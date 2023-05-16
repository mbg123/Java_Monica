package indra.talentCamp.polimorfismo.models;

//no se instancia, es una clase para que sea heredada, es un concepto el cual es abstracto, 

public abstract class Jugador {
	private String nombre;
	private int hp;
	private int fuerza;
	private int destreza;
	protected int modFuerza;
	//Temporal
	//private int tipoJugador = 1; //1 = Guerrero, 2 = Sacerdote, 3 = Mago

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.hp = 50;
		this.fuerza = 50;
		this.destreza = 50;
		this.modFuerza = 0;
		//this.tipoJugador = tipo;
	}
	
	public boolean estaVivo() {
		return (hp>0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	
	public abstract void accion(Jugador enemigo);
	
	/*public void accion(Jugador enemigo) {
		
		if(tipoJugador==1 ) {
			enemigo.setHp(enemigo.getHp() - this.getFuerza());
		} else if(tipoJugador == 2) {
			enemigo.setHp(enemigo.getHp() + this.getDestreza());
		} else if(tipoJugador == 3) {
			enemigo.setFuerza(enemigo.getFuerza() + this.getDestreza());
		}
	}*/
	
	@Override
	 public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nuestro personaje %s, llamado %s \n Tiene vida: %d \n Tiene una destreza: %d \n Tiene fuerza : %d"  ,
                this.getClass().getSimpleName(),
                this.nombre,
                this.hp,
                this.destreza,
                this.fuerza);
    }
	
	public void finalizarTurno() {
		//vuelve los stats de fuerza y destreza
		this.modFuerza = 0;
	}

	protected void setModFuerza(int modFuerza) {
		this.modFuerza = modFuerza;
	}
}
