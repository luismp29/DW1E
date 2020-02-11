package ficheros;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.*;

public class AbrirLeerEscribirFicheros 
{

	public static void main(String[] args)
	{
		//abrir y leer el fichero
		FileSystem ficheros = FileSystems.getDefault(); //objeto creado que puede ser tratado como un filesystem
		Path camino = ficheros.getPath("C:\\Users\\KLK\\Desktop\\teoria programmin.txt");
		
		try(Stream<String> flujo = Files.lines(camino, Charset.forName("UTF-8"))) //el texto que esta recibiendo lo trata como utf-8, lee el fichero y o añade en el flujo
		{
			flujo.forEach((String s) -> System.out.println(s)); //por cada string que se reciba lo imprime
		}
		catch (IOException e)//con ficheros siempre se usa IOException
		{
			e.printStackTrace();
		}
		
		
		//insertar lineas a un documento
		
		String texto[] = new String [] {"inserto 1", "inserto 2"};
		try(BufferedWriter br = Files.newBufferedWriter(camino, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //br es un buffer
			{
				Arrays.stream(texto).forEach(s -> //array de tipo string donde for each los recorre cada s(string)
				{
					try //lo que quiero es escribirlo asi que lo meto dentro de un try
					{
						br.newLine(); //al buffer le añado un enter
						br.write(s); //despues del enter se le dice al buffer que escriba lo que estaba dentro del array.
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
		
		System.out.println("**************************************************");
		try(Stream<String> flujo = Files.lines(camino, Charset.forName("UTF-8"))) //el texto que esta recibiendo lo trata como utf-8, lee el fichero y o añade en el flujo
		{
			flujo.forEach((String s) -> System.out.println(s)); //por cada string que se reciba lo imprime
		}
		catch (IOException e)//con ficheros siempre se usa IOException
		{
			e.printStackTrace();
		}

	}

}
