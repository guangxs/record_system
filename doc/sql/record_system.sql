/*
Navicat MySQL Data Transfer

Source Server         : Ning
Source Server Version : 80020
Source Host           : 101.200.57.76:3306
Source Database       : web_database

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-07-17 20:16:57
*/

SET FOREIGN_KEY_CHECKS=0;



-- ----------------------------
-- Table structure for category_brand_files
-- ----------------------------
DROP TABLE IF EXISTS `category_brand_files`;
CREATE TABLE `category_brand_files` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_brand_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `brand_id` int NOT NULL,
  `category_id` int NOT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=511 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of category_brand_files
-- ----------------------------
INSERT INTO `category_brand_files` VALUES ('1', '雷蛇', '123456', '456124', '瑕疵');
INSERT INTO `category_brand_files` VALUES ('2', '北京大学出版社', '123654', '456123', '');
INSERT INTO `category_brand_files` VALUES ('3', '华为', '789456', '789654', '');
INSERT INTO `category_brand_files` VALUES ('4', 'Nike', '147258', '456132', '国内仓');
INSERT INTO `category_brand_files` VALUES ('5', 'NIke', '147259', '456132', '海外仓');
INSERT INTO `category_brand_files` VALUES ('501', '怡宝', '333333', '365789', null);

-- ----------------------------
-- Table structure for category_files
-- ----------------------------
DROP TABLE IF EXISTS `category_files`;
CREATE TABLE `category_files` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=789682 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of category_files
-- ----------------------------
INSERT INTO `category_files` VALUES ('456125', '玩具');
INSERT INTO `category_files` VALUES ('456132', '体育用品');
INSERT INTO `category_files` VALUES ('789665', '游戏工具');
INSERT INTO `category_files` VALUES ('789681', '667');



-- ----------------------------
-- Table structure for commodity_category_file
-- ----------------------------
DROP TABLE IF EXISTS `commodity_category_file`;
CREATE TABLE `commodity_category_file` (
  `commodity_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `commodity_id` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `commodity_specifications` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `unit_of_measurement` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `condition_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `warehousing_price` double(10,2) DEFAULT NULL,
  `ex_warehousing_price` double(10,2) DEFAULT NULL,
  `inventory_cap` int DEFAULT NULL,
  `inventory_floor` int DEFAULT NULL,
  `opening_quantity` int DEFAULT NULL,
  `average_opening` double(10,2) DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `warehouse_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of commodity_category_file
-- ----------------------------
INSERT INTO `commodity_category_file` VALUES ('概率论与数理统计', '教育用品', '9787563637911', '140mm×203mm', '本', '1', '14.50', '18.80', '1000', '200', '230', '18.80', null, '青岛仓1');
INSERT INTO `commodity_category_file` VALUES ('海绵宝宝玩偶', '玩具', '9787563637915', '140mm×203mmx170mm', '个', '1', '11.00', '20.90', '200', '10', '86', '35.00', null, '烟台仓2');
INSERT INTO `commodity_category_file` VALUES ('HUAWEI P40 Pro', '电子产品', '9787563630011', '72mm×158mm×8mm', '台', '0', null, null, null, null, null, null, null, null);
INSERT INTO `commodity_category_file` VALUES ('Razer雷蛇', '电脑外设', '9787563630016', 'usb', '把', '1', '2000.00', '2699.00', '80', '5', '41', '2699.00', null, '上海仓1');



-- ----------------------------
-- Table structure for warehouse_organization_files
-- ----------------------------
DROP TABLE IF EXISTS `warehouse_organization_files`;
CREATE TABLE `warehouse_organization_files` (
  `id` int NOT NULL AUTO_INCREMENT,
  `warehouse_id` int NOT NULL,
  `warehouse_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `warehouse_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of warehouse_organization_files
-- ----------------------------
INSERT INTO `warehouse_organization_files` VALUES ('1', '1', '1', '1', '');
INSERT INTO `warehouse_organization_files` VALUES ('3', '2', '2', '2', '');


