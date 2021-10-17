/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_akas` (
  `movie_aka_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) NOT NULL,
  `aka_id` int(11) NOT NULL,
  PRIMARY KEY (`movie_aka_id`),
  KEY `movie_akas_movie_id_IDX` (`movie_id`) USING BTREE,
  KEY `movie_akas_aka_id_IDX` (`aka_id`) USING BTREE,
  CONSTRAINT `movie_akas_aka_id_FK` FOREIGN KEY (`aka_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie_akas_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
