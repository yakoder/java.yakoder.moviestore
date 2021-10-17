/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `site_movies` (
  `site_movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `site_id` int(11) NOT NULL,
  `movie_id` int(11) NOT NULL,
  `site_movie_num` varchar(100) DEFAULT NULL,
  `site_movie_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`site_movie_id`),
  KEY `site_movies_site_id_IDX` (`site_id`) USING BTREE,
  KEY `site_movies_movie_id_IDX` (`movie_id`) USING BTREE,
  KEY `site_movies_site_movie_num_IDX` (`site_movie_num`) USING BTREE,
  CONSTRAINT `site_movies_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `site_movies_site_id_FK` FOREIGN KEY (`site_id`) REFERENCES `sites` (`site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
