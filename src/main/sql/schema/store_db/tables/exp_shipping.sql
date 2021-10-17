/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exp_shipping` (
  `exp_detail_id` int(11) NOT NULL DEFAULT nextval(`store_db`.`exp_detail_id_seq`),
  `order_id` int(11) NOT NULL,
  `ship_meth_id` int(11) NOT NULL,
  `postage_cost` decimal(15,2) DEFAULT NULL,
  `insurance_cost` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`exp_detail_id`),
  KEY `exp_shipping_order_id_IDX` (`order_id`) USING BTREE,
  KEY `exp_shipping_ship_meth_id_IDX` (`ship_meth_id`) USING BTREE,
  CONSTRAINT `exp_shipping_order_id_FK` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `exp_shipping_ship_meth_id_FK` FOREIGN KEY (`ship_meth_id`) REFERENCES `shipping_methods` (`ship_meth_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
