/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_ship_methods` (
  `store_ship_meth_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_ship_id` int(11) NOT NULL,
  `ship_meth_id` int(11) NOT NULL,
  PRIMARY KEY (`store_ship_meth_id`),
  KEY `store_ship_methods_store_ship_id_FK` (`store_ship_id`),
  KEY `store_ship_methods_ship_meth_id_FK` (`ship_meth_id`),
  KEY `store_ship_methods_all_IDX` (`store_ship_meth_id`,`store_ship_id`,`ship_meth_id`) USING BTREE,
  CONSTRAINT `store_ship_methods_ship_meth_id_FK` FOREIGN KEY (`ship_meth_id`) REFERENCES `shipping_methods` (`ship_meth_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_ship_methods_store_ship_id_FK` FOREIGN KEY (`store_ship_id`) REFERENCES `store_shipping` (`store_ship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
