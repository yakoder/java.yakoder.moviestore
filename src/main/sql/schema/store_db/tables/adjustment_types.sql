/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adjustment_types` (
  `adj_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `adj_type_name` varchar(100) NOT NULL,
  `adj_type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adj_type_id`),
  KEY `adjustment_types_adj_type_name_IDX` (`adj_type_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
