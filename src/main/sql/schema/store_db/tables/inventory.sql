/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory` (
  `inv_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) NOT NULL,
  `cond_id` int(11) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL DEFAULT 1,
  `for_sale` tinyint(1) NOT NULL DEFAULT 0,
  `num_discs` int(11) NOT NULL DEFAULT 1,
  `have_case_art` tinyint(1) NOT NULL DEFAULT 0,
  `is_dual_sided` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`inv_id`),
  KEY `inventory_movie_id_IDX` (`movie_id`) USING BTREE,
  KEY `inventory_cond_id_IDX` (`cond_id`) USING BTREE,
  KEY `inventory_for_sale_IDX` (`for_sale`) USING BTREE,
  KEY `inventory_have_case_art_IDX` (`have_case_art`) USING BTREE,
  KEY `inventory_is_dual_sided_IDX` (`is_dual_sided`) USING BTREE,
  CONSTRAINT `inventory_cond_id_FK` FOREIGN KEY (`cond_id`) REFERENCES `conditions` (`cond_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `inventory_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
