import java.util.*;
import java.util.stream.Collectors;


public class Program {
	public static void main(String[] args) {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Pepe", 80));
		estudiantes.add( new Estudiante("Ricardo", 60));
		estudiantes.add( new Estudiante("Marta", 97));
		
		//Lista de estudiante con propiedades de nombre y calificacion
		//Obtener todos los estudiantes con calificacion superior a 90
		System.out.println(estudiantes.stream().filter(e -> e.getCalificacion() > 90).collect(Collectors.toList()));
		
		//Dado un arreglo de enteros, utiliza una expresion lambda para encontrar el numero mas grande
		Estudiante masAlto = estudiantes.stream().max( Comparator.comparingInt(Estudiante::getCalificacion)).orElse(null);
		//Otra forma: (lo hago con numeros que se ve mas claro)
		List<Integer> lista = new ArrayList<>();/////...
		lista.stream().max((a,b)->(a-b)).orElse(0);
		System.out.println(masAlto.getCalificacion());
		
		//3forma reduce:
		//int max = lista.stream().reduce(<valor inicial>, <expresion lambda(valorAcumulado, valorActual) >)
		int max = lista.stream().reduce(0, (a,b)->Math.max(a, b));
		//traza. valor inicial=0; v={1,2,1}
		//(0,1) = 1
		//(1,2) = 2
		//(2,1) = 2
		
		//Dada una lista de numeros obtener la suma de todos los numeros pares
		System.out.println(estudiantes.stream().filter(e -> e.getCalificacion()%2 == 0).mapToInt(e -> e.getCalificacion()).sum());
		//numeros.stream().filter(n-> n%2).reduce(0, (a,b)-> a+b)
		
		
		//dada una lista de objetos producto con propiedades de nombre y precio, utiliza una expresion lamda para obtener el producto mas caro
		//productos.strean().max( (a,b) -> a.getPrecio() - b.getPrecio()).orElse(0);
	}
}
