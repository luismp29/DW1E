package hash;
import java.util.*;
public class practicaBorrados 
{

	public static void main(String[] args) 
	{
		
		
		ArrayList <String> miAL = new ArrayList <String>(); //Arraylist tipo string
		
		miAL.add("Pepe");//añados objetos tipo string
		miAL.add("Juan");
		miAL.add("Luis");
		miAL.add("Maria");
		miAL.add("Fernando");
		System.out.println(miAL);//listo el arraylist
		
		miAL.removeIf(variable -> (variable.charAt(2) == 'a'||variable.charAt(2) == 'r')); //elimino las palabras del array list que tiene en la tercera posicion la letra a o r
		
		System.out.println(miAL);
		
		//hashSet
		//primero me creo una clase fuera del main con los tipos que quiero añador en el hs
		HashSet<Equipo> miHS = new HashSet<>();//creo el hashset
		miHS.add(new Equipo("Tuerce", 21));//añado los objetos
		miHS.add(new Equipo("Rayo", 15));
		miHS.add(new Equipo("Clara", 28));
		
		System.out.println(miHS);//primero en la clase creada fuera del main debo crear el toString
		
		miHS.removeIf(numeroEquipo -> (numeroEquipo.getNumComponentes() < 19));//elimino los objetos que tengan menos de 19 componentes
		
		
		System.out.println(miHS);
		
		//hashMap
		
		HashMap <Integer,Integer> miHM = new HashMap<>();//creo el hashMap
		miHM.put(0, 100);//los añado com put no con add
		miHM.put(1, 1000);//(clave, valor)
		miHM.put(2, 10000);
		miHM.put(3, 1000000);
		
		System.out.println(miHM);//alisto el hasmap
		
		int valor = miHM.remove(3);//elimina el objeto si la clave es 3 
		System.out.println("el valor del objeto de clave 3 es: "+valor);//te elimina la clave y te imprime el valor solo
		System.out.println(miHM);//impresion despues de borrar
		//solo se borra la clave o la clave y valor.
		//para borrar vclave y valor se encesita un boolean
		boolean operacion = miHM.remove(1, 1000);
		System.out.println(operacion);//te dice si existe y en el caso de qe exista borra el objeto del HM
	}


}

class Equipo
{
	private String nombre;
	private int numComponentes;
	
	public Equipo(String n, int nC)
	{
		nombre = n;
		numComponentes = nC;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumComponentes() {
		return numComponentes;
	}



	public void setNumComponentes(int numComponentes) {
		this.numComponentes = numComponentes;
	}



	public String toString()
	{
		String msj = "El nombre del equipo es: "+nombre+ " y tiene: "+numComponentes+" componentes.";
		return msj;
	}
}









