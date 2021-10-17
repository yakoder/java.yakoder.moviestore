/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `digitization_statuses` (
  `digit_stat_id` int(11) NOT NULL AUTO_INCREMENT,
  `digit_stat_name` varchar(100) NOT NULL,
  `digit_stat_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`digit_stat_id`),
  KEY `digitization_statuses_digit_stat_name_IDX` (`digit_stat_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
