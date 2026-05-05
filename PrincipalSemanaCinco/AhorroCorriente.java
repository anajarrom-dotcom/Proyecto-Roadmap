package PrincipalSemanaCinco;

public class AhorroCorriente extends CalculoAhorro{

	public AhorroCorriente(double saldo) {
		super(saldo);
	}

	public double deposito(double monto) {
		double saldo = this.getSaldo();
		double interesesCalculados = this.calcularInteres();
		double total = saldo + interesesCalculados + monto;
		return total;
	}
	
}
