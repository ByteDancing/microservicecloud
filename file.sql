--创建cloudDB01数据库
DROP DATABASE IF EXISTS  cloudDB01;
CREATE DATABASE cloudDB01 CHARACTER UTF8;
USE cloudDB01;

--创建dept表
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--插入数据
INSERT INTO dept(dname,db_source)VALUES ("开发部",DATABASE());
INSERT INTO dept(dname,db_source)VALUES ("人事部",DATABASE());
INSERT INTO dept(dname,db_source)VALUES ("财务部",DATABASE());
INSERT INTO dept(dname,db_source)VALUES ("市场部",DATABASE());
INSERT INTO dept(dname,db_source)VALUES ("运维部",DATABASE());
INSERT INTO dept(dname,db_source)VALUES ("销售部",DATABASE());