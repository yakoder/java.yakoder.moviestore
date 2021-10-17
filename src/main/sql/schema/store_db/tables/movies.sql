/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_title` varchar(255) NOT NULL,
  `movie_year` int(10) unsigned DEFAULT NULL,
  `movie_desc` varchar(255) DEFAULT NULL,
  `is_primary` tinyint(1) NOT NULL DEFAULT 0 COMMENT 'FALSE indicates entry is "aka" (see movie_akas)',
  `num_title_tracks` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_id`),
  KEY `movies_movie_title_IDX` (`movie_title`) USING BTREE,
  KEY `movies_movie_year_IDX` (`movie_year`) USING BTREE,
  KEY `movies_movie_title_year_IDX` (`movie_title`,`movie_year`) USING BTREE,
  KEY `movies_is_primary_IDX` (`is_primary`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
