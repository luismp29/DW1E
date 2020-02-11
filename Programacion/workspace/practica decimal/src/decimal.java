import java.util.Scanner;

public class decimal 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		
		num=entrada.nextInt();
		entrada.close();
	
		if(num<0) 
		{
			System.out.println("El numero introducido debe ser mayor o igual a 0");
		}
		else 
		{
			PasarABinariohexaoctal obj=new PasarABinarioHexaOctal();
			
			int mostrarBinario[]=obj.conversor(entrada,2);
			
			int mostrarOctal[]=obj.conversor(entrada,8);
			
			char mostrarHexa[]=obj.conversorHexa(entrada);
			
			//mostrar resultados
			
			System.out.print("El numero "+entrada+"en binario es: ");
			for(int b:mostrarBinario)
				System.out.print(b);
			
			System.out.printnl();
			
		}
			
		
		
		
		
//------------------------------------------------------------------------------------------------------------>	forma directa del calculo
		/*String hexadecimal = Integer.toHexString(num);
		String octal = Integer.toOctalString(num);
		String binary = Integer.toBinaryString(num);
		
		
        System.out.printf("Resultado ->"+" decimal: "+num+" hexadecimal: "+hexadecimal+" octal: "+octal+" binary: "+binary);*/
         
	}
	
	public int [] conversor(int entrada,int base) 
	{
		boolean condicion=true;
		int resulparcial[]=new int[32];
		int index=0;
		
		do 
		{
			if(entrada>=base) 
			{
				resulparcial[index]=entrada%base;
				index++;
				entrada/=base; //es lo mismo que entrada=entrada/2;
			}
			else 
			{
				resulparcial[index]=entrada%base;
				condicion=false;
				
			}
		}while (condicion);
		
		int resultado[]=new int[index+1];
		
		int index2=-1;
		
		for(int i=index;i>=0;i--) 
		{
			index2++;
			resultado[index2]=resulparcial[i];
		}
		return resultado;
	}
	
	public char[] conversorHexa(int entrada) 
	{
		boolean  n
	}
}
