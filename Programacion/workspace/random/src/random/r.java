package random;

import java.io.IOException;
import java.util.Random;

public class r {

	public static void main(String[] args) throws IOException 
	{
		int v;
		Random numAleatorio=new Random(System.currentTimeMillis());
		
		do 
		{
			v=15+numAleatorio.nextInt(106);
			System.out.println(v);
		}while (v!=32);
		System.out.println("lo último: " +v);
		
		switch (v)
		{
		case 15:case 20:case 30:
			System.out.println(v);
			break;
		case 90:
			v++;
			break;
		default:
			v+=8;
		}
		
		System.in.read();
		
		
		//esperar tecla es System.in.read();
	}

}
