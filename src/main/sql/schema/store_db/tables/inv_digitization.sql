/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inv_digitization` (
  `inv_digit_id` int(11) NOT NULL AUTO_INCREMENT,
  `inv_id` int(11) NOT NULL,
  `digit_stat_id` int(11) DEFAULT NULL,
  `digit_sw_id` int(11) DEFAULT NULL,
  `digit_fmt_id` int(11) DEFAULT NULL,
  `notes` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`inv_digit_id`),
  KEY `inv_digitization_inv_id_IDX` (`inv_id`) USING BTREE,
  KEY `inv_digitization_digit_stat_id_IDX` (`digit_stat_id`) USING BTREE,
  KEY `inv_digitization_digit_sw_id_IDX` (`digit_sw_id`) USING BTREE,
  KEY `inv_digitization_digit_fmt_id_IDX` (`digit_fmt_id`) USING BTREE,
  CONSTRAINT `inv_digitization_digit_fmt_id_FK` FOREIGN KEY (`digit_fmt_id`) REFERENCES `digitization_formats` (`digit_fmt_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inv_digitization_digit_stat_id_FK` FOREIGN KEY (`digit_stat_id`) REFERENCES `digitization_statuses` (`digit_stat_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inv_digitization_digit_sw_id_FK` FOREIGN KEY (`digit_sw_id`) REFERENCES `digitization_software` (`digit_sw_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inv_digitization_inv_id_FK` FOREIGN KEY (`inv_id`) REFERENCES `inventory` (`inv_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
