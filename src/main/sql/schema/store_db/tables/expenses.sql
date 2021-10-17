/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expenses` (
  `exp_id` int(11) NOT NULL AUTO_INCREMENT,
  `exp_date` date NOT NULL,
  `exp_amount` decimal(15,2) NOT NULL,
  `exp_type_id` int(11) NOT NULL,
  `exp_detail_id` int(11) NOT NULL,
  `exp_notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`exp_id`),
  KEY `expenses_exp_detail_id_shipping_FK` (`exp_detail_id`),
  KEY `expenses_exp_date_IDX` (`exp_date`) USING BTREE,
  KEY `expenses_exp_type_id_IDX` (`exp_type_id`) USING BTREE,
  CONSTRAINT `expenses_exp_detail_id_movies_FK` FOREIGN KEY (`exp_detail_id`) REFERENCES `exp_movies` (`exp_detail_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `expenses_exp_detail_id_shipping_FK` FOREIGN KEY (`exp_detail_id`) REFERENCES `exp_shipping` (`exp_detail_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `expenses_exp_detail_id_supplies_FK` FOREIGN KEY (`exp_detail_id`) REFERENCES `exp_supplies` (`exp_detail_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `expenses_exp_type_id_FK` FOREIGN KEY (`exp_type_id`) REFERENCES `exp_types` (`exp_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
