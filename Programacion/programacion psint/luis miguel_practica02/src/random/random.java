package random;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class random 
{

	public static void main(String[] args) throws IOException
	{
		
		
//------------------------------------------------------------------------------------------------------------
		System.out.println("Este juego consiste en adivinar un número entero entre el 50 y el 150 (ambos incluidos)");
		System.out.println("Dispone de 10 intentos para adivinar el número");
		System.out.println("Si lo consigue en los 3 primeros intentos GANA LA PARTIDA");
		System.out.println("Si lo consigue entre el 4º y 6º intento quedará SEGUNDO");
		System.out.println("Si lo consigue entre el 7º y 9º intento quedará TERCERO");
		System.out.println("Si lo consigue en el 10º intento ganará el premio de CONSOLACIÓN");
		System.out.println("Si no lo consigue en el 10º intento PIERDE LA PARTIDA");
		System.out.println("Una vez acierta el número saldrá: el resultado y el turno en el que acertó el número. En ese momento se acabará la partida");
		System.out.println("Podrá abandonar el juego pulsando el número 0. En este caso se le indicará al usuario que ha abandonado el juego.");
		System.out.println("Cuando el usuario introduzca un número habrá que ir guiándole diciendo si el número introducido por teclado es mayor o menor que el número buscado.");
		System.out.println("Se dejará que el usuario lea los mensajes el tiempo que desee hasta que pulse la tecla ENTER.");
		
		System.out.println(" ");
		System.in.read();
		
		System.out.println("introduzca el número 0 en cualquier momento de la partida para abandonar el juego");
		System.out.println(" ");
		System.out.println("Introduzca el primer numero: ");
		
		Random numAleatorio=new Random();
		int v=numAleatorio.nextInt(100)+50;
		
		Scanner entrada=new Scanner(System.in);
		int n;
		int intentos=0;
		
		do 
		{
			n=entrada.nextInt();
			if (n==0) 
			{
				System.out.print("Fin del juego");
				System.exit(0);
			}
			else
			{
				if (n==v) 
				{
					intentos+=1;
					System.out.println("Número correcto, has acertado");
					System.out.print("Número de intentos: "+intentos);
				} 
				else 
				{
					if (n>v) 
					{
						intentos+=1;
						System.out.println("El numero introducido es mayor, introduzca uno menor");
						System.out.print("Número de intentos: "+intentos);
					}
					else
					{
						intentos+=1;
						System.out.println("El número introducido es menor, introduza uno mayor");
						System.out.print("Número de intentos: "+intentos);
					}
				}
			}
			
		}while (n!=v||n==0);
		entrada.close();
		
		switch (intentos) 
		{
		case 1:case 2: case 3:
			System.out.print(" Usted ganó el primer puesto");
			break;
		case 4: case 5: case 6:
			System.out.print(" Usted ganó el segundo puesto");
			break;
		case 7: case 8: case 9:
			System.out.print(" Usted ganó el tercer puesto");
			break;
		}
		
		
			
			
			
			
			
		
		
		
		
	}

}
