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
