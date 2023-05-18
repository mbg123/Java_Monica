package indra.talentCamp.models;

import java.util.*;

public abstract class CuentaBancaria {
	
	private int numCuenta;
	protected List<Movimiento> movimientos = new ArrayList<Movimiento>();
	private Cliente cliente;
	
	
	
	public CuentaBancaria(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public double getSaldo() {
		throw new Error("Not Implemented");
	}
	
	public abstract void depositar(double cantidad);
	public abstract void extraer(double cantidad);
	
}
