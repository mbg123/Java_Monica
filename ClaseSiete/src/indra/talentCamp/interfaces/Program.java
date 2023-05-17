package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AreaCalculable> dibujo = Arrays.asList(
			new Circulo(10.0),
			new Triangulo(12.0, 15.0, 16.36, 16.36),
			new Rectangulo(10.0, 10.0),
			new Planta());
		
		System.out.println("El area total de mi dibujo es: ");
		System.out.println(dibujo.stream().mapToDouble(fig -> fig.calcularArea()).sum());
		
		//System.out.println("El perimetro total de mi dibujo es: ");
		//System.out.println(dibujo.stream().mapToDouble(fig -> fig.calcularPerimetro()).sum());
		
		
		//Casteo clasico
		/*double  perimetroTotal = 0.0;
		for(AreaCalculable c : dibujo) {
			//antes de hacer el casteo comprobar si es de la instancia que quiero castear
			if(c instanceof Perimetro) {
				//perimetroTotal += ((Perimetro) c).calcularPerimetro();
				perimetroTotal += Perimetro.class.cast(c).calcularPerimetro();
			}
		}*/
		
		//Casteo lambda
		double perimetroTotal = dibujo.stream().filter(Perimetro.class::isInstance)
			.map(Perimetro.class::cast)
			.mapToDouble(p -> p.calcularPerimetro()).sum();
	
		System.out.println("Perimetro total " + perimetroTotal);
		
		
		//Ejemplo de uso de interfaz existente
		List<Figura> figuras = dibujo.stream()
				.filter(Figura.class::isInstance)
				.map(Figura.class::cast).collect(Collectors.toList());
		Collections.sort(figuras);
		figuras.stream().forEach(System.out::println);
		
	}

}
