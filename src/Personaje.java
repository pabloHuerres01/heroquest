/**
 * Pr�cticas de Metodolog�a de la Programaci�n.
 * Jeroquest - Un ejemplo de Programaci�n orientada a objetos.
 * Clase Personaje 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @version 1
 * 
 */

public abstract class Personaje {
	// atributos actuales del personaje
	protected int mueve; // unidades de movimiento por turno
	protected int ataque; // total dados de ataque
	protected int defensa; // total dados de defensa
	protected int cuerpo; // puntos  de vida
	protected String nombre; // nombre del personaje
	

	
/**
 * Crea un personaje a partir de su nombre,
 * inicialmente su posici�n es nula (fuera del tablero)
 * @param suNombre nombre del personaje
 */

	/**
	 * Crea un personaje a partir de su nombre y sus atributos iniciales
	 * @param suNombre el nombre
	 * @param suMovimiento numero de casillas que mueve por turno
	 * @param suAtaque numero de dados a lanzar en un ataque
	 * @param suDefensa numero de dados a lanzar al defenderse
	 * @param suCuerpo puntos de vida iniciales
	 */
	public Personaje(String suNombre, int suMovimiento, int suAtaque, int suDefensa,int suCuerpo) {
		nombre = suNombre;
		mueve = suMovimiento;
		ataque = suAtaque;
		defensa = suDefensa;
		cuerpo = suCuerpo;

}

	/**
	 * Obt�n las unidades de movimiento por turno
	 * (observador)
	 * @return unidades de movimiento del personaje
	 */
	public int getMueve() {
		return mueve;
	}

	/**
	 * Obt�n los dados de ataque
	 * @return dados de ataque del personaje
	 */
	public int getAtaque() {
		return ataque;
	}

	/**
	 * Obt�n los dados de defensa
	 * @return dados de defensa del personaje
	 */
	public int getDefensa() {
		return defensa;
	}

	/** 
	 * Obt�n los puntos de vida 
	 * @return puntos de vida del personaje
	 */
	public int getCuerpo() {
		return cuerpo;
	}

	/**
	 * Obt�n el nombre 
	 * @return el nombre del personaje 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Comprueba si al personaje le queda alg�n punto de vida
	 * @return cierto si est� vivo, falso en otro caso
	 */
	public boolean estaVivo() {
		return cuerpo > 0;
	}

	/** 
	 * Calcula un ataque del personaje calculando el n�mero de impactos,
	 * para ello tira tantos dados como su propiedad ataque indique
	 * @return el n�mero de impactos del personaje
	 */
	public int atacar() {
		int impactos = 0;
		for (int x = 0; x < ataque; x++)
			if (Dado.tira() > 3)
				impactos++;
		return impactos;
	}


	/** 
	 * El personaje se defiende de un ataque
	 * (m�todo abstracto: cada subclase definir� su comportamiento propio)
	 * @param impactos el total de impactos que tiene que intentar detener o sufrir
	 * @return el numero de heridas sufridas
	 */
	public abstract int defender(int impactos);

	/** 
	 * Genera la versi�n String imprimible del objeto
	 *  (M�todo reescrito)
	 * @return La versi�n como String imprimible del personaje 
	 */
	@Override
	public String toString() {
		return String
				.format("%s (mueve:%d ataque:%d defensa:%d cuerpo:%d)",
						getNombre(), getMueve(), getAtaque(), getDefensa(),
						getCuerpo());
	}

}
