package PrincipalSemanaTres;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String mostrarDatos() {
		return "Nombre: " + nombre + "  Apellido: " + apellido;
	}
	
	
}
