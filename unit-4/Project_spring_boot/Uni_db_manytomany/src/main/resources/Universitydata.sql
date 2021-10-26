INSERT INTO `professor`(`professor_id`, `address`, `age`, `name`) VALUES ('1','Mumbai','20','Emre');
INSERT INTO `professor`(`professor_id`, `address`, `age`, `name`) VALUES ('2','Kolkata','25','Robin');
INSERT INTO `professor`(`professor_id`, `address`, `age`, `name`) VALUES ('3','Punjab','28','Deren');


INSERT INTO `subject`(`subject_id`, `room_number`, `duration`, `name`, `timings`) VALUES ('1','201','3 hours','Mathematics','10-1 a.m.');
INSERT INTO `subject`(`subject_id`, `room_number`, `duration`, `name`, `timings`) VALUES ('2','202','2 hours','Science','3-5 p.m.');
INSERT INTO `subject`(`subject_id`, `room_number`, `duration`, `name`, `timings`) VALUES ('3','203','1 hour','Hindi','6-7 p.m.');


INSERT INTO  `subject_professor` (`subject_id`, `professor_id`) VALUES ('1','3');
INSERT INTO  `subject_professor`(`subject_id`, `professor_id`) VALUES ('1','2');
INSERT INTO  `subject_professor`(`subject_id`, `professor_id`) VALUES ('3','3');
INSERT INTO  `subject_professor`(`subject_id`, `professor_id`) VALUES ('2','3');