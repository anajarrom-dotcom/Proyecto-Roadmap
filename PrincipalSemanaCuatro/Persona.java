package PrincipalSemanaCuatro;

public class Persona {

	protected String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String mostrar() {
		return "Nombre: " + nombre;
	}
}
