/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prod_co_types` (
  `prod_co_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `prod_co_type_name` varchar(100) NOT NULL,
  `prod_co_type_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prod_co_type_id`),
  KEY `prod_co_types_prod_co_type_name_IDX` (`prod_co_type_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
