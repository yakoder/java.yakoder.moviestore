/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_feedback` (
  `cust_fb_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_fb_rating` int(11) DEFAULT NULL,
  `rating_max_value` int(11) DEFAULT NULL,
  `cust_fb_comments` varchar(100) DEFAULT NULL,
  `cust_fb_date` date DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cust_fb_id`),
  KEY `customer_feedback_order_id_IDX` (`order_id`) USING BTREE,
  KEY `customer_feedback_cust_fb_date_IDX` (`cust_fb_date`) USING BTREE,
  KEY `customer_feedback_cust_fb_rating_IDX` (`cust_fb_rating`) USING BTREE,
  CONSTRAINT `customer_feedback_order_id_FK` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
