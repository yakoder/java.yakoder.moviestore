/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `digitization_formats` (
  `digit_fmt_id` int(11) NOT NULL AUTO_INCREMENT,
  `digit_fmt_name` varchar(100) NOT NULL,
  `digit_fmt_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`digit_fmt_id`),
  UNIQUE KEY `digitization_formats_UN` (`digit_fmt_name`),
  KEY `digitization_formats_digit_fmt_name_IDX` (`digit_fmt_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
