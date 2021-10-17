/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_adjustments` (
  `order_adj_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `adj_type_id` int(11) NOT NULL,
  `adj_req_id` int(11) NOT NULL,
  `adj_date` date DEFAULT NULL,
  `adj_notes` varchar(255) DEFAULT NULL,
  `adj_amount` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`order_adj_id`),
  KEY `order_adjustments_order_id_IDX` (`order_id`) USING BTREE,
  KEY `order_adjustments_adj_type_id_IDX` (`adj_type_id`) USING BTREE,
  KEY `order_adjustments_adj_req_id_IDX` (`adj_req_id`) USING BTREE,
  KEY `order_adjustments_adj_date_IDX` (`adj_date`) USING BTREE,
  CONSTRAINT `order_adjustments_adj_req_id_FK` FOREIGN KEY (`adj_req_id`) REFERENCES `adjustment_requestors` (`adj_req_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_adjustments_adj_type_id_FK` FOREIGN KEY (`adj_type_id`) REFERENCES `adjustment_types` (`adj_type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_adjustments_order_id_FK` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
