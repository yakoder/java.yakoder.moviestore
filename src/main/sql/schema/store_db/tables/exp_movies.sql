/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exp_movies` (
  `exp_detail_id` int(11) NOT NULL DEFAULT nextval(`store_db`.`exp_detail_id_seq`),
  `store_site_id` int(11) NOT NULL,
  `store_order_num` varchar(100) DEFAULT NULL,
  `store_txn_num` varchar(100) DEFAULT NULL,
  `store_seller` varchar(100) DEFAULT NULL,
  `movie_id` int(11) NOT NULL,
  `item_price` decimal(15,2) DEFAULT NULL,
  `ship_cost` decimal(15,2) DEFAULT NULL,
  `cond_id` int(11) DEFAULT NULL,
  `had_case_art` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`exp_detail_id`),
  KEY `exp_movies_store_site_id_IDX` (`store_site_id`) USING BTREE,
  KEY `exp_movies_store_seller_IDX` (`store_seller`) USING BTREE,
  KEY `exp_movies_movie_id_IDX` (`movie_id`) USING BTREE,
  KEY `exp_movies_cond_id_IDX` (`cond_id`) USING BTREE,
  KEY `exp_movies_store_order_num_IDX` (`store_order_num`) USING BTREE,
  KEY `exp_movies_store_txn_num_IDX` (`store_txn_num`) USING BTREE,
  CONSTRAINT `exp_movies_cond_id_FK` FOREIGN KEY (`cond_id`) REFERENCES `conditions` (`cond_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `exp_movies_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `exp_movies_store_site_id_FK` FOREIGN KEY (`store_site_id`) REFERENCES `store_sites` (`store_site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
