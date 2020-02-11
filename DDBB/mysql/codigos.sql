create database if not exists codigos character set utf8mb4 collate utf8mb4_unicode_ci;
use codigos;
create table if not exists alumnos12
(
	dni char(9),
	name_Student varchar (30),
    constraint dni_Student primary key (dni)
);

use information_schema;
select table_name,
	   column_name,
       constraint_name,
       referenced_table_name,
       referenced_column_name
from key_column_usage
Where table_schema = "codigos";
		
        
show table status from codigos;
