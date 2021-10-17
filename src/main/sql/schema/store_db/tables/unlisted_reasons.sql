/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unlisted_reasons` (
  `unlisted_reason_id` int(11) NOT NULL AUTO_INCREMENT,
  `unlisted_reason_name` varchar(100) NOT NULL,
  `unlisted_reason_desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`unlisted_reason_id`),
  KEY `unlisted_reasons_unlisted_reason_name_IDX` (`unlisted_reason_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
