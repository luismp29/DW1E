
public class pruebaClaseAbstracta extends claseAbstracta
{
	public pruebaClaseAbstracta() 
	{
		super ("pepe");
	}
	public static void main(String[] args) 
	{
		pruebaClaseAbstracta obj = new pruebaClaseAbstracta();
		obj.impresion("paula");
		System.out.println(obj.devolver());
	}
	
	public void impresion(String z)
	{
		System.out.println(z);
	}

}
