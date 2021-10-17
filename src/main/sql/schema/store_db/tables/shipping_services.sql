/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipping_services` (
  `ship_svc_id` int(11) NOT NULL AUTO_INCREMENT,
  `ship_svc_name` varchar(100) NOT NULL,
  `ship_svc_name_long` varchar(100) DEFAULT NULL,
  `ship_svc_url` varchar(255) DEFAULT NULL,
  `ship_svc_trk_url` varchar(255) DEFAULT NULL COMMENT 'Replace ''${TRACKING_ID}'' with the Tracking ID',
  `ship_svc_notes` varchar(255) DEFAULT NULL,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`ship_svc_id`),
  KEY `shipping_services_ship_svc_name_IDX` (`ship_svc_name`) USING BTREE,
  KEY `shipping_services_ship_svc_name_long_IDX` (`ship_svc_name_long`) USING BTREE,
  KEY `shipping_services_is_enabled_IDX` (`is_enabled`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
