package indra.talentCamp.generics;

//Extends Number para restringir que sea numerico
public abstract class FiguraGenerica<T extends Number> {
	public abstract T calcularArea();
	public abstract T calcularPerimetro();
	
}
