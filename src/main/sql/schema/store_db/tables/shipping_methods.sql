/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipping_methods` (
  `ship_meth_id` int(11) NOT NULL AUTO_INCREMENT,
  `ship_meth_name` varchar(100) NOT NULL,
  `ship_svc_id` int(11) NOT NULL,
  `ship_base_cost` decimal(15,2) DEFAULT NULL,
  `ship_ins_base_cost` decimal(15,2) DEFAULT NULL,
  `has_tracking` tinyint(1) NOT NULL DEFAULT 1,
  `ins_allowed` tinyint(1) NOT NULL DEFAULT 1,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 0,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`ship_meth_id`),
  KEY `shipping_methods_ship_meth_name_IDX` (`ship_meth_name`) USING BTREE,
  KEY `shipping_methods_has_tracking_IDX` (`has_tracking`) USING BTREE,
  KEY `shipping_methods_ship_svc_id_IDX` (`ship_svc_id`) USING BTREE,
  KEY `shipping_methods_ins_allowed_IDX` (`ins_allowed`) USING BTREE,
  KEY `shipping_methods_is_enabled_IDX` (`is_enabled`) USING BTREE,
  KEY `shipping_methods_ship_svc_id_enabled_IDX` (`ship_svc_id`,`is_enabled`) USING BTREE,
  CONSTRAINT `shipping_methods_ship_svc_id_FK` FOREIGN KEY (`ship_svc_id`) REFERENCES `shipping_services` (`ship_svc_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
