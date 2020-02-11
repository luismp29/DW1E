package practica03_2;
import practica03.ClaseAnimal;
public class ClaseFelinos extends ClaseAnimal
{
	
	public ClaseFelinos (String n, String h, boolean ex) 
	{
		super(n,h,ex);
	}
	
	public ClaseFelinos (String n, String h, String ali, boolean ex, int p, String esp, boolean sex) 
	{
		super(n,h,ali,ex,p,esp,sex);
	}
	
	public ClaseFelinos() 
	{
		
	}
	

	public static void main(String[] args) 
	{
		ClaseAnimal objGato=new ClaseAnimal("Gato", "Europa", false);
		System.out.println("Nombre: "+objGato.getNombre()+" Habitad: "+objGato.getHabitad()+" Extincion: "+objGato.isExtincion());
		
//-------------------------------------------------------------------------------------------------------------------------------------------->	
		
		ClaseAnimal objTigre=new ClaseAnimal("Tigre", "Asia,America", "Carnivoro", false, 4, "felino", true);
		System.out.println("Nombre: "+objTigre.getNombre()+" Habitad: "+objTigre.getHabitad()+" Alimentacion: "+objTigre.getAlimentacion()+" extioncion: "
		+objTigre.isExtincion()+" Patas: "+ objTigre.getPatas()+" especie: "+objTigre.getEspecie()+" sexoF: "+objTigre.isSexoF());
		
//-------------------------------------------------------------------------------------------------------------------------------------------->	
		ClaseAnimal objPuma=new ClaseAnimal();
		objPuma.setNombre("Puma");
		objPuma.setHabitad("Asia,America");
		objPuma.setAlimentacion("Carnivoro");
		objPuma.setExtincion(false);
		objPuma.setPatas(4);
		objPuma.setEspecie("felino");
		objPuma.setSexoF(true);
		System.out.println("Nombre: "+objPuma.getNombre()+" Habitad: "+objPuma.getHabitad()+" Alimentacion: "+objPuma.getAlimentacion()+" extioncion: "
				+objPuma.isExtincion()+" Patas: "+ objPuma.getPatas()+" especie: "+objPuma.getEspecie()+" sexoF: "+objPuma.isSexoF());
	}
}



