package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.polimorfismo.models.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero jugador = new Guerrero("Mario Bros");
		Sacerdote enemigo = new Sacerdote("Browser");
		Mago mago = new Mago("Papá pitufo");
		
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador);
		jugadores.add(enemigo);
		jugadores.add(mago);
		
		System.out.println("Comienzo del turno");
		jugadores.forEach(System.out::println);
		
		enemigo.accion(jugador);
		
		jugadores.forEach(p -> p.finalizarTurno());
		
		System.out.println("---------------");
		System.out.println("Fin del turno");
		jugadores.forEach(System.out::println);
		
		//Mostrar los que quedaron vivos con expresiones lambda
		jugadores.stream().filter(per -> per.estaVivo()).forEach(System.out::println);
	}

}
