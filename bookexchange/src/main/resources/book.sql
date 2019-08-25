CREATE DATABASE  IF NOT EXISTS `BookExchange`;
USE `BookExchange`;

DROP TABLE IF EXISTS `Book`;

CREATE TABLE `Book` (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(45) DEFAULT NULL,
  `price` double DEFAULT 0,
  `author` varchar(45) DEFAULT NULL,
  `bookName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
);

ALTER table `Book` AUTO_INCREMENT = 1;

insert into Book VALUES(1, "abc", 10, "joe", "Java");