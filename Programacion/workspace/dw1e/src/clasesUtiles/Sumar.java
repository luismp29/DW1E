package clasesUtiles;

public class Sumar 
{
	public int n1,n2,n3;
	public double n11,n22,n33;
	
	
	public int sumas(int a,int b) 
	{
		n1=a;
		n2=b;
		return n1+n2;
	}
	
	public int sumas(int a, int b, int c) 
	{
		n1=a;n2=b;n3=c;
		return n1+n2+n3;
	}
	
	public double sumas(double a, double b, double c) 
	{
		n11=a;n22=b;n33=c;
		return n11+n22+n33;
	}
	
	public double sumasdouble(double a, double b, double c) 
	{
		n11=a;n22=b;n33=c;
		return (double)n11+n22+n33;
	}
}