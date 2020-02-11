package PruebaInterfaz;
import java.util.*;
public class Calculadora implements CalculoBase1, CalculoAvanzado1
{
	
	
	
	public static void main(String[] args) 
	{
		int opcion;
		double x;
		double y;
		double resultado;
		double resultado1;
		double resultado2;
		double resultado3;
		double resultado4;
		double resultado5;
		double resultado6;
		
		System.out.println("Escoja una opción");
		System.out.println("1= calculadora normal (suma,resta,division,multiplicación)");
		System.out.println("2= Calculadora avanzada(suma y resta de un numero a pi, logaritmo)");
		
		Scanner entrada = new Scanner(System.in);
		
		opcion=entrada.nextInt();
		
		switch (opcion)
		{
		case 1:
			Calculadora tusmuertos = new Calculadora();
			System.out.println("has entrado a la calculadora normal");
			System.out.println("Introduce dos numeros");
			Scanner entrada2 = new Scanner(System.in);
			Scanner entrada3 = new Scanner(System.in);
			
			x=entrada2.nextDouble();
			y=entrada3.nextDouble();
			entrada2.close();
			entrada3.close();
			resultado = tusmuertos.suma(x,y);
			resultado1 = tusmuertos.resta(x, y);
			resultado2 = tusmuertos.multiplicacion(x, y);
			resultado3 = tusmuertos.division(x,y);
			System.out.println(resultado);
			System.out.println("-----------");
			System.out.println(resultado1);
			System.out.println("-----------");
			System.out.println(resultado2);
			System.out.println("-----------");
			System.out.println(resultado3);
			System.out.println("-----------");
			break;
			
		case 2:
			Calculadora tusmuertos2 = new Calculadora();
			System.out.println("has entrado a la calculadora normal");
			System.out.println("Introduce dos numeros");
			Scanner entrada4 = new Scanner(System.in);
			Scanner entrada5 = new Scanner(System.in);
			x=entrada4.nextDouble();
			y=entrada5.nextDouble();
			entrada4.close();
			entrada5.close();
			resultado4 = tusmuertos2.SumaPI(x);
			resultado5 = tusmuertos2.restaPI(x);
			resultado6 = tusmuertos2.log(x, y);
			System.out.println(resultado4);
			System.out.println("-----------");
			System.out.println(resultado5);
			System.out.println("-----------");
			System.out.println(resultado6);
			System.out.println("-----------");
			break;
		}
		
		
		
		

	}

	public double SumaPI(double a) 
	{
		return a+Math.PI;
		
	}

	public double restaPI(double a) 
	{
		return a-Math.PI;
	}

	public double log(double a, double b) 
	{
		return Math.log(a)/Math.log(b);
		
	}

	public double suma(double a, double b) 
	{
		return a+b;
		
	}

	public double resta(double a, double b) 
	{
		return a-b;
		
	}

	public double multiplicacion(double a, double b) 
	{
		return a*b;
		
	}
	
	public double division(double a, double b) 
	{
		return formatear (a/b);
		/*double turaza;
		turaza=a/b;
		return formatear(turaza);*/
		
	}
	
	private double formatear(double c)
	{
		double z=(double)Math.round(c*100)/100;
		return z;
	}
	

}
