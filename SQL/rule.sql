/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50151
Source Host           : 127.0.0.1:3306
Source Database       : rule

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2015-09-12 11:02:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_action
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `dateEntered` date DEFAULT NULL,
  `dateModified` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `actionMetaId` int(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('1', '2013-04-17', '2013-04-17', null, null, '1');
INSERT INTO `t_action` VALUES ('2', '2013-04-17', '2013-04-17', null, null, '1');
INSERT INTO `t_action` VALUES ('3', '2013-04-17', '2013-04-17', null, null, '1');
INSERT INTO `t_action` VALUES ('4', '2013-04-17', '2013-04-17', null, null, '1');
INSERT INTO `t_action` VALUES ('5', '2013-04-17', '2013-04-17', null, null, '1');
INSERT INTO `t_action` VALUES ('8', '2013-04-19', '2013-04-19', null, null, '3');
INSERT INTO `t_action` VALUES ('9', '2013-04-19', '2013-04-19', null, null, '1');
INSERT INTO `t_action` VALUES ('10', '2013-04-19', '2013-04-19', null, null, '2');
INSERT INTO `t_action` VALUES ('11', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('12', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('13', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('14', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('15', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('16', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('17', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('18', '2013-04-22', '2013-04-22', null, null, '1');
INSERT INTO `t_action` VALUES ('19', '2013-04-23', '2013-04-23', null, null, '1');
INSERT INTO `t_action` VALUES ('20', '2013-04-23', '2013-04-23', null, null, '1');
INSERT INTO `t_action` VALUES ('21', '2013-04-23', '2013-04-23', null, null, '1');
INSERT INTO `t_action` VALUES ('22', '2013-04-23', '2013-04-23', null, null, '1');
INSERT INTO `t_action` VALUES ('24', '2013-04-23', '2013-04-23', null, null, '1');
INSERT INTO `t_action` VALUES ('25', '2013-04-24', '2013-04-24', null, null, '6');
INSERT INTO `t_action` VALUES ('26', '2013-04-24', '2013-04-24', null, null, '6');
INSERT INTO `t_action` VALUES ('30', '2013-04-24', '2013-04-24', null, null, '6');
INSERT INTO `t_action` VALUES ('31', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('32', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('33', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('34', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('35', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('36', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('37', '2013-04-24', '2013-04-24', null, null, '7');
INSERT INTO `t_action` VALUES ('38', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('39', '2013-04-25', '2013-04-25', null, null, '8');
INSERT INTO `t_action` VALUES ('41', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('42', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('43', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('44', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('45', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('46', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('47', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('48', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('49', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('50', '2013-04-25', '2013-04-25', null, null, '7');
INSERT INTO `t_action` VALUES ('54', '2015-08-04', '2015-08-04', null, null, '7');
INSERT INTO `t_action` VALUES ('55', '2015-08-04', '2015-08-04', null, null, '7');
INSERT INTO `t_action` VALUES ('56', '2015-08-04', '2015-08-04', null, null, '7');
INSERT INTO `t_action` VALUES ('65', '2015-08-19', '2015-08-19', null, null, '7');

-- ----------------------------
-- Table structure for t_action_meta
-- ----------------------------
DROP TABLE IF EXISTS `t_action_meta`;
CREATE TABLE `t_action_meta` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `methodC` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `classC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action_meta
-- ----------------------------
INSERT INTO `t_action_meta` VALUES ('7', 'com.hxrainbow.rule.action.PointActionImpl', '赠送积分', '赠送积分', null);
INSERT INTO `t_action_meta` VALUES ('8', 'com.hxrainbow.rule.action.PointActionImpl', '赠送积分(指定人)', '指定人赠送积分', null);
INSERT INTO `t_action_meta` VALUES ('9', 'MIN', '求最小值', '求两个数中的最小值', 'com.hxrainbow.rule.action.CreditCheckActionImpl');

-- ----------------------------
-- Table structure for t_action_meta_variable
-- ----------------------------
DROP TABLE IF EXISTS `t_action_meta_variable`;
CREATE TABLE `t_action_meta_variable` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `identify` varchar(100) DEFAULT NULL,
  `actionMetaId` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_action_meta_variable
-- ----------------------------
INSERT INTO `t_action_meta_variable` VALUES ('7', '赠送人', 'memberId', '6');
INSERT INTO `t_action_meta_variable` VALUES ('8', '赠送积分', 'point', '6');
INSERT INTO `t_action_meta_variable` VALUES ('9', '积分数', 'point', '7');
INSERT INTO `t_action_meta_variable` VALUES ('10', '赠送对象', 'id', '8');
INSERT INTO `t_action_meta_variable` VALUES ('11', '赠送积分', 'point', '8');
INSERT INTO `t_action_meta_variable` VALUES ('32', 'a', 'd', null);
INSERT INTO `t_action_meta_variable` VALUES ('33', 'b', 'b', null);
INSERT INTO `t_action_meta_variable` VALUES ('36', 'e', 'd', '12');
INSERT INTO `t_action_meta_variable` VALUES ('37', 'c', 'b', '12');
INSERT INTO `t_action_meta_variable` VALUES ('38', '参数1', 'int', '9');
INSERT INTO `t_action_meta_variable` VALUES ('39', '参数2', 'int', '9');

-- ----------------------------
-- Table structure for t_action_variable
-- ----------------------------
DROP TABLE IF EXISTS `t_action_variable`;
CREATE TABLE `t_action_variable` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `actionId` int(10) DEFAULT NULL,
  `variableId` int(10) DEFAULT NULL,
  `variableValue` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_action_variable
-- ----------------------------
INSERT INTO `t_action_variable` VALUES ('1', '25', '7', '222');
INSERT INTO `t_action_variable` VALUES ('2', '25', '8', '333');
INSERT INTO `t_action_variable` VALUES ('3', '26', '7', '111');
INSERT INTO `t_action_variable` VALUES ('4', '26', '8', '2222');
INSERT INTO `t_action_variable` VALUES ('5', '27', '7', '111');
INSERT INTO `t_action_variable` VALUES ('6', '27', '8', '2222');
INSERT INTO `t_action_variable` VALUES ('7', '28', '7', '222');
INSERT INTO `t_action_variable` VALUES ('8', '28', '8', '333');
INSERT INTO `t_action_variable` VALUES ('9', '29', '7', '11');
INSERT INTO `t_action_variable` VALUES ('10', '29', '8', '22');
INSERT INTO `t_action_variable` VALUES ('11', '30', '7', '123');
INSERT INTO `t_action_variable` VALUES ('12', '30', '8', '12');
INSERT INTO `t_action_variable` VALUES ('13', '31', '9', '2');
INSERT INTO `t_action_variable` VALUES ('14', '32', '9', '5');
INSERT INTO `t_action_variable` VALUES ('15', '33', '9', '10');
INSERT INTO `t_action_variable` VALUES ('16', '34', '9', '2');
INSERT INTO `t_action_variable` VALUES ('17', '35', '9', '150');
INSERT INTO `t_action_variable` VALUES ('18', '36', '9', '15');
INSERT INTO `t_action_variable` VALUES ('19', '37', '9', '100');
INSERT INTO `t_action_variable` VALUES ('20', '38', '9', '1');
INSERT INTO `t_action_variable` VALUES ('21', '39', '10', '$64$');
INSERT INTO `t_action_variable` VALUES ('22', '39', '11', '100');
INSERT INTO `t_action_variable` VALUES ('23', '40', '9', '100');
INSERT INTO `t_action_variable` VALUES ('24', '41', '9', '100');
INSERT INTO `t_action_variable` VALUES ('25', '42', '9', '10');
INSERT INTO `t_action_variable` VALUES ('26', '43', '9', '$67$*50');
INSERT INTO `t_action_variable` VALUES ('27', '44', '9', '50');
INSERT INTO `t_action_variable` VALUES ('28', '45', '9', '20');
INSERT INTO `t_action_variable` VALUES ('29', '46', '9', '50');
INSERT INTO `t_action_variable` VALUES ('30', '47', '9', '$71$*10');
INSERT INTO `t_action_variable` VALUES ('31', '48', '9', '150');
INSERT INTO `t_action_variable` VALUES ('32', '49', '9', '150');
INSERT INTO `t_action_variable` VALUES ('33', '50', '9', '2*3');
INSERT INTO `t_action_variable` VALUES ('35', '52', '9', '2');
INSERT INTO `t_action_variable` VALUES ('41', '63', '9', '134');
INSERT INTO `t_action_variable` VALUES ('42', '64', '9', '344');
INSERT INTO `t_action_variable` VALUES ('43', '65', '9', '467');

-- ----------------------------
-- Table structure for t_apply
-- ----------------------------
DROP TABLE IF EXISTS `t_apply`;
CREATE TABLE `t_apply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `phoneNum` varchar(255) DEFAULT NULL,
  `certificateType` int(11) DEFAULT NULL,
  `idCard` varchar(255) DEFAULT NULL,
  `industry` int(11) DEFAULT NULL,
  `companyType` int(11) DEFAULT NULL,
  `position` int(11) DEFAULT NULL,
  `education` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contactName` varchar(255) DEFAULT NULL,
  `contactPhoneNum` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `IP` varchar(255) DEFAULT NULL,
  `LBS` varchar(255) DEFAULT NULL,
  `MACID` varchar(255) DEFAULT NULL,
  `workTime` int(11) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `bnRegisterTime` datetime DEFAULT NULL,
  `bnOrderNum` int(11) DEFAULT NULL,
  `bnRecivePhone` varchar(255) DEFAULT NULL,
  `bnAllTimes` int(11) DEFAULT NULL,
  `bnAllMoney` int(11) DEFAULT NULL,
  `bnBackRate` float(26,15) DEFAULT NULL,
  `bnMonthMoney` int(11) DEFAULT NULL,
  `price` float(21,10) DEFAULT NULL,
  `bnAvgPrice` float(21,10) DEFAULT NULL,
  `reciveAddr` int(11) DEFAULT NULL,
  `fitProduct` varchar(255) DEFAULT NULL,
  `applyMoney` int(11) DEFAULT NULL,
  `applyRepayTime` int(11) DEFAULT NULL,
  `applyRate` int(11) DEFAULT NULL,
  `applyDeadline` int(11) DEFAULT NULL,
  `applyTime` datetime DEFAULT NULL,
  `preResult` int(11) DEFAULT NULL,
  `preDate` datetime DEFAULT NULL,
  `userType` varchar(255) DEFAULT NULL,
  `cheatType` varchar(255) DEFAULT NULL,
  `cheatContent` varchar(255) DEFAULT NULL,
  `cheatTime` datetime DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `creditCheckRst` varchar(255) DEFAULT NULL,
  `grade` int(11) DEFAULT NULL,
  `baseQuota` float(21,10) DEFAULT NULL,
  `enableQuota` int(11) DEFAULT NULL,
  `creditCheckTime` datetime DEFAULT NULL,
  `creditCheckRate` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=285 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_apply
-- ----------------------------
INSERT INTO `t_apply` VALUES ('1', '131026197708092331', '张1', '0', '13310890120', '0', '131026197708092331', '0', '0', '0', '0', 'xxxxx', '李1', '13522371210', 'test30@126.com', '123.234.112', '173568', '37669', '2', '1000', '2015-01-01 00:00:00', '201508121', '13310890120', '0', '100764', '0.416980117559433', '8397', '2879.0000000000', '1919.0000000000', '2', null, '9928', '1', null, null, '2015-09-02 11:14:51', '21', '2015-09-02 11:14:53', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('14', '2201021972080983234', '张14', '2', '13310890131', '0', '2201021972080983234', '1', '1', '1', '1', 'xx1xx,22freed.rd', '李14', '13522371223', 'test30@126.com', '123.234.112', '173568', '37669', '0', '1000', '2015-01-01 00:00:00', '201508133', '13310890131', '17', '23724', '0.329010963439941', '1977', '678.0000000000', '452.0000000000', '2', null, '2412', '1', null, null, '2015-09-02 11:18:51', '21', '2015-09-02 11:18:51', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('15', '2201021973080983234', '张15', '0', '13310890132', '0', '2201021973080983234', '2', '2', '2', '2', 'xx1xx,23freed.rd', '李15', '13522371224', 'test30@126.com', '123.234.112', '173568', '37669', '2', '99999999', '2015-01-01 00:00:00', '201508134', '13310890132', '22', '44520', '0.243460878729820', '3710', '1272.0000000000', '848.0000000000', '1', null, '2422', '1', null, null, '2015-09-02 11:20:20', '21', '2015-09-02 11:20:20', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('17', '2201021975080983234', '张17', '1', '13310890134', '0', '2201021975080983234', '1', '1', '1', '1', 'xx1xx,25freed.rd', '李17', '13522371226', 'test30@126.com', '123.234.112', '173568', '37669', '2', '50000', '2015-01-01 00:00:00', '201508135', '13310890134', '6', '23952', '0.000000000000000', '1996', '684.0000000000', '456.0000000000', '2', null, '2432', '1', null, null, '2015-09-02 11:21:21', '21', '2015-09-02 11:21:24', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('19', '131026197708092331', '张19', '1', '13310890136', '0', '131026197708092331', '0', '0', '0', '2', 'xx1xx,27freed.rd', '李19', '13522371228', 'test30@126.com', '123.234.112', '173568', '37669', '2', '50000', '2015-01-01 00:00:00', '201508137', '13310890136', '42', '23724', '0.416980117559433', '1977', '678.0000000000', '452.0000000000', '2', null, '2452', '1', null, null, '2015-09-02 11:24:31', '22', '2015-09-02 11:24:31', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('20', '4201021980080982234', '张20', '1', '13310890137', '0', '4201021980080982234', '1', '1', '2', '1', 'xx1xx,28freed.rd', '李20', '13522371229', 'test30@126.com', '123.234.98', '173568', '37669', '1', '50000', '2015-01-01 00:00:00', '201508132', '18577829032', '47', '44520', '0.329010963439941', '3710', '1272.0000000000', '848.0000000000', '1', null, '9928', '1', null, null, '2015-09-02 13:21:10', '3', '2015-09-02 13:21:12', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('21', '4201021982080982234', '张21', '2', '13310890138', '0', '4201021982080982234', '2', '1', '2', '2', 'xx1xx,29freed.rd', '李21', '13522371230', 'test30@126.com', '123.234.99', '173568', '37669', '1', '50000', '2015-01-01 00:00:00', '201508133', '13310890138', '52', '23952', '0.243460878729820', '1996', '684.0000000000', '456.0000000000', '2', null, '2322', '1', null, null, '2015-09-02 11:30:22', '3', '2015-09-02 11:30:22', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('22', '4201021981080182234', '张22', '0', '13310890138', '0', '4201021981080182234', '0', '1', '2', '0', 'xx1xx,30freed.rd', '李22', '13522371231', 'test30@126.com', '123.234.100', '173568', '37669', '1', '50000', '2015-01-01 00:00:00', '201508134', '13310890138', '57', '100764', '0.419007897377014', '8397', '2879.0000000000', '1919.0000000000', '2', null, '2522', '1', null, null, '2015-09-02 11:30:26', '3', '2015-09-02 11:30:26', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('23', '4201021981080282234', '张23', '1', '13310890138', '0', '4201021981080282234', '1', '1', '2', '1', 'xx1xx,31freed.rd', '李23', '13522371232', 'test30@126.com', '123.234.101', '173568', '37669', '1', '50000', '2015-01-01 00:00:00', '201508135', '13310890138', '110', '74952', '0.156913444399834', '6246', '2141.0000000000', '1428.0000000000', '0', null, '2722', '1', null, null, '2015-09-02 11:30:31', '3', '2015-09-02 11:30:31', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('24', '4201021981080382234', '张24', '1', '13310890138', '0', '4201021981080382234', '2', '1', '2', '2', 'xx1xx,32freed.rd', '李24', '13522371233', 'test30@126.com', '123.234.102', '173568', '37669', '1', '50000', '2015-01-01 00:00:00', '201508136', '13310890138', '115', '44580', '0.728518903255463', '3715', '1274.0000000000', '849.0000000000', '0', null, '2922', '1', null, null, '2015-09-02 11:30:35', '3', '2015-09-02 11:30:35', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('25', '4201021981080482234', '张25', '2', '13310890138', '0', '4201021981080482234', '0', '1', '2', '0', 'xx1xx,33freed.rd', '李25', '13522371234', 'test30@126.com', '123.234.103', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508137', '13310890138', '120', '74280', '0.290271401405334', '6190', '2122.0000000000', '1415.0000000000', '0', null, '3122', '1', null, null, '2015-09-02 11:30:39', '3', '2015-09-02 11:30:40', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('26', '4201021981080582234', '张26', '1', '13310890138', '0', '4201021981080582234', '1', '1', '1', '1', 'xx1xx,34freed.rd', '李26', '13522371235', 'test30@126.com', '123.234.104', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508138', '13310890138', '125', '71856', '0.826868176460266', '5988', '2053.0000000000', '1369.0000000000', '0', null, '3322', '1', null, null, '2015-09-02 11:30:52', '3', '2015-09-02 11:30:52', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('27', '4201021981080682234', '张27', '1', '13310890138', '0', '4201021981080682234', '2', '1', '1', '2', 'xx1xx,35freed.rd', '李27', '13522371236', 'test30@126.com', '123.234.105', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508139', '13310890138', '130', '21060', '0.607051908969879', '1755', '602.0000000000', '401.0000000000', '2', null, '3522', '1', null, null, '2015-09-02 11:30:57', '3', '2015-09-02 11:30:57', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('30', '4201021967080982234', '张30', '1', '13310890141', '0', '4201021967080982234', '0', '2', '1', '1', 'xx1xx,38freed.rd', '李30', '13522371239', 'test30@126.com', '123.234.112', '173568', '37669', '1', '107947', '2015-01-01 00:00:00', '2015081130', '13310890141', '145', '99564', '0.327085256576538', '8297', '687.0000000000', '458.0000000000', '2', null, '9928', '1', null, null, '2015-09-02 13:30:07', '3', '2015-09-02 13:30:07', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('31', '4201021964081082234', '张31', '1', '13310890142', '0', '4201021964081082234', '0', '2', '0', '1', 'xx1xx,39freed.rd', '李31', '13522371240', 'test31@126.com', '123.234.113', '173569', '37670', '0', '219840', '2015-01-01 00:00:00', '2015081131', '13310890142', '150', '92520', '0.950910329818726', '7710', '617.0000000000', '411.0000000000', '2', null, '4318', '1', null, null, '2015-09-02 13:30:12', '3', '2015-09-02 13:30:12', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('32', '4201021964081182234', '张32', '2', '13310890143', '0', '4201021964081182234', '0', '1', '0', '1', 'xx1xx,40freed.rd', '李32', '13522371241', 'test32@126.com', '123.234.114', '173570', '37671', '0', '192167', '2015-01-01 00:00:00', '2015081132', '13310890143', '155', '11520', '0.306915313005447', '960', '74.0000000000', '50.0000000000', '1', null, '4604', '1', null, null, '2015-09-02 13:30:17', '3', '2015-09-02 13:30:17', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('33', '4201021958081282234', '张33', '1', '13310890144', '0', '4201021958081282234', '0', '0', '2', '1', 'xx1xx,41freed.rd', '李33', '13522371242', 'test33@126.com', '123.234.115', '173571', '37672', '0', '140135', '2015-01-01 00:00:00', '2015081133', '13310890144', '40', '88152', '0.762252151966095', '7346', '4.0000000000', '1469.0000000000', '0', null, '3865', '1', null, null, '2015-09-02 13:30:22', '3', '2015-09-02 13:30:22', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('34', '4201021961081382234', '张34', '1', '13310890145', '0', '4201021961081382234', '2', '0', '0', '1', 'xx1xx,42freed.rd', '李34', '13522371243', 'test34@126.com', '123.234.116', '173572', '37673', '0', '155929', '2015-01-01 00:00:00', '2015081134', '13310890145', '35', '100764', '0.419007897377014', '8397', '2879.0000000000', '1919.0000000000', '2', null, '4043', '1', null, null, '2015-09-02 13:30:26', '3', '2015-09-02 13:30:27', 'B', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('35', '4201021962081482234', '张35', '0', '13310890146', '0', '4201021962081482234', '2', '0', '2', '0', 'xx1xx,43freed.rd', '李35', '13522371244', 'test35@126.com', '123.234.117', '173573', '37674', '2', '156761', '2015-01-01 00:00:00', '2015081135', '13310890146', '35', '74952', '0.156913444399834', '6246', '2141.0000000000', '1428.0000000000', '0', null, '421', '1', null, null, '2015-09-02 13:30:31', '3', '2015-09-02 13:30:31', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('36', '4201021984081582234', '张36', '1', '13310890147', '0', '4201021984081582234', '1', '0', '2', '2', 'xx1xx,44freed.rd', '李36', '13522371245', 'test36@126.com', '123.234.118', '173574', '37675', '1', '121521', '2015-01-01 00:00:00', '2015081136', '13310890147', '35', '44580', '0.728518903255463', '3715', '1274.0000000000', '849.0000000000', '0', null, '9598', '1', null, null, '2015-09-02 13:31:06', '3', '2015-09-02 13:31:07', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('37', '4201021956081682234', '张37', '1', '13310890148', '0', '4201021956081682234', '2', '0', '2', '1', 'xx1xx,45freed.rd', '李37', '13522371246', 'test37@126.com', '123.234.119', '173575', '37676', '2', '211417', '2015-01-01 00:00:00', '2015081137', '13310890148', '35', '74280', '0.290271401405334', '6190', '2122.0000000000', '1415.0000000000', '0', null, '3529', '1', null, null, '2015-09-02 13:31:11', '3', '2015-09-02 13:31:11', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('38', '4201021995081782234', '张38', '2', '13310890149', '0', '4201021995081782234', '0', '0', '1', '1', 'xx1xx,46freed.rd', '李38', '13522371247', 'test38@126.com', '123.234.120', '173576', '37677', '1', '270712', '2015-01-01 00:00:00', '2015081138', '13310890149', '35', '71856', '0.826868176460266', '5988', '2053.0000000000', '1369.0000000000', '0', null, '4581', '1', null, null, '2015-09-02 13:31:15', '22', '2015-09-02 13:31:15', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('39', '4201021975081882234', '张39', '1', '13310890150', '0', '4201021975081882234', '1', '0', '2', '2', 'xx1xx,47freed.rd', '李39', '13522371248', 'test39@126.com', '123.234.121', '173577', '37678', '0', '51332', '2015-01-01 00:00:00', '2015081139', '13310890150', '35', '21060', '0.607051908969879', '1755', '602.0000000000', '401.0000000000', '2', null, '5393', '1', null, null, '2015-09-02 13:31:18', '3', '2015-09-02 13:31:19', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('40', '4201021974081982234', '张40', '1', '13310890151', '0', '4201021974081982234', '1', '1', '2', '0', 'xx1xx,48freed.rd', '李40', '13522371249', 'test40@126.com', '123.234.122', '173578', '37679', '1', '80520', '2015-01-01 00:00:00', '2015081140', '13310890151', '35', '23724', '0.416980117559433', '1977', '678.0000000000', '452.0000000000', '2', null, '5547', '1', null, null, '2015-09-02 13:31:26', '3', '2015-09-02 13:31:26', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('41', '4201021994082082234', '张41', '1', '13310890152', '0', '4201021994082082234', '1', '0', '1', '2', 'xx1xx,49freed.rd', '李41', '13522371250', 'test41@126.com', '123.234.123', '173579', '37680', '2', '207800', '2015-01-02 00:00:00', '2015081141', '13310890152', '35', '44520', '0.329010963439941', '3710', '1272.0000000000', '848.0000000000', '1', null, '8159', '1', null, null, '2015-09-02 13:31:32', '22', '2015-09-02 13:31:32', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('42', '4201021957082182234', '张42', '1', '13310890153', '0', '4201021957082182234', '0', '1', '2', '0', 'xx1xx,50freed.rd', '李42', '13522371251', 'test42@126.com', '123.234.124', '173580', '37681', '1', '289777', '2015-01-03 00:00:00', '2015081142', '13310890153', '35', '23952', '0.243460878729820', '1996', '684.0000000000', '456.0000000000', '2', null, '1700', '1', null, null, '2015-09-02 13:31:36', '3', '2015-09-02 13:31:36', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('43', '4201021964082282234', '张43', '1', '13310890154', '0', '4201021964082282234', '0', '1', '0', '2', 'xx1xx,51freed.rd', '李43', '13522371252', 'test43@126.com', '123.234.125', '173581', '37682', '2', '294674', '2015-01-04 00:00:00', '2015081143', '13310890154', '35', '49332', '0.098075479269028', '4111', '1409.0000000000', '940.0000000000', '1', null, '1214', '1', null, null, '2015-09-02 13:31:41', '3', '2015-09-02 13:31:42', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('44', '4201021996082382234', '张44', '1', '13310890155', '0', '4201021996082382234', '2', '2', '1', '2', 'xx1xx,52freed.rd', '李44', '13522371253', 'test44@126.com', '123.234.126', '173582', '37683', '1', '244585', '2015-01-05 00:00:00', '2015081144', '13310890155', '35', '42840', '0.536862075328827', '3570', '1224.0000000000', '816.0000000000', '0', null, '644', '1', null, null, '2015-09-02 13:31:45', '22', '2015-09-02 13:31:46', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('45', '4201021970082482234', '张45', '1', '13310890156', '0', '4201021970082482234', '1', '1', '1', '0', 'xx1xx,53freed.rd', '李45', '13522371254', 'test45@126.com', '123.234.127', '173583', '37684', '1', '287712', '2015-01-06 00:00:00', '2015081145', '13310890156', '35', '54720', '0.264008641242981', '4560', '1563.0000000000', '1042.0000000000', '2', null, '6322', '1', null, null, '2015-09-02 13:31:50', '3', '2015-09-02 13:31:50', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('46', '4201021986082582234', '张46', '1', '13310890157', '0', '4201021986082582234', '0', '1', '2', '1', 'xx1xx,54freed.rd', '李46', '13522371255', 'test46@126.com', '123.234.128', '173584', '37685', '1', '273028', '2015-01-07 00:00:00', '2015081146', '13310890157', '35', '11556', '0.901279270648956', '963', '330.0000000000', '220.0000000000', '2', null, '8744', '1', null, null, '2015-09-02 13:31:55', '22', '2015-09-02 13:31:55', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('47', '4201021976082682234', '张47', '1', '13310890158', '0', '4201021976082682234', '0', '1', '2', '2', 'xx1xx,55freed.rd', '李47', '13522371256', 'test47@126.com', '123.234.129', '173585', '37686', '0', '230224', '2015-01-08 00:00:00', '2015081147', '13310890158', '35', '88248', '0.098351724445820', '7354', '2521.0000000000', '1681.0000000000', '2', null, '1174', '1', null, null, '2015-09-02 13:31:59', '3', '2015-09-02 13:31:59', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('48', '4201021984082782234', '张48', '1', '13310890159', '0', '4201021984082782234', '0', '2', '2', '2', 'xx1xx,56freed.rd', '李48', '13522371257', 'test48@126.com', '123.234.130', '173586', '37687', '0', '165271', '2015-01-08 00:00:00', '2015081148', '13310890159', '35', '108144', '0.540559530258179', '9012', '3090.0000000000', '2060.0000000000', '1', null, '6473', '1', null, null, '2015-09-02 13:32:04', '3', '2015-09-02 13:32:04', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('49', '4201021977082882234', '张49', '1', '13310890160', '0', '4201021977082882234', '2', '2', '0', '2', 'xx1xx,57freed.rd', '李49', '13522371258', 'test49@126.com', '123.234.131', '173587', '37688', '2', '114367', '2015-01-08 00:00:00', '2015081149', '13310890160', '35', '1032', '0.457223296165466', '86', '29.0000000000', '20.0000000000', '1', null, '7963', '1', null, null, '2015-09-02 13:32:08', '3', '2015-09-02 13:32:08', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('181', '2201021976080983234', '张18', '2', '13310890135', '0', '2201021976080983234', '2', '2', '2', '2', 'xx1xx,26freed.rd', '李18', '13522371227', 'test30@126.com', '123.234.112', '173568', '37669', '2', '50000', '2015-08-19 00:00:00', '201509016', '13310890135', '37', '21060', '1.000000000000000', '1755', '602.0000000000', '401.0000000000', '2', null, '2442', '1', null, null, '2015-09-02 13:15:55', '3', '2015-09-02 13:16:07', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('182', '4201021997080982234', '张18', '2', '13310890135', '0', '4201021997080982234', '2', '2', '2', '2', 'xx1xx,26freed.rd', '李18', '13522371227', 'test30@126.com', '123.234.112', '173568', '37669', '2', '50000', '2015-09-01 00:00:00', '201508136', '13310890135', '37', '21060', '1.000000000000000', '1755', '602.0000000000', '401.0000000000', '2', null, '2442', '1', null, null, '2015-09-02 13:17:57', '21', '2015-09-02 13:18:01', 'A', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('281', '4201021981080782234', '张28', '2', '13310890139', '0', '4201021981080782234', '0', '1', '1', '0', 'xx1xx,36freed.rd', '李28', '13522371237', 'test30@126.com', '123.234.106', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508140', '13310890139', '135', '23724', '0.416980117559433', '1977', '678.0000000000', '452.0000000000', '2', null, '3722', '1', null, null, '2015-09-02 13:27:47', '3', '2015-09-02 13:27:49', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('282', '4201021981080782234', '张28', '2', '13310890139', '0', '4201021981080782234', '0', '1', '1', '0', 'xx1xx,36freed.rd', '李28', '13522371237', 'test30@126.com', '123.234.106', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508141', '13310890139', '135', '44520', '0.329010963439941', '3710', '1272.0000000000', '848.0000000000', '1', null, '3922', '1', null, null, '2015-09-02 13:28:30', '3', '2015-09-02 13:28:30', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('283', '4201021981080782234', '张28', '2', '13310890139', '0', '4201021981080782234', '0', '0', '1', '0', 'xx1xx,36freed.rd', '李28', '13522371237', 'test30@126.com', '123.234.106', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508142', '13310890139', '135', '44520', '0.329010963439941', '3710', '1272.0000000000', '848.0000000000', '1', null, '4122', '1', null, null, '2015-09-02 13:28:41', '3', '2015-09-02 13:28:41', 'C', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_apply` VALUES ('284', '4201021981080782234', '张28', '2', '13310890139', '0', '4201021981080782234', '0', '0', '1', '0', 'xx1xx,36freed.rd', '李28', '13522371237', 'test30@126.com', '123.234.106', '173568', '37669', '0', '50000', '2015-01-01 00:00:00', '201508143', '13310890139', '135', '44520', '0.329010963439941', '3710', '1272.0000000000', '848.0000000000', '1', null, '4322', '1', null, null, '2015-09-02 13:29:56', '3', '2015-09-02 13:29:58', 'C', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_cheat
-- ----------------------------
DROP TABLE IF EXISTS `t_cheat`;
CREATE TABLE `t_cheat` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) DEFAULT NULL COMMENT '客户号',
  `cheatType` varchar(255) DEFAULT NULL COMMENT '反欺诈结果标示',
  `cheatContent` varchar(255) DEFAULT NULL COMMENT '欺诈备注',
  `cheatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `applyId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cheat
-- ----------------------------
INSERT INTO `t_cheat` VALUES ('142', '4201021967080982234', null, null, '2015-09-11 14:29:42', '30');
INSERT INTO `t_cheat` VALUES ('143', '4201021967080982234', null, null, '2015-09-11 15:02:58', '30');
INSERT INTO `t_cheat` VALUES ('144', '4201021967080982234', null, null, '2015-09-11 15:53:50', '30');
INSERT INTO `t_cheat` VALUES ('145', '4201021967080982234', null, null, '2015-09-11 15:54:40', '30');
INSERT INTO `t_cheat` VALUES ('146', '4201021961081382234', null, null, '2015-09-11 15:54:56', '34');
INSERT INTO `t_cheat` VALUES ('147', '2201021976080983234', null, null, '2015-09-11 15:55:10', '181');
INSERT INTO `t_cheat` VALUES ('148', '4201021980080982234', 'B01', null, '2015-09-11 16:01:35', '20');
INSERT INTO `t_cheat` VALUES ('149', '4201021980080982234', 'B01', null, '2015-09-11 16:04:56', '20');

-- ----------------------------
-- Table structure for t_condition
-- ----------------------------
DROP TABLE IF EXISTS `t_condition`;
CREATE TABLE `t_condition` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `dateEntered` date DEFAULT NULL,
  `dateModified` date DEFAULT NULL,
  `typeId` int(36) DEFAULT NULL,
  `conditionC` varchar(1000) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_condition
-- ----------------------------
INSERT INTO `t_condition` VALUES ('1', null, '2013-04-17', '2013-04-17', null, '$2$>10', '$会员的积分$>10');
INSERT INTO `t_condition` VALUES ('2', null, '2013-04-17', '2013-04-17', null, '$2$>101', '$gggnnnn的bbbb$>101');
INSERT INTO `t_condition` VALUES ('3', null, '2013-04-17', '2013-04-17', null, '$2$>10', '$gggnnnn的bbbb$>10');
INSERT INTO `t_condition` VALUES ('5', null, '2013-04-17', '2013-04-17', null, '$2$', '$gggnnnn的bbbb$');
INSERT INTO `t_condition` VALUES ('6', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('7', null, '2013-04-17', '2013-04-17', null, '$1$', '$gggnnnnuuuu的aaaa$');
INSERT INTO `t_condition` VALUES ('8', null, '2013-04-17', '2013-04-17', null, '$1$', '$gggnnnnuuuu的aaaa$');
INSERT INTO `t_condition` VALUES ('9', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('10', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('11', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('12', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('13', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('14', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('15', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('16', null, '2013-04-17', '2013-04-17', null, '', '');
INSERT INTO `t_condition` VALUES ('17', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('18', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('19', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('20', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('21', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('22', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('23', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('24', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('25', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('26', null, '2013-04-18', '2013-04-18', null, '', '');
INSERT INTO `t_condition` VALUES ('27', null, '2013-04-18', '2013-04-18', null, '$53$>10', '$gggyyyy的rrrr$>10');
INSERT INTO `t_condition` VALUES ('28', null, '2013-04-18', '2013-04-18', null, '$57$>10', '$会员卡的积分$>10');
INSERT INTO `t_condition` VALUES ('37', null, '2013-04-19', '2013-04-19', null, '$57$>10', '$会员卡的积分$>10');
INSERT INTO `t_condition` VALUES ('49', null, '2013-04-19', '2013-04-19', null, '$57$>10', '$会员卡的积分$>10');
INSERT INTO `t_condition` VALUES ('50', null, '2013-04-19', '2013-04-19', null, '$57$>10', '$会员卡的积分$>10');
INSERT INTO `t_condition` VALUES ('51', null, '2013-04-22', '2013-04-22', null, '$59$==123', '$会员卡的卡号$==123');
INSERT INTO `t_condition` VALUES ('52', null, '2013-04-22', '2013-04-22', null, '$59$==123', '$会员卡的卡号$==123');
INSERT INTO `t_condition` VALUES ('53', null, '2013-04-22', '2013-04-22', null, '$59$==123&&$57$>15', '$会员卡的卡号$==123&&$会员卡的积分$>15');
INSERT INTO `t_condition` VALUES ('54', null, '2013-04-22', '2013-04-22', null, '$59$==123&&$57$>15', '$会员卡的卡号$==123&&$会员卡的积分$>15');
INSERT INTO `t_condition` VALUES ('55', null, '2013-04-22', '2013-04-22', null, '$59$==12d3&&$57$>15', '$会员卡的卡号$==12d3&&$会员卡的积分$>15');
INSERT INTO `t_condition` VALUES ('56', null, '2013-04-22', '2013-04-22', null, '$57$>100', '$会员卡的积分$>100');
INSERT INTO `t_condition` VALUES ('57', null, '2013-04-22', '2013-04-22', null, '$62$>=2', '$会员的连续登录次数$>=2');
INSERT INTO `t_condition` VALUES ('58', null, '2013-04-22', '2013-04-22', null, '$62$<=2', '$会员的连续登录次数$<=2');
INSERT INTO `t_condition` VALUES ('59', null, '2013-04-22', '2013-04-22', null, '$62$>=3&&$62$<15', '$会员的连续登录次数$>=3&&$会员的连续登录次数$<15');
INSERT INTO `t_condition` VALUES ('60', null, '2013-04-22', '2013-04-22', null, '$62$>=15', '$会员的连续登录次数$>=15');
INSERT INTO `t_condition` VALUES ('61', null, '2013-04-23', '2013-04-23', null, '$62$==3', '$会员的连续登录次数$==3');
INSERT INTO `t_condition` VALUES ('62', null, '2013-04-23', '2013-04-23', null, '$62$==15', '$会员的连续登录次数$==15');
INSERT INTO `t_condition` VALUES ('63', null, '2013-04-23', '2013-04-23', null, '', '');
INSERT INTO `t_condition` VALUES ('64', null, '2013-04-23', '2013-04-23', null, '$62$<=2&&$62$>0', '$会员的连续登录次数$<=2&&$会员的连续登录次数$>0');
INSERT INTO `t_condition` VALUES ('66', null, '2013-04-23', '2013-04-23', null, '$62$<=2&&$62$>0', '$会员的连续登录次数$<=2&&$会员的连续登录次数$>0');
INSERT INTO `t_condition` VALUES ('67', null, '2013-04-24', '2013-04-24', null, '', '');
INSERT INTO `t_condition` VALUES ('68', null, '2013-04-24', '2013-04-24', null, '', '');
INSERT INTO `t_condition` VALUES ('72', null, '2013-04-24', '2013-04-24', null, '$62$>=3&&$62$<15', '$会员的连续登录次数$>=3&&$会员的连续登录次数$<15');
INSERT INTO `t_condition` VALUES ('73', null, '2013-04-24', '2013-04-24', null, '$62$>=3&&$62$<15', '$会员的连续登录次数$>=3&&$会员的连续登录次数$<15');
INSERT INTO `t_condition` VALUES ('74', null, '2013-04-24', '2013-04-24', null, '$62$>=15', '$会员的连续登录次数$>=15');
INSERT INTO `t_condition` VALUES ('75', null, '2013-04-24', '2013-04-24', null, '$62$<=2&&$62$>0', '$会员的连续登录次数$<=2&&$会员的连续登录次数$>0');
INSERT INTO `t_condition` VALUES ('76', null, '2013-04-24', '2013-04-24', null, '$62$==15', '$会员的连续登录次数$==15');
INSERT INTO `t_condition` VALUES ('77', null, '2013-04-24', '2013-04-24', null, '$62$==3', '$会员的连续登录次数$==3');
INSERT INTO `t_condition` VALUES ('78', null, '2013-04-24', '2013-04-24', null, '', '');
INSERT INTO `t_condition` VALUES ('79', null, '2013-04-25', '2013-04-25', null, '$63$==1&&$65$<100', '$会员的是否邀请$==1&&$会员的邀请人已邀请数量$<100');
INSERT INTO `t_condition` VALUES ('80', null, '2013-04-25', '2013-04-25', null, '$63$==1&&$65$<100', '$会员的是否邀请$==1&&$会员的邀请人已邀请数量$<100');
INSERT INTO `t_condition` VALUES ('82', null, '2013-04-25', '2013-04-25', null, '$66$>=1', '$会员的答题数$>=1');
INSERT INTO `t_condition` VALUES ('83', null, '2013-04-25', '2013-04-25', null, '$67$>=1', '$会员的答对数$>=1');
INSERT INTO `t_condition` VALUES ('84', null, '2013-04-25', '2013-04-25', null, '$68$==1', '$会员的是否上传头像$==1');
INSERT INTO `t_condition` VALUES ('85', null, '2013-04-25', '2013-04-25', null, '$69$==1', '$会员的是否修改昵称$==1');
INSERT INTO `t_condition` VALUES ('86', null, '2013-04-25', '2013-04-25', null, '$70$==1', '$会员的是否完成必填资料$==1');
INSERT INTO `t_condition` VALUES ('87', null, '2013-04-25', '2013-04-25', null, '$71$>=1', '$会员的非必填字段数量$>=1');
INSERT INTO `t_condition` VALUES ('88', null, '2013-04-25', '2013-04-25', null, '', '');
INSERT INTO `t_condition` VALUES ('90', null, '2013-04-25', '2013-04-25', null, '', '');
INSERT INTO `t_condition` VALUES ('91', null, '2013-04-25', '2013-04-25', null, '', '');
INSERT INTO `t_condition` VALUES ('93', null, '2013-04-25', '2013-04-25', null, '$62$==3', '$会员的连续登录次数$==3');
INSERT INTO `t_condition` VALUES ('94', null, '2013-04-25', '2013-04-25', null, '$62$==15', '$会员的连续登录次数$==15');
INSERT INTO `t_condition` VALUES ('95', null, '2013-04-25', '2013-04-25', null, '$62$>=20', '$会员的连续登录次数$>=20');
INSERT INTO `t_condition` VALUES ('96', null, '2013-04-25', '2013-04-25', null, '$62$>=20', '$会员的连续登录次数$>=20');
INSERT INTO `t_condition` VALUES ('101', null, '2015-08-04', '2015-08-04', null, '$60$==jiang', '$会员的用户名$==jiang');
INSERT INTO `t_condition` VALUES ('102', null, '2015-08-04', '2015-08-04', null, '$60$==wangshuo', '$会员的用户名$==wangshuo');
INSERT INTO `t_condition` VALUES ('103', null, '2015-08-04', '2015-08-04', null, '$57$>10&&$60$==jiang', '$会员卡的积分$>10&&$会员的用户名$==jiang');
INSERT INTO `t_condition` VALUES ('124', null, '2015-08-19', '2015-08-19', null, '$60$==jiang', '$会员的用户名$==jiang');

-- ----------------------------
-- Table structure for t_core
-- ----------------------------
DROP TABLE IF EXISTS `t_core`;
CREATE TABLE `t_core` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `uuid` int(11) DEFAULT NULL COMMENT '客户号',
  `userName` varchar(255) DEFAULT NULL COMMENT '姓名',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `phoneNum` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `idCard` varchar(255) DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `industry` int(11) DEFAULT NULL COMMENT '行业',
  `companyType` int(11) DEFAULT NULL COMMENT '企业类型',
  `position` int(11) DEFAULT NULL COMMENT '职位',
  `education` int(11) DEFAULT NULL COMMENT '学历',
  `contactName` varchar(255) DEFAULT NULL COMMENT '紧急联系人姓名',
  `contactPhoneNum` varchar(255) DEFAULT NULL COMMENT '紧急联系人号码',
  `loanBalance` int(11) DEFAULT NULL COMMENT '贷款余额',
  `inCheckLoan` int(11) DEFAULT NULL COMMENT '审批中贷款金额',
  `userType` int(11) DEFAULT NULL COMMENT '客户分类',
  `workTime` int(11) DEFAULT NULL COMMENT '工作年限',
  `salary` int(11) DEFAULT NULL COMMENT '年收入',
  `reciveAddr` int(11) DEFAULT NULL COMMENT '近1年最常用收货地址的城市等级',
  `score` int(11) DEFAULT NULL COMMENT '信用评分',
  `grade` int(11) DEFAULT NULL COMMENT '评分等级',
  `baseQuota` int(11) DEFAULT NULL COMMENT '消费类基本额度',
  `enableQuota` int(11) DEFAULT NULL COMMENT '消费类可用额度',
  `validTime` datetime DEFAULT NULL COMMENT '授信日期',
  `validDays` datetime DEFAULT NULL COMMENT '授信有效期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_core
-- ----------------------------

-- ----------------------------
-- Table structure for t_credit_check
-- ----------------------------
DROP TABLE IF EXISTS `t_credit_check`;
CREATE TABLE `t_credit_check` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `applyId` int(11) DEFAULT NULL COMMENT '进件号',
  `uuid` varchar(255) DEFAULT NULL COMMENT '客户号',
  `score` double(21,11) DEFAULT NULL COMMENT '评分',
  `creditCheckRst` varchar(255) DEFAULT NULL COMMENT '评分审批结果',
  `grade` int(11) DEFAULT NULL COMMENT '评分等级',
  `baseQuota` double(21,11) DEFAULT NULL COMMENT '消费类基本额度',
  `enableQuota` double(21,11) DEFAULT NULL COMMENT '消费类可用额度',
  `creditCheckTime` datetime DEFAULT NULL COMMENT '评分时间',
  `creditCheckRate` double(21,11) DEFAULT NULL COMMENT '评分理论利率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_credit_check
-- ----------------------------
INSERT INTO `t_credit_check` VALUES ('4', '30', '4201021967080982234', '608.53884675876', '1', '2', '10473.17870531268', '10473.17870531268', '2015-09-11 14:29:43', '0.65000000000');
INSERT INTO `t_credit_check` VALUES ('5', '30', '4201021967080982234', '608.53884675876', '1', '2', '10498.39601996922', '10498.39601996922', '2015-09-11 15:02:58', '0.65000000000');
INSERT INTO `t_credit_check` VALUES ('6', '30', '4201021967080982234', '608.53884675876', '1', '2', '10579.75315485297', '10579.75315485297', '2015-09-11 15:53:51', '0.65000000000');
INSERT INTO `t_credit_check` VALUES ('7', '30', '4201021967080982234', '608.53884675876', '1', '2', '10513.86723085814', '10513.86723085814', '2015-09-11 15:54:41', '0.65000000000');
INSERT INTO `t_credit_check` VALUES ('8', '34', '4201021961081382234', '590.99851755574', '1', '2', '13763.89151577094', '13763.89151577094', '2015-09-11 15:54:57', '0.65000000000');
INSERT INTO `t_credit_check` VALUES ('9', '181', '2201021976080983234', '569.51164296221', '0', '2', '0.00000000000', '0.00000000000', '2015-09-11 15:55:11', '0.00000000000');

-- ----------------------------
-- Table structure for t_credit_manage
-- ----------------------------
DROP TABLE IF EXISTS `t_credit_manage`;
CREATE TABLE `t_credit_manage` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL COMMENT '订单号',
  `verifyStep` int(11) DEFAULT NULL COMMENT '审批阶段',
  `verifyResult` int(11) DEFAULT NULL COMMENT '审批结果',
  `verifyTime` datetime DEFAULT NULL COMMENT '审批时间',
  `operateNum` int(11) DEFAULT NULL COMMENT '操作号',
  `verifyMark` varchar(255) DEFAULT NULL COMMENT '审批标志',
  `verifyContent` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_credit_manage
-- ----------------------------
INSERT INTO `t_credit_manage` VALUES ('1', '4', '3', '1', '2015-09-11 14:29:55', null, 'A', '234');
INSERT INTO `t_credit_manage` VALUES ('2', '4', '3', '1', '2015-09-11 15:03:12', null, 'A', 'asdad');

-- ----------------------------
-- Table structure for t_deal
-- ----------------------------
DROP TABLE IF EXISTS `t_deal`;
CREATE TABLE `t_deal` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL COMMENT '订单编号',
  `uuid` int(11) DEFAULT NULL COMMENT '客户号',
  `serviceId` varchar(255) DEFAULT NULL COMMENT '会员服务协议编号',
  `handleId` varchar(255) DEFAULT NULL COMMENT '贷后管理服务协议编号',
  `grantId` varchar(255) DEFAULT NULL COMMENT '委托授权协议编号',
  `repayId` varchar(255) DEFAULT NULL COMMENT '还款计划编号',
  `startTime` datetime DEFAULT NULL COMMENT '起息日',
  `endTime` datetime DEFAULT NULL COMMENT '到期日',
  `loanMoney` int(11) DEFAULT NULL COMMENT '金额',
  `deadline` int(11) DEFAULT NULL COMMENT '期限',
  `loanRepayTimes` int(11) DEFAULT NULL COMMENT '期数',
  `loanRate` int(11) DEFAULT NULL COMMENT '利率',
  `dealTime` datetime DEFAULT NULL COMMENT '交易生成时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deal
-- ----------------------------

-- ----------------------------
-- Table structure for t_entity
-- ----------------------------
DROP TABLE IF EXISTS `t_entity`;
CREATE TABLE `t_entity` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `identify` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `packageC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_entity
-- ----------------------------
INSERT INTO `t_entity` VALUES ('4', 'card', '会员卡', 'com.hxrainbow.rule.model.Card');
INSERT INTO `t_entity` VALUES ('42', 'member', '会员', 'com.hxrainbow.rule.model.Member');
INSERT INTO `t_entity` VALUES ('48', 'jiangTestT', '测试2', 'com.hxrainbow.rule.model.JiangTest2');
INSERT INTO `t_entity` VALUES ('51', 'qwe', '阿斯达', 'com.hxrainbow.rule.model.JiangTest3');
INSERT INTO `t_entity` VALUES ('53', 'User', '用户基本信息', 'com.hxrainbow.rule.model.User');
INSERT INTO `t_entity` VALUES ('54', 'Apply', '进件表', 'cn.msds.model.Apply');
INSERT INTO `t_entity` VALUES ('55', 'TempCreditCheck', '信用管理衍生表', 'com.hxrainbow.rule.model.TempCreditCheck');

-- ----------------------------
-- Table structure for t_entity_item
-- ----------------------------
DROP TABLE IF EXISTS `t_entity_item`;
CREATE TABLE `t_entity_item` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `field` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `typeId` int(10) unsigned DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_entity_item
-- ----------------------------
INSERT INTO `t_entity_item` VALUES ('1', 'aa', 'aaaa', '1', '11111111111111111111111111111111111111111111111111111111111111111');
INSERT INTO `t_entity_item` VALUES ('3', 'gggggg', 'gggggg', '1', null);
INSERT INTO `t_entity_item` VALUES ('4', 'bb', 'bbb', '11', null);
INSERT INTO `t_entity_item` VALUES ('5', 'gggnnn', 'nnnnnnnnnnnnn', '11', null);
INSERT INTO `t_entity_item` VALUES ('6', 'mma', 'mmn', '11', null);
INSERT INTO `t_entity_item` VALUES ('7', 'lll', 'llll', '11', null);
INSERT INTO `t_entity_item` VALUES ('9', 'ttt', 'ttttttttttttt', '11', null);
INSERT INTO `t_entity_item` VALUES ('10', 'uuu', 'uuuu', '11', null);
INSERT INTO `t_entity_item` VALUES ('14', 'gggnnnnnhhh', 'hhhhhhhhhhhhhhhhhhh', '11', null);
INSERT INTO `t_entity_item` VALUES ('15', 'mmm', 'mmmmmmmmmmmmmmmmmmm', '15', null);
INSERT INTO `t_entity_item` VALUES ('16', 'nnnnnnnnnnnnnnnn', 'nnnnnnnnnnnnnnnnnnn', '15', null);
INSERT INTO `t_entity_item` VALUES ('17', 'adfasdf', 'asdfasdfasdf', '15', null);
INSERT INTO `t_entity_item` VALUES ('18', 'bbbb', 'bbbb', '16', null);
INSERT INTO `t_entity_item` VALUES ('19', 'ddd', 'ddddddddddddddddd', '16', null);
INSERT INTO `t_entity_item` VALUES ('20', 'gggg', 'ggggg', '16', null);
INSERT INTO `t_entity_item` VALUES ('21', 'nnn', 'nnnnnnnnnnn', '16', null);
INSERT INTO `t_entity_item` VALUES ('22', 'ggg', 'ggggggggggggggggggggg', '10', null);
INSERT INTO `t_entity_item` VALUES ('24', 'ggggggggggggggggggg', 'dddddddd', '10', null);
INSERT INTO `t_entity_item` VALUES ('41', '1111', 'aaaa', '38', null);
INSERT INTO `t_entity_item` VALUES ('42', '333', '33333', '38', null);
INSERT INTO `t_entity_item` VALUES ('45', 'uuu111', 'uuuuu', '1', null);
INSERT INTO `t_entity_item` VALUES ('52', 'yyyr', 'rtrtr', '1', null);
INSERT INTO `t_entity_item` VALUES ('57', 'point', '积分', '4', null);
INSERT INTO `t_entity_item` VALUES ('59', 'num', '卡号', '4', null);
INSERT INTO `t_entity_item` VALUES ('60', 'username', '用户名', '42', '');
INSERT INTO `t_entity_item` VALUES ('62', 'loginNum', '连续登录次数', '42', null);
INSERT INTO `t_entity_item` VALUES ('63', 'isInvite', '是否邀请', '42', '1表示邀请，0表示未邀请');
INSERT INTO `t_entity_item` VALUES ('64', 'from', '邀请人', '42', null);
INSERT INTO `t_entity_item` VALUES ('65', 'fromSize', '邀请人已邀请数量', '42', null);
INSERT INTO `t_entity_item` VALUES ('66', 'question', '答题数', '42', '');
INSERT INTO `t_entity_item` VALUES ('67', 'answerRight', '答对数', '42', null);
INSERT INTO `t_entity_item` VALUES ('68', 'avatar', '是否上传头像', '42', '1表示上传成功，0表示未上传');
INSERT INTO `t_entity_item` VALUES ('69', 'nickname', '是否修改昵称', '42', '1表示修改成功，0表示未修改');
INSERT INTO `t_entity_item` VALUES ('70', 'requiredInfo', '是否完成必填资料', '42', '1表示完成，0表示未完成');
INSERT INTO `t_entity_item` VALUES ('71', 'nonRequiredInfo', '非必填字段数量', '42', null);
INSERT INTO `t_entity_item` VALUES ('74', 'name', '姓名', null, '是');
INSERT INTO `t_entity_item` VALUES ('75', 'name', '姓名', '4', '吗');
INSERT INTO `t_entity_item` VALUES ('78', 'name', '姓名', '48', '撒旦法');
INSERT INTO `t_entity_item` VALUES ('79', 'age', '年龄', '48', '阿飞斯蒂芬');
INSERT INTO `t_entity_item` VALUES ('80', 'ww', '撒旦法', '48', '撒发生');
INSERT INTO `t_entity_item` VALUES ('85', 'age', '啊啊', '51', '发生的方式');
INSERT INTO `t_entity_item` VALUES ('86', 'gender', '性别', '53', '0-女；1-男；2-不详');
INSERT INTO `t_entity_item` VALUES ('87', 'phoneNum', '手机号', '53', '申请人手机号');
INSERT INTO `t_entity_item` VALUES ('88', 'industry', '行业', '53', '0-制造业；1-服务业；2-其他');
INSERT INTO `t_entity_item` VALUES ('89', 'companyType', '企业类型', '53', '2-国企；0-私企；1-外资');
INSERT INTO `t_entity_item` VALUES ('90', 'position', '职位', '53', '0-普通员工；1-经理及主管；2-企业法人、CEO');
INSERT INTO `t_entity_item` VALUES ('91', 'education', '学历', '53', '0-高中、高职及以下；1-本科；2-研究生及以上 ');
INSERT INTO `t_entity_item` VALUES ('92', 'contactName', '紧急联系人姓名', '53', '紧急联系人姓名');
INSERT INTO `t_entity_item` VALUES ('93', 'contactPhoneNum', '紧急联系人号码', '53', '紧急联系人号码');
INSERT INTO `t_entity_item` VALUES ('94', 'email', '邮箱', '53', '邮箱');
INSERT INTO `t_entity_item` VALUES ('95', 'workTime', '工作年限', '53', '0.3年及以下；1.3到7年；2.7年及以上');
INSERT INTO `t_entity_item` VALUES ('96', 'salary', '年收入', '53', '年收入');
INSERT INTO `t_entity_item` VALUES ('97', 'loanMoney', '申请金额', '53', '申请金额');
INSERT INTO `t_entity_item` VALUES ('98', 'loanRepayTime', '申请期数', '53', '申请期数');
INSERT INTO `t_entity_item` VALUES ('99', 'uuid', '客户号', '54', '客户号');
INSERT INTO `t_entity_item` VALUES ('105', 'type', '类型', '48', '额粉丝');
INSERT INTO `t_entity_item` VALUES ('106', 'erw', '温柔', '48', '二万人');
INSERT INTO `t_entity_item` VALUES ('107', 'position', '职位', '54', '职位');
INSERT INTO `t_entity_item` VALUES ('108', 'income', '收入', '55', '收入');
INSERT INTO `t_entity_item` VALUES ('109', 'industry', '公司类型', '54', '公司类型');
INSERT INTO `t_entity_item` VALUES ('110', 'preIncome', '预估年收入', '55', '预估年收入');
INSERT INTO `t_entity_item` VALUES ('111', 'salary', '年薪', '54', '年薪');
INSERT INTO `t_entity_item` VALUES ('112', 'bnMonthMoney', '近1年月均交易金额', '54', '近1年月均交易金额');

-- ----------------------------
-- Table structure for t_flow
-- ----------------------------
DROP TABLE IF EXISTS `t_flow`;
CREATE TABLE `t_flow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '规则流名称',
  `url` varchar(255) DEFAULT NULL COMMENT '规则流入口',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_flow
-- ----------------------------
INSERT INTO `t_flow` VALUES ('1', '申请贷款', '/apply/register.do');
INSERT INTO `t_flow` VALUES ('2', '测试规则流1', '/apply/testCredit.do');

-- ----------------------------
-- Table structure for t_flow_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_flow_detail`;
CREATE TABLE `t_flow_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flowId` int(11) DEFAULT NULL COMMENT '规则流id',
  `sceneId` int(11) DEFAULT NULL COMMENT '规则组id',
  `num` int(11) DEFAULT NULL COMMENT '顺序号',
  `sceneName` varchar(255) DEFAULT NULL COMMENT '规则组名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_flow_detail
-- ----------------------------
INSERT INTO `t_flow_detail` VALUES ('1', '1', '19', '1', '行业');
INSERT INTO `t_flow_detail` VALUES ('2', '1', '20', '2', '职业');

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `url` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  `parentId` int(10) unsigned NOT NULL DEFAULT '0',
  `sequence` int(10) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', '基础管理', '', '', '0', '1');
INSERT INTO `t_menu` VALUES ('2', '规则管理', '', '', '0', '2');
INSERT INTO `t_menu` VALUES ('3', '实体管理', 'entity/listEntity.do', 'images/icons/default.png', '1', '3');
INSERT INTO `t_menu` VALUES ('4', '动作类型管理', 'action/listActionMeta.do', 'images/icons/default.png', '1', '4');
INSERT INTO `t_menu` VALUES ('5', '场景管理', 'scene/listScene.do', 'images/icons/default.png', '1', '5');
INSERT INTO `t_menu` VALUES ('8', '系统管理', ' ', ' ', '0', '8');
INSERT INTO `t_menu` VALUES ('9', '角色管理', 'role/list.do', 'images/icons/default.png', '8', '9');
INSERT INTO `t_menu` VALUES ('10', '答题场景', 'rule/listRule.do?sceneId=14', 'images/icons/default.png', '2', '8');
INSERT INTO `t_menu` VALUES ('12', '登录场景', 'rule/listRule.do?sceneId=15', 'images/icons/default.png', '2', '9');
INSERT INTO `t_menu` VALUES ('13', '注册场景', 'rule/listRule.do?sceneId=16', 'images/icons/default.png', '2', '10');
INSERT INTO `t_menu` VALUES ('14', '资料完善场景', 'rule/listRule.do?sceneId=17', 'images/icons/default.png', '2', '11');
INSERT INTO `t_menu` VALUES ('16', '测试请求', '', ' ', '0', '13');
INSERT INTO `t_menu` VALUES ('17', '测试请求', 'apply/testSalary.do?sceneId=19', 'images/icons/default.png', '16', '14');
INSERT INTO `t_menu` VALUES ('18', '规则流管理', 'flow/listFlow.do', 'images/icons/default.png', '1', '15');
INSERT INTO `t_menu` VALUES ('19', '行业', 'rule/listRule.do?sceneId=19', 'images/icons/default.png', '2', '16');
INSERT INTO `t_menu` VALUES ('20', '职位', 'rule/listRule.do?sceneId=19', 'images/icons/default.png', '2', '17');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `replyDeadline` int(11) DEFAULT NULL COMMENT '批复期限',
  `applyId` int(11) DEFAULT NULL COMMENT '进件号',
  `uuid` varchar(255) DEFAULT NULL COMMENT '客户号',
  `orderState` int(11) DEFAULT NULL COMMENT '订单状态',
  `orderCreateTime` datetime DEFAULT NULL COMMENT '订单创建时间',
  `replyMoney` double(21,11) DEFAULT NULL COMMENT '批复金额',
  `replyTimes` int(11) DEFAULT NULL COMMENT '批复期数',
  `replyRate` double(21,11) DEFAULT NULL COMMENT '批复利率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('4', null, '30', '4201021967080982234', '1', '2015-09-11 14:29:43', '10473.17870531268', '1', '0.65000000000');
INSERT INTO `t_order` VALUES ('5', null, '30', '4201021967080982234', '1', '2015-09-11 15:02:58', '10498.39601996922', '1', '0.65000000000');
INSERT INTO `t_order` VALUES ('6', null, '30', '4201021967080982234', '1', '2015-09-11 15:53:51', '10579.75315485297', '1', '0.65000000000');
INSERT INTO `t_order` VALUES ('7', null, '30', '4201021967080982234', '1', '2015-09-11 15:54:41', '10513.86723085814', '1', '0.65000000000');
INSERT INTO `t_order` VALUES ('8', null, '34', '4201021961081382234', '1', '2015-09-11 15:54:57', '13763.89151577094', '1', '0.65000000000');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'sa', '系统管理员');
INSERT INTO `t_role` VALUES ('2', 'worker', '运维人员');

-- ----------------------------
-- Table structure for t_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roleId` int(10) unsigned NOT NULL,
  `menuId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role_menu
-- ----------------------------
INSERT INTO `t_role_menu` VALUES ('1', '1', '1');
INSERT INTO `t_role_menu` VALUES ('2', '1', '2');
INSERT INTO `t_role_menu` VALUES ('3', '1', '3');
INSERT INTO `t_role_menu` VALUES ('4', '1', '4');
INSERT INTO `t_role_menu` VALUES ('5', '1', '5');
INSERT INTO `t_role_menu` VALUES ('6', '1', '6');
INSERT INTO `t_role_menu` VALUES ('7', '1', '7');
INSERT INTO `t_role_menu` VALUES ('10', '1', '8');
INSERT INTO `t_role_menu` VALUES ('11', '1', '9');
INSERT INTO `t_role_menu` VALUES ('24', '1', '10');
INSERT INTO `t_role_menu` VALUES ('32', '2', '1');
INSERT INTO `t_role_menu` VALUES ('33', '2', '5');
INSERT INTO `t_role_menu` VALUES ('34', '2', '2');
INSERT INTO `t_role_menu` VALUES ('35', '2', '7');
INSERT INTO `t_role_menu` VALUES ('36', '2', '10');
INSERT INTO `t_role_menu` VALUES ('37', '2', '8');
INSERT INTO `t_role_menu` VALUES ('38', '2', '9');
INSERT INTO `t_role_menu` VALUES ('82', '1', '12');
INSERT INTO `t_role_menu` VALUES ('83', '2', '12');
INSERT INTO `t_role_menu` VALUES ('85', '1', '13');
INSERT INTO `t_role_menu` VALUES ('86', '2', '13');
INSERT INTO `t_role_menu` VALUES ('88', '1', '14');
INSERT INTO `t_role_menu` VALUES ('89', '2', '14');
INSERT INTO `t_role_menu` VALUES ('93', '1', '16');
INSERT INTO `t_role_menu` VALUES ('94', '2', '16');
INSERT INTO `t_role_menu` VALUES ('95', '1', '17');
INSERT INTO `t_role_menu` VALUES ('96', '2', '17');
INSERT INTO `t_role_menu` VALUES ('97', '1', '18');
INSERT INTO `t_role_menu` VALUES ('98', '2', '18');
INSERT INTO `t_role_menu` VALUES ('99', '1', '19');
INSERT INTO `t_role_menu` VALUES ('100', '2', '19');
INSERT INTO `t_role_menu` VALUES ('101', '1', '20');
INSERT INTO `t_role_menu` VALUES ('102', '2', '20');

-- ----------------------------
-- Table structure for t_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_rule`;
CREATE TABLE `t_rule` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `dateEntered` date DEFAULT NULL,
  `dateModified` date DEFAULT NULL,
  `sceneId` int(36) DEFAULT NULL,
  `conditionC` varchar(1000) DEFAULT NULL,
  `action` varchar(1000) DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  `begin` date DEFAULT NULL,
  `end` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_rule
-- ----------------------------
INSERT INTO `t_rule` VALUES ('68', '大于等于3且小于15天', '2013-04-24', '2013-04-24', '15', '73', '32', '1', null, null);
INSERT INTO `t_rule` VALUES ('69', '大于等于15天', '2013-04-24', '2013-04-24', '15', '74', '33', '1', null, null);
INSERT INTO `t_rule` VALUES ('70', '连续登录<=2', '2013-04-24', '2013-04-24', '15', '75', '34', '1', null, null);
INSERT INTO `t_rule` VALUES ('72', '等于3', '2013-04-24', '2013-04-24', '15', '77', '36', '1', null, null);
INSERT INTO `t_rule` VALUES ('75', '邀请送100', '2013-04-25', '2013-04-25', '16', '80', '39', '1', null, null);
INSERT INTO `t_rule` VALUES ('77', '注册送100分', '2013-04-25', '2013-04-25', '16', '', '41', '1', null, null);
INSERT INTO `t_rule` VALUES ('78', '答题送10分', '2013-04-25', '2013-04-25', '14', '82', '42', '1', null, null);
INSERT INTO `t_rule` VALUES ('79', '答对1题送50分', '2013-04-25', '2013-04-25', '14', '83', '43', '1', null, null);
INSERT INTO `t_rule` VALUES ('80', '上传头像送50分', '2013-04-25', '2013-04-25', '17', '84', '44', '1', null, null);
INSERT INTO `t_rule` VALUES ('81', '修改昵称送20分', '2013-04-25', '2013-04-25', '17', '85', '45', '1', null, null);
INSERT INTO `t_rule` VALUES ('82', '完成必填字段送50分', '2013-04-25', '2013-04-25', '17', '86', '46', '1', null, null);
INSERT INTO `t_rule` VALUES ('83', '完成非必填字段,10分/个', '2013-04-25', '2013-04-25', '17', '87', '47', '1', null, null);
INSERT INTO `t_rule` VALUES ('91', '等于15', '2013-04-25', '2013-04-25', '15', '94', '49', '1', null, null);
INSERT INTO `t_rule` VALUES ('97', '测试2', '2015-08-19', '2015-08-19', '18', '124', '65', '1', '2015-08-20', '2015-08-20');
INSERT INTO `t_rule` VALUES ('98', '测试', '2015-09-11', '2015-09-12', '19', null, null, null, null, null);

-- ----------------------------
-- Table structure for t_scene
-- ----------------------------
DROP TABLE IF EXISTS `t_scene`;
CREATE TABLE `t_scene` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `identify` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_scene
-- ----------------------------
INSERT INTO `t_scene` VALUES ('14', 'question', '答题场景');
INSERT INTO `t_scene` VALUES ('15', 'login', '登录场景');
INSERT INTO `t_scene` VALUES ('16', 'register', '注册场景');
INSERT INTO `t_scene` VALUES ('17', 'perfect', '资料完善场景');
INSERT INTO `t_scene` VALUES ('19', 'industry', '行业');
INSERT INTO `t_scene` VALUES ('20', 'postion', '职位');

-- ----------------------------
-- Table structure for t_scene_entity
-- ----------------------------
DROP TABLE IF EXISTS `t_scene_entity`;
CREATE TABLE `t_scene_entity` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `entityId` int(36) DEFAULT NULL,
  `sceneId` int(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8540523 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_scene_entity
-- ----------------------------
INSERT INTO `t_scene_entity` VALUES ('8540415', '10', null);
INSERT INTO `t_scene_entity` VALUES ('8540416', '4', null);
INSERT INTO `t_scene_entity` VALUES ('8540417', '6', null);
INSERT INTO `t_scene_entity` VALUES ('8540447', '4', '15');
INSERT INTO `t_scene_entity` VALUES ('8540448', '42', '15');
INSERT INTO `t_scene_entity` VALUES ('8540449', '42', '16');
INSERT INTO `t_scene_entity` VALUES ('8540451', '42', '14');
INSERT INTO `t_scene_entity` VALUES ('8540452', '42', '17');
INSERT INTO `t_scene_entity` VALUES ('8540459', '42', '21');
INSERT INTO `t_scene_entity` VALUES ('8540460', '51', '21');
INSERT INTO `t_scene_entity` VALUES ('8540506', '51', '21');
INSERT INTO `t_scene_entity` VALUES ('8540507', '53', '21');
INSERT INTO `t_scene_entity` VALUES ('8540509', '51', '22');
INSERT INTO `t_scene_entity` VALUES ('8540510', '53', '22');
INSERT INTO `t_scene_entity` VALUES ('8540511', '4', '23');
INSERT INTO `t_scene_entity` VALUES ('8540512', '52', '23');
INSERT INTO `t_scene_entity` VALUES ('8540515', '42', '24');
INSERT INTO `t_scene_entity` VALUES ('8540516', '52', '24');
INSERT INTO `t_scene_entity` VALUES ('8540517', '48', '25');
INSERT INTO `t_scene_entity` VALUES ('8540518', '51', '25');
INSERT INTO `t_scene_entity` VALUES ('8540519', '54', '19');
INSERT INTO `t_scene_entity` VALUES ('8540520', '55', '19');
INSERT INTO `t_scene_entity` VALUES ('8540521', '54', '20');
INSERT INTO `t_scene_entity` VALUES ('8540522', '55', '20');

-- ----------------------------
-- Table structure for t_variable
-- ----------------------------
DROP TABLE IF EXISTS `t_variable`;
CREATE TABLE `t_variable` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `defaultValue` varchar(255) DEFAULT NULL,
  `dynamicId` int(36) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_variable
-- ----------------------------
INSERT INTO `t_variable` VALUES ('1', '12', null, '测试1', '2');
INSERT INTO `t_variable` VALUES ('2', '12', null, '测试2', '1');
INSERT INTO `t_variable` VALUES ('3', '12', '0', '测试2', '4');
INSERT INTO `t_variable` VALUES ('4', '12', '84834603', '动态测试', '4');
