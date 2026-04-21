package Principal;

import Principal.SemanaUnoYDos.ClasesYObjetos;
import Principal.SemanaUnoYDos.Ejercicio2Encapsulacion;
import Principal.SemanaUnoYDos.Empleado;
import Principal.SemanaUnoYDos.Encapsulacion;
import PrincipalSemanaTres.Herencia;
import PrincipalSemanaTres.Sobreescritura;

public class Main {
	public static void main (String[]args) {
		
		semanaUnoYDos();
		semanaTres();
	}
	public static void semanaUnoYDos() {
		
		Empleado empl1 = new Empleado(1, "Antony", "Najarro",
				36, "Ciudad", "M", "activo");
		
		System.out.println("--------------------semana uno y dos---------------------------");
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
	
	public static void semanaTres() {
		System.out.println("      ");
		System.out.println("---------------------semana tres--------------------------");
		
		Herencia herencia = new Herencia("Antony", "Najarro", "Ingenieria En sistemas");
		System.out.println(herencia);
		System.out.println("-----------------------------------------------");
		Sobreescritura st = new Sobreescritura("lucas", "Lopez", "Abogado");
		System.out.println(st.mostrarDatos());
	}

}
