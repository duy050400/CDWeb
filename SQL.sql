SELECT * FROM moviet_ticket.province;
SELECT * FROM moviet_ticket.cinema;

INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_USER');
INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO moviet_ticket.roles(name) VALUES('ROLE_ADMIN');

insert into moviet_ticket.province(name) values('Đồng Nai');
insert into moviet_ticket.province(name) values('Hồ Chí Minh');
insert into moviet_ticket.province(name) values('Bình Dương');
insert into moviet_ticket.province(name) values('An Giang');
insert into moviet_ticket.province(name) values('Bà Rịa – Vũng tàu');
insert into moviet_ticket.province(name) values('Bắc Giang');
insert into moviet_ticket.province(name) values('Bắc Kạn');
insert into moviet_ticket.province(name) values('Bạc Liêu');
insert into moviet_ticket.province(name) values('Bắc Ninh');
insert into moviet_ticket.province(name) values('Bến Tre');
insert into moviet_ticket.province(name) values('Bình Định');
insert into moviet_ticket.province(name) values('Bình Phước');
insert into moviet_ticket.province(name) values('Bình Thuận');
insert into moviet_ticket.province(name) values('Cà Mau');
insert into moviet_ticket.province(name) values('Cần Thơ');
insert into moviet_ticket.province(name) values('Cao Bằng');
insert into moviet_ticket.province(name) values('Đà Nẵng');
insert into moviet_ticket.province(name) values('Đắk Lắk');
insert into moviet_ticket.province(name) values('Đắk Nông');
insert into moviet_ticket.province(name) values('Điện Biên');
insert into moviet_ticket.province(name) values('Đồng Tháp');
insert into moviet_ticket.province(name) values('Gia Lai');
insert into moviet_ticket.province(name) values('Hà Giang');
insert into moviet_ticket.province(name) values('Hà Nam');
insert into moviet_ticket.province(name) values('Hà Nội');
insert into moviet_ticket.province(name) values('Hà Tĩnh');
insert into moviet_ticket.province(name) values('Hải Dương');
insert into moviet_ticket.province(name) values('Hải Phòng');
insert into moviet_ticket.province(name) values('Hậu Giang');
insert into moviet_ticket.province(name) values('Hòa Bình');
insert into moviet_ticket.province(name) values('Hưng Yên');
insert into moviet_ticket.province(name) values('Khánh Hòa');
insert into moviet_ticket.province(name) values('Kiên Giang');
insert into moviet_ticket.province(name) values('Kon Tum');
insert into moviet_ticket.province(name) values('Lai Châu');
insert into moviet_ticket.province(name) values('Lâm Đồng');
insert into moviet_ticket.province(name) values('Lạng Sơn');
insert into moviet_ticket.province(name) values('Lào Cai');
insert into moviet_ticket.province(name) values('Long An');
insert into moviet_ticket.province(name) values('Nam Định');
insert into moviet_ticket.province(name) values('Nghệ An');
insert into moviet_ticket.province(name) values('Ninh Bình');
insert into moviet_ticket.province(name) values('Ninh Thuận');
insert into moviet_ticket.province(name) values('Phú Thọ');
insert into moviet_ticket.province(name) values('Phú Yên');
insert into moviet_ticket.province(name) values('Quảng Bình');
insert into moviet_ticket.province(name) values('Quảng Nam');
insert into moviet_ticket.province(name) values('Quảng Ngãi');
insert into moviet_ticket.province(name) values('Quảng Ninh');
insert into moviet_ticket.province(name) values('Quảng Trị');
insert into moviet_ticket.province(name) values('Sóc Trăng');
insert into moviet_ticket.province(name) values('Sơn La');
insert into moviet_ticket.province(name) values('Tây Ninh');
insert into moviet_ticket.province(name) values('Thái Bình');
insert into moviet_ticket.province(name) values('Thái Nguyên');
insert into moviet_ticket.province(name) values('Thanh Hóa');
insert into moviet_ticket.province(name) values('Thừa-Thiên Huế');
insert into moviet_ticket.province(name) values('Tiền Giang');
insert into moviet_ticket.province(name) values('Trà Vinh');
insert into moviet_ticket.province(name) values('Tuyên Quang');
insert into moviet_ticket.province(name) values('Vĩnh Long');
insert into moviet_ticket.province(name) values('Vĩnh Phúc');
insert into moviet_ticket.province(name) values('Yên Bái');

INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`,`is_deleted`) VALUES ('320 Đồng Khởi', 'Đồng Khởi Cinema', '1',0);
INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`,`is_deleted`) VALUES ('1024 Đồng Khởi', 'Đồng Khởi Cinema', '1',0);
INSERT INTO `moviet_ticket`.`cinema` (`address`, `name`, `province_id`,`is_deleted`) VALUES ('281 Võ Thị Sáu', 'Võ Thị Sáu Cinema', '2', 0);


INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'A', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'A', '50000');

INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'B', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'B', '50000');

INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'C', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'C', '50000');

INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'D', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'D', '50000');

INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'E', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'E', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'E', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'E', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'E', '50000');

INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('1', 'F', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('2', 'F', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('3', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('4', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('5', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('6', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('7', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('8', 'F', '70000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('9', 'F', '50000');
INSERT INTO `moviet_ticket`.`movie_seat` (`id_colum`, `id_row`, `price`) VALUES ('10', 'F', '50000');

INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 1');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 2');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 3');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 4');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 5');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 6');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 7');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 8');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 9');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 10');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 11');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 12');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 13');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 14');
INSERT INTO `moviet_ticket`.`room` (`room_name`) VALUES ('Phòng 15');

INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '1');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '2');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '3');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '4');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '5');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '6');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '7');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '8');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '9');
INSERT INTO `moviet_ticket`.`cinema_room` (`cinema_id`, `room_id`) VALUES ('1', '10');




INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Steve Carell,Lucy Lawless,Michelle Yeoh...', 
'Kyle Balda, Brad Ableson, Jonathan del Val',
'Adventure, Animation, Comedy', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'P - GENERAL MOVIE TO ALL CUSTOMERS', 
'88 minutes', 
'MINIONS: THE RISE OF GRU', 
'https://www.youtube.com/watch?v=dTQXlDV16SY&ab_channel=CGVCinemasVietnam',
0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Minami Takayama, Chafûrin, Tôru Furuya...', 
'Gosho Aoyama, Susumu Mitsunaka',
'Animation', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C13 - NO CHILDREN UNDER 13 YEARS OLD', 
'111 minutes', 
'DETECTIVE CONAN: THE BRIDE OF HALLOWEEN', 
'https://www.youtube.com/watch?v=SqSJPzWvcLc',
0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Chris Hemsworth, Tessa Thompson, Natalie Portman, Chris Pratt...', 
'Taika Waititi',
'Action, Adventure, Fantasy', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C13 - NO CHILDREN UNDER 13 YEARS OLD', 
'118 minutes', 
'THOR: LOVE AND THUNDER', 
'https://www.youtube.com/watch?v=Go8nTmfrQd8',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Chris Pratt, Bryce Dallas Howard, Isabella Sermon, Omar Sy, Sam Neill...', 
'Colin Trevorrow',
'Adventure, Animation, Comedy', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C13 - NO CHILDREN UNDER 13 YEARS OLD', 
'147 minutes', 
'JURASSIC WORLD 3: Dominion', 
'https://www.youtube.com/watch?v=fb5ELWi-ekk',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Tang Wei, Park Hae Il...', 
'Park Chan Wook',
'Romance, Thriller', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C16 - NO CHILDREN UNDER 16 YEARS OLD', 
'138 minutes', 
'DECISION TO LEAVE', 
'https://www.youtube.com/watch?v=9aMHyTqvIvU',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Dwayne Johnson, Kevin Hart, Keanu Reeves...', 
'Jared Stern',
'Animation', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'P - GENERAL MOVIE TO ALL CUSTOMERS', 
'106 minutes', 
'DECISION TO LEAVE', 
'https://www.youtube.com/watch?v=1jkw2JPCl18',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Aghniny Haque, Achmad Megantara, Aulia Sarah...', 
'Awi Suryadi',
'Horror', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C16 - NO CHILDREN UNDER 16 YEARS OLD', 
'123 minutes', 
'KKN DI DESA PENARI', 
'https://www.youtube.com/watch?v=jtDRXPTZT-M',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Kim Yoon-Seok, Jo In-Sung, Huh Joon-Ho,...', 
'Ryoo Seung-wan',
'Action, Drama, Thriller', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C16 - NO CHILDREN UNDER 16 YEARS OLD', 
'121 minutes', 
'ESCAPE FROM MOGADISHU', 
'https://www.youtube.com/watch?v=jtDRXPTZT-M',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`)  
VALUES (
'Hong Je Yi, Kim Ji Young, Kim Mi Hwa, Hwang Seok Jeong', 
'Kim Hyunho, Yoon Jewan',
'Animation', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'P - GENERAL MOVIE TO ALL CUSTOMERS', 
'79 minutes', 
'PORORO, DINOSAUR ISLAND ADVENTURE', 
'https://www.youtube.com/watch?v=s3vUSpREuO8',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Rachel Rodriguez, Daniel Martínez, Dominika Paleta,...', 
'Henry Bedwell',
'Horror', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C18 - NO CHILDREN UNDER 18 YEARS OLD', 
'80 minutes', 
'KAREM, THE POSSESSION', 
'https://www.youtube.com/watch?v=-th9bcFAGJM',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Trần Lực, Avin Lu, Akari Nakatani, Bùi Lan Hương, Hoàng Hà, Lan Thy,...', 
'Phan Gia Nhật Linh',
'Romance', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C13 - NO CHILDREN UNDER 13 YEARS OLD', 
'136 minutes', 
'EM VÀ TRỊNH', 
'https://www.youtube.com/watch?v=IosqnBOkk2I',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Dương Tử Quỳnh, Quan Kế Huy, Stephanie Hsu, James Hong,...', 
'Daniel Kwan, Daniel Scheinert',
'Fantasy, Science Fiction', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C18 - NO CHILDREN UNDER 18 YEARS OLD', 
'139 minutes', 
'EVERYTHING EVERYWHERE ALL AT ONCE', 
'https://www.youtube.com/watch?v=wxN1T1uxQ2g',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Shin Shi A, Lee Jong Suk, Park Eun Bin, Jin Goo, Kim Da Mi,...', 
'Park Hoon Jung',
'Action', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C18 - NO CHILDREN UNDER 18 YEARS OLD', 
'138 minutes', 
'THE WITCH: PART 2.THE OTHER ONE', 
'https://www.youtube.com/watch?v=jhF5zIGJsXs',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Eiji Akaso, Keita Machida , Kodai Asaka, Yutaro,...', 
'Hiroki Kazama',
'Romance', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C16 - NO CHILDREN UNDER 16 YEARS OLD', 
'104 minutes', 
'CHERRY MAGIC! THIRTY YEARS OF VIRGINITY CAN MAKE YOU A WIZARD?!', 
'https://www.youtube.com/watch?v=CQbXwIiJDfI',0);
INSERT INTO moviet_ticket.`movie` (cast, director, genre, image, rated, running_time, title, trailer,`is_deleted`) 
VALUES (
'Dwayne Johnson, Sarah Shahi, Pierce Brosnan, Noah Centineo,...', 
'Jaume Collet-Serra',
'Action, Adventure', 
'https://lag.vn/tin/the-gioi-phim-anh/minions-tung-loat-poster-cuc-de-thuong-cho-mua-he-2022.html', 
'C16 - NO CHILDREN UNDER 16 YEARS OLD', 
'104 minutes', 
'BLACK ADAM', 
'https://www.youtube.com/watch?v=X0tOpBuYasI,0');

INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-24', '10:15:00', '1', '1', '1',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '11:15:00', '1', '1', '1',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '12:45:00', '1', '1', '2',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '14:20:00', '1', '1', '5',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '16:35:00', '1', '1', '7',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '18:30:00', '1', '1', '6',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '20:10:00', '1', '1', '8',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-07-23', '23:45:00', '1', '1', '10',0);

INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '10:15:00', '1', '1', '1',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '11:15:00', '1', '1', '1',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '12:45:00', '1', '1', '2',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '14:20:00', '1', '1', '5',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '16:35:00', '1', '1', '7',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '18:30:00', '1', '1', '6',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '20:10:00', '1', '1', '8',0);
INSERT INTO `moviet_ticket`.`movie_showing` (`date`, `time`, `cinema_id`, `movie_id`, `room_id`,`is_deleted`) VALUES ('2022-08-03', '23:45:00', '1', '1', '10',0);


select c.name , p.name from moviet_ticket.province p join moviet_ticket.cinema c where c.province_id=p.id;
select c.id,c.name , c.address,p.name from moviet_ticket.province p join moviet_ticket.cinema c where c.province_id=p.id;