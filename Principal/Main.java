package Principal;

import Principal.SemanaUnoYDos.ClasesYObjetos;
import Principal.SemanaUnoYDos.Ejercicio2Encapsulacion;
import Principal.SemanaUnoYDos.Empleado;
import Principal.SemanaUnoYDos.Encapsulacion;

public class Main {
	public static void main (String[]args) {
		
		semanaUno();
	}
	public static void semanaUno() {
		
		Empleado empl1 = new Empleado(1, "Antony", "Najarro",
				36, "Ciudad", "M", "activo");
		
		
		System.out.println(empl1);
		System.out.println("-----------------------------------------------");
		ClasesYObjetos cb = new ClasesYObjetos();
		cb.titulo = "Matematica";
		System.out.println(cb.titulo);
		System.out.println("-----------------------------------------------");
		Encapsulacion encapsulacion = new Encapsulacion(10);
		encapsulacion.setEdad(20);
		System.out.println(encapsulacion.getEdad());
		System.out.println("-----------------------------------------------");
		Ejercicio2Encapsulacion c2 = new Ejercicio2Encapsulacion("Antony", "Najarro", 19);
		System.out.println(c2);
	}

}
