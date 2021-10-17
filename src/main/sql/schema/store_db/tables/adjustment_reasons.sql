/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adjustment_reasons` (
  `adj_rsn_id` int(11) NOT NULL AUTO_INCREMENT,
  `adj_rsn_name` varchar(100) NOT NULL,
  `adj_rsn_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adj_rsn_id`),
  KEY `adjustment_reasons_adj_rsn_name_IDX` (`adj_rsn_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
