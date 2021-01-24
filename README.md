# TravelReseverseProject

本项目为**中科大-高级数据库**课程期末大作业



## 功能点

1.实现客户的添加、修改以及预定显示功能

2.实现客户预定酒店、出租车、航班功能



## 数据库建表

```sql
DROP  DATABASE IF EXISTS travelReverse;

CREATE DATABASE travelReverse;

USE travelReverse;

//航班表
CREATE TABLE t_flights(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `flightNum` VARCHAR(20) NOT NULL UNIQUE,
  `price` INT,
  `numSeats` INT,
  `numAvail` INT,
  `fromCity` VARCHAR(20),
  `arivCity` VARCHAR(20)
);

//酒店表
CREATE TABLE t_hotles(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `location` VARCHAR(20) NOT NULL,
  `price` INT NOT NULL,
  `numRooms` INT NOT NULL,
  `numAvail` INT NOT NULL,
  `NAME` VARCHAR(20)
);

//出租车表
CREATE TABLE t_cars(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `location` VARCHAR(20) NOT NULL,
  `price` INT NOT NULL,
  `numCars` INT NOT NULL,
  `numAvail` INT NOT NULL
);

//客户表
CREATE TABLE t_customers(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `custName` VARCHAR(20) NOT NULL
);

//预定表
CREATE TABLE t_reservations(
  `resvKey` INT PRIMARY KEY AUTO_INCREMENT,
  `custId` INT NOT NULL,
  `resvType` ENUM('flight','hotel','car'),
  `resvId` INT NOT NULL
);
```

