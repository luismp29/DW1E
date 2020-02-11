package ss;
import java.util.Scanner;

public class a {

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduzca un nombre");
		String teclado=entrada.nextLine();
		
		System.out.println("introduzca un numero con decimales");
		double numeroDoble=entrada.nextDouble();
		System.out.println(teclado+" "+numeroDoble);
		
		entrada.close(); //cerramos entrada teclado
		
		Alumno al1=new Alumno(1200);
		
		

	}

}
