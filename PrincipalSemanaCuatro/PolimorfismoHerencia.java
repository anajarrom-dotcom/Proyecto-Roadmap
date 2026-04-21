package PrincipalSemanaCuatro;

public class PolimorfismoHerencia extends Persona{

	public PolimorfismoHerencia(String nombre) {
		super(nombre);
	}

	@Override
	public String mostrar() {
		return "Estudian No.1  " + super.mostrar();
}
	}
