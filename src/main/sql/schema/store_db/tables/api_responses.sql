/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_responses` (
  `api_resp_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_id` int(11) NOT NULL,
  `api_resp_code` int(11) NOT NULL,
  `api_resp_text` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`api_resp_id`),
  KEY `api_responses_api_id_IDX` (`api_id`) USING BTREE,
  KEY `api_responses_api_resp_code_IDX` (`api_resp_code`) USING BTREE,
  KEY `api_responses_api_resp_text_IDX` (`api_resp_text`) USING BTREE,
  KEY `api_responses_api_id_code_IDX` (`api_id`,`api_resp_code`) USING BTREE,
  KEY `api_responses_api_id_text_IDX` (`api_id`,`api_resp_text`) USING BTREE,
  CONSTRAINT `api_responses_api_id_FK` FOREIGN KEY (`api_id`) REFERENCES `apis` (`api_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
