import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import indra.utils.Consola;

public class ProgramDos {
	
	public static void ejemploBufferedReaderWithThrows() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar nombre2: ");
			String nombre = reader.readLine();
	
			System.out.println("Ingresar edad2: ");			
			int edad = Integer.parseInt(reader.readLine());
			
			System.out.println("Hola " + nombre + " con edad " + edad);
			
			
		
			
		} finally {
			System.out.println("Cerrando el buffer");
			reader.close();
			
		}
	}
	
	public static void ejemploBufferedReaderWithoutThrows(){
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			try {
				System.out.println("Ingresar nombre2: ");
				String nombre = reader.readLine();
		
				System.out.println("Ingresar edad2: ");			
				int edad = Integer.parseInt(reader.readLine());
				
				System.out.println("Hola " + nombre + " con edad " + edad);
				
			} catch (Exception e) {
				System.err.println("Error " + e.getMessage());
			}
		
			
		} finally {
			System.out.println("Cerrando el buffer");
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void ejemploScanner() {
		try (Scanner in = new Scanner(System.in)) { //ES lo mismo que un try finally con un close

			System.out.println("Su nombre es...");
			String nombre = in.nextLine();
			System.out.println("Su edad es...");
			int edad = in.nextInt();
			System.out.println("Tu nombre es " + nombre + " con edad " + edad);	
		}// solito hace el close
	}
	
	
	public static void main(String[] args) throws IOException{
		/*try {
			ProgramDos.ejemploBufferedReaderWithThrows();
			ProgramDos.ejemploBufferedReaderWithoutThrows();
			
		} catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}*/
		
		
		/*
		
		Scanner in = new Scanner(System.in);
		System.out.println("Numero: ");
		
		boolean resp = isNumeric(in.nextLine());
		System.out.println(resp);
		
		if(isNumeric(in.nextLine())) {
			System.out.println("Es correcto, introduciste un número");
		} else {
			System.out.println("No es un número");
			
		}
		
		in.close(); //una vez se cierra el scanner se cierra la entrada estandar, por lo que aunque se cree otro no va a leer la siguiente línea
		in = new Scanner(System.in);
		in.nextLine();
		
		*/
		 
		//int n = Consola.readInt("Ingresar un numero -> ");
		//System.out.println("Es..." + n);
		
		/*Random r = new Random();
		for(int i = 0; i < 100; i++) {
			int azar = r.nextLine(i, 100);
		}*/
		
		//adivinaNumero2();
		esPrimo();
	}
	
	public static void adivinaNumero() {
		double value = Math.round(Math.random());
		
		Double newData = new Double(value);
		int random = newData.intValue();
	
		boolean adivina = false;
		int intentos = 5;
		
		while(!adivina && intentos <= 5) {
			int num = Consola.readInt("Elige un numero: ");
			if(num == random) {
				adivina  = true;
			}
			intentos--;
		}
	}

	static final int CANTIDAD_OPORTUNIDADES = 5;
	static final int MAX_VALUE = 100;
	
	public static void adivinaNumero2() {
		Random r = new Random();
		int secreto = r.nextInt(1, MAX_VALUE);
		boolean adivino = false;
		int turnoActual = 1;
		
		while(!adivino && turnoActual <= CANTIDAD_OPORTUNIDADES) {
			int adivinanza = Consola.readInt("Ingrese numero");
			if(adivinanza < secreto ) {
				System.out.println("El número es mayor");
			} else if(adivinanza > secreto) {
				System.out.println("El número es menor");
			} else {
				System.out.println("Lo has adivinado!!");
				adivino = true;
			}
			turnoActual++;
		}
		
		if(!adivino) {
			System.out.println("Oh! No has podido adivinarlo");
		}
	}

	public static void esPrimo() {
		int numero = Consola.readInt("Ingrese numero");
		boolean esPrimo = false;
		
		for(int i = 2; i < numero/2 ; i++) {
			
			if(numero % i == 0) {
				esPrimo = false;
			} 
		}
		
		if(esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}

}
