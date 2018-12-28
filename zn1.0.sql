/*
Navicat MySQL Data Transfer

Source Server         : ZNSXS
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : zn

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2018-12-27 17:56:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dialoguelist
-- ----------------------------
DROP TABLE IF EXISTS `dialoguelist`;
CREATE TABLE `dialoguelist` (
  `value` varchar(255) default NULL,
  `number` int(11) default NULL,
  `name` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dialoguelist
-- ----------------------------
INSERT INTO `dialoguelist` VALUES ('天生我材必有用，精彩壮阔的人生由自己来书写吧！', '1', '旁白');
INSERT INTO `dialoguelist` VALUES ('你们好，我叫（角色输入的姓名）,余下的日子还烦你们请多指教。', '2', '我');
INSERT INTO `dialoguelist` VALUES ('em，emm……！糟了，糟了，睡过头了！军训要集合了!', '3', '我');
INSERT INTO `dialoguelist` VALUES ('学生时代的最后一次军训，倾情出演，不留遗憾！感谢教官，也感谢一起训练的同学们。', '4', '我');
INSERT INTO `dialoguelist` VALUES ('又是一个新的学期开始了，我还是怀念假期T.T，那个夏天，我以为抓住了叨扰的夏蝉就能抓住整个夏天，她...还好吗？', '5', '我');
INSERT INTO `dialoguelist` VALUES ('终于结束了这惨烈的换届选举大会，结果嘛………(看了下手里的工作牌)还是蛮合心的嘛。', '6', '我');
INSERT INTO `dialoguelist` VALUES ('哇，大二了啊，又要交学费了，要努力珍惜大学时光了呢！', '7', '我');
INSERT INTO `dialoguelist` VALUES ('怕不是，就过了半年了啊，明明寒假才刚过，这就大二下学期了啊！', '8', '我');
INSERT INTO `dialoguelist` VALUES ('哎，大三了，又要交学费了大学已经没了一半了，要更加珍惜这大学时光了呢！', '9', '我');
INSERT INTO `dialoguelist` VALUES ('哎，大三都快结束了，想想都快呢！', '10', '我');
INSERT INTO `dialoguelist` VALUES ('没想到呢，这就大四了，最后一次交学费了，即将步入社会了呀，骚年！', '11', '我');
INSERT INTO `dialoguelist` VALUES ('没想到大学就快没了，想想大一开学还历历在目呢！', '12', '我');
INSERT INTO `dialoguelist` VALUES ('没想到，这就大学毕业了啊，四年啊，明明大一开学时还想着要在大学里表现一番呢！结果（望向自己手上文凭\\冠军奖状\\望向自己还显示着直播的显示器）混成了这样子呢！', '13', '我');
INSERT INTO `dialoguelist` VALUES ('诶，怎么那么热闹？', '14', '我');
INSERT INTO `dialoguelist` VALUES ('周围：师弟师妹，有没有兴趣了解一下……', '15', '周围');
INSERT INTO `dialoguelist` VALUES ('我：原来是社团招新啊，去凑凑热闹', '16', '我');
INSERT INTO `dialoguelist` VALUES ('今晚各个社团都会出来展示，过去看看有什么有趣的事情吧！', '17', '我');
INSERT INTO `dialoguelist` VALUES ('想当年我还是个萌新，也是在这个时候参加社团的呢，看看今年有哪些和我当年一样的人吧！', '18', '我');
INSERT INTO `dialoguelist` VALUES ('你们老师有没有介绍蓝桥杯并且鼓励你们去参加啊？', '19', '宿友');
INSERT INTO `dialoguelist` VALUES ('什么是蓝桥杯啊？', '20', '我');
INSERT INTO `dialoguelist` VALUES ('蓝桥杯是为促进软件和信息领域专业技术人才培养，提升高校毕业生的就业竞争力，由教育部就业指导中心支持，工业和信息化部人才交流中心举办蓝桥杯大赛。九年来，包括北大、清华在内的超过 1200 余所院校，累计20万余名学子报名参赛，IBM、百度等知名企业全程参与，成为国内始终领跑的人才培养选拔模式和行业认可度最高的 IT 类科技竞赛......', '21', '宿友');
INSERT INTO `dialoguelist` VALUES ('停！说了这么多，你们参加吗？', '22', '我');
INSERT INTO `dialoguelist` VALUES ('为了祖国的伟大事业，作为现代优秀大学生，我们肯定是积极参与的。(宿友是你的队友，主角选择参加或者不参加)', '23', '宿友');
INSERT INTO `dialoguelist` VALUES ('四六级考试，被理所当然的当成大学是否认真读书衡量的标准，参加了万一过了呢?是吧，万一，谁也说不定！', '24', '我');
INSERT INTO `dialoguelist` VALUES ('一年一度的校运会（又）到了，各个爱好运动的人都开始蠢蠢欲动了', '25', '旁白');
INSERT INTO `dialoguelist` VALUES ('校运会欸，以我的能力未必不能哪个奖（参加）\r\n	校运会还是交给那些运动大佬们吧，我就在台上做个吃瓜群众（不参加）\r\n', '26', '我');
INSERT INTO `dialoguelist` VALUES ('舒服了啊，寒假/暑假我来了，让我想想这个假期该如何过呢？', '27', '我');
INSERT INTO `dialoguelist` VALUES ('诶，要期末考试了，拿出之前的笔记复习复习。', '28', '我');
INSERT INTO `dialoguelist` VALUES ('诶，完了，要期末考试了，快看看老师画的重点。', '29', '我');
INSERT INTO `dialoguelist` VALUES ('即将期末考试！', '30', '我');
INSERT INTO `dialoguelist` VALUES ('期末挂科了！', '31', '我');
INSERT INTO `dialoguelist` VALUES ('期末考试顺利通过了！', '32', '我');
INSERT INTO `dialoguelist` VALUES ('因为上学期挂科了，这学期要重修！', '33', '我');
INSERT INTO `dialoguelist` VALUES ('我要这个！', '34', '我');
INSERT INTO `dialoguelist` VALUES ('谢谢光临！', '35', '店员');
INSERT INTO `dialoguelist` VALUES ('你被学校劝退了！', '36', '退学');
INSERT INTO `dialoguelist` VALUES ('你的大学过的是如此咸鱼呢！', '37', '咸鱼的大学');
INSERT INTO `dialoguelist` VALUES ('没有什么运动可以难倒我！', '38', '运动达人');
INSERT INTO `dialoguelist` VALUES ('与人交谈也是一门技术呢！', '39', '社交达人');
INSERT INTO `dialoguelist` VALUES ('好热啊！这样的天气，真想一直待在家里，不要出门。', '40', '我');
INSERT INTO `dialoguelist` VALUES ('啊，竟然有电话啊……是谁呢？', '41', '我');
INSERT INTO `dialoguelist` VALUES ('嘿！在干嘛？今天女生\\男生节！', '42', '朋友');
INSERT INTO `dialoguelist` VALUES ('什么！对欸！', '43', '我');
INSERT INTO `dialoguelist` VALUES ('你不是喜欢谁谁嘛？抓住这个时机啊！！！！', '44', '朋友');
INSERT INTO `dialoguelist` VALUES ('啊……有道理啊……那……我们快去准备礼物吧，我十分钟后送到！', '45', '我');
INSERT INTO `dialoguelist` VALUES ('我到了，你快点', '46', '朋友');
INSERT INTO `dialoguelist` VALUES ('马上！', '47', '我');
INSERT INTO `dialoguelist` VALUES ('呐，这是给你，希望你能开心', '48', '我');
INSERT INTO `dialoguelist` VALUES ('真的吗！你怎么知道我喜欢这个☺️', '49', '男/女');
INSERT INTO `dialoguelist` VALUES ('你的出现，让我看不起所有女人，因为只有你才是最好的。', '50', '我：xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('想把你我的故事写成一本书，可微薄的纸张又怎能承载得住你我深厚的感情', '51', '我：xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('做我的女人。你不用太过完美。只需要依靠我就够了，我会为你撑起整片天空。', '52', '我：xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('我的每一次呼吸都在爱你。', '53', 'xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('我的女神，让我守护你一生吧！\r\n（所以，我们试着交往吧！）\r\n', '54', 'xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('想用一支笔，画下你的样子，藏在心里，画下你的眉眼，印在脑海，你可以，给我这个机会吗？', '55', 'xx（昵称）');
INSERT INTO `dialoguelist` VALUES ('你是认真的吗？我....我....我愿意。', '56', '女');
INSERT INTO `dialoguelist` VALUES ('其实.....我也喜欢你，我一直.....一直在等你。', '57', '女');
INSERT INTO `dialoguelist` VALUES ('对不起，你是个好人。', '58', '女');
INSERT INTO `dialoguelist` VALUES ('可以给我点时间，让我再考虑考虑，好吗？', '59', '女');
INSERT INTO `dialoguelist` VALUES ('你人真的很好，谢谢你这些天对我的体贴和照顾，但是我们真的不适合。', '60', '女');
INSERT INTO `dialoguelist` VALUES ('我看你骨骼惊奇，是个练武奇才，一起来探讨哲学吧！', '61', '我');
INSERT INTO `dialoguelist` VALUES ('我刚买了很多肥皂要一起试试嘛……', '62', '我');
INSERT INTO `dialoguelist` VALUES ('boy♂next♂boy', '63', '我');
INSERT INTO `dialoguelist` VALUES ('这太突然了，惊喜来的太快了，当然可以', '64', '男');
INSERT INTO `dialoguelist` VALUES ('没问题，你1还是我1', '65', '男');
INSERT INTO `dialoguelist` VALUES ('coming，boy', '66', '男');
INSERT INTO `dialoguelist` VALUES ('对不起，我不搞基', '67', '男');
INSERT INTO `dialoguelist` VALUES ('你脑子没病吧，我们两个都是男的', '68', '男');
INSERT INTO `dialoguelist` VALUES ('滚', '69', '男');
INSERT INTO `dialoguelist` VALUES ('每学期学费为150，挂科科目必须花40补修，心情会受到活动的影响，当心情为自闭的时候需要注意哦！', '70', '1');

-- ----------------------------
-- Table structure for eddinglist
-- ----------------------------
DROP TABLE IF EXISTS `eddinglist`;
CREATE TABLE `eddinglist` (
  `endingvalue` varchar(255) default NULL,
  `endingnumber` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eddinglist
-- ----------------------------
INSERT INTO `eddinglist` VALUES ('毕业后你创业成功，走上了人生巅峰。', '1');
INSERT INTO `eddinglist` VALUES ('多年的坚持没有白费，你在一个含金量很高的运动中获得了冠军，走上了运动员的光辉道路', '2');
INSERT INTO `eddinglist` VALUES ('通过大学四年的阅历，你决定成为一名主播。', '3');

-- ----------------------------
-- Table structure for egglist
-- ----------------------------
DROP TABLE IF EXISTS `egglist`;
CREATE TABLE `egglist` (
  `eggname` varchar(255) default NULL,
  `eggnumber` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of egglist
-- ----------------------------
INSERT INTO `egglist` VALUES ('退学', '1');
INSERT INTO `egglist` VALUES ('咸鱼的大学', '2');
INSERT INTO `egglist` VALUES ('运动达人', '3');
INSERT INTO `egglist` VALUES ('社交达人', '4');
INSERT INTO `egglist` VALUES ('读书达人', '5');

-- ----------------------------
-- Table structure for festivallist
-- ----------------------------
DROP TABLE IF EXISTS `festivallist`;
CREATE TABLE `festivallist` (
  `festivalname` varchar(255) default NULL,
  `festivalnumber` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of festivallist
-- ----------------------------
INSERT INTO `festivallist` VALUES ('生日', '1');
INSERT INTO `festivallist` VALUES ('情人节', '2');

-- ----------------------------
-- Table structure for loverlist
-- ----------------------------
DROP TABLE IF EXISTS `loverlist`;
CREATE TABLE `loverlist` (
  `name` varchar(225) NOT NULL,
  `manone` varchar(11) default '0',
  `mantwo` varchar(11) default '0',
  `manthree` varchar(11) default '0',
  `grilone` varchar(11) default '0',
  `griltwo` varchar(11) default '0',
  `grilthree` varchar(11) default '0',
  KEY `name` (`name`),
  CONSTRAINT `name` FOREIGN KEY (`name`) REFERENCES `storagelist` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loverlist
-- ----------------------------
INSERT INTO `loverlist` VALUES ('11', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('123', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('11133', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('小明', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('爱笑男孩', '5', '0', '0', '0', '105', '0');
INSERT INTO `loverlist` VALUES ('廖文峰', '10', '10', '25', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('一命通关', '0', '0', '0', '0', '伴侣', '0');
INSERT INTO `loverlist` VALUES ('warboy', '失败', '失败', '失败', '10', '失败', '失败');
INSERT INTO `loverlist` VALUES ('wargirl', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('aaaaa', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('djjmm', '失败', '失败', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('44', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('1234', '0', '0', '失败', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('111', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('66', '0', '0', '0', '0', '0', '0');
INSERT INTO `loverlist` VALUES ('67', '0', '0', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for moodlist
-- ----------------------------
DROP TABLE IF EXISTS `moodlist`;
CREATE TABLE `moodlist` (
  `mood` varchar(255) default NULL,
  `moodnumber` int(11) NOT NULL,
  `moodinfluence` varchar(255) default NULL,
  PRIMARY KEY  (`moodnumber`),
  KEY `moodnumber` (`moodnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of moodlist
-- ----------------------------
INSERT INTO `moodlist` VALUES ('人间不值得', '0', '死亡');
INSERT INTO `moodlist` VALUES ('自闭', '1', '额外减2');
INSERT INTO `moodlist` VALUES ('沮丧', '2', '额外减1');
INSERT INTO `moodlist` VALUES ('普通', '3', '0');
INSERT INTO `moodlist` VALUES ('轻松', '4', '额外加1');
INSERT INTO `moodlist` VALUES ('乐极', '5', '额外加2');

-- ----------------------------
-- Table structure for sightlist
-- ----------------------------
DROP TABLE IF EXISTS `sightlist`;
CREATE TABLE `sightlist` (
  `sightname` varchar(255) default NULL,
  `sightnumber` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sightlist
-- ----------------------------
INSERT INTO `sightlist` VALUES ('宿舍', '1');
INSERT INTO `sightlist` VALUES ('操场', '2');
INSERT INTO `sightlist` VALUES ('奶茶店', '3');
INSERT INTO `sightlist` VALUES ('课室', '4');

-- ----------------------------
-- Table structure for storagelist
-- ----------------------------
DROP TABLE IF EXISTS `storagelist`;
CREATE TABLE `storagelist` (
  `uid` int(11) NOT NULL,
  `name` varchar(225) NOT NULL default '',
  `power` int(11) default '1',
  `IQ` int(11) default '1',
  `EQ` int(11) default '1',
  `money` int(11) default '200',
  `moodmath` int(11) NOT NULL default '50',
  `mood` int(11) default NULL,
  `lover` int(11) default NULL,
  `actionpoints` int(11) default NULL,
  `time` int(11) NOT NULL,
  `class` int(5) NOT NULL default '0',
  PRIMARY KEY  (`name`),
  KEY `mood` (`mood`),
  KEY `lover` (`lover`),
  KEY `club` (`actionpoints`),
  KEY `uid` (`uid`),
  KEY `time` (`time`),
  CONSTRAINT `mood` FOREIGN KEY (`mood`) REFERENCES `moodlist` (`moodnumber`),
  CONSTRAINT `time` FOREIGN KEY (`time`) REFERENCES `timelist` (`timenumber`),
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `uselist` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of storagelist
-- ----------------------------
INSERT INTO `storagelist` VALUES ('29', '11', '9', '13', '4', '200', '50', '3', null, '30', '2', '0');
INSERT INTO `storagelist` VALUES ('1', '111', '17', '10', '19', '220', '56', '3', null, '19', '1', '0');
INSERT INTO `storagelist` VALUES ('33', '11133', '9', '9', '14', '200', '50', '3', null, '30', '1', '0');
INSERT INTO `storagelist` VALUES ('31', '123', '5', '10', '14', '200', '50', '3', null, '30', '1', '0');
INSERT INTO `storagelist` VALUES ('1', '1234', '79', '91', '83', '285', '38', '2', null, '26', '3', '0');
INSERT INTO `storagelist` VALUES ('41', '44', '2', '7', '1', '200', '50', '3', null, '30', '1', '0');
INSERT INTO `storagelist` VALUES ('30', '66', '13', '6', '9', '204', '50', '3', null, '28', '1', '0');
INSERT INTO `storagelist` VALUES ('1', '67', '18', '13', '9', '200', '50', '3', null, '29', '1', '0');
INSERT INTO `storagelist` VALUES ('38', 'aaaaa', '113', '147', '81', '216', '22', '2', null, '23', '2', '0');
INSERT INTO `storagelist` VALUES ('40', 'djjmm', '8', '14', '6', '208', '100', '5', null, '16', '2', '0');
INSERT INTO `storagelist` VALUES ('39', 'warboy', '58', '43', '47', '25', '50', '3', null, '13', '1', '0');
INSERT INTO `storagelist` VALUES ('39', 'wargirl', '13', '1', '15', '200', '50', '3', null, '30', '1', '0');
INSERT INTO `storagelist` VALUES ('36', '一命通关', '296', '325', '335', '87', '82', '5', '1', '12', '7', '0');
INSERT INTO `storagelist` VALUES ('34', '小明', '7', '1', '10', '200', '50', '3', null, '30', '1', '0');
INSERT INTO `storagelist` VALUES ('33', '廖文峰', '73', '27', '85', '88', '22', '2', null, '23', '2', '0');
INSERT INTO `storagelist` VALUES ('37', '爱笑男孩', '63', '44', '51', '50000', '46', '3', null, '10', '3', '0');

-- ----------------------------
-- Table structure for timelist
-- ----------------------------
DROP TABLE IF EXISTS `timelist`;
CREATE TABLE `timelist` (
  `time` varchar(255) default NULL,
  `timenumber` int(11) NOT NULL,
  PRIMARY KEY  (`timenumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of timelist
-- ----------------------------
INSERT INTO `timelist` VALUES ('大一1', '1');
INSERT INTO `timelist` VALUES ('大一2', '2');
INSERT INTO `timelist` VALUES ('大一3', '3');
INSERT INTO `timelist` VALUES ('大一4', '4');
INSERT INTO `timelist` VALUES ('假期1', '5');
INSERT INTO `timelist` VALUES ('大一5', '6');
INSERT INTO `timelist` VALUES ('大一6', '7');
INSERT INTO `timelist` VALUES ('大一7', '8');
INSERT INTO `timelist` VALUES ('大一8', '9');
INSERT INTO `timelist` VALUES ('假期2', '10');
INSERT INTO `timelist` VALUES ('大二1', '11');
INSERT INTO `timelist` VALUES ('大二2', '12');
INSERT INTO `timelist` VALUES ('大二3', '13');
INSERT INTO `timelist` VALUES ('大二4', '14');
INSERT INTO `timelist` VALUES ('假期3', '15');
INSERT INTO `timelist` VALUES ('大二5', '16');
INSERT INTO `timelist` VALUES ('大二6', '17');
INSERT INTO `timelist` VALUES ('大二7', '18');
INSERT INTO `timelist` VALUES ('大二8', '19');
INSERT INTO `timelist` VALUES ('假期4', '20');
INSERT INTO `timelist` VALUES ('大三1', '21');
INSERT INTO `timelist` VALUES ('大三2', '22');
INSERT INTO `timelist` VALUES ('大三3', '23');
INSERT INTO `timelist` VALUES ('大三4', '24');
INSERT INTO `timelist` VALUES ('假期5', '25');
INSERT INTO `timelist` VALUES ('大三5', '26');
INSERT INTO `timelist` VALUES ('大三6', '27');
INSERT INTO `timelist` VALUES ('大三7', '28');
INSERT INTO `timelist` VALUES ('大三8', '29');
INSERT INTO `timelist` VALUES ('假期6', '30');
INSERT INTO `timelist` VALUES ('大四1', '31');
INSERT INTO `timelist` VALUES ('大四2', '32');
INSERT INTO `timelist` VALUES ('大四3', '33');
INSERT INTO `timelist` VALUES ('大四4', '34');
INSERT INTO `timelist` VALUES ('假期7', '35');
INSERT INTO `timelist` VALUES ('大四5', '36');
INSERT INTO `timelist` VALUES ('大四6', '37');
INSERT INTO `timelist` VALUES ('大四7', '38');
INSERT INTO `timelist` VALUES ('大四8', '39');
INSERT INTO `timelist` VALUES ('毕业', '40');

-- ----------------------------
-- Table structure for uselist
-- ----------------------------
DROP TABLE IF EXISTS `uselist`;
CREATE TABLE `uselist` (
  `uid` int(11) NOT NULL auto_increment,
  `umail` varchar(30) NOT NULL,
  `upw` varchar(30) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uselist
-- ----------------------------
INSERT INTO `uselist` VALUES ('1', '12', '123');
INSERT INTO `uselist` VALUES ('2', '33', '5555');
INSERT INTO `uselist` VALUES ('29', 'g', 'g');
INSERT INTO `uselist` VALUES ('30', '1', '1');
INSERT INTO `uselist` VALUES ('31', '66', '1');
INSERT INTO `uselist` VALUES ('33', '123', '123');
INSERT INTO `uselist` VALUES ('34', '789', '789');
INSERT INTO `uselist` VALUES ('35', '廖文锋', '10086');
INSERT INTO `uselist` VALUES ('36', '303078', '123');
INSERT INTO `uselist` VALUES ('37', '测试', '123456');
INSERT INTO `uselist` VALUES ('38', 'nibaba', '123456');
INSERT INTO `uselist` VALUES ('39', 'warboy', '111');
INSERT INTO `uselist` VALUES ('40', '小明', '123');
INSERT INTO `uselist` VALUES ('41', '44', '44');

-- ----------------------------
-- Table structure for worklist
-- ----------------------------
DROP TABLE IF EXISTS `worklist`;
CREATE TABLE `worklist` (
  `workname` varchar(255) default NULL,
  `worknumber` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worklist
-- ----------------------------
INSERT INTO `worklist` VALUES ('搬砖', '1');
INSERT INTO `worklist` VALUES ('销售', '2');
INSERT INTO `worklist` VALUES ('家教', '3');
