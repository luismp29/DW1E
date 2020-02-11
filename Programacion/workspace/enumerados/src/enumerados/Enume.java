package enumerados;
//lista de posibles valores que no tendrá otros valores que nosotros no hayamos dado.
public class Enume 
{
	public enum Personas{María,Jesús,Diego,José,Jaime}
	
	static Personas nombre=Personas.José;
	
	static String b="jota";
	static String a="Jota";
	
	static String result =(b.contentEquals(a))?"Igual":"Distinto";
	static String result2 =(b.contentEquals(a))?"Igual":"Distinto";
	
	static int num=20;
	
	static int numDespla=num<<3;
	
	

	public static void main(String[] args) 
	{
		
		System.out.println(nombre+"\n\"Hola");
		
		System.out.println(result);
		
		System.out.println(b+" "+a);
		System.out.println(numDespla);
		
		//valorNum=(i<j)?valorNum+20:valorNum+1; 
		

		
		
	}
	


}
