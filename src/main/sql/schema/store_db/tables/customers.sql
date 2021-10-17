/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_email` varchar(255) NOT NULL,
  `cust_name_first` varchar(100) DEFAULT NULL,
  `cust_name_last` varchar(100) DEFAULT NULL,
  `cust_addr_1` varchar(100) DEFAULT NULL,
  `cust_addr_2` varchar(100) DEFAULT NULL,
  `cust_city` varchar(100) DEFAULT NULL,
  `cust_state` char(2) DEFAULT NULL,
  `cust_zip` varchar(10) DEFAULT NULL,
  `cust_country` char(2) DEFAULT NULL,
  PRIMARY KEY (`cust_id`),
  KEY `customers_cust_email_IDX` (`cust_email`) USING BTREE,
  KEY `customers_cust_name_first_last_IDX` (`cust_name_first`,`cust_name_last`) USING BTREE,
  KEY `customers_cust_city_state_IDX` (`cust_city`,`cust_state`) USING BTREE,
  KEY `customers_cust_state_IDX` (`cust_state`) USING BTREE,
  KEY `customers_cust_zip_IDX` (`cust_zip`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
