package indra.talentCamp.generics;

public class RectanguloInteger extends FiguraGenerica<Integer> {
	private int base;
	private int altura;
	

	public RectanguloInteger(int base, int altura) {
		super();
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public Integer calcularArea() {
		// TODO Auto-generated method stub
		return this.base * this.altura;
	}

	@Override
	public Integer calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.base * 2 + this.altura * 2;
	}
	
	
}
