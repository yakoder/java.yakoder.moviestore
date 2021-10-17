/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supply_types` (
  `supply_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `supply_type_name` varchar(100) NOT NULL,
  `supply_type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`supply_type_id`),
  KEY `supply_types_supply_type_name_IDX` (`supply_type_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
