package pruebaExamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class test 
{

	public static void main(String[] args) 
	{
		String idE="",nomE="";
		String fC=null,fA=null;
		boolean repe=false;
		double coste=0;
		System.out.println("¿Cuántos alumnos quiere dar de alta?");
		Scanner teclado=new Scanner(System.in);
		int numElementos=teclado.nextInt();//numeor que quiere meter
		
		Estudiante lista[]=new Estudiante[numElementos];
		
		for(int i=0;i<numElementos;i++)
		{
			idE="estudiante"+i;
			System.out.print("Nombre: ");
			nomE=teclado.next();
			System.out.print("Fecha contrato <aaaa-mm-dd>: ");
			fC=teclado.next();
			System.out.print("Fecha aniversario <aaaa-mm-dd>: ");
			fA=teclado.next();
			
			LocalDate fContrato=null;
			LocalDate fAniversario=null;
			Estudiante obj=null;
			
			try
			{
				fContrato=LocalDate.parse(fC);
				fAniversario=LocalDate.parse(fA);
			}
			catch(Exception x)
			{
				x.printStackTrace();
			}
			
			System.out.print("coste matricula, si no lo sabe introduzca 0: ");
			coste=teclado.nextDouble();
			
			System.out.print("repetidor (true o false): ");
			repe=teclado.nextBoolean();
			
			if(coste==0)
			{
				obj=new Estudiante(idE,nomE,fContrato);
			}
			else
			{
				obj=new Estudiante(idE,nomE,fContrato,fAniversario,repe,coste);
			}
			
			lista[i]=obj;
		}
		
		ArrayList <Estudiante> miLista = new ArrayList <Estudiante>();
		
		
		for(Estudiante b:lista) //añade estudiantes al arraylist
			miLista.add(b); //b es un estudiante
			/*System.out.println(a);*/
		
		/*for(int i=0;i<miLista.size();i++) //imprime lo que hay en la posicion, 1,2,3 del array list
		{
			System.out.println(miLista.get(i)); //cuando imprimes va al metodo tostring cuando es println
			System.out.println(miLista.get(i).getId());//sin el tostring con getters y setter puedo imprimirlo añadiendo despues miLista.get(i).getId()
		}
		
		for(Estudiante c:miLista) //c es un estudiante
		{
			System.out.println(c.isRepetidor());
		} */
		
		Iterator <Estudiante> miIterator = miLista.iterator();
		
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next()); //.next siempre llama al tostring
		}

	}

}

class Estudiante 
{
	private String id;
	private String nombre;
	private LocalDate fechaContrato;
	private LocalDate fechaCumple;
	private boolean repetidor;
	private double costeMatricula;
	
	public Estudiante()
	{
		
	}
	
	public Estudiante(String id, String nombre, LocalDate fechaContrato) 
	{
		this.id=id;
		this.nombre=nombre;
		this.fechaContrato=fechaContrato;
	}
	
	public Estudiante(String id, String nombre, LocalDate fechaContrato, LocalDate fechaCumple, boolean repetidor, double costeMatricula)
	{
		/*this.id=id;
		this.nombre=nombre;
		this.fechaContrato=fechaContrato;*/
		this(id,nombre,fechaContrato); //con esa linea me ahorro escribir de nuevo lo de arriba
		this.fechaCumple=fechaCumple;
		this.repetidor=repetidor;
		this.costeMatricula=costeMatricula;
	}
	
	public String toString()
	{
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-mm-aaaa"); // para cponer el formato de la fecha que usamos
		String repe="";// crea una varibale local para ponerla en el string msj para que diga si es repetidor o no
		if(repetidor) 
		{
			repe=". Es repetidor";
		}
		else
		{
			repe=". No es repetidor";
		}
		String msj="El estudiante de ID "+id+" y de nombre "+nombre+
				" tiene la fecha de contrato: "+fechaContrato.format(formatoFecha)+" y su fecha de nacimiento es: "+fechaCumple.format(formatoFecha)+
				repe+". La matricula cuesta: "+costeMatricula; // se añade a cada variable de echa para cambiar el formao de la fecha
		
		return msj;
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public LocalDate getFechaContrato() 
	{
		return fechaContrato;
	}
	public void setFechaContrato(LocalDate fechaContrato) 
	{
		this.fechaContrato = fechaContrato;
	}
	public LocalDate getFechaCumple() 
	{
		return fechaCumple;
	}
	public void setFechaCumple(LocalDate fechaCumple) 
	{
		this.fechaCumple = fechaCumple;
	}
	public boolean isRepetidor() 
	{
		return repetidor;
	}
	public void setRepetidor(boolean repetidor) 
	{
		this.repetidor = repetidor;
	}
	public double getCosteMatricula() 
	{
		return costeMatricula;
	}
	public void setCosteMatricula(double costeMatricula) 
	{
		this.costeMatricula = costeMatricula;
	}
	
	
}