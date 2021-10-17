/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_customers` (
  `store_cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_site_id` int(11) NOT NULL,
  `cust_id` int(11) NOT NULL,
  `cust_username` varchar(100) DEFAULT NULL,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`store_cust_id`),
  KEY `store_customers_store_site_id_IDX` (`store_site_id`) USING BTREE,
  KEY `store_customers_cust_id_IDX` (`cust_id`) USING BTREE,
  KEY `store_customers_cust_username_IDX` (`cust_username`) USING BTREE,
  KEY `store_customers_is_enabled_IDX` (`is_enabled`) USING BTREE,
  KEY `store_customers_store_site_id_enabled_IDX` (`store_site_id`,`is_enabled`) USING BTREE,
  CONSTRAINT `store_customers_cust_id_FK` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_customers_store_site_id_FK` FOREIGN KEY (`store_site_id`) REFERENCES `store_sites` (`store_site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
