package Principal.SemanaUnoYDos;

public class Ejercicio2Encapsulacion {
	
private String nombre;
private String apellido;
private int edad;

public Ejercicio2Encapsulacion(String nombre, String apellido, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

@Override
public String toString() {
	return "Informacion:  nombre = " + nombre + " apellido = " + apellido + " edad = " + edad ;
}


}
