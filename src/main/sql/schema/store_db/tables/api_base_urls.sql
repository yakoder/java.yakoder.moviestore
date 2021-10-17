/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_base_urls` (
  `api_base_url_id` int(11) NOT NULL AUTO_INCREMENT,
  `site_id` int(11) NOT NULL,
  `api_base_url_name` varchar(100) NOT NULL,
  `api_base_url_url` varchar(255) NOT NULL,
  `api_base_url_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`api_base_url_id`),
  KEY `api_base_urls_site_id_IDX` (`site_id`) USING BTREE,
  KEY `api_base_urls_api_base_url_name_IDX` (`api_base_url_name`) USING BTREE,
  CONSTRAINT `api_base_urls_site_id_FK` FOREIGN KEY (`site_id`) REFERENCES `sites` (`site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
