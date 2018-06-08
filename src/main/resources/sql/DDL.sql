create user 'mas' identified by 'Mas@123456';
grant all privileges on `mas`.* to 'mas' identified by 'Mas@123456';

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account_display_id` varchar(0) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '账户显示ID',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `account_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '账户自定义名字',
  `available_amount` decimal(20, 2) NULL DEFAULT NULL COMMENT '可用金额',
  `pre_income_amount` decimal(20, 0) NULL DEFAULT NULL COMMENT '预入账金额',
  `pre_outcome_amount` decimal(20, 0) NULL DEFAULT NULL COMMENT '预转出金额',
  `status` int(1) NULL DEFAULT NULL COMMENT '账户状态1可用 0 不可用',
  `created_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建时间',
  `last_updated_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;