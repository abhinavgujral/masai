

insert into passport( id, number)
values(50001, 'E123456');


insert into passport(id, number)
values(50002, 'E25468');


insert into student(id, name, passport_id)
values(20001, 'Varun', 50001);


insert into student(id, name, passport_id)
values(20002, 'Shubham', 50002);



insert into course(id, name)
values(8001, 'SQL');

insert into course(id, name)
values(8002, 'spring');

insert into review(id, description, course_id)
values (6001,'Great',8001);

insert into review(id, description, course_id)
values (6002,'Great',8002);

insert into student_course(student_id, course_id)
values(20001,8001);

insert into student_course(student_id, course_id)
values(20001,8002);

insert into student_course(student_id, course_id)
values(20002,8001);

insert into student_course(student_id, course_id)
values(20002,8002);

insert into player(id, player_name, player_details, player_code, player_info)
values(20002, 'Martin','pro' , '123', 'Racing');
