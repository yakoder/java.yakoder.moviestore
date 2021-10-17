/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exp_types` (
  `exp_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `exp_type_name` varchar(100) NOT NULL,
  `exp_type_desc` varchar(255) DEFAULT NULL,
  `exp_detail_table_id` int(11) NOT NULL,
  PRIMARY KEY (`exp_type_id`),
  KEY `exp_types_exp_type_name_IDX` (`exp_type_name`) USING BTREE,
  KEY `exp_types_exp_detail_table_id_IDX` (`exp_detail_table_id`) USING BTREE,
  KEY `exp_types_exp_type_name_table_IDX` (`exp_type_name`,`exp_detail_table_id`) USING BTREE,
  KEY `exp_types_exp_type_id_table_IDX` (`exp_type_id`,`exp_detail_table_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
