import java.beans.FeatureDescriptor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import LuisPizangoExamenP1EVA.Cliente;

public class LuisPizangoExamenP1EVA 
{

	public static void main(String[] args) 
	{
		String idC;
		String nCliente;
		String fNa = null;
		double sueldo;
		boolean vip = false;
		String cVip;
		String S,s = null;
		String n = null;
		int i = 0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduza el numero de clientes que desea introducir: ");
		int numcliente=teclado.nextInt();
		Cliente lista[] = new Cliente[numcliente];
		
			for(i=0;numcliente<i;i++)
			{
				idC="cliente"+i;
				System.out.println("Introduzca el nombre del cliente: ");
				nCliente=teclado.next();
				System.out.print("introduzca la fecha de nacimiento <yyyy-mm-dd>: ");
				fNa=teclado.next();
				System.out.println("Introduza el sueldo (si no lo conoce introduzca 0): ");
				sueldo=teclado.nextDouble();
				LocalDate fechaNacimiento= null;
				Cliente obj=null;
				try
				{
					fechaNacimiento=LocalDate.parse(fNa);
				}
				catch (Exception x)
				{
					x.printStackTrace();
				}
				
				
				if(sueldo==0)
				{
					obj= new Cliente (idC,nCliente,fechaNacimiento,vip);
					
				}
				else
				{
					obj= new Cliente (idC,nCliente,fechaNacimiento,sueldo,vip);
				}
				
				System.out.println("Introduzca si es un cliente vip (s/S o n/N): ");
				cVip=teclado.next();
				
				
	}
}

class Cliente
{
	private String id;
	private String nombre;
	private LocalDate fechaNacimiento;
	private double sueldo;
	private boolean vip;
	
	public Cliente()
	{
		
	}
	
	public Cliente (String id, String nombre, LocalDate fechaNacimiento, boolean vip)
	{
		this.id=id;
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.vip=vip;
				
	}
	
	public Cliente (String id, String nombre, LocalDate fechaNacimiento, double sueldo, boolean vip)
	{
		this(id,nombre,fechaNacimiento,vip);
		this.sueldo=sueldo;
		
	}
	
	/*public String toString()
	{
		if (vip==false)
		{
			System.out.println(" no es vip.");
		}
		else
		{
			System.out.println(" es vip.");
		}
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("El cliente de ID: "+id+" de nombre: "+nombre+" y fecha de nacimiento: "+fechaNacimiento.format(formatoFecha)+
		", tiene un sueldo de: "+sueldo+"€ y"+vip);
		
		return;
	}*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
}}