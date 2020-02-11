create database ClinicSante;
use clinicsante;
create table if not exists staff
(
	/* This is our fisrt table*/
    dni char(9),
    salary decimal(5,2) null,
    dateOfBirth date not null,
    first_name varchar(30) not null,
    sur_name varchar(30) not null,
	street varchar (30) not null,
	numberStreet int not null,
    constraint dni_staff primary key (dni)
);

create table if not exists Staf_phone
(
	dni char(9),
    phone varchar (15),
	constraint staff_phone primary key (dni,phone)
);
create table if not exists specialization
(
	id_specialist char(2),
    name_spe varchar(30),
    dni char unique,
    constraint speciliazation_idspecialist primary key(id_specialist),
	constraint specialization_dni foreign key (dni) references staff(dni)
);
create table if not exists doctor
(

	dni char(9),
    specialist varchar (2),
    dni_super char(9),
    constraint doctor_dni primary key (dni),
    constraint doctor_dni_super foreign key (dni_super) references staff(dni),
    constraint doctor_specialist foreign key (specialist) references specialization(id_specialist)
);
create table if not exists nurse
(
	dni char(9),
    dni_super char(9),
    constraint nurse_dni primary key (dni),
    constraint nurse_dni foreign key (dni) references staff(dni),
	constraint nurse_dni_super foreign key (dni_super) references staff(dni)
);

create table if not exists doctor_nuerse
(
	dni_doctor char(9),
    dni_nurse char(9),
    constraint doctor_nurse primary key (dni_doctor,dni_nurse),
	constraint doctor_nurse_dnidoctor foreign key (dni_doctor) references staff(dni),
	constraint doctor_nurse_dninurse foreign key (dni_nurse) references staff(dni)
);

create table if not exists Pacient
(
	id_Pacient char(4),
    dni char(9),
    nameP varchar(30),
    age int,
    
    constraint idPacient primary key (id_Pacient),
    constraint indxUQ unique index (dni,age),
    index indxAge (age)
);

drop table if exists alumnos1;


select table_name,
	   column_name,
       constraint_name,
       referenced_table_name,
       referenced_column_name
from key_column_usage
Where table_schema = "clinicsante";

alter table clinicsante.staff add index (salary);
show indexes from staff;
show table status from clinicsante;
