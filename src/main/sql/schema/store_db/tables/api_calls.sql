/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_calls` (
  `api_call_id` int(11) NOT NULL AUTO_INCREMENT,
  `api_id` int(11) NOT NULL,
  `api_call_dt` datetime NOT NULL,
  `api_call_cnt` int(11) NOT NULL,
  PRIMARY KEY (`api_call_id`),
  KEY `api_calls_api_id_IDX` (`api_id`) USING BTREE,
  KEY `api_calls_api_call_dt_IDX` (`api_call_dt`) USING BTREE,
  KEY `api_calls_api_id_dt_IDX` (`api_id`,`api_call_dt`) USING BTREE,
  KEY `api_calls_api_id_cnt_IDX` (`api_id`,`api_call_cnt`) USING BTREE,
  CONSTRAINT `api_calls_api_id_FK` FOREIGN KEY (`api_id`) REFERENCES `apis` (`api_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
