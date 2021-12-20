create database sharding_jdbc;

CREATE TABLE `order_main_0` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                `serial_id` varchar(20) DEFAULT NULL,
                                `piece_key` bigint(20) DEFAULT NULL,
                                `member_id` bigint(20) DEFAULT NULL,
                                `order_status` int(10) DEFAULT NULL,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
CREATE TABLE `order_main_1` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                `serial_id` varchar(20) DEFAULT NULL,
                                `piece_key` bigint(20) DEFAULT NULL,
                                `member_id` bigint(20) DEFAULT NULL,
                                `order_status` int(10) DEFAULT NULL,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;