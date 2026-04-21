package PrincipalSemanaTres;

public class Herencia extends Persona{
	
private String carrera;

public Herencia(String nombre, String apellido, String carrera) {
	super(nombre, apellido);
	this.carrera = carrera;
}

@Override
public String toString() {
	return  "Herencia nombre = " + nombre + " apellido = " + apellido + " Carrera = " + carrera ;
}




}
