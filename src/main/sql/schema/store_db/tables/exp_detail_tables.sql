/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exp_detail_tables` (
  `exp_detail_table_id` int(11) NOT NULL AUTO_INCREMENT,
  `exp_detail_table_name` varchar(100) NOT NULL,
  PRIMARY KEY (`exp_detail_table_id`),
  UNIQUE KEY `exp_detail_tables_exp_detail_table_name_UN` (`exp_detail_table_name`),
  KEY `exp_detail_tables_exp_detail_table_name_IDX` (`exp_detail_table_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
