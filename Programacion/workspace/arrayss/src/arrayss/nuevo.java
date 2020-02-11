package arrayss;
public class nuevo {
	

	public static void main(String[] args) 
	{
		/*double a;
		int b;
		a=150.45;
		
		b=(int)a;
		
		System.out.println(a+" "+b);
		*/
		
//---------------------------------------------		
		//
		int milista[]=new int[50];
		//char milistaCaracter[]=new char[10];
		
		//una forma de asignar valores
		/*
		milista[0]=100;
		milista[1]=200;
		milista[2]=300;
		milista[3]=400;
		milista[4]=500;
		milista[5]=600;
		*/
		
//------------------------------------------------------
		//otra forma
		//con esa lista no necesito el new char y con { <- introduzco los elemetos
		
		//int milista2[]= {100,200,300,400,500,600};
		
//-------------------------------------------		
		//tercera forma con criterio 
		//int i = para
		//i++ es de uno en uno y es lo mismo que i=i+1 y al contrario i-- es restar dos
		//para sumar mas seria i+=3, asi sucesivamente cambiando el 3
		
		
		/*int primero=1000;
		
		for(int i=0;i<26;i++)
		{
			milista[i]=primero;
			primero++;
		
		}
		
		for(int i=0;i<26;i++)
			System.out.println(milista[i]);
		*/
		

//------------------------------------------------------
		/*int primero=202;
		for(int i=0;i<50;i+=1)
		{
			milista[i]=primero;
			primero+=2;
		}
		
		for(int i=0;i<50;i+=1)
			System.out.println(milista[i]);
		*/
//------------------------------------- 
//length longitud array y no hace falta indicar el tamaño del array que es 50 en este caso
		/*
		int primero=202;
		for(int i=0;i<milista.length;i+=1)
		{
			milista[i]=primero;
			primero+=2;
		}
		
		for(int i=0;i<milista.length;i+=1)
			System.out.println(milista[i]);
			*/
//---------------------------------------------
		/*
		int primero=202;
		for(int i=0;i<milista.length;i+=1)
			
		while (i<milista.length)
		{
			milista[i]=primero;
			primero+=2;
			i++;
		}

		for(int i=0;i<milista.length;i+=1)
			System.out.println(milista[i]);
		*/
//-----------------------------------------------------------------
		
		int i=0;
		int primero=202;
		do
		{
			milista[i]=primero;
			primero+=2;
			i++;
			
		}while(i<milista.length);
		
		for(i=0;i<milista.length;i+=1)
			System.out.println(milista[i]);
		
		System.out.println("***************");
		//creando una variable nueva te imprime todos los valores sin necesidad de escribir el anterior for for(int i=0;i<milista.....
		//esta sentencia se llama for each: for(int v:milista)
		for(int v:milista)
			System.out.println(v);
		
		
		Persona obj1=new Persona();
		Persona obj2=new Persona();
		Persona obj3=new Persona();
		
		obj1.nombre="Josefa";
		obj1.sueldo=1500.60;
		obj1.casado=false;
		
		obj2.nombre="Pedro";
		obj2.sueldo=1400.30;
		obj2.casado=true;
		
		obj3.nombre="Raul";
		obj3.sueldo=3200.02;
		obj3.casado=true;
			
	}
	


}

class Persona 
{
	public String nombre;
	public double sueldo;
	public boolean casado;
	
	public String getNombre()
	{
		return nombre;
	}
}

