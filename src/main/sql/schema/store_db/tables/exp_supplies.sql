/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exp_supplies` (
  `exp_detail_id` int(11) NOT NULL DEFAULT nextval(`store_db`.`exp_detail_id_seq`),
  `supply_type_id` int(11) NOT NULL,
  `store_name` varchar(100) DEFAULT NULL,
  `exp_subtotal` decimal(15,2) DEFAULT NULL,
  `exp_tax` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`exp_detail_id`),
  KEY `exp_supplies_supply_type_id_IDX` (`supply_type_id`) USING BTREE,
  KEY `exp_supplies_store_name_IDX` (`store_name`) USING BTREE,
  CONSTRAINT `exp_supplies_supply_type_id_FK` FOREIGN KEY (`supply_type_id`) REFERENCES `supply_types` (`supply_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
