create database if not exists Cyclist;
use Cyclist;
set sql_safe_updates=0;
create table if not exists People
(
	id char(5),
    dni char(9) unique,
    nombre varchar(30),
    gender char(1),
    surname numeric(2,0),
    dateBirth date,
    salary decimal(6,2),
    email varchar(40),
   
    constraint pk_id primary key (id)
);
create table if not exists phone_people
(
	id char(5),
    phone varchar(30),
    constraint pk_phone primary key(id,phone),
    constraint fk_id_phone foreign key (id) references people(id)


);


create table if not exists cyclist
(
	idC char(5),
    dorsal int,
    constraint pk_idC primary key (idC),
    constraint fk_id foreign key (idC) references People(id)
    
);

create table if not exists staff
(
	idS char(5),
    jobFunction varchar(30),
    constraint pk_idS primary key (idS),
	constraint fk_idCT foreign key (idS) references cyclistTeam(idCT),
    constraint fk_id2 foreign key (idS) references People(id)
);

create table if not exists manager
(
	idM char(5),
    constraint pk_idM primary key (idM),
    constraint fk_idCT2 foreign key (idM) references cyclistTeam(idCT),
	constraint fk_id3 foreign key (idM) references People(id)
);

create table if not exists races
(
	idRace char(5),
    fecha date,
    startPoint varchar(30),
    endPoint varchar(30),
    constraint pk_idRace primary key(idRace)
);

create table if not exists cyclistTeam
(
	idCT char(5),
    nombreCT varchar(30),
    country varchar(30),
    NCyclist int,
    constraint pk_idCT primary key(idCT),
    constraint fk_idC foreign key (idCT) references cyclist(idC)
);
create table if not exists participate
(
	idC char(5),
    idRace char(5),
	constraint fk_idC2 foreign key (idC) references cyclist(idC),
    constraint fk_idRace foreign key(idRace) references races(idRace)
);

show create table Cyclist.People;
alter table races rename Race20192020;
alter table staff change jobFunction typeOfJob varchar(30);

