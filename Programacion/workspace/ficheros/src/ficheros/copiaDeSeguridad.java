package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class copiaDeSeguridad 
{

	public static void main(String[] args) 
	{
		FileSystem ficheroWindows = FileSystems.getDefault();
		
		LocalDate hoy = LocalDate.now();
		LocalTime hoy2 = LocalTime.now();
		hoy2.toString().replace(":", "-");
		CharSequence ahorax = hoy2.toString().replace(":", "-");
		ahorax = ahorax.subSequence(0, 8);
		Path rutaOrigen = ficheroWindows.getPath("C:\\Users\\KLK\\Desktop\\teoria programmin.txt");
		Path ruta = ficheroWindows.getPath("C:\\Users\\KLK\\Desktop\\teoria programmin.back"+" "+hoy+"_"+ahorax+".back");

		
		try
		{
			
			
			System.out.println("El propietario del fichero es: "+Files.getOwner(rutaOrigen));//te dice el propietario del archivo, quien lo creo
			
			if(Files.notExists(ruta))
			{
				Path copiar = Files.copy(rutaOrigen, ruta);//te crea un backup del archivo
				System.out.println(copiar); //te dice la ruta donde se ha creado el backup
			}
			System.out.println("hora de ultima modificacion: "+Files.getLastModifiedTime(rutaOrigen).toString().subSequence(11, 19));
			System.out.println("fecha de ultima modificacion: "+Files.getLastModifiedTime(rutaOrigen).toString().subSequence(0, 10));//con el getlast tengo un file time con el tosttring lo paso a string y con el subsequence cuanto los digitos dede que empieza la fecha hasta la que acaba
			FileTime fecha = Files.getLastModifiedTime(rutaOrigen);
			/*fecha.to(TimeUnit.DAYS);
			System.out.println(fecha.toString());*/
			
		}
		catch(IOException a)
		{
			System.out.println("error manin"+a.getMessage());
		}
		
		
	}

}
