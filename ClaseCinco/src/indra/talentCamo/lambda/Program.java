package indra.talentCamo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.lambda.models.*;

public class Program {

	public static void main(String[] args) {
		//String frase = "Que la fuerza " + "este contigo"; // 3 strings ["que la fuerza", "este contigo", "que la fuerza este contigo"]
		/*
		String frase = "que la fuerza";
		frase += "este";
		frase += "contigo";
		*/
		//Es ineficiente, pq va creando copias en memoria, heap, copiando además tarda más tiempo
		//Para solucionarlo StringBuilder: Permite concatenarlo en el mismo lugar de memoria y en menos tiempo
		/*StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append("este contigo");
		
		System.out.println(builder.toString());
		*/
		
		List<Persona> personas = new ArrayList<Persona>();
		//List<Persona> personas = new LinkedList<Persona>();
		/*personas.add(new Persona("Maria", 163));
		personas.add(new Persona("Pedro", 182));
		personas.add(new Persona("Luisa", 179));
		personas.add(new Persona("Ricardo", 188));*/
		
		List<Persona> personas2 = Arrays.asList(
				new Persona("Maria", 163),
				new Persona("Pedro", 182),
				new Persona("Luisa", 179),
				new Persona("Ricardo", 188)
		);
		
		System.out.println("La lista de personas");
		for(Persona persona : personas2) {
			System.out.println(persona.getNombre());
		}
		
		//Iterando con funciones lambda
		System.out.println("Mostrar con funciones lambda");
		personas2.forEach(persona -> System.out.println(persona.getNombre()));
		
		//Iterando con lambda de una manera más particular... ::
		personas2.forEach(System.out::println);
		
		List<Integer> numeros = Arrays.asList(4, 85, 8, 32, 54, 7);
		/*int max = 0;
		for(int num: numeros){
			//if(num > max) {
			if(Integer.compare(num, max) > 0) {
				max = num;				
			}
		}*/
		
		//Maximo con expresion lambda. .stream te dev todos los metodos relacionados con expresiones lambda excepto foreach
		int max = numeros.stream().max((a, b) -> a-b).orElse(0);
		//int max = numeros.stream().max((a, b) -> a.compareTo(b)).orElse(0);
		//int max = numeros.stream().max((a, b) -> Integer.compare(a, b)).orElse(0);
		
		System.out.println("El maximo es " + max);
		
		//Persona masAlto = personas2.stream().max( (a,b) -> a.getCentimetrosAltura() - b.getCentimetrosAltura()).orElse(null);
		Persona masAlto = personas2.stream().max( Comparator.comparingInt(Persona::getCentimetrosAltura)).orElse(null);
		System.out.println(masAlto);
		
		
		////////////////
		///Sumatoria///
		//////////////
		List<Integer> listaNumeros = Arrays.asList(4, 85, 8, 32, 54, 7);
		/*//Tradicional:
		int suma = 0;
		for(int n : listaNumeros) {
			suma += n;
		}*/
		//con lambda
		//int suma = listaNumeros.stream().mapToInt(n->n).sum();
		//System.out.println(suma);
		
		int sumaAltura = personas2.stream().mapToInt(per -> per.getCentimetrosAltura()).sum();
		int sumaAltura2 = personas2.stream().mapToInt(Persona::getCentimetrosAltura).sum();
		System.out.println(sumaAltura + " " + sumaAltura2);
		
		//media
		int suma = 0;
		for(int n : listaNumeros) {
			suma += n;
		}
		//double media = (double)suma/(double)listaNumeros.size();
		//System.out.println(media);
		
		//lambda
		System.out.format("Media %.2f / ", listaNumeros.stream().mapToDouble(n -> (double)n).average().orElse(0));
		System.out.printf("Media %.2f ", listaNumeros.stream().mapToDouble(n -> (double)n).average().orElse(0));
		System.out.println();
		System.out.printf("Media alturas %.2f / ", personas2.stream().mapToDouble(per -> (double)per.getCentimetrosAltura()).average().orElse(0));
		System.out.printf("Media %.2f", personas2.stream().mapToDouble(Persona::getCentimetrosAltura).average().orElse(0));
		System.out.println();
		
		//Filtrar elementos:
		//numeros.stream().filter(n -> n>10).forEach(System.out::println);
		List<Integer> numerosMayores10 = numeros.stream().filter(n -> n>10).collect(Collectors.toList());
		System.out.println(numerosMayores10);
		
		List<Persona> midenMas100 = personas2.stream().filter(per -> per.getCentimetrosAltura()>100).collect(Collectors.toList());
		System.out.println("Mide más de 1 metro " + midenMas100);
		
		
		////////////////
		//////MAP///////
		////////////////
		numeros.stream().map( n -> n*2).forEach(System.out::println);
		List<Integer> dobles = numeros.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println("dobles " + dobles);
		//convertir lista de personas en una lista de alturas
		List<Integer> alturas = personas2.stream().map(p -> p.getCentimetrosAltura()).collect(Collectors.toList());
		alturas.forEach(System.out::println);
		
		////////////////
		/////REDUCE/////
		////////////////
		int suma2 = numeros.stream().reduce(0, (acumulado, valorActual) -> acumulado + valorActual);
		System.out.println("suma con reduce " + suma2);
		
	};
}
