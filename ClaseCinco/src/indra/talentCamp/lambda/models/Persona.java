package indra.talentCamp.lambda.models;

public class Persona {
	private String nombre;
	private int centimetrosAltura;
	
	public Persona(String nombre, int centimetrosAltura) {
		super();
		this.nombre = nombre;
		this.setCentimetrosAltura(centimetrosAltura); //doble encapsulamiento
	}

	public int getCentimetrosAltura() {
		return centimetrosAltura;
	}

	public void setCentimetrosAltura(int centimetrosAltura) {
		
		//Uso Error para no estar obligado a capturar la excepcion o poner throws
		if(centimetrosAltura > 300) throw new Error("No puede medir más de 300cm");
		if(centimetrosAltura < 0) throw new Error("No puede medir menos de 0cm");
		//assert(centimetrosAltura < 300); //otra alternativa
		//assert(centimetrosAltura >= 0); //otra alternativa
		
		this.centimetrosAltura = centimetrosAltura;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}
