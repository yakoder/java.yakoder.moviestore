/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_shipping` (
  `store_ship_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_site_id` int(11) NOT NULL,
  `store_ship_code` char(1) DEFAULT NULL,
  `store_ship_name` varchar(100) NOT NULL,
  `initial_credit` decimal(15,2) NOT NULL DEFAULT 0.00,
  `additional_credit` decimal(15,2) NOT NULL DEFAULT 0.00,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 1,
  `notes` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`store_ship_id`),
  KEY `store_shipping_store_site_id_IDX` (`store_site_id`) USING BTREE,
  KEY `store_shipping_store_ship_code_IDX` (`store_ship_code`) USING BTREE,
  KEY `store_shipping_store_site_id_ship_code_IDX` (`store_site_id`,`store_ship_code`) USING BTREE,
  KEY `store_shipping_store_ship_name_IDX` (`store_ship_name`) USING BTREE,
  KEY `store_shipping_store_site_id_ship_name_IDX` (`store_site_id`,`store_ship_name`) USING BTREE,
  KEY `store_shipping_initial_credit_IDX` (`initial_credit`) USING BTREE,
  KEY `store_shipping_store_site_id_code_initcred_IDX` (`store_site_id`,`store_ship_code`,`initial_credit`) USING BTREE,
  KEY `store_shipping_store_site_id_code_addlcred_IDX` (`store_site_id`,`store_ship_code`,`additional_credit`) USING BTREE,
  KEY `store_shipping_is_enabled_IDX` (`is_enabled`) USING BTREE,
  KEY `store_shipping_store_site_id_enabled_IDX` (`store_site_id`,`is_enabled`) USING BTREE,
  CONSTRAINT `store_shipping_store_site_id_FK` FOREIGN KEY (`store_site_id`) REFERENCES `store_sites` (`store_site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
