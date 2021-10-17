/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimb_detail_tables` (
  `reimb_detail_table_id` int(11) NOT NULL AUTO_INCREMENT,
  `reimb_detail_table_name` varchar(100) NOT NULL,
  PRIMARY KEY (`reimb_detail_table_id`),
  UNIQUE KEY `reimb_detail_tables_UN` (`reimb_detail_table_name`),
  KEY `reimb_detail_tables_reimb_detail_table_name_IDX` (`reimb_detail_table_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
