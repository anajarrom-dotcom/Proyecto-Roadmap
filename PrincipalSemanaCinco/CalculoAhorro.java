package PrincipalSemanaCinco;

public class CalculoAhorro {

	private double saldo;
	private final double INTERES = 5;
	
	public double calcularInteres() {
		return this.saldo * this.INTERES / 100;
	}
	public double calcularInteres(int interesVariable) {
		return this.saldo * interesVariable / 100;
	}
	public CalculoAhorro(double saldo) {
		super();
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
