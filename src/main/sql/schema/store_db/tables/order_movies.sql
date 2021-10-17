/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_movies` (
  `order_movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  `price_paid` decimal(15,2) DEFAULT NULL,
  `shipping_credit` decimal(15,2) DEFAULT NULL,
  `is_bonus` tinyint(1) DEFAULT 0,
  `store_fees` varchar(100) DEFAULT NULL,
  `total_due` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`order_movie_id`),
  KEY `order_movies_order_id_FK` (`order_id`),
  KEY `order_movies_inv_id_FK` (`inv_id`),
  KEY `order_movies_is_bonus_IDX` (`is_bonus`) USING BTREE,
  CONSTRAINT `order_movies_inv_id_FK` FOREIGN KEY (`inv_id`) REFERENCES `inventory` (`inv_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_movies_order_id_FK` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
