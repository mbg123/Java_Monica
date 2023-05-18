package indra.talentCamp.relaciones.composite;

public abstract class OperacionBinaria extends Operacion {
	protected Operacion operandoIzquierda;
	protected Operacion operandoDerecha;
	
	
	public OperacionBinaria(Operacion operandoIzquierda, Operacion operandoDerecha) {
		super();
		this.operandoIzquierda = operandoIzquierda;
		this.operandoDerecha = operandoDerecha;
	}
	
	public OperacionBinaria(double operandoIzquierda, double operandoDerecha) {
		super();
		this.operandoIzquierda = new Valor(operandoIzquierda);
		this.operandoDerecha = new Valor(operandoDerecha);
	}
	
	public OperacionBinaria(double operandoIzquierda, Operacion operandoDerecha) {
		super();
		this.operandoIzquierda = new Valor(operandoIzquierda);
		this.operandoDerecha = operandoDerecha;
	}
	
	public OperacionBinaria(Operacion operandoIzquierda, double operandoDerecha) {
		super();
		this.operandoIzquierda = operandoIzquierda;
		this.operandoDerecha = new Valor(operandoDerecha);
	}
}
