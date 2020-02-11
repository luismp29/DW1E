package colecciones;
import java.util.*;


public class HashSetLuisMiguelPizango extends Arboles
{

	public HashSetLuisMiguelPizango(String nombre, double altura, int añosEdad, String lugarOrigen,
			boolean hojaCaduca) {
		super(nombre, altura, añosEdad, lugarOrigen, hojaCaduca);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		HashSet<Arboles> lista = new HashSet<>();
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
		
		System.out.println("El tamaño del HashSet es de: "+lista.size()); //visualizo el tamaño del hashset
		
		System.out.println("\rListo el Array"+"\n"+"==============");
		Arboles[] array = new Arboles[lista.size()];
		lista.toArray(array);
		for (int x = 0; x < array.length; x++) 
            System.out.println("Nombre del arbol: "+array[x].getNombre()+"\n"+"Altura: "+array[x].getAltura()+"\n"+"Edad en años: "+array[x].getAñosEdad()+"\n"+"Lugar de origen: "+array[x].getLugarOrigen()+"\n"+
                    "Hoja caduca: "+array[x].isHojaCaduca()+"\n"+"********************************");
		
		System.out.println("Listo el HashSet"+"\n"+"==============");
		/*Iterator<Arboles> i = lista.iterator(); 
		while (i.hasNext()) 
            System.out.println("Nombre del arbol: "+i.next().getNombre()+"\n"+"Altura: "+i.next().getAltura()+"\n"+"Edad en años: "+i.next().getAñosEdad()+"\n"+"Lugar de origen: "+i.next().getLugarOrigen()+"\n"+
                    "Hoja caduca: "+i.next().isHojaCaduca()+"\n"+"********************************");*/
		for(Arboles z : lista)
		{
			System.out.println("Nombre del arbol: "+z.getNombre()+"\n"+"Altura: "+z.getAltura()+"\n"+"Edad en años: "+z.getAñosEdad()+"\n"+"Lugar de origen: "+z.getLugarOrigen()+"\n"+
                    "Hoja caduca: "+z.isHojaCaduca()+"\n"+"********************************");
		}
	}

}
