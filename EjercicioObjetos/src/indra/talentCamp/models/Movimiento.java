package indra.talentCamp.models;

import java.time.LocalDate;

public class Movimiento {
	
	private LocalDate fecha;
	private double saldo; //Positivo: deposito --- Negativo:extraccion

	public Movimiento(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Movimiento " + this.fecha + "ha sido de " + this.saldo;
	}
	
}
