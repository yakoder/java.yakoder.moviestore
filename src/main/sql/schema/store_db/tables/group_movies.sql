/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_movies` (
  `grp_movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `grp_id` int(11) NOT NULL,
  `grp_movie_item_num` int(11) NOT NULL,
  PRIMARY KEY (`grp_movie_id`),
  KEY `group_movies_grp_id_IDX` (`grp_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
