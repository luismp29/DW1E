package enumerados;

public class misEnumerados 
{
	
	public enum Clase 
	{
		MATES("Aua 13", 20),FISICA("Aula 1",12),PROGRAMMING("Aula 0",22);
		
		public String aula;
		public int numAlumnos;
		
		private Clase (String aula,int numAlumnos) 
		{
			this.aula=aula;
			this.numAlumnos=numAlumnos;
			
		}
	}

	public static void main(String[] args) 
	{
		Clase miClase=Clase.FISICA;
		
		
		System.out.println(miClase.toString());

	}
	
	public String toString()
	{
		Clase miClase=Clase.FISICA;
		String mensaje="El nombre es: "+miClase.name()+"y el aula es: "+ miClase.aula+miClase.numAlumnos;// miClase.name como es enum se crea el objeto name que te imprime el nombre de la clase
		//miClase.numAlumnos imprime lo que hay dentro de los private de esos atributos.
		return mensaje;
	}

}
