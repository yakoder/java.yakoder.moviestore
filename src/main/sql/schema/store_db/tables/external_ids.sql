/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_ids` (
  `ext_id` int(11) NOT NULL AUTO_INCREMENT,
  `grp_id` int(11) NOT NULL,
  `grp_movie_id` int(11) NOT NULL,
  `ext_id_name` varchar(100) NOT NULL,
  `inv_id` int(11) NOT NULL,
  PRIMARY KEY (`ext_id`),
  UNIQUE KEY `external_ids_ext_id_name_UN` (`ext_id_name`),
  KEY `external_ids_grp_movie_id_FK` (`grp_movie_id`),
  KEY `external_ids_grp_id_IDX` (`grp_id`) USING BTREE,
  KEY `external_ids_grp_movie_id_IDX` (`grp_id`,`grp_movie_id`) USING BTREE,
  KEY `external_ids_ext_id_name_IDX` (`ext_id_name`) USING BTREE,
  KEY `external_ids_inv_id_IDX` (`inv_id`) USING BTREE,
  CONSTRAINT `external_ids_grp_id_FK` FOREIGN KEY (`grp_id`) REFERENCES `groups` (`grp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `external_ids_grp_movie_id_FK` FOREIGN KEY (`grp_movie_id`) REFERENCES `group_movies` (`grp_movie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `external_ids_inv_id_FK` FOREIGN KEY (`inv_id`) REFERENCES `inventory` (`inv_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`jwarren`@`%`*/ /*!50003 TRIGGER create_new_ext_id_name
BEFORE INSERT
ON external_ids FOR EACH ROW
BEGIN 
	declare vListName varchar(100);
	declare iItemId int;

	-- Find list name
	select l.list_name into vListName from lists l where l.list_id = NEW.list_id;

	-- Find item id
	select lm.list_item_id into iItemId from list_movies lm where lm.list_movie_id = NEW.list_movie_id;

	set NEW.ext_id_name = concat(vListName, '-', cast(iItemId as char));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
