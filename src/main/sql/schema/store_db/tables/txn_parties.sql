/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `txn_parties` (
  `txn_party_id` int(11) NOT NULL AUTO_INCREMENT,
  `txn_party_name` varchar(100) NOT NULL,
  `txn_party_email` varchar(255) DEFAULT NULL,
  `txn_party_phone` varchar(20) DEFAULT NULL,
  `txn_party_addr_1` varchar(100) DEFAULT NULL,
  `txn_party_addr_2` varchar(100) DEFAULT NULL,
  `txn_party_city` varchar(100) DEFAULT NULL,
  `txn_party_state` char(2) DEFAULT NULL,
  `txn_party_zip` varchar(10) DEFAULT NULL,
  `txn_party_acct_num` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`txn_party_id`),
  KEY `txn_parties_txn_party_name_IDX` (`txn_party_name`) USING BTREE,
  KEY `txn_parties_txn_party_email_IDX` (`txn_party_email`) USING BTREE,
  KEY `txn_parties_txn_party_phone_IDX` (`txn_party_phone`) USING BTREE,
  KEY `txn_parties_txn_party_state_IDX` (`txn_party_state`) USING BTREE,
  KEY `txn_parties_txn_party_zip_IDX` (`txn_party_zip`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
