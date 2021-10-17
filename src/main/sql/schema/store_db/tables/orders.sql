/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_order_num` varchar(100) NOT NULL,
  `cust_id` int(11) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `store_site_id` int(11) DEFAULT NULL,
  `store_ship_id` int(11) NOT NULL,
  `order_ship_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `orders_store_order_num_UN` (`store_order_num`),
  KEY `orders_cust_id_IDX` (`cust_id`) USING BTREE,
  KEY `orders_order_date_IDX` (`order_date`) USING BTREE,
  KEY `orders_store_site_id_IDX` (`store_site_id`) USING BTREE,
  KEY `orders_store_ship_id_IDX` (`store_ship_id`) USING BTREE,
  KEY `orders_order_ship_id_IDX` (`order_ship_id`) USING BTREE,
  KEY `orders_store_order_num_IDX` (`store_order_num`) USING BTREE,
  CONSTRAINT `orders_cust_id_FK` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `orders_order_ship_id_FK` FOREIGN KEY (`order_ship_id`) REFERENCES `order_shipments` (`order_ship_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_store_ship_id_FK` FOREIGN KEY (`store_ship_id`) REFERENCES `store_shipping` (`store_ship_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_store_site_id_FK` FOREIGN KEY (`store_site_id`) REFERENCES `store_sites` (`store_site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Internally tracked orders (aka "sales") from customers';
/*!40101 SET character_set_client = @saved_cs_client */;
