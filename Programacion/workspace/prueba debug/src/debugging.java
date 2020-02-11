
public class debugging 
{

	private int a;
	private int b;
	
	public debugging(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) 
	{
		debugging obj = new debugging(12, 12);

		System.out.println("suma: "+obj.sumar());
		System.out.println("resta: "+obj.restar());
	}

	public int sumar ()
	{
		return this.getA()+this.getB();
	}
	
	public int restar()
	{
		return this.getA()+this.getB();
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
