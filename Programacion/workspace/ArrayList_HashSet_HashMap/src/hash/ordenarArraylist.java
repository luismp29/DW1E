package hash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ordenarArraylist {

	public static void main(String[] args) 
	{
		ArrayList <Integer> miAL = new ArrayList<Integer>();
		ArrayList <String> miALS = new ArrayList<String>();
		
		miAL.add(8);
		miAL.add(2);
		miAL.add(5);
		miAL.add(9);
		miAL.add(1);
		miAL.add(6);
		miAL.add(21);
		miAL.add(3);
		Collections.sort(miAL);//me lo ordena de menor a maty
		System.out.println(miAL);
		
		miALS.add("Mongolo");
		miALS.add("Mongolo1");
		miALS.add("Mongolo21");
		miALS.add("Mongolo3");
		miALS.add("Mongolo5");
		miALS.add("Mongolo0");
		Collections.sort(miALS);//lo ordna por orden alfabetico de la a - z
		System.out.println(miALS);
//--------------------------------------------------------------------- comparador
		
		Comparator<Integer> comp = Collections.reverseOrder();//cambia de orden a la inversa
		Collections.sort(miAL, comp); //te lo ordena a la reversa
		System.out.println(miAL);
		Comparator<String> comp2 = Collections.reverseOrder();
		Collections.sort(miALS, comp2);
		System.out.println(miALS);
		
//------------------------------------------------------------------------ ArrayList ordenar precio
		
		ArrayList <Coche> miALCoche = new ArrayList <>();
		
		miALCoche.add(new Coche("Mercedes",70000.40,"Rojo"));
		miALCoche.add(new Coche("Ferrari",95430.69,"Chocolate"));
		miALCoche.add(new Coche("Seat",13000.20,"Gris"));
		miALCoche.add(new Coche("BMW",45000.10,"Blanco"));
		miALCoche.add(new Coche("Tesla",120000.10,"Negro Mate"));
		
		Collections.sort(miALCoche);
		
		
	}

}

class Coche implements Comparable<Coche>
{
	private String marca;
	private double precio;
	private String color;
	
	public Coche (String m, double p, String c)
	{
		marca = m;
		precio = p;
		color = c;
		
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}


	public double compareTo(Coche o) 
	{
		return precio.compareTo(o.getPrecio());
	}
	
	
}
