/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `price_override_reasons` (
  `override_reason_id` int(11) NOT NULL AUTO_INCREMENT,
  `override_reason_name` varchar(100) NOT NULL,
  `override_reason_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`override_reason_id`),
  KEY `price_override_reasons_override_reason_name_IDX` (`override_reason_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
