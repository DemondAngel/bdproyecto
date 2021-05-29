USE master
CREATE DATABASE Cineteca
GO

USE Cineteca
GO

CREATE TABLE Director(
	idDirector			int PRIMARY KEY NOT NULL, 
	nombre				varchar(100) NOT NULL,
	estado				bit NOT NULL DEFAULT 1
)
GO

CREATE TABLE Pais(
	idPais				int PRIMARY KEY NOT NULL,
	nombre				varchar(50) NOT NULL,
	estado				bit NOT NULL DEFAULT 1
)
GO

CREATE TABLE Pelicula(
	idPelicula			varchar(20) primary key NOT NULL,
	tituloOriginal		varchar(200) NOT NULL,
	tituloExhibicion	varchar(200) NULL,
	año					int NULL,
	estado				bit NOT NULL DEFAULT 1
)
GO

CREATE TABLE Pelicula_Pais(
	idPelicula			varchar(20) NOT NULL,
	idPais				int NOT NULL,

	CONSTRAINT pk_pp PRIMARY KEY (idPelicula, idPais),
	CONSTRAINT fk_pl FOREIGN KEY (idPelicula) references Pelicula(idPelicula),
	CONSTRAINT fk_ps FOREIGN KEY (idPais) references Pais(idPais),
)
GO

Create table Pelicula_Director(
	idPelicula varchar(20) NOT NULL,
	idDirector int NOT NULL,
	
	CONSTRAINT pk_pd PRIMARY KEY(idPelicula, idDirector),
	CONSTRAINT fk_p FOREIGN KEY (idPelicula) references Pelicula(idPelicula),
	CONSTRAINT fk_d FOREIGN KEY (idDirector) references Director(idDirector)
)
GO

CREATE UNIQUE INDEX idxNombreDirector on Director (nombre);
 
CREATE UNIQUE INDEX idxNombrePais on Pais(nombre);

CREATE UNIQUE INDEX idxNombrePelicula on Pelicula(tituloOriginal,año);