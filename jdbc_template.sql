/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : jdbc_template

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 27/10/2020 17:51:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `balance` decimal(14, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, 'jj1', 10000.00);
INSERT INTO `account` VALUES (2, 'jj2', 20000.00);

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'b1', 'bb1', 100.00);
INSERT INTO `book` VALUES (2, 'b2', 'bb2', 200.00);
INSERT INTO `book` VALUES (3, 'b3', 'bb3', 300.00);

-- ----------------------------
-- Table structure for book_stock
-- ----------------------------
DROP TABLE IF EXISTS `book_stock`;
CREATE TABLE `book_stock`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book_stock
-- ----------------------------
INSERT INTO `book_stock` VALUES (1, 'b1', 100);
INSERT INTO `book_stock` VALUES (2, 'b2', 200);
INSERT INTO `book_stock` VALUES (3, 'b3', 300);

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salary` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, '张一', 1302.00);
INSERT INTO `employee` VALUES (2, '张二', 200.00);
INSERT INTO `employee` VALUES (3, '123', 123.00);
INSERT INTO `employee` VALUES (4, '张三', 12.00);
INSERT INTO `employee` VALUES (5, '李四', 13.00);
INSERT INTO `employee` VALUES (6, '王五', 14.00);
INSERT INTO `employee` VALUES (7, '赵六', 15.00);
INSERT INTO `employee` VALUES (8, '张三', 1200.00);
INSERT INTO `employee` VALUES (9, '李四', 1300.00);
INSERT INTO `employee` VALUES (10, '王五', 1400.00);
INSERT INTO `employee` VALUES (11, '赵六', 1500.00);
INSERT INTO `employee` VALUES (12, '张三', 1200.10);
INSERT INTO `employee` VALUES (13, '李四', 1300.12);
INSERT INTO `employee` VALUES (14, '王五', 1400.13);
INSERT INTO `employee` VALUES (15, '赵六', 1500.30);
INSERT INTO `employee` VALUES (16, '阿吉1号', 998.98);
INSERT INTO `employee` VALUES (17, '阿吉2号', 1231.12);
INSERT INTO `employee` VALUES (18, '阿吉2号', 1231.12);

SET FOREIGN_KEY_CHECKS = 1;
