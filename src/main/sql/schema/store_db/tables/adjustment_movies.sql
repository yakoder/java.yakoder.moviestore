/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adjustment_movies` (
  `adj_movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_adj_id` int(11) NOT NULL,
  `order_movie_id` int(11) NOT NULL,
  `adj_type_id` int(11) NOT NULL,
  `adj_amount` decimal(15,2) DEFAULT NULL,
  `adj_rsn_id` int(11) NOT NULL,
  PRIMARY KEY (`adj_movie_id`),
  KEY `adjustment_movies_order_adj_id_IDX` (`order_adj_id`) USING BTREE,
  KEY `adjustment_movies_order_movie_id_IDX` (`order_movie_id`) USING BTREE,
  KEY `adjustment_movies_adj_type_id_IDX` (`adj_type_id`) USING BTREE,
  KEY `adjustment_movies_adj_rsn_id_IDX` (`adj_rsn_id`) USING BTREE,
  CONSTRAINT `adjustment_movies_adj_rsn_id_FK` FOREIGN KEY (`adj_rsn_id`) REFERENCES `adjustment_reasons` (`adj_rsn_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `adjustment_movies_adj_type_id_FK` FOREIGN KEY (`adj_type_id`) REFERENCES `adjustment_types` (`adj_type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `adjustment_movies_order_adj_id_FK` FOREIGN KEY (`order_adj_id`) REFERENCES `order_adjustments` (`order_adj_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `adjustment_movies_order_movie_id_FK` FOREIGN KEY (`order_movie_id`) REFERENCES `order_movies` (`order_movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
