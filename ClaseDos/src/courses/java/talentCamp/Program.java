package courses.java.talentCamp;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;

public class Program {

	public static void cambiarValor(int n) {
		n = 20;
	}
	
	public static void cambiarBase(Rectangulo r) {
		r.base = 33;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esto es la segunda clase");
		
		int number = 10;
		int b = 20;
		
		number = b;
		
		System.out.println(number + " " + b);
		
		Rectangulo r = new Rectangulo();
		r.base = 10;
		r.altura = 20;
		
		Rectangulo r2 = null;
		r2 = new Rectangulo();
		r2.base = 100;
		r2.altura = 40;
		System.out.println(r2.base);
		
		//Cuidado!
		r = r2; // apuntan al mismo lugar de memoria
		r2.base = 55;
		System.out.println("Apuntan al mismo lugar de memoria r:" + r.base + " y r2: " + r2.base);
	
		int a = 555;
		cambiarValor(a);
		System.out.println(a);
		
		r.base = 888;
		cambiarBase(r);
		System.out.println(r.base);
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Marta");
		nombres.add("Luis");
		nombres.add("Pepe");
		nombres.add("María");
		nombres.add("Claudia");
		
		//Ojo no es el que se usa
		String nombreActual = null; //El string es un tipo de dato especial, parece primitivo pero es de referencia
		
		for(int i = 0; i < nombres.size(); i++) {
			nombreActual = nombres.get(i);
			System.out.println(nombreActual);
		}
	}
	


}
