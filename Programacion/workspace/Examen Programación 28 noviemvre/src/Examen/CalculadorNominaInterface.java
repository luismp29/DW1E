package Examen;

public interface CalculadorNominaInterface 
{
	 public String MEDICO = "Médico";
	 public String ENFERMERO = "Enfermero";
	 public String OTRA = "Otra";
	 
	 abstract public double calculoIRPF();
	 abstract public double calculoSSocial();
	 abstract public double calculoSueldoNeto(double a, double b);
}
