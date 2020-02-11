//import java.io.IOException;
import java.util.Scanner;

public class controlErrores 
{

	public static void main(String[] args) 
	{
		String Tratamiento;
		double cantidad;
		
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		try
		{
			System.out.println("introduce su tratamiento (Sra, Sr): ");
			Tratamiento=teclado1.next();
			if(Tratamiento.equals("Sra")||Tratamiento.equals("Sr"))
			{
				try
				{
					System.out.println("introduzca su cantidad");
					cantidad=teclado2.nextDouble();
					controlRango(cantidad);
					System.out.println("");
					System.out.println("***Resumen***");
					System.out.println(Tratamiento+".*** "+cantidad);
				}
				catch(NegativoException a)
				{
					System.out.println(a);
				}
				catch (CeroException a)
				{
					System.out.println(a);
				}
				catch (FueraDeRangoException a)
				{
					System.out.println(a);
				}
				
			}
			else
			{
				throw new TratamientoException("El tratamiento introducido no es correcto");
			}
			
		}
		catch(TratamientoException e)
		{
			System.out.println(e);
		}
		

	}
	
public static double controlRango( double b) throws FueraDeRangoException, CeroException, NegativoException
{
	if(b<0)
	{
		throw new NegativoException("No se admiten cantidades negativas");
	}
	else
	{
		if(b==0)
		{
			throw new CeroException("Las cantidades no pueden ser cero.");
		}
		else
		{
			if(b>=1000||b==1000000)
			{
				System.out.println("cantidad: "+b);
				System.out.println("");
			}
			else
			{
				if(b<1000||b>1000000)
				{
					throw new FueraDeRangoException("La cantidad introducida está fuera del rango admitido.");
				}
			}
		}
	}
	if(b<1000||b>1000000)
	{
		throw new FueraDeRangoException("La cantidad introducida está fuera del rango admitido.");
	}
	return b;
}

}
class TratamientoException extends Exception
{
	public TratamientoException (String s)
	{
		super(s);
	}
}

class NegativoException extends Exception
{
	public NegativoException (String c)
	{
		super(c);
	}
}

class CeroException extends Exception
{
	public CeroException (String c)
	{
		super(c);
	}
}

class FueraDeRangoException extends Exception
{
	public FueraDeRangoException (String c)
	{
		super(c);
	}
}