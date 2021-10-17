/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sites` (
  `site_id` int(11) NOT NULL AUTO_INCREMENT,
  `site_name` varchar(100) NOT NULL,
  `site_url` varchar(255) DEFAULT NULL,
  `site_priority` int(11) NOT NULL DEFAULT 1 COMMENT 'Lowest value = higher priority',
  `site_name_abbr` varchar(10) NOT NULL,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`site_id`),
  UNIQUE KEY `sites_site_name_UN` (`site_name_abbr`),
  UNIQUE KEY `sites_site_name_abbr_UN` (`site_name_abbr`),
  KEY `sites_site_name_IDX` (`site_name`) USING BTREE,
  KEY `sites_site_name_abbr_IDX` (`site_name_abbr`) USING BTREE,
  KEY `sites_is_enabled_IDX` (`is_enabled`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`jwarren`@`%`*/ /*!50003 TRIGGER site_name_abbr_ins_case
BEFORE INSERT
ON sites FOR EACH ROW
BEGIN
	SET NEW.site_name_abbr = UPPER(NEW.site_name_abbr);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`jwarren`@`%`*/ /*!50003 TRIGGER site_name_abbr_upd_case
BEFORE UPDATE
ON sites FOR EACH ROW
BEGIN
	SET NEW.site_name_abbr = UPPER(NEW.site_name_abbr);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
