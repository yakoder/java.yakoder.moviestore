/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimb_methods` (
  `reimb_meth_id` int(11) NOT NULL AUTO_INCREMENT,
  `reimb_meth_name` varchar(100) NOT NULL,
  `reimb_meth_desc` varchar(255) DEFAULT NULL,
  `reimb_detail_table_id` int(11) NOT NULL,
  PRIMARY KEY (`reimb_meth_id`),
  KEY `reimb_types_reimb_meth_name_IDX` (`reimb_meth_name`) USING BTREE,
  KEY `reimb_methods_reimb_detail_table_id_IDX` (`reimb_detail_table_id`) USING BTREE,
  KEY `reimb_methods_reimb_meth_id_table_IDX` (`reimb_meth_id`,`reimb_detail_table_id`) USING BTREE,
  KEY `reimb_methods_reimb_meth_name_table_IDX` (`reimb_meth_name`,`reimb_detail_table_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
