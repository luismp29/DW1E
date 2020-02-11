package practica03;

public class ClaseAnimal 
{
	private String nombre;
	private String habitad;
	private String alimentacion;
	private boolean extincion;
	private int patas;
	private String especie;
	private boolean sexoF;
	
	public ClaseAnimal(String n, String h, boolean ex)
	{
		nombre=n;
		habitad=h;
		this.extincion=ex;
	}
	
	public ClaseAnimal(String n, String h, String ali, boolean ex, int p, String esp, boolean sex) 
	{
		nombre=n;
		habitad=h;
		alimentacion=ali;
		this.extincion=ex;
		this.patas=p;
		especie=esp;
		this.sexoF=sex;
	}
	
	public ClaseAnimal() 
	{
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public boolean isExtincion() {
		return extincion;
	}

	public void setExtincion(boolean extincion) {
		this.extincion = extincion;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isSexoF() {
		return sexoF;
	}

	public void setSexoF(boolean sexoF) {
		this.sexoF = sexoF;
	}
	
	
}


