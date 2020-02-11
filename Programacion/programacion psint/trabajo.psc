//menu que ponga 2- areas circulo 1- longitud circunferencia 3- area cuadrado 4- area trapecio. cada opcion se resuelve en un subproceso distinto ej: uno para el circulo, cuadrado.
//los datos los pido en el subproceso, el resultado final se da en el proceso principal y cuando da el rsultado se vuelve al meno,m con la opcion 9 se sale.
//luis miguel pizango
//

//-------------------------------------------------------------
SubProceso total3 <- medidas3 ( base3 Por Referencia )
	Definir total3 Como Real;
	Escribir "introduce la base: ";
	Leer base3;
	total3<-calculoarea3(base3);
FinSubProceso

SubProceso area3 <- calculoarea3 ( base3 Por Referencia )
	Definir area3 Como Real;
	area3<-base3*base3;
FinSubProceso
//-------------------------------------------------------------
SubProceso totalcirculo <- medidas2 ( radio2 Por Referencia )
	Definir totalcirculo Como Real;
	Escribir "introduce el radio: ";
	Leer radio2;
	totalcirculo<-calculoarea2(radio2);
FinSubProceso

SubProceso area2 <- calculoarea2 ( radio2 Por Referencia )
	Definir area2 Como Real;
	area2<-pi*(radio2*radio2);
FinSubProceso
//-------------------------------------------------------------
SubProceso total1 <- medidas1 ( radio por referencia )
	Definir total1 Como Real;
	Escribir "introduce el radio: ";
	Leer radio;
	total1<-calculolongi(radio);
FinSubProceso

SubProceso longitud1 <- calculolongi ( radio Por Referencia )
	Definir longitud1 Como Real;
	longitud1<- radio*(2*pi);
FinSubProceso
//-------------------------------------------------------------
SubProceso total4 <- medidas4 ( base4 Por Referencia, base5 Por Referencia, altura Por Referencia )
	Definir total4 Como Real;
	Escribir "introduce la base pequeña: " Sin Saltar;
	Leer base5;
	Escribir "introduce la base grande: " Sin Saltar;
	leer base4;
	Escribir "introduce la altura: " Sin Saltar;
	Leer altura;
	total4<-calculoarea4(base4,base5,altura);
FinSubProceso

SubProceso area4 <- calculoarea4 ( base4, base5, altura Por Referencia )
	Definir area4 Como Real;
	area4<- (base4+base5)*altura/2;
FinSubProceso

//-------------------------------------------------------------

Proceso calculadoraAreas
	Definir opcion Como Entero;
	Definir radio, radio2, total1, totalcirculo, total3, total4, base3, base4, base5, altura Como Real;
	Escribir "menu para el calculo";
	Escribir "pulsa 1 para calcular la longitud de la circunferencia";
	Escribir "pulsa 2 para calcular el area del circulo";
	Escribir "pulsa 3 para calcular el area del cuadrado";
	Escribir "pulsa 4 para calcular el area del trapecio";
	Leer opcion;
	
	Segun opcion Hacer
		1:
			total1<-medidas1(radio);
			Escribir "la longitud de la circunferencia de radio ",radio, " es de ",total1;
		2:
			totalcirculo<-medidas2(radio2);
			Escribir "el area del circulo de radio ",radio2, " es de ", totalcirculo;
		3:
			total3<-medidas3(base3);
			Escribir "el area del cuadrado de base ",base3, " es de ", total3;
		4:
			total4<-medidas4(base5, base4, altura);
			Escribir "el area del trapecio de base menor ",base4, ", de base mayor ",base5, " y de altura ",altura, " es de ", total4;
		9:
			
		De Otro Modo:
			
	FinSegun
	
FinProceso
