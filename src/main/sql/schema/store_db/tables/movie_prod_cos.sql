/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_prod_cos` (
  `movie_prod_co_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) NOT NULL,
  `prod_co_id` int(11) NOT NULL,
  `prod_co_type_id` int(11) NOT NULL,
  PRIMARY KEY (`movie_prod_co_id`),
  KEY `movie_prod_cos_movie_id_FK` (`movie_id`),
  KEY `movie_prod_cos_prod_co_id_FK` (`prod_co_id`),
  KEY `movie_prod_cos_prod_co_type_id_FK` (`prod_co_type_id`),
  CONSTRAINT `movie_prod_cos_movie_id_FK` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`movie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie_prod_cos_prod_co_id_FK` FOREIGN KEY (`prod_co_id`) REFERENCES `prod_cos` (`prod_co_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `movie_prod_cos_prod_co_type_id_FK` FOREIGN KEY (`prod_co_type_id`) REFERENCES `prod_co_types` (`prod_co_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
