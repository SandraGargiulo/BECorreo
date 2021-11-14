-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
-- -----------------------------------------------------
-- Le doy permisos a JAVA para que conecte con la base de datos
-- -----------------------------------------------------
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
FLUSH PRIVILEGES;
-- -----------------------------------------------------
-- Defino Schema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `correo` DEFAULT CHARACTER SET utf8 ;
USE `correo` ;
-- drop database `correo`;
-- -----------------------------------------------------
-- Creo la tabla Usuario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `correo`.`Usuario` (
  `idUser` INT NOT NULL,
  `user` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`idUser`))
  ENGINE = InnoDB;
  
-- -----------------------------------------------------
-- Creo el registro del usuario admin para que gestione los pedidos
-- -----------------------------------------------------
  INSERT INTO correo.usuario VALUES (1, 'admin', 'admin');
  INSERT INTO correo.usuario VALUES (2, 'correo', 'correo');
  
-- -----------------------------------------------------
-- Creo la tabla Seguimiento
-- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `correo`.`Seguimiento` (
  `idPedido` INT NOT NULL,
  `idSeguimiento` INT NOT NULL,
  `DocDestinatario` VARCHAR(45) NULL,
  `fechaUltimaActualizacion` DATETIME NULL,
  `estado` VARCHAR(45) NULL,
  PRIMARY KEY (`idSeguimiento`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Creo los registros base para hacer pruebas de pedidos
-- -----------------------------------------------------
INSERT INTO correo.seguimiento VALUES (10, 1, "123456578", '2021-10-21 00:00:00','En camino');  
INSERT INTO correo.seguimiento VALUES (11, 2, "123456579", '2021-10-22 00:00:00','En preparación');
INSERT INTO correo.seguimiento VALUES (12, 3, "123456578", '2021-10-22 00:00:00','Despachado');
  
-- -----------------------------------------------------
-- Valido la carga de los registros en las tablas 
-- -----------------------------------------------------
select * from correo.usuario;
select * from correo.seguimiento;

-- -----------------------------------------------------
-- Querys con filtros de pruebas 
-- ----------------------------------------------------
-- Por codigo de seguimiento
select * from correo.seguimiento where idSeguimiento in(1);

-- Por DNI de cliente
select * from correo.seguimiento where docdestinatario in(123456578);

-- Por estado de envio
select * from correo.seguimiento where estado like '%En camino%';


