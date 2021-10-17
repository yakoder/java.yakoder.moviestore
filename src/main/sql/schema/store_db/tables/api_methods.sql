/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_methods` (
  `api_meth_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_meth_name` varchar(100) NOT NULL,
  `api_meth_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`api_meth_id`),
  KEY `api_methods_api_meth_name_IDX` (`api_meth_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
