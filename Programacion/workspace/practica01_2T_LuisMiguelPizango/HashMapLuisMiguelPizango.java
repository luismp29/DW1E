package colecciones;

import java.util.HashMap;
import java.util.Map.Entry;;

public class HashMapLuisMiguelPizango 
{

	public static void main(String[] args) 
	{
		HashMap <Integer,String> lista = new HashMap<>();//creo el hashMap
		lista.put(1,"Maria Salomea Sklodowska"); //añado clave y nombre
		lista.put(2,"Santiago Ramón y Cajal");
		lista.put(3,"Téano de Crotona");
		lista.put(4,"Mariano Barbacid");
		lista.put(5,"Augusta Ada Byron");
		
		System.out.println("El Hashmap tiene una longitud de "+lista.size()+" elementos\r");//visualizo el tamaño
		
		
		for(Entry<Integer, String> m: lista.entrySet()) //hago un creo y le doy una varable
		{
		    if(m.getKey().equals(1)) //si la clave es 1 te imprime lo siguiente
		    {
		        System.out.println("Posicion: "+m.getKey()+". Nombre: "+m.getValue()+". Nacionalidad: Polaca");
		    }
		    if (m.getKey().equals(2)) 
		    {
		    	System.out.println("Posicion: "+m.getKey()+". Nombre: "+m.getValue()+". Nacionalidad: Española");
		    }
		    if (m.getKey().equals(3)) 
		    {
		    	System.out.println("Posicion: "+m.getKey()+". Nombre: "+m.getValue()+". Nacionalidad: Griega");
		    }
		}
		lista.replace(4, "Margarita Salas Falgueras"); //remplazo el 4 puesto mantengo la clave
		System.out.println("\rImpresión del HashMap completo\r\n" + 
				"===============================");
		lista.forEach((k, v) -> //uso lamba para imprimir el map entero
		{
            System.out.println("Posición: "+k+" *** Nombre: " + v);
        });

	}

}
