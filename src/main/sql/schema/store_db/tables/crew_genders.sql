/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_genders` (
  `crew_gender_code` char(1) NOT NULL,
  `crew_gender_name` varchar(100) NOT NULL,
  PRIMARY KEY (`crew_gender_code`),
  KEY `crew_genders_crew_gender_name_IDX` (`crew_gender_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
