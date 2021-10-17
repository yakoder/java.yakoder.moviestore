/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_inventory` (
  `store_inv_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_site_id` int(11) NOT NULL,
  `inv_id` int(11) NOT NULL,
  `store_movie_num` varchar(100) NOT NULL,
  `is_listed` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`store_inv_id`),
  UNIQUE KEY `store_inventory_store_movie_num_UN` (`store_movie_num`),
  KEY `store_inventory_store_site_id_IDX` (`store_site_id`) USING BTREE,
  KEY `store_inventory_inv_id_IDX` (`inv_id`) USING BTREE,
  KEY `store_inventory_store_movie_num_IDX` (`store_movie_num`) USING BTREE,
  KEY `store_inventory_is_listed_IDX` (`is_listed`) USING BTREE,
  KEY `store_inventory_store_site_id_listed_IDX` (`store_site_id`,`is_listed`) USING BTREE,
  KEY `store_inventory_inv_id_listed_IDX` (`inv_id`,`is_listed`) USING BTREE,
  KEY `store_inventory_store_movie_num_listed_IDX` (`store_movie_num`,`is_listed`) USING BTREE,
  CONSTRAINT `store_inventory_inv_id_FK` FOREIGN KEY (`inv_id`) REFERENCES `inventory` (`inv_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_inventory_store_site_id_FK` FOREIGN KEY (`store_site_id`) REFERENCES `store_sites` (`store_site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
