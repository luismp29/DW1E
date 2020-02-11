package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class practicaClaseTest 
{

	@Test
	void testLogaritmo() 
	{
		int espera = 3;
		int tupm; //variable para igualar
		int x;
		try(Scanner entrada = new Scanner(System.in);)
		{
			x=entrada.nextInt();
			practicaClase obj = new practicaClase();
			tupm=obj.logaritmo(x);
		}
		
		assertEquals(espera, tupm);
	}

	@Test
	void testCaracter() 
	{
		char tusmuertos = 'H';//lo que esperas
		char hijodeputa;//lo que tienes
		String n = "Hoy es viernes";
		practicaClase obj = new practicaClase();
		hijodeputa=obj.caracter(n);//te creas una variable para igualarla al obj y asi luego los comparas con el de abajo
		if (hijodeputa == 'g')
			{
			fail("letra erronea");//te imprime el error
			}
		else
		{
			System.out.println("tusmuertos");
		}
		assertEquals(tusmuertos, hijodeputa);//igual los dos y los compara
		
	}

}
