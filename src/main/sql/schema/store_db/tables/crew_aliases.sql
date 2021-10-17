/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_aliases` (
  `crew_alias_id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_id` int(11) NOT NULL,
  `alias_id` int(11) NOT NULL,
  PRIMARY KEY (`crew_alias_id`),
  KEY `crew_aliases_crew_id_FK` (`crew_id`),
  KEY `crew_aliases_alias_id_FK` (`alias_id`),
  CONSTRAINT `crew_aliases_alias_id_FK` FOREIGN KEY (`alias_id`) REFERENCES `crew` (`crew_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `crew_aliases_crew_id_FK` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`crew_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
