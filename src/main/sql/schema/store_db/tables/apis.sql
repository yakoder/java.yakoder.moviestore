/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apis` (
  `api_id` int(11) NOT NULL AUTO_INCREMENT,
  `site_id` int(11) NOT NULL,
  `api_name` varchar(100) NOT NULL,
  `api_desc` varchar(255) DEFAULT NULL,
  `api_url` varchar(255) NOT NULL,
  `is_template` tinyint(1) NOT NULL DEFAULT 1,
  `in_meth_id` int(11) NOT NULL,
  `out_fmt_id` int(11) NOT NULL,
  `api_docs` blob DEFAULT NULL,
  `api_base_url_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`api_id`),
  KEY `api_site_id_IDX` (`site_id`) USING BTREE,
  KEY `apis_api_name_IDX` (`api_name`) USING BTREE,
  KEY `apis_api_url_IDX` (`api_url`) USING BTREE,
  KEY `apis_site_id_name_url_IDX` (`site_id`,`api_name`,`api_url`) USING BTREE,
  KEY `apis_is_template_IDX` (`is_template`) USING BTREE,
  KEY `apis_site_id_template_IDX` (`site_id`,`is_template`) USING BTREE,
  KEY `apis_in_meth_id_FK` (`in_meth_id`),
  KEY `apis_out_fmt_id_FK` (`out_fmt_id`),
  KEY `apis_api_base_url_id_FK` (`api_base_url_id`),
  CONSTRAINT `site_apis_api_base_url_id_FK` FOREIGN KEY (`api_base_url_id`) REFERENCES `api_base_urls` (`api_base_url_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `site_apis_api_in_meth_id_FK` FOREIGN KEY (`in_meth_id`) REFERENCES `api_methods` (`api_meth_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `site_apis_api_out_fmt_id_FK` FOREIGN KEY (`out_fmt_id`) REFERENCES `data_formats` (`data_fmt_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `site_apis_site_id_FK` FOREIGN KEY (`site_id`) REFERENCES `sites` (`site_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
