package pruebas;

public class Trabajador {
	private String nombre;
	private double salarioBrutoAnual;
	private int edad;
	private int numHijos;
	private int numPersonasDependientes;

	public Trabajador(String nombre, double salarioBrutoAnual, int edad, int numHijos, int numPersonasDependientes) {
		this.nombre = nombre;
		this.salarioBrutoAnual = salarioBrutoAnual;
		this.edad = edad;
		this.numHijos = numHijos;
		this.numPersonasDependientes = numPersonasDependientes;
	}

	public double calcularSalarioBrutoMensual()throws Exception {
		if (salarioBrutoAnual<0) {
			throw new Exception();
			
		}
		return salarioBrutoAnual / 12;
	}

	public double calcularSalarioNetoAnual() {
		double irpf = 0;
		if (salarioBrutoAnual < 20000) {
			irpf = 0.14;
		} else if (salarioBrutoAnual < 40000) {
			irpf = 0.18;
		} else if (salarioBrutoAnual > 100000) {
			irpf = 0.32;
		}

		if (numHijos > 2) {
			irpf -= 0.03;
		}

		irpf -= numPersonasDependientes * 0.02;

		if (edad < 30 && salarioBrutoAnual < 20000) {
			irpf = 0.09;
		}

		return salarioBrutoAnual * (1 - irpf);
	}

	public double calcularSalarioNetoMensual() {
		return calcularSalarioNetoAnual() / 12;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioBrutoAnual() {
		return salarioBrutoAnual;
	}

	public void setSalarioBrutoAnual(double salarioBrutoAnual) {
		this.salarioBrutoAnual = salarioBrutoAnual;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public int getNumPersonasDependientes() {
		return numPersonasDependientes;
	}

	public void setNumPersonasDependientes(int numPersonasDependientes) {
		this.numPersonasDependientes = numPersonasDependientes;
	}

}
