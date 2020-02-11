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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Stream;

//ficheros maestros: Tres ficheros 1- proveedores 2- clientes 3- cobros 
//tenemos fichero temporal: tmpclientes (c1, n1, d1; c2...), tmpProveedor(p1, np1, dp1; p2...), tmpCobros (c1, 2999,28; c2, 768.89;)
//preguntar si existe fichero tmp -> si existe escribir en el fichero maestro añadir informacion y borrar los ficheros tmp
//una vez borrados los tmp se crea una copia de seguridad de los maestros con el nombre (proveedoresyyyy-mm-dd_hh-mm-s.back) crarlos en una subcareta dentro de las mestras llamada backup
//si no existe enviar mensaje donde se dice faltan datos
//ver fecha de modificacion de cada fichero maestro al final
//ficheros maestros en una carpeta distinta a los tmps

/**
 * @author KLK
 * version 1.0
 *
 * Esta clase lee fichero de datos incorporados a la empresa para crear y actualizar ficheros maestros
 *
 * los ficheros maestros sonde proveedores, clientes y cobros
 */
public class practicaTodoFinal 
{

	/**
	 * @Metodo incial sin valores añadidos al parametro
	 * en este metodo se resuelve toda la aplicación
	 * @param args
	 */
	public static void main(String[] args) 
	{
		FileSystem fichero = FileSystems.getDefault();
		Path rutaMaster = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosMaestros");
		Path rutaBackUp = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosMaestros\\backUP");
		Path rutaTMP = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosTMP");
		Path fMaster = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosMaestros\\Maestro.txt");
		Path tmpClientes = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosTMP\\tpmClientes.txt");
		Path tmpCobros = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosTMP\\tpmCobros.txt");
		Path tmpProveedores = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosTMP\\tpmProveedores.txt");

		if(Files.exists(tmpProveedores))
		{
			try(Stream<String> bufferTMP = Files.lines(tmpProveedores, Charset.defaultCharset())) // buffer que lea proveedores
			{
				try(BufferedWriter bufferMaster = Files.newBufferedWriter(fMaster, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //me creo un buffer que es el que va a leer el documento
				{
					bufferTMP.forEach(s ->{
						try
						{
							bufferMaster.write(s);
							bufferMaster.newLine();
						}
						catch (IOException A)
						{
							A.printStackTrace();
						}
						
					});
				}
				catch(IOException a)
				{
					a.printStackTrace();
				}
				Files.delete(tmpProveedores);
			}
			catch(IOException a)
			{
				a.printStackTrace();
			}
		}
		else
		{
			System.out.println("Faltan datos");
		}
		
		if(Files.exists(tmpClientes))
		{
			try(Stream<String> bufferTMP = Files.lines(tmpClientes, Charset.defaultCharset())) // buffer que lea clientes
			{
				try(BufferedWriter bufferMaster = Files.newBufferedWriter(fMaster, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //me creo un buffer que es el que va a leer el documento
				{
					bufferTMP.forEach(s ->{
						try
						{
							bufferMaster.write(s);
							bufferMaster.newLine();
						}
						catch (IOException A)
						{
							A.printStackTrace();
						}
						
					});
				}
				catch(IOException a)
				{
					a.printStackTrace();
				}
				Files.delete(tmpClientes);
			}
			catch(IOException a)
			{
				a.printStackTrace();
			}
		}
		else
		{
			System.out.println("Faltan datos");
		}
		if(Files.exists(tmpCobros))
		{
			try(Stream<String> bufferTMP = Files.lines(tmpCobros, Charset.defaultCharset())) // buffer que lea cobros
			{
				try(BufferedWriter bufferMaster = Files.newBufferedWriter(fMaster, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) //me creo un buffer que es el que va a leer el documento
				{
					bufferTMP.forEach(s ->{
						try
						{
							bufferMaster.write(s);
							bufferMaster.newLine();
						}
						catch (IOException A)
						{
							A.printStackTrace();
						}
						
					});
				}
				catch(IOException a)
				{
					a.printStackTrace();
				}
			Files.delete(tmpCobros);
				
			}
			catch(IOException a)
			{
				a.printStackTrace();
			}
		}
		else
		{
			System.out.println("Faltan datos");
		}
		
		//crear archivos temporal del master
		//backup de esta ruta Path fMaster = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosMaestros\\Maestro.txt");
		LocalDate hoy = LocalDate.now();
		LocalTime hoy2 = LocalTime.now();
		hoy2.toString().replace(":", "-");
		CharSequence ahorax = hoy2.toString().replace(":", "-");
		ahorax = ahorax.subSequence(0, 8);
		Path masterBackup = fichero.getPath("C:\\Users\\KLK\\eclipse-workspace\\ficheros\\src\\ficheros\\archivosMaestros\\backUP\\FMaster"+hoy+ahorax+".back"); //me creo la ruta donde voy a generar ekl backup
		try
		{
			if(Files.notExists(masterBackup))
			{
				Path copiar = Files.copy(fMaster, masterBackup);
				System.out.println(copiar);
			}
		}
		catch(IOException x)
		{
			System.out.println("Error al crear el archivo temporal"+x.getMessage());
		}
	}

}
