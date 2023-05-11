package indra.talentCamp.encapsulamiento;

import java.util.Scanner;
import indra.talentCamp.encapsulamiento.models.*;
import indra.talentCamp.utils.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		try {
			
			//Student student = new Student();
			
			//System.out.println("Nombre: ");
			//String nombre = in.nextLine();
			//student.setName(Consola.readString("Nombre: "));
			
			//System.out.println("Documento: ");
			//int documento = Integer.parseInt(in.nextLine());
			//student.setDocument(Consola.readInt("Documento: "));
			
			//System.out.println("Dirección: ");
			//String direccion = in.nextLine();
			//student.setAddress(Consola.readString("Dirección: "));
			
			//System.out.println("Te gusta el front-end? (S/N)");
			//String respuesta = Consola.readString("Te gusta el front-end? (S/N): ");
			//boolean prefiereFront = (respuesta.equalsIgnoreCase("S"));
			//student.setPreferenceFront(respuesta.equalsIgnoreCase("S"));
			
			System.out.println("Profesor:");
			Teacher teacher = new Teacher(Consola.readString("Nombre: "),
					Consola.readInt("Documento: "),
					Consola.readString("Dirección: "));
			
			System.out.println("Estudiante:");
			Student student = new Student(Consola.readString("Nombre: "),
					Consola.readInt("Documento: "),
					Consola.readString("Dirección: "));
			
			String respuesta = Consola.readString("Te gusta el front-end? (S/N): ");
			student.setPreferenceFront(respuesta.equalsIgnoreCase("S"));
			
			System.out.println("Bienvenido " + student.getName() + " al talent Camp");
			System.out.println("Con documento " + student.getDocument() + " y residencia en " + student.getAddress());
			
			if(student.getPreferenceFront()) {
				System.out.println("Esperemos que tenga un proyecto Front-end");
			} else {
				System.out.println("Esperemos que tenga un proyecto Back-end");
			}
			
			System.out.println(student.toString());
			
		} finally {
			in.close();
		}
		
	}

}
