package herencia;

public class Doctor extends persona
{

	public static void main(String[] args) 
	{
		Doctor obj=new Doctor();
		
		obj.setNombre("Josefina");
		obj.setApellido("Mendoza");
		obj.setCalle("Turaza, 24");
		obj.setEdad(35);
		obj.setTelefono("911111111");
		
		System.out.println(obj.edadAmpliada());
		
		System.out.println("Nombre: "+obj.getNombre()+"\nCalle: "+obj.getCalle());
	}

}
