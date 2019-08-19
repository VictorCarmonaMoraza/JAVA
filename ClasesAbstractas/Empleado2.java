package ClasesAbstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado2 extends Persona {

	// Atributos , campos de clase, propiedades

	// private String nombre;

	private double sueldo;

	private Date altaContrato;
	private int Id;

	/*
	 * variable estatica o campo de clase. En cuanto ponemos static la variable
	 * se pone en cursiva. Una variable static pertenece a la clase no al objeto
	 */

	private static int IdSiguiente = 1;

	// Constructor 1
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		// Llamada al constructor de la clase Padre
		super(nom);
		// nombre = nom;
		sueldo = sue;
		// Un objeto que recibe una fecha
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();
		// calendario.getTime devuelve un objeto de tipo date por eso lo
		// guardamos en altacontrato

		Id = IdSiguiente;
		// Incrementamos la variable static IdSiguiente
		IdSiguiente++;
	}

	public String dameDescripcion() {
		return "Este empleado tiene un Id= " + Id + " con un sueldo= " + sueldo;
	}

	// Cnostructor 2 con solo un parametro
	// public Empleado(String nom) {
	// this(nom, 30000, 2000, 01, 01);
	// }

	// Devuelve el nombre
	// getter
	// public String dameNombre() {
	// return nombre;
	// }

	/*
	 * Devuelve la fecha del altaContrato Devuelve un objeto tipo Date
	 */
	public Date dameFechaContrato() {
		return altaContrato;
	}

	/*
	 * Metodo para subir el suelto SETTER
	 */
	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	public double dameSueldo() {
		return sueldo;
	}

	public int DevolverId() {
		return Id;
	}

}

// }
