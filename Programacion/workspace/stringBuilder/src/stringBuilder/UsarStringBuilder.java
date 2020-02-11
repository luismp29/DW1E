package stringBuilder;

public class UsarStringBuilder {

	public static void main(String[] args) 
	{
		StringBuilder cadena=new StringBuilder("Hoy es viernes");
		
		cadena.append(" día 8 ");
		System.out.println(cadena);
		
		cadena.insert(18, ", "); //el primer numero es la posicion donde quieres que se introduzca el texto y despues el texto que queramos introducir
		System.out.println(cadena); 

	}

}
