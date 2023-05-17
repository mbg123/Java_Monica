package indra.talentCamp.interfaces;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	
	public Triangulo(double base, double altura, double lado1, double lado2) {
		super();
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.getBase() * this.getAltura()) * 2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.getBase() + this.getLado1() + this.getLado2();
	}
	
}
