alter table clinicsante.specialization
modify name_spe varchar(40) default 'Surgery';

show create table clinicsante.driver;

create table if not exists clinicsante.driver
(
	idDriver char(3),
    nameDriver varchar(40),
    dpt char(2) default 'd1',
    constraint pk_driver primary key (idDriver)
);

create table dw1e.t2
(
	c1 int,
    c2 int,
    c3 int
);

create table if not exists dw1e.hola
(
	c1 int,
    c2 int,
    c3 int
);

drop table dw1e.hola;
rename table dw1e.t1 to dw1e.checktable;
alter table dw1e.t2 change c1 col01 int;
alter table dw1e.t2 change c2 col02 int;
alter table dw1e.t2 change c3 col03 int;
alter table dw1e.t2 change col02 col02 double default 12.50;
show create table dw1e.t2;
alter table dw1e.t2 modify col03 varchar (30) default 'Lunes';
alter table t2 add column (town2 varchar(30), country varchar(30));
insert into dw1e.t2 (col01,col02,col03) values (170,200.6,'Miercoles');
insert into dw1e.t2 (town2) values ('Cadiz');
insert into dw1e.t2 (col01,col02,col03) values (170,200.6,'Miercoles'),(200,100.64,'Jueves');
select * from dw1e.t2;
alter table dw1e.t2 drop foreign key 
update dw1e.t2 set col03='Lunes' where col01=100;
truncate dw1e.t2;
SET SQL_SAFE_UPDATES = 0;
delete from dw1e.t2 where col01='100';
insert into dw1e.t2 values ('123',30, 'pepe', 'sevilla','spain');   