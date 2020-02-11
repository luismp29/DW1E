//cadenas
public class string 
{

	public static void main(String[] args) 
	{
		String cadena1=new String("Hoy es viernes");
		String cadena2= ". Y mañana es sábado";
		String cadena3="Bien";
		
		System.out.println(cadena1.length()+" "+cadena1+cadena2.toUpperCase()+cadena3);
		//.toUpperCase es para convertir a mayusculas
		System.out.println(cadena1.concat(cadena2));

		
		if (cadena1.contentEquals(cadena2)) 
		{
			System.out.print("Son iguales");
		}
		else
			System.out.print("Son distintas");
		/*
		String etiqueta=String.valueOf(numero);
		String etiqueta2=String.valueOf(numdoble);
		*/
		System.out.println();
		
		String partecadena=cadena1.substring(7);
		System.out.println(partecadena);
		
		String parteV=cadena1.substring(7,11);
		System.out.println(parteV);
		
		char letras=cadena1.charAt(2);
		System.out.println(letras);
		
		String cadena4="";
		String dato=(cadena4.isEmpty())?"vacia":"llena";
		
		System.out.println(dato);
				
	}

}
