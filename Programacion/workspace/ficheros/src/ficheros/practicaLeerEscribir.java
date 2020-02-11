package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class practicaLeerEscribir 
{

	public static void main(String[] args) 
	{
		FileSystem ficheros = FileSystems.getDefault(); //me creo el objeto tipo filesystem
		Path directorio = ficheros.getPath("C:\\Users\\KLK\\Desktop\\prueba documentos.txt"); //me creo una variable de tipo path, el directorio y lo adjunto a este
		
		//me creo un objeto de tipo string 
		String añadir [] = new String [] {"Guille guarrilla"}; //escribo lo qu quiero se añada a mi archivo
		try(BufferedWriter bufferLector = Files.newBufferedWriter(directorio, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //me creo un buffer que es el que va a leer el documento
		{
			Arrays.stream(añadir).forEach(s -> //va a recorrer lo que hay dentro del array (añadir)
			{
				try
				{
					bufferLector.newLine(); //el buffer lee el archivo y añade un enter
					bufferLector.write(s); //una vez leido comienza a escribir lo que habia dentro del array
				}
				catch (IOException error)
				{
					error.printStackTrace();
				}
			});
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		//me imprime el texto una vez añadido todo
		try(Stream<String> bufferImprime = Files.lines(directorio, Charset.forName("UTF-8"))) //me creo un nuevo buffer que me lee el documento
		{
			bufferImprime.forEach((String s) -> System.out.println(s)); //me lee cada string dentro del documento y me lo imprime
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//***************************************************
		System.out.println("direc: "+directorio.getParent());//ruta del archivo
		System.out.println("Ruta: "+directorio.isAbsolute()); 
		System.out.println("sistema fichero: "+directorio.getFileSystem());
		System.out.println("fichero: "+directorio.getFileName());// nombre del fichero
		System.out.println("root: "+directorio.getRoot()); //tedice enq ue particion esta
		
		
		//variable exists si existe o no la ruta 
		if(Files.exists(directorio)) //si existe el archivo en la ruta dada
			System.out.println("existe el fichero: "+directorio.getFileName()); //si existe el archivo te da el nobre del archivo
		else System.out.println("no existe"); //si no pues esto
		
		//variable directorio
		if(Files.isDirectory(directorio))//te dice si es un directorio o no
			System.out.println("lo es"); // si fuese "C:\\Users\\KLK\\Desktop\\prueba"
		else System.out.println("no lo es"); //porq es "C:\\Users\\KLK\\Desktop\\prueba documentos.txt"
		
		// te dice si es ejecutable el archivo de la ruta o no
		if(Files.isExecutable(directorio))
			System.out.println("lo es");
		else System.out.println("no lo es");
		
		try //hidden siempre dentro de un try catch
		{
			System.out.println(Files.isHidden(directorio)); //te dice si el archivo esta oculto o no, siempre se tiene que eter dentro de un try
		}
		catch (IOException E)
		{
			E.printStackTrace();
		}
		
		//crear un nuevo directorio forma rapida
		/*File dir = new File("C:/Users/KLK/Desktop/guille cabron");
		if (!dir.exists()) 
		{
            if (dir.mkdirs()) 
            {
                System.out.println("Directorio creado");
            } 
            else 
            {
                System.out.println("Error al crear directorio");
            }
        }*/
		
		//crear directorio forma un poco lenta pero bien
		//cuando se crea se debe poner sin el archivo "C:\\Users\\KLK\\Desktop\\guille cabron"
		Path direc = ficheros.getPath("C:\\Users\\KLK\\Desktop\\guille cabron\\Hola.txt");
		try
		{
			Files.createDirectory(direc);
			if (!Files.exists(direc)) 
			{
				System.out.println("Error al crear directorio");
			}
			else
			{
				System.out.println("Directorio creado");
			}
		}
		catch (IOException E)
		{
			E.printStackTrace();
		}
		//Crear fichero nuevo
		Path ficheronuevo = ficheros.getPath("C:\\Users\\KLK\\Desktop\\guille cabron\\Hola.txt");
		try
		{
			Files.createFile(ficheronuevo);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		//meto datos dentro del nuevo archivo
		String añado [] = new String[] {"Hola man"};
		try(BufferedWriter bufferQueLee = Files.newBufferedWriter(direc, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
		//una vez creado el directorio y el archio volver al nuevo directorio y añadir el archivo creado a la ruta \\Hola.txt
		{
			Arrays.stream(añado).forEach(a -> //va a recorrer lo que hay dentro del array (añadir)
			{
				try
				{
					bufferQueLee.write(a); //el buffer lee el archivo y añade un enter
					bufferQueLee.newLine();; //una vez leido comienza a escribir lo que habia dentro del array
				}
				catch (IOException error)
				{
					error.printStackTrace();
				}
			});
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
				
		
	}

}
