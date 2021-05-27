CREATE OR ALTER PROCEDURE usp_AltaPais @NombrePais varchar(50) AS
BEGIN
	DECLARE @IdPais int
	SET @IdPais = (SELECT TOP 1 idPais FROM Pais ORDER BY idPais DESC) +1
	
	INSERT INTO Pais VALUES (@IdPais,@NombrePais,1)
END

CREATE OR ALTER PROCEDURE usp_AltaDirector @NombreDirector varchar(100) AS
BEGIN
	DECLARE @IdDirector int
	SET @IdDirector = (SELECT TOP 1 idDirector FROM Director ORDER BY idDirector DESC) +1
	
	INSERT INTO Director VALUES (@IdDirector,@NombreDirector,1)
END

CREATE OR ALTER PROCEDURE usp_AltaPelicula 
@TituloO varchar(200), @TituloE varchar(200), @Año int, @Director varchar(100), @Pais varchar(50) AS
BEGIN
	DECLARE @IdDirector int
	DECLARE @IdPais int
	DECLARE @IdPelicula nvarchar(20)
	DECLARE @nacion nvarchar(5)

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

	INSERT INTO Pelicula VALUES (@IdPelicula,@TituloO,@TituloE,@Año,1)
	INSERT INTO Pelicula_Director VALUES (@IdPelicula,@IdDirector)
	INSERT INTO Pelicula_Pais VALUES (@IdPelicula,@IdPais)
		
END

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

CREATE OR ALTER PROCEDURE usp_EditarPais @NombreActual varchar(50), @NuevoNombre varchar(50) AS
BEGIN
	UPDATE P SET [nombre]=@NuevoNombre FROM Pais AS P WHERE nombre=@NombreActual;
END

CREATE OR ALTER PROCEDURE usp_EditarDirector @NombreActual varchar(100), @NuevoNombre varchar(100) AS
BEGIN
	UPDATE P SET [nombre]=@NuevoNombre FROM Director AS P WHERE nombre=@NombreActual;
END

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

EXEC usp_AltaPelicula 'Evangelion','Evangelion',1997,'ABEL GANCE','MÉXICO'
*/






