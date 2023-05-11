package indra.talentCamp.utils;


import java.util.Scanner;

public class Consola {
	private static boolean isNumeric(String numero) {
		//captura de excepciones
		//devuelve si es un numero o no

		try {
			Integer.parseInt(numero);
			return true;
			
		} catch(NumberFormatException e ) {
			return false;
		}
			
	}
	
	public static int readInt() {
		//lee un numero de la entrada estandar
		// si el usuario ingresa otra cosa que no sea numero
		//se le vuelve a preguntar
		//while...
		
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa un numero");

		String entrada = in.nextLine();
		while(!isNumeric(entrada)) {
			System.out.println("ingresa un numero");
			entrada = in.nextLine();
		}
		
		
		return Integer.valueOf(entrada);
	}
	
	public static int readInt(String prompt) { //sobrecarga
		//lee un numero de la entrada estandar
		// si el usuario ingresa otra cosa que no sea numero
		//se le vuelve a preguntar
		//while...
		
		Scanner in = new Scanner(System.in);
		System.out.println(prompt);

		String entrada = in.nextLine();
		while(!isNumeric(entrada)) {
			System.out.println(prompt);
			entrada = in.nextLine();
		}
		
		
		return Integer.valueOf(entrada);
	}
	
	public static String readString(String prompt) {
		Scanner in = new Scanner(System.in);
		
		String entrada = "";
		
		do {
			System.out.println(prompt);
			entrada = in.nextLine();
		} while(entrada.length() == 0);
		
		return entrada;
	}

}