/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_import_prep` (
  `store_import_prep_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_movie_num` varchar(100) NOT NULL,
  `cond_name` varchar(100) NOT NULL,
  `listing_comments` varchar(255) NOT NULL,
  `listed_price` decimal(15,2) NOT NULL,
  `quantity` int(11) NOT NULL DEFAULT 1,
  `ext_id_name` varchar(100) NOT NULL,
  PRIMARY KEY (`store_import_prep_id`),
  UNIQUE KEY `store_import_prep_ext_id_name_UN` (`ext_id_name`),
  UNIQUE KEY `store_import_prep_store_movie_num_UN` (`store_movie_num`),
  KEY `store_import_prep_ext_id_name_IDX` (`ext_id_name`) USING BTREE,
  KEY `store_import_prep_store_movie_num_IDX` (`store_movie_num`) USING BTREE,
  CONSTRAINT `store_import_prep_ext_id_name_FK` FOREIGN KEY (`ext_id_name`) REFERENCES `external_ids` (`ext_id_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_import_prep_store_movie_num_FK` FOREIGN KEY (`store_movie_num`) REFERENCES `store_inventory` (`store_movie_num`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Staging table for generating the export file used to import listings to the store site.';
/*!40101 SET character_set_client = @saved_cs_client */;
