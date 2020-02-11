

Proceso adivinaelnumero
	definir intento Como real;
	definir num1 Como Entero;
	Definir numeroaleatorio Como entero;
	Definir continuar Como Caracter;
	intento<-0;
	
	Escribir "Este juego consiste en adivinar un número entero entre el 50 y el 150 (ambos incluidos)";
	Escribir "Dispone de 10 intentos para adivinar el número";
	Escribir "Si lo consigue en los 3 primeros intentos GANA LA PARTIDA";
	Escribir "Si lo consigue entre el 4º y 6º intento quedará SEGUNDO";
	Escribir "Si lo consigue entre el 7º y 9º intento quedará TERCERO";
	Escribir "Si lo consigue en el 10º intento ganará el premio de CONSOLACIÓN";
	Escribir "Si no lo consigue en el 10º intento PIERDE LA PARTIDA";
	Escribir "Una vez acierta el número saldrá: el resultado y el turno en el que acertó el número. En ese momento se acabará la partida";
	Escribir "Podrá abandonar el juego pulsando el número 0. En este caso se le indicará al usuario que ha abandonado el juego.";
	Escribir "Cuando el usuario introduzca un número habrá que ir guiándole diciendo si el número introducido por teclado es mayor o menor que el número buscado.";
	Escribir "Se dejará que el usuario lea los mensajes el tiempo que desee hasta que pulse la tecla ENTER.";
	
	Escribir " ";
	Leer continuar;
	Limpiar Pantalla;	
	
	numeroaleatorio<-aleatorio(50,150);
	Escribir "introduzca el número 0 en cualquier momento de la partida para abandonar el juego";
	Escribir " ";
	Escribir "Introduzca el primer numero: ";
	
	Repetir
		Leer num1;
		si num1=0 Entonces
			intento<- -intento;
			Escribir "Fin del juego";
		SiNo
			Si num1=numeroaleatorio Entonces
				intento<-intento+1;
				Escribir "Enhorabuena usted acertó el numero";
				Escribir "número de intentos: ", intento;
			SiNo
				Si num1>numeroaleatorio Entonces
					intento<-intento+1;
					Escribir "Número incorrecto, el número introducido es mayor, introduzca uno menor";
					Escribir "número de intentos: ", intento;
				SiNo
					intento<-intento+1;
					Escribir "Número incorrecto, el número introducido es menor, introduzca uno mayor";
					Escribir "número de intentos: ", intento;
				FinSi
			FinSi
		FinSi
	Hasta Que (num1=numeroaleatorio | num1=0)
	
	
	Segun intento Hacer
		1,2,3:
			Escribir "Usted ganó el primero puesto";
		4,5,6:
			Escribir "Usted ganó el segundo puesto";
		7,8,9:
			Escribir "Usted ganó el tercer puesto";
		10:
			Escribir "Usted ha perdido";
		De Otro Modo:
			
	FinSegun
	
	
	
	//
	
FinProceso
