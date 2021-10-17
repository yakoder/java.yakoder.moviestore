/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_crew` (
  `movie_crew_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) NOT NULL,
  `crew_id` int(11) NOT NULL,
  `crew_type_id` int(11) NOT NULL,
  `crew_is_star` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`movie_crew_id`),
  KEY `movie_crew_crew_type_id_FK` (`crew_type_id`),
  KEY `movie_crew_movie_id_IDX` (`movie_id`) USING BTREE,
  KEY `movie_crew_crew_id_IDX` (`crew_id`) USING BTREE,
  KEY `movie_crew_crew_id_type_IDX` (`crew_id`,`crew_type_id`) USING BTREE,
  KEY `movie_crew_crew_id_star_IDX` (`crew_id`,`crew_is_star`) USING BTREE,
  KEY `movie_crew_movie_id_crew_type_IDX` (`movie_id`,`crew_type_id`) USING BTREE,
  KEY `movie_crew_movie_id_crew_star_IDX` (`movie_id`,`crew_is_star`) USING BTREE,
  CONSTRAINT `movie_crew_crew_id_FK` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`crew_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie_crew_crew_type_id_FK` FOREIGN KEY (`crew_type_id`) REFERENCES `crew_types` (`crew_type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie_crew_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
