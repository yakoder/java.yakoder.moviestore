/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimb_online` (
  `reimb_detail_id` int(11) NOT NULL DEFAULT nextval(`store_db`.`reimb_detail_id_seq`),
  `ol_pymt_site_id` int(11) NOT NULL,
  `payor_id` int(11) NOT NULL,
  `payee_id` int(11) NOT NULL,
  PRIMARY KEY (`reimb_detail_id`),
  KEY `reimb_online_ol_pymt_site_id_IDX` (`ol_pymt_site_id`) USING BTREE,
  KEY `reimb_online_payor_id_IDX` (`payor_id`) USING BTREE,
  KEY `reimb_online_payee_id_IDX` (`payee_id`) USING BTREE,
  CONSTRAINT `reimb_online_ol_pymt_site_id_FK` FOREIGN KEY (`ol_pymt_site_id`) REFERENCES `online_pymt_sites` (`ol_pymt_site_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reimb_online_payee_id_FK` FOREIGN KEY (`payee_id`) REFERENCES `txn_parties` (`txn_party_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reimb_online_payor_id_FK` FOREIGN KEY (`payor_id`) REFERENCES `txn_parties` (`txn_party_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
