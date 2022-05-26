CREATE DATABASE Booking_Movie_Ticket
GO
Use Booking_Movie_Ticket
GO
--CREATE TABLE Date_Exam
--(
--	id int IDENTITY(1,1) PRIMARY KEY,
--	trailer nvarchar(50) NOT NULL FOREIGN KEY REFERENCES Semester (ID_Semester),
--	ID_Schedule nvarchar(50) NOT NULL FOREIGN KEY REFERENCES Schedule (ID_Schedule),
--	group_Exam nvarchar(50) ,
--	seats smallint  not null,
--)

CREATE TABLE Movies
(
	id int IDENTITY(1,1) PRIMARY KEY,
	trailer nvarchar(50) NOT NULL,
	iamge image NOT NULL,
	title nvarchar(256) NOT NULL ,
	descriptions nvarchar(MAX) NOT NULL ,
	rated nvarchar(256) NOT NULL ,
	in_theater nvarchar(256) NOT NULL ,
	genre nvarchar(256) NOT NULL ,
	director nvarchar(256) NOT NULL ,
	casts nvarchar(256) NOT NULL ,
	runtime time(7) NOT NULL ,
	languages nvarchar(256) NOT NULL ,
)

CREATE TABLE Users
(
	phone_number varchar(11) PRIMARY KEY,
	[password] nvarchar(256) NOT NULL,
	[name] nvarchar(256) NOT NULL,
	email nvarchar(256),
	date_of_birth date NOT NULL,
	sex nvarchar(50) NOT NULL
)

CREATE TABLE Auditorium
(
	phone_number varchar(11) PRIMARY KEY,
	[password] nvarchar(256) NOT NULL,
	[name] nvarchar(256) NOT NULL,
	email nvarchar(256),
	date_of_birth date NOT NULL,
	sex nvarchar(50) NOT NULL
)