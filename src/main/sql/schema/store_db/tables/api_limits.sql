/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_limits` (
  `api_limit_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_id` int(11) NOT NULL,
  `api_limit_type_id` int(11) NOT NULL,
  `api_type_value` int(11) NOT NULL,
  PRIMARY KEY (`api_limit_id`),
  KEY `api_limits_api_id_IDX` (`api_id`) USING BTREE,
  KEY `api_limits_api_limit_type_id_IDX` (`api_limit_type_id`) USING BTREE,
  KEY `api_limits_api_id_limit_type_IDX` (`api_id`,`api_limit_type_id`) USING BTREE,
  CONSTRAINT `api_limits_api_id_FK` FOREIGN KEY (`api_id`) REFERENCES `apis` (`api_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `api_limits_api_limit_type_id_FK` FOREIGN KEY (`api_limit_type_id`) REFERENCES `api_limit_types` (`api_limit_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
