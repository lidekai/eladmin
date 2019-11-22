/*
 Navicat Premium Data Transfer

 Source Server         : myOracle
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : localhost:1521
 Source Schema         : SSM

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 21/11/2019 16:55:48
*/


-- ----------------------------
-- Table structure for TEST
-- ----------------------------
DROP TABLE "SSM"."TEST";
CREATE TABLE "SSM"."TEST" (
  "TEST01" VARCHAR2(255 BYTE) NOT NULL ,
  "TEST02" VARCHAR2(255 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TEST
-- ----------------------------
INSERT INTO "SSM"."TEST" VALUES ('1', '1');
INSERT INTO "SSM"."TEST" VALUES ('2', '2');
INSERT INTO "SSM"."TEST" VALUES ('3', '3');

-- ----------------------------
-- Primary Key structure for table TEST
-- ----------------------------
ALTER TABLE "SSM"."TEST" ADD CONSTRAINT "SYS_C0011053" PRIMARY KEY ("TEST01");
