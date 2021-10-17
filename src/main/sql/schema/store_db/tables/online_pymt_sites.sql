/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `online_pymt_sites` (
  `ol_pymt_site_id` int(11) NOT NULL AUTO_INCREMENT,
  `ol_pymt_site_name` varchar(100) NOT NULL,
  `ol_pymt_site_url` varchar(255) NOT NULL,
  PRIMARY KEY (`ol_pymt_site_id`),
  KEY `online_pymt_sites_ol_pymt_site_name_IDX` (`ol_pymt_site_name`) USING BTREE,
  KEY `online_pymt_sites_ol_pymt_site_url_IDX` (`ol_pymt_site_url`) USING BTREE,
  KEY `online_pymt_sites_ol_pymt_site_name_url_IDX` (`ol_pymt_site_name`,`ol_pymt_site_url`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
