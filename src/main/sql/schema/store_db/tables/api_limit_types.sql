/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_limit_types` (
  `api_limit_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_limit_type_name` varchar(100) NOT NULL,
  `api_limit_type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`api_limit_type_id`),
  KEY `api_limit_types_api_limit_type_name_IDX` (`api_limit_type_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
