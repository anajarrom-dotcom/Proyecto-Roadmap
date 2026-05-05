package Principal;

import Principal.SemanaUnoYDos.ClasesYObjetos;
import Principal.SemanaUnoYDos.Ejercicio2Encapsulacion;
import Principal.SemanaUnoYDos.Empleado;
import Principal.SemanaUnoYDos.Encapsulacion;
import PrincipalSemanaCinco.AhorroCorriente;
import PrincipalSemanaCinco.AhorroSeguro;
import PrincipalSemanaCinco.RegistroEstudiante;
import PrincipalSemanaCuatro.EjemploPolimorfismo;
import PrincipalSemanaTres.Herencia;
import PrincipalSemanaTres.Sobreescritura;
import PrincipalSemanaCuatro.Polimorfismo;
import PrincipalSemanaCuatro.PolimorfismoHerencia;
import PrincipalSemanaCuatro.Persona;
import java.util.Scanner;




public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Roadmap, Seguimiento del curso");
		System.out.println("1.Semana Uno Y Dos");
		System.out.println("2.Semana Tres");
		System.out.println("3.Semana Cuatro");
		System.out.println("4.Semana Cinco");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			semanaUnoYDos();
			break;
		case 2:
			semanaTres();
			break;
		case 3:
			semanaCuatro();
			break;
		case 4:
			semanaCinco();
			break;
		}
		
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
	public static void semanaCuatro() {
		
		System.out.println("      ");
		System.out.println("---------------------semana Cuatro--------------------------");
		
		Polimorfismo polimorfismo = new EjemploPolimorfismo();
		polimorfismo.mensaje();
		System.out.println("-----------------------------------------------");
		
		Persona persona = new PolimorfismoHerencia("Lucas");
		System.out.println(persona.mostrar());
	}
	
	public static void semanaCinco() {
		
		System.out.println("      ");
		System.out.println("---------------------semana Cinco--------------------------");
		
		RegistroEstudiante rg = new RegistroEstudiante();
	       rg.registrar("Antony");
	       rg.registrar("Antony", "19500");
	       rg.registrar("Antony", "19500", "Sistemas");
	       
	       System.out.println("---------------------Ejemplo 1--------------------------");
	       
	       AhorroCorriente ac = new AhorroCorriente(2700);
	        System.out.println("1-Saldo: " + ac.getSaldo());
	        ac.deposito(500);
	        System.out.println("2-Saldo: " + ac.getSaldo());
	        System.out.println("########################");
	        AhorroSeguro as = new AhorroSeguro(2700);
	        System.out.println("1-Saldo: " + as.getSaldo());
	        as.deposito(500);
	        System.out.println("2-Saldo: " + as.getSaldo());
	}
}
