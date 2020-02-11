create database BlueSea;
use BlueSea;
create table if not exists staff
(
StaffID char(5),
dni char(9) null,
first_name varchar(40),
surname varchar(40),
email varchar(40),
/*phones char(9), en una tabla a parte*/
jobCategory varchar(12),
constraint Staff_ID primary key (StaffID)
);

create table if not exists boats
(
boat_number char(5),
boat_type varchar(9),
boat_name varchar(40),
boat_status varchar(7),
constraint boat_ID primary key (boat_number)
);

create table if not exists tour
(
tourID char(5),
startpoint varchar(30),
destinationpoint varchar(30),
start_date datetime, /*si no se especifica nada datetime o date, si es algo especifico usar datetime*/
return_date datetime,
numberOfPassenger char(6),
price decimal (8,2),
operating_expenses decimal (8,2),
constraint tour_ID primary key(tourID)
);

create table if not exists Staff_Phone
(
	StaffID char(5),
    constraint pk_staff_phone primary key (StaffID,phoneNumber),
    constraint fk_staff_phone foreign key

);

create table if not exists Tour_Staff
(
boat_number char(5),
tourID

);












