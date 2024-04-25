/**
 * Prácticas de Metodología de la Programación.
 * Jeroquest - Un ejemplo de Programación orientada a objetos.
 * Programa principal 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @version 1
 *
 */
import java.util.Random;
public class JeroquestTest {
	
	public static boolean Barbaros_vivos (Barbaro[]b) {
		int muertes=0;;
		for(int a=0 ; a<b.length ;a++) {
			if(b[a].estaVivo())	
				return true;
		}
		return false;
	}
	public static boolean Momias_vivos (Momia[]b) {
		int muertes=0;;
		for(int a=0 ; a<b.length ;a++) {
			if(b[a].estaVivo())	
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
	
		
		Momia ramses = new Momia("Ramses");
		Barbaro conan = new Barbaro("Conan");
		
		/*System.out.println(ramses);
		System.out.println(conan);*/
		//Equipos 5vs5
			//Barbaro
			Personaje[]b=new Personaje[4];
			for(int x=0;x<4;x++) {
				b[x]=new Barbaro("Barbaro"+x);
			}
			//Momia
			Personaje[]m=new Personaje[4];
			for(int x=0;x<4;x++) {
				m[x]=new Momia("Momia"+x);
			}
		//Numero Maximo de rondas
			/*int MaxRondas=10;
		while((ramses.estaVivo()&&conan.estaVivo())&& MaxRondas!=0){//Bucle 1vs1
		// conan ataca a ramses
		int impactos = conan.atacar();
		ramses.defender(impactos);
		
		// si ramses esta vivo ataca a conan
		if (ramses.estaVivo())
			conan.defender(ramses.atacar());
			
		System.out.println(ramses);
		System.out.println(conan);
		MaxRondas=MaxRondas-1;
		System.out.printf("Estas en la ronda %d",MaxRondas);
		System.out.println();
		System.out.println();
				
		}//Fin del bucle de guerra
		*/
		int MaxRondas2=10;
		
		
		
	
			}//Fin del Main
		
		
			
}//Fin del Programa

	


