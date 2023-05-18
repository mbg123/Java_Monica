package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.generics.*;

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
		
	

		//Ejemplo de uso con interfaz funcional
		Operacion<Integer> suma = (a,b)->(a+b);
		int res = suma.operar(2, 2);
		System.out.println("Sumar 2 + 2 = " + res);
		
		OperacionInteger sumaInt = (a,b)->(a+b);
		int resInt = sumaInt.operar(2, 2);
		System.out.println("Sumar 2 + 2 = " + resInt);
		
		System.out.println("--------------");
		System.out.println();
		
		//Caja fuerte ejemplo:		
		/*CajaFuerte<String> clave  = new CajaFuerte<>("Abrir");
		clave.guardarValor("La clave del banco");
		
		String claveOk = clave.leerValor("Abrir");
		System.out.println("La clave es " + claveOk);
		
		System.out.println("Intentado acceder a una clave invalida");
	
		try {
			String mal = clave.leerValor("esta no es");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		
		System.out.println("*****");
		*/
		
		//Con numeros
		CajaFuerte<Integer, String> claveInt  = new CajaFuerte<>("Abrir");
		claveInt.guardarValor(1234);
		
		int claveIntOk = claveInt.leerValor("Abrir");
		System.out.println("La clave es " + claveIntOk);
		
		System.out.println("Intentado acceder a una clave invalida");
	
		try {
			int malInt = claveInt.leerValor("esta no es");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		
	}
	
	
}
