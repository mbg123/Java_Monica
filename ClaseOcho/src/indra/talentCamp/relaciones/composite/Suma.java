package indra.talentCamp.relaciones.composite;

public class Suma extends OperacionBinaria {

	public Suma(Operacion operandoIzquierda, Operacion operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	public Suma(double operandoIzquierda, double operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	public Suma(double operandoIzquierda, Operacion operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	public Suma(Operacion operandoIzquierda, double operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	@Override
	public double calcular() {
		return this.operandoIzquierda.calcular() + this.operandoDerecha.calcular();
	}

	
}
