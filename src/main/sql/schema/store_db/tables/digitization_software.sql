/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `digitization_software` (
  `digit_sw_id` int(11) NOT NULL AUTO_INCREMENT,
  `digit_sw_name` varchar(100) NOT NULL,
  `digit_sw_desc` varchar(255) DEFAULT NULL,
  `digit_sw_version` varchar(100) DEFAULT NULL,
  `digit_sw_is_enabled` tinyint(1) NOT NULL DEFAULT 0,
  `digit_sw_config` blob DEFAULT NULL COMMENT 'Software configuration file',
  `digit_sw_preset` blob DEFAULT NULL COMMENT 'Preset file used',
  `digit_sw_config_filename` varchar(100) DEFAULT NULL,
  `digit_sw_preset_filename` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`digit_sw_id`),
  KEY `digitization_software_digit_sw_name_IDX` (`digit_sw_name`) USING BTREE,
  KEY `digitization_software_digit_sw_version_IDX` (`digit_sw_version`) USING BTREE,
  KEY `digitization_software_digit_sw_name_version_IDX` (`digit_sw_name`,`digit_sw_version`) USING BTREE,
  KEY `digitization_software_digit_sw_is_enabled_IDX` (`digit_sw_is_enabled`) USING BTREE,
  KEY `digitization_software_digit_sw_name_enabled_IDX` (`digit_sw_name`,`digit_sw_is_enabled`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
