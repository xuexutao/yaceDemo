/*
 Navicat Premium Data Transfer

 Source Server         : MysqlLocalDB
 Source Server Type    : MySQL
 Source Server Version : 50743
 Source Host           : localhost:3306
 Source Schema         : yace

 Target Server Type    : MySQL
 Target Server Version : 50743
 File Encoding         : 65001

 Date: 22/02/2024 08:29:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for people
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people`  (
  `id` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `age` int(11) NOT NULL,
  `sex` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of people
-- ----------------------------
INSERT INTO `people` VALUES ('1', 'xxt', 23, '1');
INSERT INTO `people` VALUES ('102', '郭平', 50, '0');
INSERT INTO `people` VALUES ('151', '马杰', 45, '0');
INSERT INTO `people` VALUES ('177', '苏秀兰', 42, '0');
INSERT INTO `people` VALUES ('184', '田秀英', 21, '0');
INSERT INTO `people` VALUES ('223', '锺敏', 32, '1');
INSERT INTO `people` VALUES ('253', '杜桂英', 52, '0');
INSERT INTO `people` VALUES ('263', '郝静', 45, '0');
INSERT INTO `people` VALUES ('264', '谢军', 13, '1');
INSERT INTO `people` VALUES ('292', '邹超', 12, '1');
INSERT INTO `people` VALUES ('3', 'xxt3', 28, '1');
INSERT INTO `people` VALUES ('320', '范秀英', 40, '1');
INSERT INTO `people` VALUES ('352', '蒋平', 80, '1');
INSERT INTO `people` VALUES ('369', '汤娟', 74, '0');
INSERT INTO `people` VALUES ('396', '范敏', 21, '0');
INSERT INTO `people` VALUES ('4', 'yjy', 21, '0');
INSERT INTO `people` VALUES ('435', '白明', 56, '1');
INSERT INTO `people` VALUES ('44', '袁静', 46, '0');
INSERT INTO `people` VALUES ('464', '潘强', 78, '1');
INSERT INTO `people` VALUES ('475', '胡芳', 43, '1');
INSERT INTO `people` VALUES ('485', '姚涛', 66, '1');
INSERT INTO `people` VALUES ('5', 'yjy1', 18, '0');
INSERT INTO `people` VALUES ('527', '朱洋', 72, '0');
INSERT INTO `people` VALUES ('536', '龚涛', 67, '1');
INSERT INTO `people` VALUES ('540', '姚刚', 29, '0');
INSERT INTO `people` VALUES ('548', '郑艳', 17, '0');
INSERT INTO `people` VALUES ('58', '雷芳', 16, '0');
INSERT INTO `people` VALUES ('596', '韩艳', 19, '0');
INSERT INTO `people` VALUES ('629', '彭芳', 29, '0');
INSERT INTO `people` VALUES ('671', '姜强', 78, '0');
INSERT INTO `people` VALUES ('691', '许刚', 37, '1');
INSERT INTO `people` VALUES ('787', '廖杰', 33, '0');
INSERT INTO `people` VALUES ('828', '姜平', 48, '0');
INSERT INTO `people` VALUES ('829', '戴勇', 23, '1');
INSERT INTO `people` VALUES ('870', '康娟', 27, '1');
INSERT INTO `people` VALUES ('899', '秦明', 29, '0');
INSERT INTO `people` VALUES ('908', '万娜', 22, '1');
INSERT INTO `people` VALUES ('98', '汤涛', 68, '1');

SET FOREIGN_KEY_CHECKS = 1;
