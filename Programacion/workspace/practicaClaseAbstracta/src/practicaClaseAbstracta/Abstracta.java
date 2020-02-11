package practicaClaseAbstracta;

public abstract class Abstracta 
{
	private String nombre;
	private double sueldo;
	
	public Abstracta()
	{
		
	}
	
	public Abstracta(String n, double s)
	{
		nombre=n;
		sueldo=s;
	}
	
	public String devolver()
	{
		return nombre;
	}
	
	public double devolver2()
	{
		return (sueldo*0.05)+sueldo;
	}
	
	abstract public double calculo(double s);
	
}
