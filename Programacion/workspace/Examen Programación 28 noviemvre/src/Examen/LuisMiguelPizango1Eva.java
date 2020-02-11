package Examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class LuisMiguelPizango1Eva extends Trabajador implements CalculadorNominaInterface
{
	private String funcion;
	private String especialidad;

	public LuisMiguelPizango1Eva(String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, String ciudad,
			String país, double sueldobruto, double porcientoIrpf, double porcientoSSocial, String funcion, String especialidad) 
	{
		super(nombre, fechaNacimiento, fechaAlta, ciudad, país, sueldobruto, porcientoIrpf, porcientoSSocial);
		this.funcion=funcion;
		this.especialidad=especialidad;
	}

	public static void main(String[] args) 
	{
		String idT;
		String nT;
		String fN=null;
		String fA=null;
		String pa;
		String ciu;
		double suBruto;
		double porIRPF;
		double porSS;
		String fun = null;
		String Espe; 
		String M="Medico"; String O="Otra"; String E="Enfermero";
		 System.out.println("¿Cuántos profesionales, entres médic@s, enfermer@s y otr@s desea dar de alta? Teclee su numero a continuación: ");
		 Scanner teclado=new Scanner(System.in);
		 int numProfesionales = teclado.nextInt();
		 Trabajador[] lista = new Trabajador[numProfesionales];
		 ArrayList <Trabajador> listaM = new ArrayList <Trabajador>();
		 ArrayList <Trabajador> listaE = new ArrayList <Trabajador>();
		 ArrayList <Trabajador> listaD = new ArrayList <Trabajador>();
		 
		 for(int x=0;x<numProfesionales;x++)
		 {
			 System.out.println("Introduzca los siguientes datos del profesional: ");
			 System.out.println("Nombre: ");
			 nT=teclado.next();
			 System.out.println("Fecha de nacimiento (aaaa-mm-dd): ");
			 fN=teclado.next();
			 LocalDate fechaNacimiento=null;
			 System.out.println("Fecha Alta en la empresa (aaaa-mm-dd): ");//cambiar de string a localddate con parse!!
			 fA=teclado.next();
			 LocalDate fechaAlta=null;
			 System.out.println("País: ");
			 pa=teclado.next();
			 System.out.println("Ciudad: ");
			 ciu=teclado.next();
			 System.out.println("Sueldo Bruto: ");
			 suBruto=teclado.nextDouble();
			 System.out.println("Porcentaje IRPF: ");
			 porIRPF=teclado.nextDouble();
			 System.out.println("Porcentaje Seguridad Social: ");
			 porSS=teclado.nextDouble();
			 System.out.println("Función. Teclee(M o E u O [M]édico o [E]nfermero u [O]tra)");
			 fun=teclado.next();// switch en el tostring para imprimir
			 System.out.println("Especialidad Médica o de Enfermería u Otra");
			 System.out.println("Médica:(Oftalmólogo, UVI, Internista, Traumatólogo, Cirugía");
			 System.out.println("Enfermería:(Quirófano, UVI, Urgencias, Planta)");
			 System.out.println("Otra: Otra");
			 Espe=teclado.next();
			 
			 
			 lista[x] = new LuisMiguelPizango1Eva (nT, fechaNacimiento, fechaAlta, ciu, pa, suBruto, porIRPF, porSS, fun, Espe);
		 }
		 
		 for(Trabajador b:lista)
		 {
			 if (fun.equals("M"))
			 {
				 listaM.add(b);
			 }
		 }
		 for(Trabajador b:lista)
		 {
			 if (fun.equals("E"))
			 {
				 listaE.add(b);
			 }
		 }
		 for(Trabajador b:lista)
		 {
			 if (fun.equals("O"))
			 {
				 listaD.add(b);
			 }
		 }
			System.out.println("Información del personal Médico");
			System.out.println("===============================");
			System.out.println("");
			
		 for(int x=0;x<listaM.size();x++)
		 {
			 System.out.println(listaM.get(x));
		 }
		 
		 System.out.println("Información del personal Enfermero");
			System.out.println("===============================");
			System.out.println("");
			
		 for(int x=0;x<listaE.size();x++)
		 {
			 System.out.println(listaE.get(x));
		 }
		 
		 System.out.println("Información del personal Otro");
			System.out.println("===============================");
			System.out.println("");
			
		 for(int x=0;x<listaD.size();x++)
		 {
			 System.out.println(listaD.get(x));
		 }

	}

	public double calculoIRPF() 
	{
		return formatear (sueldobruto-(sueldobruto*porcientoIrpf));
	}

	public double calculoSSocial() 
	{
		return formatear ((porcientoIrpf/100)*sueldobruto);
	}

	public double calculoSueldoNeto(double a, double b) 
	{
		return formatear (sueldobruto-(calculoIRPF()+calculoSSocial()));
	}
	
	private double formatear(double c)
	{
		double z=(double)Math.round(c*100)/100;
		return z;
	}
	
	public String toString()
	{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String msg= "nombre:"+getNombre()+"Fecha Alta: "+formato.format(getFechaAlta())+"Fecha Nacimiento: "+ formato.format(getFechaNacimiento())+"Especialidad: "+especialidad+"Tiene un sueldo bruto de :"+sueldobruto;
		return msg;
		
	}

}


