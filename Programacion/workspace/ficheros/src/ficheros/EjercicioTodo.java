package ficheros;
//CREAR UNA PROGRESION ARITMETICA PIDIENDO AL USUARIO EL PRIMER TERMINO, EL NUMERO DE TERMINOS Y LA DIFERENCIA (3 DATOS)
//EJEMPLO 20/5/3 ->> 20, 23, 26, 29, 32
//LOS DATOS LOS GUARADAMOS EN EL FICHERO Y LE AÑADIMOS LA FECHA Y LA HORA 
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.*;
import java.util.*;

public class EjercicioTodo 
{

	public static void main(String[] args) 
	{
		int primerTerm;
		int numTerm;
		int difTerm;
		FileSystem fichero = FileSystems.getDefault(); // me creo el objeto
		Path direccion = fichero.getPath("C:\\Users\\KLK\\Desktop\\ejerPrueba"); //ruta
		
		if(Files.exists(direccion)) //si la ruta ya esta creada
		{
			System.out.println("directorio ya creado anteriormente");
		}
		else //sino crarla
		{
			try
			{
				Files.createDirectory(direccion); //una vez creada la ruta con este metodo nos creamos la carpeta
			}
			catch (IOException E)
			{
				E.printStackTrace();
			}
		}
		
		Path documento = fichero.getPath("C:\\Users\\KLK\\Desktop\\ejerPrueba\\documento.txt");//me creo la ruta del nuevo documento
		
		if(Files.exists(documento))//si el documento ya esta creado
		{
			System.out.println("Documento ya creado anteriormente");
		}
		else //sino crearlo
		{
			try
			{
				Files.createFile(documento); //con este metodo me creo el nuevo documento
			}
			catch (IOException a)
			{
				a.printStackTrace();
			}
		}
		
		Path ruta = fichero.getPath("C:\\Users\\KLK\\Desktop\\ejerPrueba\\documento.txt"); //ruta final con todo incluido //tambien ./src/
		//Scanner siempre en try
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de elementos");
		numTerm=entrada.nextInt();
		
		System.out.println("Introduzca un número");
		primerTerm=entrada.nextInt();
		System.out.println("Introduzca la diferencia entre cada uno");
		difTerm=entrada.nextInt();
		
		System.out.println(primerTerm);
		
		//String cadena = calculo(numTerm, primerTerm, difTerm);//me creo un array string con los atributos creados por lo que en vez de crearme un tostring me creo un string cadena
		
		
		String progre []= new String [1]; //me creo un array tipo string donde voy a meter los datos de 1 dimension (1linea)
		int j=0,ter=primerTerm; //j es el número de términos y ter es el calculo del termino
		String resul="";//resul es el valor de la cadena donde se acumula la progresion
		
		
		while (j<numTerm) //bucle 
		{
			resul=resul+Integer.toString(ter)+","; //resul=nada+n1+, == ejemplo(resul=nada+1,) -> cuando se vuelve a hacer seria resul = 1,
			ter+=difTerm;
			j++;
			if(j==numTerm) //cuando sea igual que pare de hacer el bucle para que no genere mas lineas y que lo imprima
			{
				LocalDate fecha = LocalDate.now(); 
				LocalTime hora = LocalTime.now();
				progre[0]=resul+ " **** "+fecha+" **** "+hora;
			}
		}
		
		try(BufferedWriter br = Files.newBufferedWriter(ruta, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //br es un buffer
			{
				Arrays.stream(progre).forEach(s -> //array de tipo string donde for each los recorre cada s(string)
				{
					try //lo que quiero es escribirlo asi que lo meto dentro de un try
					{
						br.write(s); //despues del enter se le dice al buffer que escriba lo que estaba dentro del array.
						br.newLine(); //al buffer le añado un enter
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				});
			}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	
/*public static String calculo(int nt, int n1, int dif) //me creo el string calculo asignando nombres distintos con los mismos atributos y pongo todo lo que quiero que haga
{
	LocalDate fecha = LocalDate.now(); //
	LocalTime hora = LocalTime.now();
	//j es el numero que me va a ir contanto el numero de terminos
	//ter es el numero que me va a contar
	//resul 
	int j=0,ter=n1; //j es el número de términos y ter es el calculo del termino
	String resul=""; //resul es el valor de la cadena donde se acumula la progresion
	
	/*while (j<nt)
	{
		resul=resul+Integer.toString(ter)+",";//resul=nada+n1+, == ejemplo(resul=nada+1,) -> cuando se vuelve a hacer seria resul = 1,
		ter+=dif;
		j++;
	}*/
	
	/*return resul+" ** "+fecha+" - "+hora; //La progresión más la fecha y la hora actual
	
}*/


}

