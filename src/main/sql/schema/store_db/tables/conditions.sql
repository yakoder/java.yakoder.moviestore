/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conditions` (
  `cond_id` int(11) NOT NULL AUTO_INCREMENT,
  `cond_name` varchar(100) NOT NULL,
  `cond_value` int(11) NOT NULL,
  `pct_retail` decimal(15,10) DEFAULT NULL,
  PRIMARY KEY (`cond_id`),
  KEY `conditions_cond_name_IDX` (`cond_name`) USING BTREE,
  KEY `conditions_cond_value_IDX` (`cond_value`) USING BTREE,
  KEY `conditions_pct_retail_IDX` (`pct_retail`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
