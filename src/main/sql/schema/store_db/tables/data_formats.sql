/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_formats` (
  `data_fmt_id` int(11) NOT NULL AUTO_INCREMENT,
  `data_fmt_name` varchar(100) NOT NULL,
  `data_fmt_desc` varchar(255) DEFAULT NULL,
  `data_fmt_parser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`data_fmt_id`),
  KEY `data_formats_data_fmt_name_IDX` (`data_fmt_name`) USING BTREE,
  KEY `data_formats_data_fmt_name_parser_IDX` (`data_fmt_name`,`data_fmt_parser`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
