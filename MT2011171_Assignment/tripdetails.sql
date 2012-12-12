-- MySQL dump 10.13  Distrib 5.5.16, for Win64 (x86)
--
-- Host: localhost    Database: wizard
-- ------------------------------------------------------
-- Server version	5.5.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tripdetails`
--

DROP TABLE IF EXISTS `tripdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tripdetails` (
  `tripId` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  `source` varchar(200) DEFAULT NULL,
  `destination` varchar(200) DEFAULT NULL,
  `via1` varchar(200) DEFAULT NULL,
  `via2` varchar(200) DEFAULT NULL,
  `via3` varchar(200) DEFAULT NULL,
  `TripAgent` varchar(200) DEFAULT NULL,
  `TripDate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tripId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripdetails`
--

LOCK TABLES `tripdetails` WRITE;
/*!40000 ALTER TABLE `tripdetails` DISABLE KEYS */;
INSERT INTO `tripdetails` VALUES (1,'ssd','saa','adfa','asfd','sad','ad','sad',NULL),(2,'as','saa','adfa','asfd','sad','ad','sad',NULL),(3,'as','saa','adfa','asfd','sad','ad','sad',NULL),(4,'as','saa','adfa','asfd','sad','ad','sad',NULL),(5,'as','saa','adfa','asfd','sad','ad','sad',NULL),(6,'Holidays','Bhopal','Bangalore','Pune','','','Yatra.com','12/11/2012'),(7,'Holidays','Bhopal','Bangalore','Pune','','','Go Indigo','14/11/2012'),(8,'Fun Trip','Bangalore','Bhopal','Pune','','','Go Indigo','11/12/2012'),(9,'banglore to bhopal vacation','bangalore','bhopal','itarsi','','','IRCTC','19/12/2012');
/*!40000 ALTER TABLE `tripdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-12-08 15:09:35
