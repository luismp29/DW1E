package practicaClaseAbstracta;

public class publica extends Abstracta
{	
	public publica()
	{
		super("pepe", 999.99);
	}

	public static void main(String[] args) 
	{
		publica obj=new publica();
		System.out.println("nombre: "+obj.devolver()+" sueldo: "+obj.devolver2());

	}


	public double calculo(double sueldo) 
	{
		
		return sueldo;
	}

}
