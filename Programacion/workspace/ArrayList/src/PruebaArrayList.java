import java.util.ArrayList;
import java.util.Iterator;
public class PruebaArrayList 
{

	public static void main(String[] args) 
	{
		Empleado empleado1 = new Empleado("Juan", 1600.34, true);
		Empleado empleado2 = new Empleado("Juan1", 1340.32, true);
		Empleado empleado3 = new Empleado("Juan2", 1760.04, true);
		Empleado empleado4 = new Empleado("Juan3", 1210.44, true);
		
		ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
		
		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		listaEmpleados.add(empleado4);
		listaEmpleados.add(new Empleado("María",2500.23,true));
		listaEmpleados.add(new Empleado ("Jenny", 1000.50, false));
		
		System.out.println("Numero de empleados: "+listaEmpleados.size());
		

		/*Iterator it = listaEmpleados.iterator( );
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			System.out.println( "Whole list=" + listaEmpleados );
		}
		*/

	}

}


class Empleado
{
	private String nombre;
	private double sueldo;
	private boolean soltero;
	
	public Empleado (String nom, double suel, boolean sol)
	{
		nombre = nom;
		sueldo = suel;
		soltero = sol;
	}
	
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public double getSueldo() 
	{
		return sueldo;
	}
	public void setSueldo(double sueldo) 
	{
		this.sueldo = sueldo;
	}
	public boolean isSoltero() 
	{
		return soltero;
	}
	public void setSoltero(boolean soltero) 
	{
		this.soltero = soltero;
	}
	
	
}

