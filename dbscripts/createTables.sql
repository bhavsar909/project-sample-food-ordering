use `FO`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `phoneNumber` varchar(128) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `item_category` tinyint(128) DEFAULT NULL,
  `description` varchar(128) DEFAULT NULL,
  `cost` DOUBLE(10, 5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;




DROP TABLE IF EXISTS `Order`;

CREATE TABLE `Order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `total_amount` DOUBLE(10, 2) DEFAULT NULL,
    `createDate` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP(),
  `updateDate` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `OrdeitemrItemMap`;

CREATE TABLE `FO`.`OrderItemMap` (
  `order_id` INT NULL,
  `item_id` INT NULL,
  INDEX `fk_OrderItemMap_1_idx` (`order_id` ASC),
  INDEX `fk_OrderItemMap_2_idx` (`item_id` ASC),
  CONSTRAINT `fk_OrderItemMap_1`
    FOREIGN KEY (`order_id`)
    REFERENCES `FO`.`Order` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_OrderItemMap_2`
    FOREIGN KEY (`item_id`)
    REFERENCES `FO`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
