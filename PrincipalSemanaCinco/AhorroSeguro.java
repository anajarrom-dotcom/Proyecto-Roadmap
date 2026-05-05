package PrincipalSemanaCinco;

public class AhorroSeguro extends CalculoAhorro{

	 public AhorroSeguro(double saldo) {
		super(saldo);
	}

	 private final double INTERES = 4;
	 
	 @Override
	    public double calcularInteres() {
	         return this.getSaldo() * this.INTERES / 100;
	    }
	 
	 public double deposito(double monto) {
	        double saldo = this.getSaldo();
	        double interesesCalculados = this.calcularInteres();
	        double total = saldo + interesesCalculados + monto;
	        this.setSaldo(total);
	        return total;    
	    }
	 
	 public double deposito(double monto, int comision) {
	        double saldo = this.getSaldo();
	        double interesesCalculados = this.calcularInteres();
	        double total = saldo + interesesCalculados + monto;
	        total = total + total * comision / 100;
	        this.setSaldo(total);
	        return total;    
	    }
}
