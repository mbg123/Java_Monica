package indra.talentCamp.relaciones.composite;

public class Multiplicacion extends OperacionBinaria {

	public Multiplicacion(Operacion operandoIzquierda, Operacion operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}

	public Multiplicacion(double operandoIzquierda, double operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	
	public Multiplicacion(double operandoIzquierda, Operacion operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	
	public Multiplicacion(Operacion operandoIzquierda, double operandoDerecha) {
		super(operandoIzquierda, operandoDerecha);
	}
	
	@Override
	public double calcular() {
		return this.operandoIzquierda.calcular() * this.operandoDerecha.calcular();
	}
	
	
	
}
