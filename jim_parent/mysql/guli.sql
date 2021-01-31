/*
 Navicat Premium Data Transfer

 Source Server         : mamp
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:8889
 Source Schema         : guli

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 31/01/2021 17:32:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for edu_teacher
-- ----------------------------
DROP TABLE IF EXISTS `edu_teacher`;
CREATE TABLE `edu_teacher` (
  `id` bigint(19) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '讲师名称',
  `intro` varchar(500) DEFAULT NULL COMMENT '讲师简介',
  `career` varchar(500) DEFAULT NULL COMMENT '讲师资历',
  `level` int(11) DEFAULT NULL COMMENT '讲师头衔，1高级，2首席',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `sort` int(10) DEFAULT NULL COMMENT '排序',
  `is_deleated` tinyint(1) DEFAULT '0' COMMENT '逻辑删除',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
