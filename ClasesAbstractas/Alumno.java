package ClasesAbstractas;

public class Alumno extends Persona {

	private String carrera;

	public Alumno(String nom, String car) {
		//Llamada al constructor de la clase Padre
		super(nom);
		carrera = car;
	}
	/*
	 * Sobrescribimos el metodo dameDescripcion
	 */
	public String dameDescripcion(){
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
	
}
