-- ----------------------------
-- Table structure for events
-- ----------------------------
DROP TABLE IF EXISTS `events`;
CREATE TABLE `events` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(127) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for events_map
-- ----------------------------
DROP TABLE IF EXISTS `events_map`;
CREATE TABLE `events_map` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `text` varchar(255) NOT NULL,
  `event_location` varchar(255) NOT NULL,
  `lng` float DEFAULT NULL,
  `lat` float DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for events_rec
-- ----------------------------
DROP TABLE IF EXISTS `events_rec`;
CREATE TABLE `events_rec` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `text` varchar(255) NOT NULL,
  `rec_type` varchar(64) NOT NULL,
  `event_pid` int(11) NOT NULL,
  `event_length` int(11) NOT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for events_units
-- ----------------------------
DROP TABLE IF EXISTS `events_units`;
CREATE TABLE `events_units` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(255) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `event_topic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `events` VALUES ('38', 'Third Annual Progressive Marketing Summit', '2012-02-07 11:30:00', '2012-02-07 16:45:00');
INSERT INTO `events` VALUES ('39', 'Third Annual Progressive Marketing Summit', '2013-02-07 10:00:00', '2013-02-07 15:15:00');
INSERT INTO `events` VALUES ('40', 'Intelligent Content Conference 2013', '2013-02-07 08:15:00', '2013-02-08 18:30:00');
INSERT INTO `events` VALUES ('41', 'Refresh Teesside February', '2013-02-07 16:00:00', '2013-02-07 19:00:00');
INSERT INTO `events` VALUES ('43', 'Digital Media Strategies 2013', '2013-02-19 14:00:00', '2013-02-20 19:00:00');
INSERT INTO `events` VALUES ('44', 'ZendFrameworkDay', '2013-02-01 09:00:00', '2013-02-01 16:40:00');
INSERT INTO `events` VALUES ('45', 'Tomorrow\'s Web', '2013-02-02 13:00:00', '2013-02-02 18:00:00');
INSERT INTO `events` VALUES ('46', 'Webstock 2013', '2013-02-11 09:00:00', '2013-02-15 18:00:00');
INSERT INTO `events` VALUES ('47', 'Training: Build your first Mobile App with HTML5 and a Backend-as-a-Service', '2013-02-09 09:00:00', '2013-02-09 18:30:00');
INSERT INTO `events` VALUES ('48', 'Online Northwest', '2013-02-08 10:00:00', '2013-02-08 14:30:00');
INSERT INTO `events` VALUES ('49', 'GreeceJS 4th Meetup', '2013-02-02 16:00:00', '2013-02-02 20:00:00');
INSERT INTO `events` VALUES ('50', 'DowncityJS', '2013-02-02 09:00:00', '2013-02-02 21:00:00');
INSERT INTO `events` VALUES ('51', 'BathCamp Node.js Evening', '2013-02-06 20:00:00', '2013-02-06 22:00:00');
INSERT INTO `events` VALUES ('52', 'MadJS - Ember.js / Testing with Jasmine', '2013-02-11 10:00:00', '2013-02-11 17:00:00');
INSERT INTO `events` VALUES ('53', 'Social Media - an introduction', '2013-02-05 10:00:00', '2013-02-05 19:00:00');
INSERT INTO `events` VALUES ('54', 'CIPR Scotland: Four steps to Unlocking Online Success', '2013-01-30 14:00:00', '2013-01-30 19:00:00');
INSERT INTO `events` VALUES ('55', 'jQuery Europe 2013', '2013-02-22 10:00:00', '2013-02-23 18:00:00');
INSERT INTO `events` VALUES ('56', 'The Late Late Breakfast Show', '2013-01-30 18:00:00', '2013-01-30 20:30:00');
INSERT INTO `events` VALUES ('57', 'SuperConf 2013', '2013-02-21 13:00:00', '2013-02-22 18:00:00');
INSERT INTO `events` VALUES ('58', 'SearchFest 2013 by SEMpdx', '2013-02-22 07:30:00', '2013-02-22 07:35:00');
INSERT INTO `events` VALUES ('59', 'MPI TechCon', '2013-02-19 08:00:00', '2013-02-19 19:00:00');
INSERT INTO `events` VALUES ('60', 'Social Media Week Milan 2013', '2013-02-18 10:00:00', '2013-02-22 17:00:00');
INSERT INTO `events` VALUES ('62', '5th Facades Design & Delivery Summit', '2013-01-28 09:00:00', '2013-01-30 17:00:00');
INSERT INTO `events` VALUES ('63', 'Webcat February', '2013-02-13 17:00:00', '2013-02-13 21:00:00');
INSERT INTO `events` VALUES ('65', 'Manchester Hackathon', '2013-02-16 14:00:00', '2013-02-17 18:00:00');
INSERT INTO `events` VALUES ('66', 'TOCA ME 2013', '2013-02-16 12:00:00', '2013-02-16 18:00:00');
INSERT INTO `events` VALUES ('68', 'MelbJS', '2013-02-13 18:00:00', '2013-02-13 21:00:00');
INSERT INTO `events` VALUES ('69', 'London Node.js User Group Meetup ', '2013-02-27 18:30:00', '2013-02-27 20:30:00');
INSERT INTO `events` VALUES ('70', 'WebVisions 2013 - NYC', '2013-02-27 09:00:00', '2013-03-01 18:00:00');
INSERT INTO `events` VALUES ('72', 'Lean Day: UX', '2013-03-01 08:30:00', '2013-03-01 17:00:00');
INSERT INTO `events` VALUES ('73', 'TFM&A 2013', '2013-02-26 09:00:00', '2013-02-27 11:00:00');
INSERT INTO `events` VALUES ('75', 'mloc.js', '2013-02-14 09:00:00', '2013-02-16 19:00:00');
INSERT INTO `events_map` VALUES ('10', '2013-02-07 08:30:00', '2013-02-07 16:30:00', 'Mission Possible - Mobile Marketing Conference 2013', 'Market Square, Smithfield, Dublin 7', '-6.27041', '53.3499');
INSERT INTO `events_map` VALUES ('11', '2013-02-02 13:00:00', '2013-02-02 18:00:00', 'Tomorrow\'s Web', 'England London  Arnold Circus, Shoreditch, E2 7ES', '-0.0748263', '51.5263');
INSERT INTO `events_map` VALUES ('12', '2013-02-05 08:30:00', '2013-02-07 16:45:00', 'Social Media Strategy Summit: Las Vegas 2013', '3645 Las Vegas Boulevard, South Las Vegas, NV , 86109', '-115.173', '36.1122');
INSERT INTO `events_map` VALUES ('14', '2013-02-27 18:30:00', '2013-02-27 21:30:00', 'London Node.js User Group Meetup ', 'England, London 19 Mandela Street, NW1 0DU', '-0.136678', '51.5377');
INSERT INTO `events_map` VALUES ('15', '2013-02-13 19:00:00', '2013-02-13 21:00:00', 'Webcat February', 'Spain, Barcelona AlÃ­ Bei, 4, 08010', '2.17829', '41.3915');
INSERT INTO `events_map` VALUES ('16', '2013-02-22 08:30:00', '2013-02-23 18:30:00', 'PHP UK Conference 2013', 'England,London 52 Chiswell Street, London, EC1Y 4SD', '-0.0909232', '51.5208');
INSERT INTO `events_map` VALUES ('17', '2013-02-07 08:15:00', '2013-02-08 18:30:00', 'Intelligent Content Conference 2013', 'United States, San Francisco 1675 Owens Street, 94158', '-122.393', '37.768');
INSERT INTO `events_map` VALUES ('19', '2013-02-21 18:30:00', '2013-02-21 21:00:00', 'Refresh Boston: Honest SEO', 'United States, Cambridge 1 Memorial Drive, 02142', '-71.0813', '42.3614');
INSERT INTO `events_map` VALUES ('20', '2013-02-07 11:30:00', '2013-02-07 16:45:00', 'Third Annual Progressive Marketing Summit', 'United States, Knoxville 4 Market Square, 37902', '-83.9193', '35.9651');
INSERT INTO `events_map` VALUES ('21', '2013-02-02 08:00:00', '2013-02-02 16:30:00', 'Detroit Mobile City iOS Conference', 'United States, Detroit 1114 Washington Boulevard', '-83.0508', '42.3318');
INSERT INTO `events_map` VALUES ('23', '2013-02-09 10:00:00', '2013-02-09 18:30:00', 'Edge', 'England,London 42 Earlham Street, Covent Garden, WC2H 9LA', '-0.125749', '51.5137');
INSERT INTO `events_map` VALUES ('25', '2013-02-08 14:30:00', '2013-02-08 18:00:00', 'BaseX Users Meetup, XML Prague', 'Czech Republic, Prague namesti Winstona Churchilla 1938/4', '14.4412', '50.0829');
INSERT INTO `events_map` VALUES ('26', '2013-02-04 09:00:00', '2013-02-08 16:00:00', 'Akendi UX Training Week Toronto', 'Canada, Toronto 225 Richmond Street West, m5v 1w2', '-79.3898', '43.6493');
INSERT INTO `events_map` VALUES ('27', '2013-02-04 19:00:00', '2013-02-04 21:00:00', 'February London Enterprise Tech Meetup', 'Clement House, City of Westminster, London, England', '-0.115002', '51.5133');
INSERT INTO `events_map` VALUES ('28', '2013-02-14 09:30:00', '2013-02-14 16:30:00', 'Enterprise Lean Startup Day 2013', 'Germany, Hamburg SeewartenstraÃ?e 9, 20459', '9.96916', '53.5472');
INSERT INTO `events_map` VALUES ('29', '2013-02-22 09:00:00', '2013-02-23 18:00:00', 'Meta Refresh 2013', 'India, Bangalore Brigade Millennium, 7th Phase, J.P. Nagar, 560078', '77.5828', '12.8909');
INSERT INTO `events_map` VALUES ('30', '2013-02-18 09:00:00', '2013-02-21 18:00:00', 'An Event Apart Atlanta 2013', 'United States,Atlanta 3315 Peachtree Rd. NE, 30326', '-84.3683', '33.8457');
INSERT INTO `events_map` VALUES ('31', '2013-02-13 09:00:00', '2013-02-13 16:30:00', 'Start-Up City: Miami', 'United States, Miami Beach, 500 17th Street , 33139', '-80.1332', '25.7914');
INSERT INTO `events_map` VALUES ('32', '2013-02-15 08:30:00', '2013-02-15 20:00:00', 'SyncConf 2013', 'England,Norwich 20 Bank Plain, Norwich, Norfolk, NR2 4SF', '1.29764', '52.6297');
INSERT INTO `events_map` VALUES ('33', '2013-02-16 17:00:00', '2013-02-16 20:00:00', 'iOS Demo Day - Braga', 'Portugal, Braga Avenida Barros e Soares nÂº 423, 4715-214', '-8.29099', '41.8343');
INSERT INTO `events_map` VALUES ('34', '2013-02-26 09:15:00', '2013-02-28 17:00:00', 'ApacheCon North America 2013', 'United States, Portland, 921 SW Sixth Avenue, Portland, Oregon, United States, 97204', '-122.68', '45.5175');
INSERT INTO `events_map` VALUES ('35', '2013-01-30 07:30:00', '2013-01-31 17:15:00', 'Big Data Innovation Summit', 'United States, 3570 Las Vegas Blvd South, Las Vegas, NV, 89109', '-115.178', '36.1171');
INSERT INTO `events_rec` VALUES ('4', '2008-01-01 00:00:00', '9999-02-01 00:00:00', ' New Year\'s Day', 'year_1___#no', '0', '86400');
INSERT INTO `events_rec` VALUES ('7', '2012-02-14 00:00:00', '9999-02-01 00:00:00', 'St. Valentine\'s Day', 'year_1___#no', '0', '86400');
INSERT INTO `events_rec` VALUES ('8', '2013-02-14 00:00:00', '2013-02-14 23:55:00', 'St. Valentine\'s Day', '', '7', '1360789200');
INSERT INTO `events_rec` VALUES ('9', '2013-01-01 00:00:00', '2013-01-01 23:55:00', ' New Year\'s Day', '', '4', '1356987600');
INSERT INTO `events_rec` VALUES ('13', '2011-12-26 09:30:00', '9999-02-01 00:00:00', 'Staff meeting', 'week_1___1#no', '0', '5400');
INSERT INTO `events_rec` VALUES ('20', '2012-02-09 18:00:00', '9999-02-01 00:00:00', 'Salary', 'month_1___#no', '0', '3600');
INSERT INTO `events_rec` VALUES ('23', '2012-01-30 17:00:00', '9999-02-01 00:00:00', 'Staff meeting', 'week_1___5#no', '0', '3600');
INSERT INTO `events_rec` VALUES ('24', '2008-02-05 00:00:00', '9999-02-01 00:00:00', 'Mother\'s birthday', 'year_1___#no', '0', '86400');
INSERT INTO `events_rec` VALUES ('25', '2013-02-07 09:30:00', '2013-02-10 17:30:00', 'Web Development conference', '', '0', '0');
INSERT INTO `events_rec` VALUES ('26', '2011-01-24 10:00:00', '9999-02-01 00:00:00', 'Swimming', 'week_1___2,4,6#no', '0', '5400');
INSERT INTO `events_rec` VALUES ('27', '2013-02-07 18:30:00', '2013-02-07 22:00:00', 'Theater (Notre-Dame de Paris)', '', '0', '0');
INSERT INTO `events_rec` VALUES ('28', '2013-02-19 09:00:00', '2013-02-23 19:30:00', 'Social Media Strategies', '', '0', '0');
INSERT INTO `events_rec` VALUES ('29', '2013-03-02 18:00:00', '2013-03-02 22:00:00', 'Theater (Falstaff)', '', '0', '0');
INSERT INTO `events_units` VALUES ('10', 'Refresh Teesside February (England)', '2013-02-07 12:00:00', '2013-02-07 21:00:00', 'web');
INSERT INTO `events_units` VALUES ('11', 'Third Annual Progressive Marketing Summit (United States)', '2013-02-07 11:30:00', '2013-02-07 16:45:00', 'marketing');
INSERT INTO `events_units` VALUES ('12', 'Swiss App Awards 2013 (Switzerland)', '2013-02-07 18:30:00', '2013-02-07 22:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('13', 'Oil & Gas Mobility Summit (England)', '2013-02-18 09:15:00', '2013-02-20 18:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('14', 'An Event Apart Atlanta 2013 (United States)', '2013-02-18 09:00:00', '2013-02-21 17:00:00', 'web');
INSERT INTO `events_units` VALUES ('15', 'SES London 2013 (England)', '2013-02-18 07:30:00', '2013-02-21 16:00:00', 'marketing');
INSERT INTO `events_units` VALUES ('16', 'Detroit Mobile City iOS Conference (United States)', '2013-02-02 08:00:00', '2013-02-02 16:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('17', 'Training: Build your first Mobile App with HTML5 and a Backend-as-a-Service (United States)', '2013-02-09 09:00:00', '2013-02-09 17:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('18', 'iOS Demo Day - Braga (Portugal)', '2013-02-16 17:00:00', '2013-02-16 20:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('19', 'Metrocell Masterclass (England)', '2013-02-21 09:00:00', '2013-02-21 17:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('20', 'WorthingDigital February 2013 (England)', '2013-02-28 08:00:00', '2013-02-28 12:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('21', 'Designing for mobility 2013 (Australia)', '2013-03-01 09:00:00', '2013-03-01 17:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('22', 'tiConf Europe 2013 (Spain)', '2013-02-22 09:00:00', '2013-02-24 18:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('23', 'Jfokus 2013 (Sweden)', '2013-02-04 08:00:00', '2013-02-06 17:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('24', 'Edge (England)', '2013-02-09 09:00:00', '2013-02-09 21:00:00', 'web');
INSERT INTO `events_units` VALUES ('25', 'Webcat February (Spain)', '2013-02-13 19:00:00', '2013-02-13 21:00:00', 'web');
INSERT INTO `events_units` VALUES ('26', 'Refresh Boston: Honest SEO (United States)', '2013-02-21 18:30:00', '2013-02-21 21:00:00', 'web');
INSERT INTO `events_units` VALUES ('27', 'WebVisions 2013 - NYC (United States)', '2013-02-27 09:00:00', '2013-03-01 17:30:00', 'web');
INSERT INTO `events_units` VALUES ('28', 'Altitude (England)', '2013-02-27 19:00:00', '2013-02-27 22:00:00', 'web');
INSERT INTO `events_units` VALUES ('29', 'Responsive Day Out (England)', '2013-03-01 09:00:00', '2013-03-01 22:00:00', 'web');
INSERT INTO `events_units` VALUES ('30', 'Leampack January (England)', '2013-01-29 09:30:00', '2013-01-29 23:30:00', 'web');
INSERT INTO `events_units` VALUES ('31', 'Linda Rising\'s Patterns for Improved Customer Interaction (England)', '2013-01-31 09:00:00', '2013-01-31 12:30:00', 'marketing');
INSERT INTO `events_units` VALUES ('32', 'Social Media Strategy Summit: Las Vegas 2013 (United States)', '2013-02-05 08:30:00', '2013-02-07 16:45:00', 'marketing');
INSERT INTO `events_units` VALUES ('33', 'Integrated Marketing Communications: San Francisco-Two Day Workshop (United States)', '2013-02-25 08:30:00', '2013-02-26 17:00:00', 'marketing');
INSERT INTO `events_units` VALUES ('34', 'Webtrends ENGAGE 2013 (United States)', '2013-01-28 15:00:00', '2013-01-30 17:00:00', 'marketing');
INSERT INTO `events_units` VALUES ('35', 'Intelligent Content Conference 2013 (United States)', '2013-02-07 08:15:00', '2013-02-08 18:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('36', 'Apps World N. America (United States)', '2013-02-07 09:20:00', '2013-02-08 17:30:00', 'mobile');
INSERT INTO `events_units` VALUES ('37', 'BathCamp Node.js Evening (England)', '2013-02-06 18:00:00', '2013-02-06 22:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('38', 'Online Northwest (United States)', '2013-02-08 09:05:00', '2013-02-08 18:00:00', 'mobile');
INSERT INTO `events_units` VALUES ('39', 'Social Media - an introduction (England)', '2013-02-05 10:00:00', '2013-02-05 18:00:00', 'marketing');
