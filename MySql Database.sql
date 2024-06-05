CREATE DATABASE  IF NOT EXISTS `hotel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hotel`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hotel
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `checkin` date NOT NULL,
  `checkout` date NOT NULL,
  `room_number` int NOT NULL,
  `customar_id` int NOT NULL,
  `adulat` int NOT NULL,
  `child` int DEFAULT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'not check in',
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (101,'2024-03-12','2024-03-15',101,101,2,1,'not check in'),(105,'2024-03-26','2024-03-28',103,105,4,2,'not check in'),(106,'2024-03-29','2024-03-30',101,106,3,2,'not check in'),(107,'2024-04-01','2024-04-03',102,103,2,1,'not check in'),(109,'2024-04-08','2024-04-09',101,102,4,3,'not check in'),(110,'2024-04-10','2024-04-16',102,103,3,1,'not check in'),(111,'2024-04-18','2024-04-20',103,105,3,1,'not check in'),(135,'2024-06-05','2024-06-06',101,171,3,1,'not check in');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customar`
--

DROP TABLE IF EXISTS `customar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customar` (
  `customar_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(11) NOT NULL,
  `passport` varchar(45) DEFAULT NULL,
  `nid` varchar(45) DEFAULT NULL,
  `room_number` int DEFAULT NULL,
  PRIMARY KEY (`customar_id`),
  UNIQUE KEY `nid_UNIQUE` (`nid`),
  UNIQUE KEY `passport_UNIQUE` (`passport`)
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customar`
--

LOCK TABLES `customar` WRITE;
/*!40000 ALTER TABLE `customar` DISABLE KEYS */;
INSERT INTO `customar` VALUES (101,'HABIB ULLAH','mohammedhabibullah27697@gmail.com','1297548654','A4537L','987654321',101),(102,'arif','dbc@gmail.com','44543544','a456y','656576',102),(116,'Abu Hossain','abc@email.com','1516718442','A4538L','54656585',102),(118,'HABIB ULLAH','arifhc65@gmail.com','1789639995','A4534Lwq','223345',0),(119,'HABIB ULLAH','entertainment','1297548654','A4539Mdf','334444',101),(163,'HABIB ULLAH','ariful155367@gmail.com','01257835484','A4634L','34534',101),(164,'HABIB ULLAH','arifhossain7095@gmail.com','01257835484','A45459L','334323',101),(165,'HABIB ULLAH','arifhc65@gmail.com','01257835484','A45kl34L','24353',101),(166,'HABIB ULLAH','ataurrahmanfarju@gmail.com','01257835484','A45jt4L','564675875',101),(170,'axd','arifhossain7095@gmail.com','01789639995','A4537L1452','102356884',106),(171,'Rahimul','ariful155367@gmail.com','01789639995','A456538L','2458796215',101);
/*!40000 ALTER TABLE `customar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `massage` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (7,'ARIFUL ISLAM','arifhc65@gmail.com','Good'),(8,'HABIB ULLAH','arifhc65@gmail.com','well');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foodtransaction`
--

DROP TABLE IF EXISTS `foodtransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foodtransaction` (
  `s_number` int NOT NULL AUTO_INCREMENT,
  `c_id` int DEFAULT NULL,
  `f_type` varchar(45) DEFAULT NULL,
  `f_menu` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`s_number`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foodtransaction`
--

