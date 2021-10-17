/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prod_cos` (
  `prod_co_id` int(11) NOT NULL AUTO_INCREMENT,
  `prod_co_name` varchar(100) NOT NULL,
  `prod_co_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prod_co_id`),
  KEY `prod_cos_prod_co_name_IDX` (`prod_co_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
