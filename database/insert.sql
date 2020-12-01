use astronomy; 

insert into role(code,rolename) values('ADMIN','Quản trị');
insert into role(code,rolename) values('USER','Người dùng');

insert into user(username,password,fullname,status)
values('daohongson','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','Đào Hồng Sơn',1);
insert into user(username,password,fullname,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
