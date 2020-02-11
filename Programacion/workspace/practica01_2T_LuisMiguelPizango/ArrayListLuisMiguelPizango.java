package colecciones;

import java.util.*;



public class ArrayListLuisMiguelPizango extends Arboles
{
	public ArrayListLuisMiguelPizango(String nombre, double altura, int añosEdad, String lugarOrigen,
			boolean hojaCaduca) 
	{
		super(nombre, altura, añosEdad, lugarOrigen, hojaCaduca);
	}

	public static void main(String[] args)
	{

		ArrayList <Arboles> lista = new ArrayList <Arboles>();//me creo el arraylist
		Arboles arbol1 = new Arboles ("Roble",12.5,80, "Canadá",true);//me creo cada uno de los objetos que voy a añadir
		Arboles arbol2 = new Arboles ("Encina", 5.25, 90, "España", false);
		Arboles arbol3 = new Arboles ("Pino Laricio", 5.25, 80, "Italia", false);
		Arboles arbol4 = new Arboles ("Roble",5.5,15, "Canadá",true);
		Arboles arbol5 = new Arboles ("Manzano",3.5,60, "India",false);
		lista.add(arbol1);//añados los objetos al arraylist
		lista.add(arbol2);
		lista.add(arbol3);
		lista.add(arbol4);
		lista.add(arbol5);
		/*System.out.println(lista);*///para comprobar si se han añadido
		if(lista.isEmpty())
		{
			System.out.println("Esta vacio");
		}
		else
		{
			Arboles [] Array = new Arboles [lista.size()]; //me creo un array a partir de los datos del arraylist
			Array = lista.toArray(Array);
		}
		
		if(lista.contains("Peral"))
		{
			System.out.println("Lo contiene");
		}
		else
		{
			System.out.println("* El árbol Peral de lugar de origen Canadá, no existe.");
		}
		
		System.out.println("* La posición del árbol de 3.5 de alto está en la posición "+lista.indexOf(arbol5));
		
            if(arbol2.getNombre() == "Encina")
            {
                arbol2.setAñosEdad(95);
                System.out.println("* Edad de encinas de 90 años se han cambiado a 95");
            }
            else
            {System.out.println("No se cumple");}
            
        //condicion para borrar uno de los objetos del arrayl
        if(lista.removeIf(variable -> variable.getNombre()=="Roble"&&variable.isHojaCaduca()==true))
        {
        	System.out.println("* Se ha borrado el Roble de hoja caduca");
        }
        else
        {
        	System.out.println("No se ha borrado");
        }
        lista.trimToSize(); //ajusta el arraylist
        
        Collections.sort(lista, new Comparator<Arboles>() //orden segun lugar de origen
        {
			public int compare(Arboles o1, Arboles o2) 
			{
				return new String (o2.getLugarOrigen()).compareTo(new String (o1.getLugarOrigen()));
			}
        });
        
        Collections.sort(lista, new Comparator<Arboles>() //orden segun años
        {
			public int compare(Arboles o1, Arboles o2) 
			{
				return new Integer (o2.getAñosEdad()).compareTo(new Integer (o1.getAñosEdad()));
			}
        });
        
        System.out.println("\rListo ArrayList\r================");
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println("Nombre del arbol: "+lista.get(i).getNombre()+"\n"+"Altura: "+lista.get(i).getAltura()+"\n"+"Edad en años: "+lista.get(i).getAñosEdad()+"\n"+"Lugar de origen: "+lista.get(i).getLugarOrigen()+"\n"+
        "Hoja caduca: "+lista.get(i).isHojaCaduca()+"\n"+"********************************");
        }
	}

}
