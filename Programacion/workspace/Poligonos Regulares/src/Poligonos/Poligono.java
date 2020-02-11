package Poligonos;

public class Poligono 
{
	private double longLado;
	private int nlado;
	private double perimetro;
	private double radio;
	private double apotema;
	private double altura;
	
	public Poligono (double longLado, int nlado )
	{
		this.longLado=longLado;
		this.nlado=nlado;
	}
	
	public Poligono (double longLado, int nlado, double perimetro, double radio, double apotema, double altura)
	{
		this.longLado=longLado;
		this.nlado=nlado;
	}

	public double getLongLado() 
	{
		return longLado;
	}

	public void setLongLado(double longLado) 
	{
		this.longLado = longLado;
	}

	public int getNlado() 
	{
		return nlado;
	}

	public void setNlado(int nlado) 
	{
		this.nlado = nlado;
	}

	public double getPerimetro() 
	{
		return perimetro;
	}

	public void setPerimetro(double perimetro) 
	{
		this.perimetro = perimetro;
	}

	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}

	public double getApotema() 
	{
		return apotema;
	}

	public void setApotema(double apotema) 
	{
		this.apotema = apotema;
	}

	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	

}
