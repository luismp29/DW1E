package input;

import java.util.Scanner;

public class inputPorTeclado 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca edad: "); // meter entre el in edad y el string nombre un string vacio 
		int edad = entrada.nextInt();
		String vacio = entrada.nextLine();
		System.out.println("Introduzca nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Introduzca apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println(edad+ " "+ nombre+ " "+ apellido);
		

	}

}
