SELECT * FROM moviet_ticket.province;
SELECT * FROM moviet_ticket.cinema;

INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_USER');
INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_ADMIN');

insert into moviet_ticket.province(name) values('Đồng Nai');
insert into moviet_ticket.province(name) values('Hồ Chí Minh');
insert into moviet_ticket.province(name) values('Bình Dương');


INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`) VALUES ('320 Đồng Khởi', 'Đồng Khởi Cinema', '1');
INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`) VALUES ('1024 Đồng Khởi', 'Đồng Khởi Cinema', '1');
INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`) VALUES ('280 Võ Thị Sáu', 'Võ Thị Sáu Cinema', '2');

select c.name , p.name from moviet_ticket.province p join moviet_ticket.cinema c where c.province_id=p.id;
select c.id,c.name , c.address,p.name from moviet_ticket.province p join moviet_ticket.cinema c where c.province_id=p.id;