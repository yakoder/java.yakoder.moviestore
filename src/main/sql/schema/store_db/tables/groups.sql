/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `grp_id` int(11) NOT NULL AUTO_INCREMENT,
  `grp_key` varchar(10) NOT NULL,
  `grp_name` varchar(100) DEFAULT NULL,
  `grp_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`grp_id`),
  UNIQUE KEY `groups_grp_key_UN` (`grp_key`),
  KEY `groups_grp_key_IDX` (`grp_key`) USING BTREE,
  KEY `groups_grp_name_IDX` (`grp_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
