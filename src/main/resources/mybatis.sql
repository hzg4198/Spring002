/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2023-09-05 10:09:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'rose', '12000');
INSERT INTO `account` VALUES ('2', 'jack', '8000');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '下单用户id',
  `number` varchar(32) NOT NULL COMMENT '订单号',
  `createtime` datetime NOT NULL COMMENT '创建订单时间',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('3', '1', '1000010', '2015-02-04 13:22:35', 'abc');
INSERT INTO `orders` VALUES ('4', '1', '1000011', '2015-02-03 13:22:41', 'aa');
INSERT INTO `orders` VALUES ('5', '10', '1000012', '2015-02-12 16:13:23', 'bbb');

-- ----------------------------
-- Table structure for tbl_log
-- ----------------------------
DROP TABLE IF EXISTS `tbl_log`;
CREATE TABLE `tbl_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(255) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_log
-- ----------------------------
INSERT INTO `tbl_log` VALUES ('24', '转账操作由1到2，金额:1000.0', '2023-08-01');
INSERT INTO `tbl_log` VALUES ('25', '转账操作由1到2，金额:2000.0', '2023-08-01');
INSERT INTO `tbl_log` VALUES ('26', '转账操作由1到2，金额:3000.0', '2023-08-01');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张飞', null, '2', '北京市');
INSERT INTO `user` VALUES ('10', '张三', '2014-07-10', '1', '北京市');
INSERT INTO `user` VALUES ('16', '张小明', null, '1', '河南郑州');
INSERT INTO `user` VALUES ('22', '陈小明', null, '1', '河南郑州');
INSERT INTO `user` VALUES ('24', '张三丰', null, '1', '河南郑州');
INSERT INTO `user` VALUES ('25', '陈小明', null, '1', '河南郑州');
INSERT INTO `user` VALUES ('26', '王五', null, null, null);
INSERT INTO `user` VALUES ('28', '张良', '2023-05-22', '1', 'cuit');
INSERT INTO `user` VALUES ('29', '张良', '2023-05-22', '2', 'cuit');
INSERT INTO `user` VALUES ('31', '张良', '2023-05-22', '2', 'cuit');
INSERT INTO `user` VALUES ('33', '跟比老张', null, null, null);
INSERT INTO `user` VALUES ('34', '跟比老张', null, null, null);
INSERT INTO `user` VALUES ('35', 'qiweikai', null, null, 'cuit');
INSERT INTO `user` VALUES ('36', '老王', null, null, '成都');
INSERT INTO `user` VALUES ('41', '张飞', '2023-08-03', '1', '成都');
INSERT INTO `user` VALUES ('42', '张飞', '2023-08-03', '1', '成都');
INSERT INTO `user` VALUES ('44', 'wang', '2023-08-03', '1', 'cuiot');
INSERT INTO `user` VALUES ('45', 'wang', '2023-08-03', '1', 'cuiot');
