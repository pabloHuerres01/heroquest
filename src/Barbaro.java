/**
 * Pr�cticas de Metodolog�a de la Programaci�n.
 * Jeroquest - Un ejemplo de Programaci�n orientada a objetos.
 * Clase Barbaro 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @version 1
 * 
 */

public class Barbaro extends Personaje {
	// valores iniciales de los atributos
	protected static final int MOVIMIENTO = 7;
	protected static final int ATAQUE = 1;
	protected static final int DEFENSA = 2;
	protected static final int CUERPO = 8;

	/**
	 * Crea un b�rbaro a partir de su nombre
	 * @param suNombre nombre del b�rbaro
	 */
	public Barbaro(String suNombre)
	{
		// fijamos los atributos con los valores iniciales
		super(suNombre, MOVIMIENTO, ATAQUE, DEFENSA, CUERPO);
	}
	
	/** 
	 * El b�rbaro se defiende de un ataque
	 * (Implementaci�n de m�todo abstracto heredado)
	 * @param impactos el total de impactos que tiene que intentar bloquear y sino sufrir
	 * @return el numero de heridas sufridas
	 */
	public int defender(int impactos)
	{
		// se tratan de bloquear los impactos con la defensa
		for(int totalDadosDefensa = defensa; (impactos > 0) && (totalDadosDefensa > 0);
		totalDadosDefensa--)
			if (Dado.tira() > 4) // se necesita un 5 o 6 para detener un impacto
				impactos --;
		
		// si hay algun impacto se resta de la vida
		if(impactos > 0)
		{
			// la vida de un personaje no puede ser menor que cero
			cuerpo = Math.max(0, cuerpo - impactos);
			System.out.printf("El b�rbaro " + this.getNombre() + " no puede bloquear %d impactos%s", impactos,
					(estaVivo() ? "\n" : " y se muere\n"));
		}
		else
		{
			System.out.printf("El b�rbaro bloquea totalmente el ataque\n");
		}
		
		return impactos;
	}
	
	
	/** 
	 * Genera la versi�n String imprimible del objeto
	 *  (M�todo reescrito)
	 * @return La versi�n como String imprimible del barbaro
	 */
	public String toString()
	{
		return String.format("El b�rbaro: %s", super.toString());
	}

}
