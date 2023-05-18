package indra.talentCamp.models;

public class CuentaCorriente extends CuentaBancaria {
	
	public CuentaCorriente(String nCuenta, int saldo, Cliente cliente) {
		super(cliente);
	}

	@Override
	public void depositar(double cantidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraer(double cantidad) {
		// TODO Auto-generated method stub
		
	}

}