LOCK TABLES `foodtransaction` WRITE;
/*!40000 ALTER TABLE `foodtransaction` DISABLE KEYS */;
INSERT INTO `foodtransaction` VALUES (1,101,'Dinner','shampain',450,'2024-05-29'),(2,101,'Breakfast','shampain',500,'2024-05-15'),(3,101,'Dinner','shampain',1200,'2024-05-24'),(4,101,'Breakfast','Lunch package',399,'2024-05-31');
/*!40000 ALTER TABLE `foodtransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `room_number` int DEFAULT NULL,
  `customar_id` int DEFAULT NULL,
  `total_bill` double DEFAULT NULL,
  `pay` double DEFAULT NULL,
  `due` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `payment_type` varchar(45) DEFAULT NULL,
  `transaction_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5026 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (5001,101,101,2500,2000,3599,'due',NULL,NULL),(5002,102,102,4000,4000,0,'payed',NULL,NULL),(5003,106,149,0,1500,0,NULL,'bkash',NULL),(5004,106,150,5000,3000,2000,NULL,'nagad','klo12563g'),(5005,105,151,2200,2200,0,NULL,'nagad','kadjsgkjh'),(5006,105,152,2200,2200,0,NULL,'nagad','hasjkghio'),(5007,105,152,2200,0,2200,'partial paid','nagad','hasjkghio'),(5008,101,154,5000,0,5000,'due','nagad','kjdgskarak'),(5009,101,154,5000,2500,2500,'partial paid','nagad','kjdgskaragh'),(5010,101,154,5000,5000,0,'paid','nagad','kjdgskarahgf'),(5011,101,157,3000,1000,2000,'partial paid','bkash',NULL),(5012,101,157,3000,1000,2000,'partial paid','bkash','kadjsgkjhjkk'),(5013,102,159,2000,200,1800,'partial paid','nagad','dhfhfgs'),(5014,103,160,2000,500,1500,'partial paid','bkash','dhfg'),(5015,101,161,2500,1000,1500,'partial paid','bkash','rtehtghh'),(5016,101,116,2500,1000,1500,'partial paid','bkash','tretffs'),(5017,101,163,2500,1000,1500,'partial paid','bkash','vbnchgfc'),(5018,101,164,2500,500,2000,'partial paid','bkash','frtgrftg'),(5019,101,165,2500,433,2067,'partial paid','bkash','edffd'),(5020,101,166,2500,1000,1500,'partial paid','bkash','kadjsgkjh'),(5021,102,116,1500,100,1400,'partial paid',NULL,'hfdgfdg'),(5022,103,116,1500,100,1400,'partial paid','bkash','erwwr'),(5023,103,116,1500,1500,0,'paid','bkash','jgkajofkgasd'),(5024,106,170,3000,2500,500,'partial paid','bkash','kadjsgkjh'),(5025,101,171,1500,1000,500,'partial paid','nagad','thfrttfretgf');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `room_id` int NOT NULL AUTO_INCREMENT,
  `room_number` int NOT NULL,
  `service_type` varchar(45) DEFAULT NULL,
  `facility_id` int DEFAULT NULL,
  `img` varchar(45) DEFAULT NULL,
  `s_disscriptions` varchar(300) DEFAULT NULL,
  `l_disscriptions` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1001,101,'Single room',101,'assets\\images\\booking_1.jpg','ABOUT ZANTE HOTEL','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis'),(1002,102,'Double room',102,'assets\\images\\booking_2.jpg','ABOUT ZANTE HOTEL','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis'),(1003,103,'Deluxe room',103,'assets\\images\\booking_3.jpg','Live your myth in Greece','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit...'),(1004,104,'Single',104,'assets\\images\\rsz_w2.jpg','ABOUT ZANTE HOTEL','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis'),(1005,105,'Single',105,'assets\\images\\rsz_t2.jpg','ABOUT ZANTE HOTEL','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis'),(1006,106,'Single',106,'assets\\images\\rsz_1t4.jpg','ABOUT ZANTE HOTEL','Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomreant`
--

DROP TABLE IF EXISTS `roomreant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roomreant` (
  `id` int NOT NULL AUTO_INCREMENT,
  `room_no` int DEFAULT NULL,
  `room_reant` double DEFAULT NULL,
  `service_bill` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomreant`
--

LOCK TABLES `roomreant` WRITE;
/*!40000 ALTER TABLE `roomreant` DISABLE KEYS */;
INSERT INTO `roomreant` VALUES (1000,101,500,1000),(1001,102,500,1000),(1002,103,500,1000),(1003,104,1000,1000),(1004,105,400,1000),(1005,106,1000,1000),(1006,107,4000,1000);
/*!40000 ALTER TABLE `roomreant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('arif1','abc@gmail.com','123','admin'),('ataur','ataurrahmanfarju@gmail.com','123','Costomar'),('eds','mohammedhabibullah27697@gmail.com','123',NULL),('gyt','arifhc65@gmail.com','123','admin'),('pitu','mohammedhabibullah27697@gmail.com','123',NULL),('pitu1','ariful155367@gmail.com','123','Caustomar'),('Raj','arifhc65@gmail.com','123',NULL),('rifat','arifhc65@gmail.com','123','Caustomar'),('saru','arifhc65@gmail.com','123','admin'),('ssd','mohammedhabibullah27697@gmail.com','123',NULL),('sumon2','arif@gmail.com','123','customar'),('tghgt','arifhc65@gmail.com','123',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-05  1:18:02
