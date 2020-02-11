package practica;

public abstract class SerVivo 
{
	private String nombre;
	private double altura;
	private int edad;
	private int patas;
	private String animales;
	private String plantas;
	private boolean extincion;
	private String carnivoro;
	private String herviboro;
	private String agua;

	abstract public String comer(String carnivoro, String herviboro);
	
	abstract public String beber(String agua);
	
	public String devolverCarne() 
	{
		return carnivoro;
	}
	
	public String devolverVege() 
	{
		return herviboro;
	}
	
	public String devolverAgua() 
	{
		return agua;
	}
	
	public void deseoVivir()
	{
		System.out.println("Deseo vivir");
	}
}
