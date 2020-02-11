package Poligonos;

import java.util.Scanner;

public class Calculadora extends Poligono implements InterCalcu
{
	public Calculadora(double longLado, int nlado, double perimetro, double radio, double apotema, double altura) 
	{
			super(longLado, nlado, perimetro, radio, apotema, altura);
	}
	
	public Calculadora(double longLado, int nlado) 
	{
			super(longLado, nlado);
	}
	//perimetro area altura apotema radio numero de angulos amplitud del angulo como se llama el poligono
	
	public static void main(String[] args) 
	{
		double x;
		double y;
		double lado;
		int numeroLados;
		double Perimetro; 
		double Radio;
		double Apotema;
		double h;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de lados: ");
		numeroLados=entrada.nextInt();
		
		/*Calculadora resultado = new Calculadora(lado, numeroLados, Perimetro, Radio, Apotema, h);*/
		
		switch (numeroLados)
		{
		case 1:
			System.out.println("Figura introducida circulo/circunferencia");
			break;
		case 2:
			System.out.println("Esta figura no existe");
			break;
		case 3:
			System.out.println("La figura introducida es un Triangulo");
			System.out.println("Introduzca la longitud del lado: ");
			x=entrada.nextDouble();
			System.out.println("La longitud del lado es de: "+x);
			/*System.out.println("La altura es de: ");
			System.out.println("El area del triangulo es de: "+resultado.areaTriangulo(x));
			break;*/
		case 4:
			System.out.println("La figura introducida es un Cuadrado");
			break;
		case 5:
			System.out.println("La figura introducida es un Pentagono");
			break;
		case 6:
			System.out.println("La figura introducida es un Hexágono");
			break;
		case 7:
			System.out.println("La figura introducida es un Heptagono");
			break;
		case 8:
			System.out.println("La figura introducida es un Octógono");
			break;
		case 9:
			System.out.println("La figura introducida es un Eneágono");
			break;
		case 10:
			System.out.println("La figura introducida es un Decágono");
			break;
		}

	}


public double areaCirculo(double rad) 
{
	return 0;
}	

public double areaPoligono(double perim, double apo) 
{
	return 0;
}


public double perimetro(int lad, double longlad) 
{
	return 0;
}


public double radio(int numlad, double longlad, double cApotema) 
{
	return 0;
}


public double apotema(int lad, double longlad) 
{
	return 0;
}

public double altura(int nlad, double rad, double apo) 
{
	return 0;
}

/*public double areaTriangulo(double a) 
{
	double resulTriangulo;
	double hTrian;
	hTrian=(Math.sqrt(3)*a)/2;
	resulTriangulo=((a*hTrian)/2);
	return resulTriangulo;
}

public double areaCuadrado(double a) 
{
	double resulCuadrado;
	resulCuadrado=a*a;
	return resulCuadrado;
}

public double areaPentagono(double a) 
{
	double resulPentagono;
	resulPentagono=(a/2);
	
	return resulPentagono;
}*/


}

//calculo apotema 

//x.trimToSize ajusta