package debug;

public class debug1 
{
	

	public static void main(String[] args) 
	{
		Persona obj=new Persona();
		obj.setNombre("Luis");
		System.out.println("Nombre: "+obj.getNombre());
	}
	
}
	class Persona
	{
			String apellido;
			String nombre;
			int DNI;
			int edad;
			boolean casado;
			
			public String getApellido() 
			{
				return apellido;
			}
			
			public void setApellido(String _apellido)
			{
				apellido = _apellido;
			}
			
			public String getNombre() 
			{
				return nombre;
			}
			
			public void setNombre(String _nombre)
			{
				nombre = _nombre;
			}
			
			public int getNIA()
			{
				return DNI;
			}
			
			public void setNIA(int _NIA)
			{
				DNI = _NIA;
			}
			
			public boolean getCasado()
			{
				return casado;
			}
			
			public void setCasado(boolean _casado)
			{
				casado = _casado;
			}
			
	}
