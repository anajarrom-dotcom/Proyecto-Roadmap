package PrincipalSemanaCinco;

public class AhorroLargoPlazo extends CalculoAhorro{

	public AhorroLargoPlazo(double saldo) {
		super(saldo);
	}

	private final int INTERES = 7;
	
	@Override
    public double calcularInteres(int monto) {
        if(monto > 18000) {
            return super.calcularInteres(this.INTERES);
        } else {
            return super.calcularInteres();
        }
    }
	
	 public double deposito(double monto) {
	        double saldo = this.getSaldo();
	        double interesesCalculados = this.calcularInteres();
	        double total = saldo + interesesCalculados + monto;
	        this.setSaldo(total);
	        return total;    
	    }
}
