/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_users` (
  `api_usr_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_id` int(11) NOT NULL,
  `api_usr_username` varchar(100) NOT NULL,
  `api_usr_email` varchar(255) DEFAULT NULL,
  `is_enabled` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`api_usr_id`),
  KEY `api_users_api_id_IDX` (`api_id`) USING BTREE,
  KEY `api_users_api_usr_username_IDX` (`api_usr_username`) USING BTREE,
  KEY `api_users_api_usr_email_IDX` (`api_usr_email`) USING BTREE,
  KEY `api_users_is_enabled_IDX` (`is_enabled`) USING BTREE,
  KEY `api_users_api_id_enabled_IDX` (`api_id`,`is_enabled`) USING BTREE,
  CONSTRAINT `api_users_api_id_FK` FOREIGN KEY (`api_id`) REFERENCES `apis` (`api_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
