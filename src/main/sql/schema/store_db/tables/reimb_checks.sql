/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimb_checks` (
  `reimb_detail_id` int(11) NOT NULL DEFAULT nextval(`store_db`.`reimb_detail_id_seq`),
  `payor_id` int(11) NOT NULL,
  `payee_id` int(11) NOT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `ck_number` varchar(100) DEFAULT NULL,
  `ck_is_cancelled` tinyint(1) NOT NULL DEFAULT 0,
  `ck_cx_date` date DEFAULT NULL COMMENT 'Date check is cancelled',
  PRIMARY KEY (`reimb_detail_id`),
  KEY `reimb_checks_ck_is_cancelled_IDX` (`ck_is_cancelled`) USING BTREE,
  KEY `reimb_checks_ck_cx_date_IDX` (`ck_cx_date`) USING BTREE,
  KEY `reimb_checks_payor_id_IDX` (`payor_id`) USING BTREE,
  KEY `reimb_checks_payee_id_IDX` (`payee_id`) USING BTREE,
  CONSTRAINT `reimb_checks_payee_id_FK` FOREIGN KEY (`payee_id`) REFERENCES `txn_parties` (`txn_party_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reimb_checks_payor_id_FK` FOREIGN KEY (`payor_id`) REFERENCES `txn_parties` (`txn_party_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
