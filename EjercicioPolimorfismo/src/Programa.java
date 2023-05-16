import java.util.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(new Perro());
		animales.add(new Gato());
		animales.add(new Vaca());
		animales.forEach(a -> a.hacerSonido());
	}

}
