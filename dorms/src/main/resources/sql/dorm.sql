/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : dorm

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 07/01/2021 09:19:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` int(11) NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'adminxxxxxxxxxxxxxxxxxxx', '123456xxxxxx', 'adminxxxxx', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (2, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (3, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (4, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (5, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (6, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (7, 'admin1', '12345661', 'admin1', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (8, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (10, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (11, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (12, 'admin', '1234566', 'admin', NULL, NULL, NULL);
INSERT INTO `tb_user` VALUES (13, 'admin', '1234566', 'admin', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
