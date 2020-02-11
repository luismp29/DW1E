-- ******************************************************************* SIMPLES ************************************************************************************************************************************
-- 1.- Obtener una lista de todos los productos, indicando para cada uno de ellos, su idfab, idproducto, descripción, precio y precio con I.V.A. incluido (es el precio anterior aumentado en un 16%). 
select idfab, idproducto, descricion, precio, round(precio*1.16,2) from ejercicios.productos;
-- 2.- De cada pedido queremos saber su número de pedido, fab, producto, cantidad, precio unitario e importe. 
select numpedido, fab, producto, cant, importe / cant as precio_unitario, importe from pedidos;
-- 3.- Listar de cada empleado su nombre, nº de días que lleva trabajando en la empresa y su año de nacimiento (suponiendo que este año ya ha cumplido años).
select nombre, date() - contrato as dias_trabajados, year(date()) - edad as año_nacimiento from empleados;
-- 4.- Obtener la lista de los clientes ordenados por código de representante asignado, visualizar todas la columnas de la tabla.
select * from clientes order by repclie;
-- 5.- Obtener las oficinas ordenadas por orden alfabético de región y dentro de cada región por ciudad, si hay más de una oficina en la misma ciudad, aparecerá primero la que tenga el número de oficina mayor.
SELECT * FROM oficinas ORDER BY region, ciudad, oficina DESC;
-- 6.- Obtener los pedidos ordenados por fecha de pedido.
select * from pedidos order by fechapedido;
-- 7.- Listar las cuatro líneas de pedido más caras (las de mayor importe).
/*select TOP 4 * from pedidos order importe desc;*/
select * from ejercicios.pedidos order by importe desc limit 4;
-- 8.- Obtener las mismas columnas que en el ejercicio 2 pero sacando unicamente las 5 líneas de pedido de menor precio unitario.
/*select TOP 5 numpedido, fab, producto, cant, importe / cant as precio_unitario, importe from ejercicios.pedidos order by 5;*/
select numpedido, fab, producto, cant, round(importe/cant,2) 'precio unitario', importe from ejercicios.pedidos order by 5;
-- 9.- Listar toda la información de los pedidos de marzo.
select * from pedidos where month(fechapedido) = 3;
-- 10.- Listar los números de los empleados que tienen una oficina asignada.
select numemp from ejercicios.empleados where oficina is not null;
-- 11.- Listar los números de las oficinas que no tienen director.

-- 12.- Listar los datos de las oficinas de las regiones del norte y del este (tienen que aparecer primero las del norte y después las del este).
select * from oficinas where region in ('norte','este') order by region desc;
-- 13.- Listar los empleados de nombre Juan.
select * from empleados where nombre like 'Juan *';
-- 14.- Listar los productos cuyo idproducto acabe en x.
select * from productos where idproducto like '*x';
-- ********************************************************************** RESUMEN ***********************************************************************************

-- 1.- ¿Cuál es la cuota media y las ventas medias de todos los empleados?
select avg(cuota) as cuota_media, avg(ventas) as ventas_media from empleados;
select round(avg(cuota),2) 'AVG Cuota', round(avg(ventas),2) 'AVG Ventas' from ejercicios.empleados;
-- 2.- Hallar el importe medio de pedidos, el importe total de pedidos y el precio medio de venta (el precio de venta es el precio unitario en cada pedido).
select avg(importe), sum(importe), avg(round(importe/cant),2) from ejercicios.pedidos;
-- 3.- Hallar el precio medio de los productos del fabricante ACI.

-- 4.- ¿Cuál es el importe total de los pedidos realizados por el empleado Vicente Pantalla?
SELECT SUM(importe) AS total_pedidos_V_Pantalla FROM empleados INNER JOIN pedidos ON empleados.numemp = pedidos.rep WHERE nombre = 'Vicente Pantalla'
-- 5.- Hallar en qué fecha se realizó el primer pedido (suponiendo que en la tabla de pedidos tenemos todos los pedidos realizados hasta la fecha).

-- 6.- Hallar cuántos pedidos hay de más de 25000 ptas.

-- 7.- Listar cuántos empleados están asignados a cada oficina, indicar el número de oficina y cuántos hay asignados.

-- 8.- Para cada empleado, obtener su número, nombre, e importe vendido por ese empleado a cada cliente indicando el número de cliente.

-- 9.- Para cada empleado cuyos pedidos suman más de 30.000€, hallar su importe medio de pedidos. En el resultado indicar el número de empleado y su importe medio de pedidos.

-- 10.- Listar de cada producto, su descripción, precio y cantidad total pedida, incluyendo sólo los productos cuya cantidad total pedida sea superior al 75% del stock; y ordenado por cantidad total pedida.

-- 11.- Saber cuántas oficinas tienen empleados con ventas superiores a su cuota, no queremos saber cuales sino cuántas hay.

-- ************************************************************** MULTITABLA *********************************************************************************
-- 1 Listar las oficinas del este indicando para cada una de ellas su número, ciudad, números y nombres de sus empleados. Hacer una versión en la que aparecen sólo las que tienen empleados, y hacer otra en las que aparezcan las oficinas del este que no tienen empleados.
-- 1.1		Oficinas del este con empleados:

-- 1.2		Oficinas del este incluyendo las que no tienen empleados:

-- 1.3		Oficinas de cualquier región incluyendo las que no tienen empleados:

-- 1.4		Oficinas de cualquier región que no tienen empleados:

-- 2 Listar los pedidos mostrando su número, importe, nombre del cliente, y el límite de crédito del cliente correspondiente (todos los pedidos tienen cliente y representante).

-- 3 Listar los datos de cada uno de los empleados, la ciudad y región en donde trabaja.
 
-- 4 Listar las oficinas con objetivo superior a 600.000€ indicando para cada una de ellas el nombre de su director.

-- 5 Listar los pedidos superiores a 25.000€, incluyendo el nombre del empleado que tomó el pedido y el nombre del cliente que lo solicitó.

-- 6 Hallar los empleados que realizaron su primer pedido el mismo día en que fueron contratados.

-- 7 Listar los empleados con una cuota superior a la de su jefe; para cada empleado sacar sus datos y el número, nombre y cuota de su jefe.

-- 8 Listar los códigos de los empleados que tienen una línea de pedido superior a 10.000 o que tengan una cuota inferior a 10.000.

-- ************************************************************** SUBCONSULTAS *********************************************************************************

-- 1.- Listar los nombres de los clientes que tienen asignado el representante Alvaro Jaumes (suponiendo que no pueden haber representantes con el mismo nombre).

-- 2.- Listar los vendedores (numemp, nombre, y nº de oficina) que trabajan en oficinas "buenas" (las que tienen ventas superiores a su objetivo).

-- 3.- Listar los vendedores que no trabajan en oficinas dirigidas por el empleado 108.

-- 4.- Listar los productos (idfab, idproducto y descripción) para los cuales no se ha recibido ningún pedido de 25000 o más.

-- 5.- Listar los clientes asignados a Ana Bustamante que no han remitido un pedido superior a 3000€.

-- 6.- Listar las oficinas en donde haya un vendedor cuyas ventas representen más del 55% del objetivo de su oficina.

-- 7.- Listar las oficinas en donde todos los vendedores tienen ventas que superan al 50% del objetivo de la oficina.

-- 8.- Listar las oficinas que tengan un objetivo mayor que la suma de las cuotas de sus vendedores.