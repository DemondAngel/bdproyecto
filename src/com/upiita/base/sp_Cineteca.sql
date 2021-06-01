--------------------------------INSERT
CREATE OR ALTER PROCEDURE usp_AltaPais @NombrePais varchar(50) AS
BEGIN
	EXEC usp_ValidarEspacios @NombrePais OUTPUT
	DECLARE @IdPais int
	SET @IdPais = (SELECT TOP 1 idPais FROM Pais ORDER BY idPais DESC) +1
	
	BEGIN TRAN
		INSERT INTO Pais VALUES (@IdPais,@NombrePais,1)
		IF LEN(@NombrePais)=0
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;
		END
		ELSE
			COMMIT TRAN;
END

CREATE OR ALTER PROCEDURE usp_AltaDirector @NombreDirector varchar(100) AS
BEGIN
	EXEC usp_ValidarEspacios @NombreDirector OUTPUT
	DECLARE @IdDirector int
	SET @IdDirector = (SELECT TOP 1 idDirector FROM Director ORDER BY idDirector DESC) +1
	
	BEGIN TRAN
		INSERT INTO Director VALUES (@IdDirector,@NombreDirector,1)
		IF LEN(@NombreDirector)=0
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;
		END
		ELSE
			COMMIT TRAN;
END

CREATE OR ALTER PROCEDURE usp_AltaPelicula 
@TituloO varchar(200), @TituloE varchar(200), @Año int, @Director varchar(100), @Pais varchar(50) AS
BEGIN
	DECLARE @IdDirector int
	DECLARE @IdPais int
	DECLARE @IdPelicula nvarchar(20)
	DECLARE @nacion nvarchar(5)

	EXEC usp_ValidarEspacios @TituloO OUTPUT
	EXEC usp_ValidarEspacios @TituloE OUTPUT

	SET @IdDirector = (SELECT idDirector FROM Director WHERE nombre=@Director)
	SET @IdPais = (SELECT IdPais FROM Pais WHERE nombre=@Pais)

	IF (@IdPais=99)
	BEGIN
		SET @nacion =((right ((SELECT TOP 1 idPelicula FROM Pelicula WHERE idPelicula LIKE 'A-%' ORDER BY idPelicula DESC),5)+1));	
		SET @nacion = (SELECT FORMAT ((SELECT CAST(@nacion AS int)),'00000'))
		SET @IdPelicula= 'A-'+@nacion
	END
	ELSE
	BEGIN
		SET @nacion =((right ((SELECT TOP 1 idPelicula FROM Pelicula WHERE idPelicula LIKE 'C-%' ORDER BY idPelicula DESC),5)+1));	
		SET @nacion = (SELECT FORMAT ((SELECT CAST(@nacion AS int)),'00000'))
		SET @IdPelicula= 'C-'+@nacion
	END
	BEGIN TRAN
		INSERT INTO Pelicula VALUES (@IdPelicula,@TituloO,@TituloE,@Año,1)
		INSERT INTO Pelicula_Director VALUES (@IdPelicula,@IdDirector)
		INSERT INTO Pelicula_Pais VALUES (@IdPelicula,@IdPais)
		IF(LEN(@TituloO)=0)
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;
		END
		ELSE
			COMMIT TRAN;
	
END
--------------------------------------UPDATE
CREATE OR ALTER PROCEDURE usp_EditarPais @NombreActual varchar(50), @NuevoNombre varchar(50) AS
BEGIN
		EXEC usp_ValidarEspacios @NuevoNombre OUTPUT
		BEGIN TRAN
		UPDATE P SET [nombre]=@NuevoNombre FROM Pais AS P WHERE nombre=@NombreActual;
		IF LEN(@NuevoNombre)=0
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;
		END
		ELSE
			COMMIT TRAN;
END

CREATE OR ALTER PROCEDURE usp_EditarDirector @NombreActual varchar(100), @NuevoNombre varchar(100) AS
BEGIN
		EXEC usp_ValidarEspacios @NuevoNombre OUTPUT
		BEGIN TRAN
		UPDATE P SET [nombre]=@NuevoNombre FROM Director AS P WHERE nombre=@NombreActual;
		IF LEN(@NuevoNombre)=0
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;

		END
		ELSE
			COMMIT TRAN;
END

