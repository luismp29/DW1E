package javadoc;

/**
 * @author KLK
 * version 1.0
 */
/**
 * @param a
 * @param b
 * @return
 */
public class documentancionJavadoc 
{

	/**
	 * este metodo solo llama a los otros metodos
	 * @see metodos: sumar, restar,multi
	 * @param args
	 */
	public static void main(String[] args) 
	{
	
		documentancionJavadoc obj = new documentancionJavadoc();
		double suma = obj.sumar(23, 78);
		double res = obj.restar(47637.378, 493875.329);
		double mul = obj.multi(439579834.32874, 73264.82374);
		System.out.println(suma+" ***** "+res+" ***** "+mul);
	}

	/**
	 * @param a -- double 
	 * @param b -- double 
	 * @return retorna la operacion
	 */
	public double sumar(double a, double b)
	{
		return a+b;
	}
	/**
	 * @param a -- double 
	 * @param b --double 
	 * @return retorna la operacion
	 */
	public double restar(double a, double b)
	{
		return a-b;
	}
	/**
	 * @param a -- double 
	 * @param b -- double 
	 * @return retorna la operacion
	 */
	public double multi(double a, double b)
	{
		return a*b;
	}
}
