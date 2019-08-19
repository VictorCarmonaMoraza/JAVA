package ClasesAbstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];
		// Un empleado2 es una Persona por la herenecia
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		// Un Alumno es una Persona por la herencia
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologicas");

		/*
		 * Bucle for mejorado
		 */
		for (Persona p : lasPersonas) {
			System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
		}
	}

}
