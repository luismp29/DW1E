package practica;

import java.util.Scanner;

public class Animal extends SerVivo implements Interfaz 
{


	public static void main(String[] args) 
	{
		//---------- llama al metodo de la clase abstracta creo los string para dar el resultado
		String tipoclase1;
		String tipoclase2;
		//---------------
		String n;
		double a;
		int age;
		int p;
		int cla;
		String h;
		boolean ex;
		Animal lista[] = new Animal [4];
		System.out.println("Introduza los datos de cada animal");
		Scanner teclado = new Scanner (System.in);
		for(int i=0;i<4;i++)
		{
			i=i+1;
			System.out.println("nombre: ");
			n=teclado.next();
			System.out.println("altura: ");
			a=teclado.nextDouble();
			System.out.println("edad: ");
			age=teclado.nextInt();
			System.out.println("numero de patas: ");
			p=teclado.nextInt();
			System.out.println("tipo alimentacion (1 carnivoro, 2 herviboro): ");
			cla=teclado.nextInt();
			switch(cla)
			{
			case 1:
				Animal tipoclase = new Animal();
				tipoclase1 = tipoclase.devolverCarne();
				break;
			case 2:
				Animal tipoclasexd = new Animal();
				tipoclase2 = tipoclasexd.devolverVege();
				break;
			}
			
			
			
		}
		
		

	}

	public String acordarPastilla(String x) 
	{
		return null;
	}

	public String visitarParientes(String a, String b) 
	{
		return null;
	}


	public String comer(String carnivoro, String herviboro) 
	{
		return null;
	}

	public String beber(String agua) 
	{
		return agua;
	}

	

}
