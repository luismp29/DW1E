//programador Guillermo Blanco
//Fecha 24/9/2019

Proceso calculadora
	Definir opcion como entera;
	Definir num1,num2,total,sw como entero;
	Definir operacion como cadena;
	
	sw<-0;
	//Menú
	escribir "Menu de operaciones aritméticas ";
	escribir "1 - sumar";
	Escribir "2 - restar";
	Escribir "3 - multiplicar";
	Escribir "4 - Dividir";
	//Escribir "9 - salir de la aplicación";
	Escribir "";
	Escribir "Introduce un tipo de operación " sin saltar;
	Leer opcion;
	
	Segun opcion Hacer
		1:
			Escribir "introduzca dos numeros enteros";
			leer num1,num2;
			total<-num1+num2;
			operacion<-"suma";
		2:
			Escribir "introduzca dos numeros enteros";
			leer num1,num2;
			total<-num1-num2;
			operacion<-"resta";
		3:
			Escribir "introduzca dos numeros enteros";
			leer num1,num2;
			total<-num1*num2;
			operacion<-"multiplicación";
		4:
			Escribir "introduzca dos numeros enteros";
			leer num1,num2;
			total<-trunc(num1/num2);
			operacion<-"división";
		De Otro Modo:
			Escribir "No existe ese número de operación";
			sw<-1;
	FinSegun
	si sw<-1 entonces
		escribir "Reinicie el programa";
	SiNo
		Escribir "el resultado de la " ,operacion," es: " ,total,;
	FinSi
	
FinProceso
