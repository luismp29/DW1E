create database if not exists HealthyAnimalsVet collate utf8mb4_unicode_ci collate utf8mb4_unicode_ci;
use HealthyAnimalsVet;


create table if not exists Staff
(
Staff_ID char (5),
DNI char (9) UNIQUE,
Staff_name varchar (40),
Staff_surname varchar (40),
Date_of_Birth datetime,
Age int,
Email varchar (40),
jobCategory enum ('Veterinarian', 'Assistant', 'Office_Clerk'),
Salary decimal(4,2),
constraint pk_staffID primary key (Staff_ID)
);

create table if not exists staff_Phone
(
Staff_ID char (5),
phone varchar (15),
constraint pk_staffID_phone primary key (Staff_ID, phone),
constraint fk_StaffID_phone foreign key (Staff_ID) references Staff(Staff_ID)
);

create table if not exists Veterinarian
(
Staff_ID char (5),
Specialization enum ('cat', 'dog', 'others'),
constraint pk_staffID_Vet primary key (Staff_ID, Specialization),
constraint fk_staffID_Vet foreign key (Staff_ID) references Staff(Staff_ID)
);

create table if not exists Assistant
(
Staff_ID char (5),
constraint pk_staffID_Assis primary key (Staff_ID),
constraint fk_staffID_Assis foreign key (Staff_ID) references Staff(Staff_ID)
);

create table if not exists Office_Clerk
(
Staff_ID char (5),
constraint pk_staffID_Office primary key (Staff_ID),
constraint fk_staffID_Office foreign key (Staff_ID) references Staff(Staff_ID)
);

create table if not exists Clinics
(
Clinic_ID char (5),
Town varchar (40),
Adress enum ('Street', 'number'),
constraint pk_clinicID primary key (Clinic_ID)
);

create table if not exists clinic_Phone
(
Clinic_ID char (5),
phone varchar (15),
constraint pk_clinicID_phone primary key (Clinic_ID, phone),
constraint fk_clinicID_phone foreign key (Clinic_ID) references Clinics(Clinic_ID)
);

insert into Staff values 
('s0001','000000001','Alberto', 'Perez', '2000-01-01', 19, 'alberto@hola.com', 'Assistant', 30.30),
('s0002','000000002','Juan', 'Lobos', '1997-01-01', 22, 'juan@hola.com', 'Office_Clerk', 86.25),
('s0003','000000003','Maria', 'Blanco', '1996-01-01', 23, 'maria@hola.com', 'Veterinarian', 22.15);

insert into staff_Phone values 
('s0001','111111111'),
('s0002','222222222'),
('s0003','333333333');

insert into Veterinarian values 
('s0001','dog'),
('s0002','cat'),
('s0003','dog');

insert into Assistant values 
('s0001'),
('s0002'),
('s0003');

insert into Office_Clerk values 
('s0001'),
('s0002'),
('s0003');

insert into Clinics values 
('s0001','Madrid','Calle Oro','21'),
('s0002','Barcelona','Calle Plata','22'),
('s0003','Granada','Calle Bronce','23');