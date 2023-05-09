import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
		try {
			
			System.out.println("Ingresar nombre: ");
			String nombre = reader.readLine();

			System.out.println("Ingresar edad: ");			
			int edad = Integer.parseInt(reader.readLine());
			
			System.out.println("Hola " + nombre + " con edad " + edad);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
