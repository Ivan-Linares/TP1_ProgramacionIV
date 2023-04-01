package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado[] vEmpleados = new Empleado[5];
		
		vEmpleados[0] = new Empleado();
		vEmpleados[0].setNombre("Tuke");
		
		vEmpleados[1] = new Empleado("Teto", 41);
		vEmpleados[2] = new Empleado();
		vEmpleados[3] = new Empleado("Marie", 22);
		vEmpleados[4] = new Empleado("Juan", 35);
		

		for(Empleado empleado : vEmpleados){
			System.out.println(empleado.toString());
		}

		System.out.println("ID del siguiente empleado: " + Empleado.devuelveProximoID());
	}

}
