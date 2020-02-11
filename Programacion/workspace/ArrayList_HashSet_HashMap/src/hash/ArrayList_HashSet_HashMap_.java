package hash;

import java.util.ArrayList;

public class ArrayList_HashSet_HashMap_ 
{
//insertar elementos
	//hashmap coleciones, es una lista de elementos, pero cada elemento solo tiene dos partes, la parte clave y valor
	//clave siempre tipo string y el valor entero (Integer) 
	public static void main(String[] args) 
	{
		int i;
		ArrayList <Integer> miAL = new ArrayList<Integer>(); //creo un arraylist de tipo int
		for (i=0;i<=20;i++) 
		{
			miAL.add(i);
		}
		
		Integer [] Array = new Integer [miAL.size()];//pasar de arraylist a array
		Array = miAL.toArray(Array);//pasar de arraylist a array
		
		miAL.removeIf(n -> (n>=8 && n<=12));//te elimina de x a y en el array
		//n representa al valor que esta en primer lugar del arraylist
		
		System.out.println(miAL.get(7)); //en el indice 7 esta el numero x
		
		System.out.println(miAL.indexOf(12)); // te imprime su indice si no existe imprime -1 si existe te imprime el numero
		
		if(miAL.isEmpty()) //pregunta si esta vacio el array list
		{
			System.out.println("Esta vacía");
		}
		else 
		{
			int size = miAL.size(); //si no esta vacia te imprime la longitud del arrayolist
			System.out.println(miAL.size());
		}
		
		miAL.trimToSize(); //ajusta el arraylist
		System.out.println(miAL.indexOf(13));//para comprobar el indice del numero y ver si esta ajustado 
		
		if(miAL.contains(45))//pregunta si existe el numero 45 en mi array list
		{
			System.out.println("sí");
		}
		else
		{
			System.out.println("no");
		}
		//miAL.removeRange(8,12); no funciona dpende de la version es para eliminar de x a y
		
	}

}
