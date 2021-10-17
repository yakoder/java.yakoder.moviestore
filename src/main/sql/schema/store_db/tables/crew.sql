/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew` (
  `crew_id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_name_full` varchar(255) NOT NULL,
  `crew_name_last` varchar(100) DEFAULT NULL,
  `crew_name_first` varchar(100) DEFAULT NULL,
  `crew_gender_id` char(1) NOT NULL,
  `crew_birth_year` int(10) unsigned DEFAULT NULL,
  `crew_death_year` int(10) unsigned DEFAULT NULL,
  `crew_is_deceased` tinyint(1) NOT NULL DEFAULT 0,
  `crew_is_alias` tinyint(1) NOT NULL DEFAULT 0,
  `crew_has_aliases` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`crew_id`),
  KEY `crew_crew_name_full_IDX` (`crew_name_full`) USING BTREE,
  KEY `crew_crew_name_last_IDX` (`crew_name_last`) USING BTREE,
  KEY `crew_crew_name_first_IDX` (`crew_name_first`) USING BTREE,
  KEY `crew_crew_name_last_first_IDX` (`crew_name_last`,`crew_name_first`) USING BTREE,
  KEY `crew_crew_gender_id_IDX` (`crew_gender_id`) USING BTREE,
  KEY `crew_crew_is_deceased_IDX` (`crew_is_deceased`) USING BTREE,
  KEY `crew_crew_birth_year_IDX` (`crew_birth_year`) USING BTREE,
  KEY `crew_crew_death_year_IDX` (`crew_death_year`) USING BTREE,
  KEY `crew_crew_has_aliases_IDX` (`crew_has_aliases`) USING BTREE,
  KEY `crew_crew_is_alias_IDX` (`crew_is_alias`) USING BTREE,
  CONSTRAINT `crew_crew_gender_id_FK` FOREIGN KEY (`crew_gender_id`) REFERENCES `crew_genders` (`crew_gender_code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
