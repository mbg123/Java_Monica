package indra.talentCamp.polimorfismo.models;

public class Mago extends Jugador {
	
	private int poderMagico;
	private int mana;
	
	public Mago(String nombre) {
		super(nombre);
		this.poderMagico = 10;
		this.mana = 100;
	}

	@Override 
	public void accion(Jugador enemigo) {
		System.out.format("%s tira un hechizo a %s y mofica su stats",
				this.getNombre(),
				enemigo.getNombre());
		System.out.println();
		
		if(this.mana > this.poderMagico) {
			enemigo.setModFuerza(-this.poderMagico);
			this.mana -= this.poderMagico;
		}
	}
	
	@Override
	public void finalizarTurno() {
		//Este es otro escenari donde en vez de reemplazar el comportamiento, lo extiendo
		super.finalizarTurno();
		this.mana =+ 1;
	}
}
