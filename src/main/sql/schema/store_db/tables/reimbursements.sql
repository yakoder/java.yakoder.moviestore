/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimbursements` (
  `reimb_id` int(11) NOT NULL AUTO_INCREMENT,
  `reimb_date` date NOT NULL,
  `reimb_amount` decimal(15,2) NOT NULL,
  `reimb_meth_id` int(11) NOT NULL,
  `reimb_detail_id` int(11) NOT NULL,
  `reimb_notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`reimb_id`),
  KEY `reimbursements_reimb_date_IDX` (`reimb_date`) USING BTREE,
  KEY `reimbursements_reimb_meth_id_IDX` (`reimb_meth_id`) USING BTREE,
  KEY `reimbursements_reimb_detail_id_IDX` (`reimb_detail_id`) USING BTREE,
  CONSTRAINT `reimbursements_reimb_detail_id_checks_FK` FOREIGN KEY (`reimb_detail_id`) REFERENCES `reimb_checks` (`reimb_detail_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reimbursements_reimb_detail_id_online_FK` FOREIGN KEY (`reimb_detail_id`) REFERENCES `reimb_online` (`reimb_detail_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reimbursements_reimb_meth_id_FK` FOREIGN KEY (`reimb_meth_id`) REFERENCES `reimb_methods` (`reimb_meth_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
