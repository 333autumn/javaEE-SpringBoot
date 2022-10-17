/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : fruit_manage

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 17/10/2022 14:40:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accessory
-- ----------------------------
DROP TABLE IF EXISTS `accessory`;
CREATE TABLE `accessory`  (
  `accessoryid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `fruitid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`accessoryid`) USING BTREE,
  UNIQUE INDEX `accessory_PK`(`accessoryid`) USING BTREE,
  INDEX `关系4_FK`(`fruitid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of accessory
-- ----------------------------
INSERT INTO `accessory` VALUES ('4587egaskh-9j65-87s4-9245-9347ajasd', '88e6ec6c-6d17-43a7-8782-38904ajskdh', '包装袋', 0.1, '2017-09-13 19:47:19');
INSERT INTO `accessory` VALUES ('4758zhuyrg-2l4t-4d6e-1754-1342ujify', '88e6ec6c-6d17-43a7-8782-38904ajskdh', '纸板盒', 0.3, '2017-09-13 19:50:12');
INSERT INTO `accessory` VALUES ('fbfec4d6-6510-4c83-9ef2-5467ef6b07ca', '88e6ec6c-6d17-43a7-8782-38904ajskdh', '捆绳', 0.1, '2017-09-13 21:17:39');

-- ----------------------------
-- Table structure for commodities
-- ----------------------------
DROP TABLE IF EXISTS `commodities`;
CREATE TABLE `commodities`  (
  `fruitid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `locality` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`fruitid`) USING BTREE,
  UNIQUE INDEX `commodities_PK`(`fruitid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodities
-- ----------------------------
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-38904ajskdh', '黄桃', 3.5, '浙江省金华市', '2017-09-09 09:34:12');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-48957ajskdf', '火龙果', 6.68, '浙江省绍兴市', '2017-09-09 09:35:17');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-89asdjh389a', '橙子', 0.4, '江苏省南京市', '2017-09-09 09:36:44');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-9534sd23h90', '柚子', 0.5, '上海市金山区', '2017-09-09 09:37:51');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-csrjdsk8347', '猕猴桃', 2.2, '上海市嘉定区', '2017-09-09 09:38:03');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-d1eae391234', '苹果', 0.7, '山东省青岛市', '2017-09-09 09:39:22');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-d1eae394106', '橘子', 1.6, '上海市普陀区', '2017-09-09 09:40:11');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-d1eae84dj46', '香蕉', 1.3, '江苏省昆山市', '2017-09-09 09:41:23');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-dhk327894aj', '柿子', 0.5, '江苏省苏州市', '2017-09-09 09:42:52');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-dijhksd2367', '榴莲', 13, '江苏省盐城县', '2017-09-09 09:43:31');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-hc2374gasd8', '葡萄', 2.3, '上海市马陆镇', '2017-09-09 09:43:57');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-jhk8340a783', '荔枝', 1.8, '江苏省无锡市', '2017-09-09 09:44:05');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-kduidfh3435', '西瓜', 0.3, '江苏省常州市', '2017-09-09 09:45:14');
INSERT INTO `commodities` VALUES ('88e6ec6c-6d17-43a7-8782-xce3940hsd4', '芒果', 3.6, '浙江省杭州市', '2017-09-09 09:46:34');

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract`  (
  `contractid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `retailerid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `barcode` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `type` int(11) NULL DEFAULT NULL COMMENT '1是省外,0是省内',
  `createtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`contractid`) USING BTREE,
  UNIQUE INDEX `contract_PK`(`contractid`) USING BTREE,
  INDEX `关系1_FK`(`retailerid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of contract
-- ----------------------------
INSERT INTO `contract` VALUES ('1119393d-c61a-4cba-a5bd-4d60834f0849', '90h7dv5c-9j87-24r6-9087-anune089x476', '202210160006', 1, '2022-10-16 08:28:25');
INSERT INTO `contract` VALUES ('339b5d09-3735-4230-aa19-6a7934b7a7cd', '90h7dv5c-9j87-24r6-9087-anune089x021', '202210160001', 1, '2022-10-16 07:48:46');
INSERT INTO `contract` VALUES ('3a1d91dc-7eb8-4414-856c-6df52c150114', '90h7dv5c-9j87-24r6-9087-anune089x476', '202210160002', 1, '2022-10-16 07:55:40');
INSERT INTO `contract` VALUES ('48b2949e-6d92-4f99-a24e-4f11d4619514', '90h7dv5c-9j87-24r6-9087-anune089x021', '202210160007', 0, '2022-10-16 08:24:49');
INSERT INTO `contract` VALUES ('781f0ec8-a9d5-4431-9d13-82fc7ea98038', '90h7dv5c-9j87-24r6-9087-anune089x294', '202210160004', 0, '2022-10-16 07:50:44');

-- ----------------------------
-- Table structure for middle_tab
-- ----------------------------
DROP TABLE IF EXISTS `middle_tab`;
CREATE TABLE `middle_tab`  (
  `middleid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `contractid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fruitid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `number` double NULL DEFAULT NULL,
  PRIMARY KEY (`middleid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of middle_tab
-- ----------------------------
INSERT INTO `middle_tab` VALUES ('28c3c609-e91a-44c2-adc4-866658bc7088', '339b5d09-3735-4230-aa19-6a7934b7a7cd', '88e6ec6c-6d17-43a7-8782-48957ajskdf', 1);
INSERT INTO `middle_tab` VALUES ('35d745e6-3c32-4213-8ef4-1ba3b159a674', '1119393d-c61a-4cba-a5bd-4d60834f0849', '88e6ec6c-6d17-43a7-8782-48957ajskdf', 1.2);
INSERT INTO `middle_tab` VALUES ('4b6beed3-f21d-49e8-a8fd-7837e653df72', '781f0ec8-a9d5-4431-9d13-82fc7ea98038', '88e6ec6c-6d17-43a7-8782-89asdjh389a', 1.6);
INSERT INTO `middle_tab` VALUES ('71b29e64-aa0e-4a4e-b25a-feb19ab2ca2b', '781f0ec8-a9d5-4431-9d13-82fc7ea98038', '88e6ec6c-6d17-43a7-8782-38904ajskdh', 4.5);
INSERT INTO `middle_tab` VALUES ('92499d2a-04b3-473b-a70b-ba349ac3b194', '3a1d91dc-7eb8-4414-856c-6df52c150114', '88e6ec6c-6d17-43a7-8782-48957ajskdf', 0.3);
INSERT INTO `middle_tab` VALUES ('9b738211-ffe8-49e1-87eb-40f9fb994521', '1119393d-c61a-4cba-a5bd-4d60834f0849', '88e6ec6c-6d17-43a7-8782-38904ajskdh', 1.5);
INSERT INTO `middle_tab` VALUES ('a44ad302-c4d4-48a9-9855-6a91f5783cef', '339b5d09-3735-4230-aa19-6a7934b7a7cd', '88e6ec6c-6d17-43a7-8782-89asdjh389a', 0.6);
INSERT INTO `middle_tab` VALUES ('c57e65f4-40f8-4851-a07a-d012caa88b19', '48b2949e-6d92-4f99-a24e-4f11d4619514', '88e6ec6c-6d17-43a7-8782-38904ajskdh', 0.3);
INSERT INTO `middle_tab` VALUES ('c92293d7-2ed2-4648-8106-009c20b70983', '48b2949e-6d92-4f99-a24e-4f11d4619514', '88e6ec6c-6d17-43a7-8782-48957ajskdf', 0.1);
INSERT INTO `middle_tab` VALUES ('d8a9150c-f9d1-418a-8f8c-6818ca18d1e4', '3a1d91dc-7eb8-4414-856c-6df52c150114', '88e6ec6c-6d17-43a7-8782-9534sd23h90', 0.3);
INSERT INTO `middle_tab` VALUES ('da24d453-a2e3-48eb-806b-d90bbc540f71', '339b5d09-3735-4230-aa19-6a7934b7a7cd', '88e6ec6c-6d17-43a7-8782-38904ajskdh', 1.3);

-- ----------------------------
-- Table structure for retailer
-- ----------------------------
DROP TABLE IF EXISTS `retailer`;
CREATE TABLE `retailer`  (
  `retailerid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`retailerid`) USING BTREE,
  UNIQUE INDEX `retailer_PK`(`retailerid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of retailer
-- ----------------------------
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x021', '胡晓丽', '155222233', '上海市闵行区', 1, '2017-08-30 09:14:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x294', '施俊杰', '13444444', '上海市徐汇区', 1, '2017-09-04 01:16:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x325', '钱晓晓', '15533333333', '上海市长宁区', 0, '2017-09-04 01:17:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x365', '王二小', '13555555555', '上海市杨浦区', 1, '2017-09-04 09:18:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x476', '任宇', '13222222222', '上海市虹口区', 1, '2017-09-04 09:19:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x734', '周佳', '15566666666', '上海市金山区', 1, '2017-09-04 09:20:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x921', '张晓冉', '15511111111', '上海市奉贤区', 0, '2017-09-04 09:21:55');
INSERT INTO `retailer` VALUES ('90h7dv5c-9j87-24r6-9087-anune089x954', '牛夏利', '13333333333', '上海市松江区', 1, '2017-09-04 09:22:55');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE,
  UNIQUE INDEX `user_PK`(`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('3af57d0545766ec940d2c32a6567cc06ae5', 'jack', '1234', '李书春', '137858512');
INSERT INTO `user` VALUES ('734hdak3kfd389jgh3kll4590wejrh983jk', 'tom', '4321', '张茜茜', '13888888888');
INSERT INTO `user` VALUES ('88e6ec6c-6d17-43a7-8782-d1eae394d802', 'jackson', '2222', '刘霜', '13782345627');

SET FOREIGN_KEY_CHECKS = 1;
