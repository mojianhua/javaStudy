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

 Date: 20/10/2020 18:25:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salary` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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

SET FOREIGN_KEY_CHECKS = 1;
