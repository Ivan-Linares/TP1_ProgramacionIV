package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado Tuke = new Empleado();
		Empleado Teto = new Empleado("Teto", 41);
		Empleado Tato = new Empleado();
		
		Tuke.setNombre("Tuke");
		
		//System.out.println("ID: " + Tuke.getId() + " Nombre: " + Tuke.getNombre());
		System.out.println(Tuke.toString());
		System.out.println(Teto.toString());
		System.out.println(Tato.toString());
		
		System.out.println("ID del siguiente empleado: " + Empleado.devuelveProximoID());
	}

}
