CREATE DATABASE moviet_ticket character set UTF8 collate utf8_vietnamese_ci;

use moviet_ticket;

CREATE TABLE `moviet_ticket`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `moviet_ticket`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(5000) NOT NULL,
  `username` VARCHAR(5000) NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `moviet_ticket`.`user_roles` (
  `user_id` INT NULL,
  `role_id` INT NULL);
  
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');