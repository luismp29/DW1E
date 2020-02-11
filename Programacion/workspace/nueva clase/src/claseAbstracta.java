
public abstract class claseAbstracta 
{
	private String nombre;
	
	
	public claseAbstracta ()
	{
		
	}
	
	
	public claseAbstracta(String n)
	{
		nombre=n;
	}
	
	abstract public void impresion (String x);
	
	public String devolver()
	{
		return nombre;
	}
}
