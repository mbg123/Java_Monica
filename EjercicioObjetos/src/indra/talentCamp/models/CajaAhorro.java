package indra.talentCamp.models;

public class CajaAhorro extends CuentaBancaria{

	
	public CajaAhorro(Cliente cliente) {
		super( cliente);
	}

	@Override
	public void depositar(double cantidad) {
		if(cantidad > 0) {
			Movimiento mov = new Movimiento(cantidad);
			movimientos.add(mov);
		}
		
	}

	@Override
	public void extraer(double cantidad) {
		// TODO Auto-generated method stub
		
	}

	
}
