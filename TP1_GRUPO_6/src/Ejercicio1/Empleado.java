package Ejercicio1;

public class Empleado 
{
	private final int id;
	private String nombre;
	private int edad;
	
	public Empleado() {
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	private static int cont = 1000;
}