CREATE OR ALTER PROCEDURE usp_EditarPelicula 
@IdPelicula varchar(20),@TituloO varchar(200), @TituloE varchar(200), @Año int, @Director varchar(100), @Pais varchar(50)   AS
BEGIN
	EXEC usp_ValidarEspacios @TituloO OUTPUT
	EXEC usp_ValidarEspacios @TituloE OUTPUT
	BEGIN TRAN
		IF(@TituloO <> (SELECT tituloOriginal FROM Pelicula WHERE idPelicula=@IdPelicula))
			UPDATE P SET [tituloOriginal]=@TituloO FROM Pelicula AS P WHERE idPelicula=@IdPelicula 
		IF(@TituloE <> (SELECT tituloExhibicion FROM Pelicula WHERE idPelicula=@IdPelicula))
			UPDATE P SET [tituloExhibicion]=@TituloE FROM Pelicula AS P WHERE idPelicula=@IdPelicula 
		IF(@Año <> (SELECT año FROM Pelicula WHERE idPelicula=@IdPelicula))
			UPDATE P SET [año]=@Año FROM Pelicula AS P WHERE idPelicula=@IdPelicula 
		IF(@Pais <> (SELECT nombre FROM Pelicula P INNER JOIN Pelicula_Pais PP ON P.idPelicula=PP.idPelicula INNER JOIN Pais PA ON PP.idPais=PA.idPais WHERE P.idPelicula=@IdPelicula ))
			UPDATE P SET [idPais]=(SELECT IdPais FROM Pais WHERE nombre=@Pais) FROM Pelicula_Pais P WHERE idPelicula=@IdPelicula
		IF(@Director<> (SELECT nombre FROM Pelicula P INNER JOIN Pelicula_Director PD ON P.idPelicula=PD.idPelicula INNER JOIN Director D ON PD.idDirector=D.idDirector WHERE P.idPelicula=@IdPelicula ))
			UPDATE P SET [idDirector]=(SELECT idDirector FROM Director WHERE nombre=@Director) FROM Pelicula_Director P WHERE idPelicula=@IdPelicula
		IF(LEN(@TituloO)=0)
		BEGIN
			ROLLBACK TRAN;
			THROW 51000, 'El valor no puede ser vacio', 1;
		END
		ELSE
			COMMIT TRAN;
END
-------------------------------------DESACTIVAR
CREATE OR ALTER PROCEDURE usp_BajaPais @NombrePais varchar(50) AS
BEGIN
	UPDATE P SET [estado] = 0 FROM Pais as P WHERE nombre=@NombrePais
END

CREATE OR ALTER PROCEDURE usp_BajaDirector @NombreDirector varchar(100) AS
BEGIN
	UPDATE P SET [estado] = 0 FROM Director as P WHERE nombre=@NombreDirector
END

CREATE OR ALTER PROCEDURE usp_BajaPelicula @TituloO varchar(200), @Año int AS
BEGIN
	UPDATE P SET [estado] = 0 FROM Pelicula as P WHERE tituloOriginal=@TituloO AND año=@Año
END

-------------------------------------------ACTIVAR
CREATE OR ALTER PROCEDURE usp_ReactivarPais @NombrePais varchar(50) AS
BEGIN
	UPDATE P SET [estado] = 1 FROM Pais as P WHERE nombre=@NombrePais
END

CREATE OR ALTER PROCEDURE usp_ReactivarDirector @NombreDirector varchar(100) AS
BEGIN
	UPDATE P SET [estado] = 1 FROM Director as P WHERE nombre=@NombreDirector
END

CREATE OR ALTER PROCEDURE usp_ReactivarPelicula @TituloO varchar(200), @Año int AS
BEGIN
	UPDATE P SET [estado] = 1 FROM Pelicula as P WHERE tituloOriginal=@TituloO AND año=@Año
END

-----------------------------------VIEWS
CREATE VIEW vPais AS
SELECT * FROM Pais

CREATE VIEW vDirector AS
SELECT * FROM Director

CREATE VIEW vPelicula AS
SELECT * FROM Pelicula

CREATE VIEW vPaisNombre AS
SELECT nombre FROM Pais

CREATE VIEW vDirectorNombre AS
SELECT nombre FROM Director

CREATE VIEW vPeliculaTitulos AS
SELECT tituloOriginal, tituloExhibicion FROM Pelicula

CREATE VIEW vPeliculaPais AS
SELECT * FROM Pelicula_Pais				

CREATE VIEW vPeliculaDirector AS
SELECT * FROM Pelicula_Director

CREATE VIEW vReporte AS
SELECT P.idPelicula,P.tituloOriginal,P.tituloExhibicion,P.año,P.estado,PA.nombre Pais,D.nombre Director FROM Pais PA 
INNER JOIN Pelicula_Pais PP ON PA.idPais=PP.idPais
INNER JOIN Pelicula P ON PP.idPelicula=P.idPelicula
INNER JOIN Pelicula_Director PD ON P.idPelicula=PD.idPelicula
INNER JOIN Director D ON PD.idDirector=D.idDirector

--------------------------------VALIDAR ESPACIOS
CREATE OR ALTER PROCEDURE usp_ValidarEspacios @valor varchar(200) OUTPUT AS
BEGIN
	SET @valor = TRIM (@valor)
END

--EXEC usp_ValidarEspacios '     aljfdlaj        '

/*
EXEC usp_BajaPais 'MÉXICO'
EXEC usp_BajaDirector 'ADOLFO ARRIETA'
EXEC usp_BajaPelicula 'Evangelion', 1997

SELECT * FROM pelicula
DELETE FROM Director WHERE idDirector=8435
select * from Pelicula where idPelicula like 'A-%'
select * from Pelicula_Director where idPelicula like 'A-%'
select * from Pelicula_Pais where idPelicula like 'A-%'

DELETE FROM Pelicula_Director WHERE idPelicula = 'A-06710'
DELETE FROM Pelicula_Pais WHERE idPelicula = 'A-06710'
DELETE FROM Pelicula WHERE idPelicula = 'A-06710'

EXEC usp_AltaPelicula 'evangelion','Evangelion',1997,'ABEL GANCE','MÉXICO'

DECLARE @v varchar(50)
SET @v='    '
print Len(@v)
EXEC usp_AltaPais @v
DELETE PAIS WHERE idPais=156
SELECT * FROM PAIS
SELECT * FROM vReporte
SELECT * FROM Pais*/




