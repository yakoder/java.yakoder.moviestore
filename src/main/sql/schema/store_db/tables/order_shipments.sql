/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_shipments` (
  `order_ship_id` int(11) NOT NULL AUTO_INCREMENT,
  `ship_meth_id` int(11) NOT NULL,
  `shipped_on` varchar(100) DEFAULT NULL,
  `postage_cost` decimal(15,2) NOT NULL,
  `has_insurance` tinyint(1) NOT NULL DEFAULT 0,
  `insurance_cost` decimal(15,2) NOT NULL DEFAULT 0.00,
  `insured_value` decimal(15,2) DEFAULT NULL,
  `tracking_number` varchar(100) DEFAULT NULL,
  `estimated_delivery` date DEFAULT NULL,
  `late_delivery` tinyint(1) DEFAULT NULL,
  `delivered_on` date DEFAULT NULL,
  PRIMARY KEY (`order_ship_id`),
  UNIQUE KEY `order_shipments_UN` (`tracking_number`),
  KEY `order_shipments_ship_meth_id_IDX` (`ship_meth_id`) USING BTREE,
  KEY `order_shipments_shipped_on_IDX` (`shipped_on`) USING BTREE,
  KEY `order_shipments_tracking_number_IDX` (`tracking_number`) USING BTREE,
  KEY `order_shipments_late_delivery_IDX` (`late_delivery`) USING BTREE,
  KEY `order_shipments_delivered_on_IDX` (`delivered_on`) USING BTREE,
  CONSTRAINT `order_shipments_ship_meth_id_FK` FOREIGN KEY (`ship_meth_id`) REFERENCES `shipping_methods` (`ship_meth_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
