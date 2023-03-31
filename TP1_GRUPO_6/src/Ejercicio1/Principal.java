package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado Tuke = new Empleado();
		Empleado Teto = new Empleado("Teto", 41);
		
		Tuke.setNombre("Tuke");
		
		System.out.println("ID: " + Tuke.getId() + " Nombre: " + Tuke.getNombre());
		System.out.println(Tuke.toString());
		System.out.println(Teto.toString());
	}

}
