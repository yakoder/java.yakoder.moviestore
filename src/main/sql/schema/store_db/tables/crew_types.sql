/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_types` (
  `crew_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_type_name` varchar(100) NOT NULL,
  `crew_type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`crew_type_id`),
  KEY `crew_types_crew_type_name_IDX` (`crew_type_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
