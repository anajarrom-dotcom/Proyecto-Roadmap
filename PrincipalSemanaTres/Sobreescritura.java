package PrincipalSemanaTres;

public class Sobreescritura extends Persona{

	private String carrera;

	public Sobreescritura(String nombre, String apellido, String carrera) {
		super(nombre, apellido);
		this.carrera = carrera;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos() + " Carrera = " + carrera;
	}
}
