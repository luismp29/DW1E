alter database clinicsante character set utf8mb4 collate utf8mb4_unicode_ci;
create table if not exists borrar
(
	nombre varchar (20) primary key
);

alter table clinicsante.doctor character set utf8mb4 collate utf8mb4_unicode_ci;