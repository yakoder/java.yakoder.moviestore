/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_bonuses` (
  `store_bonus_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_bonus_name` varchar(100) NOT NULL,
  `store_bonus_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`store_bonus_id`),
  KEY `store_bonuses_store_bonus_name_IDX` (`store_bonus_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
