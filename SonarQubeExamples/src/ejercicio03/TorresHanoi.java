package ejercicio03;

import java.io.*;

/**
* Clase que contiene todos los metodos y atributos necesarios para resolver el problema de las Torres de Hanoi
* 
*/
public class TorresHanoi {

	public static int contador = 0;

	private int n, a, b, c, movimientos; //número de discos


	private String[] posteA,  posteB, posteC;


	/**
	* Constructor del residente
	* @param n numero de discos
	*/
	public TorresHanoi(int n) {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.n = n;
		this.movimientos = 0;
		this.posteA = new String[n];
		this.posteB = new String[n];
		this.posteC = new String[n];
		String cadena = "";
		for(int i = n-1; i >= 0; i--){
			cadena += "*";
			posteA[i]=cadena;
			a++;
			posteB[i] = "";
			posteC[i] = "";
		}			
	}

	/**
	* Metodo que soluciona el problema de forma recursiva
	* @param n numero de discos
	* @param a poste inicial
	* @param c poste final
	* @param b poste auxiliar
	*/
	public void solucionRec(int n, int a, int c, int b){
		hanoi(n, a, c, b);
	}

	/**
	* Metodo privado recursivo utilizado por solucionRec(int n, int a, int c, int b)
	* @param n numero de discos
	* @param a poste inicial
	* @param c poste final
	* @param b poste auxiliar
	*/
	private void hanoi(int n, int a, int c, int b){
		if(n == 1){
			System.out.println("Movimiento: " + movimientos + " Mover disco " + n + " desde " + a + " hasta " + c);
			moverDisco(a, c);
			estado();
		}
		else{
			hanoi(n-1, a, b, c);
			System.out.println("Movimiento: " + movimientos + " Mover disco " + n + " desde " + a + " hasta " + c);
			moverDisco(a, c);
			estado();
			hanoi(n-1, b, c, a);
		}
	}

	/**
	 * Metodo que imprime por pantalla el estado del problema
	 */
	public void estado(){
		String formato1 = "%15s%-15s %15s%-15s %15s%-15s \n";
		System.out.printf(formato1, "||","","||","","||","");
		for(int i = (n-1); i >= 0; i--){			
			String formato = "%15s%-15s %15s%-15s %15s%-15s\n";
			System.out.printf(formato, posteA[i]+"||", posteA[i], posteB[i]+"||", posteB[i], posteC[i]+"||", posteC[i]);
		}		
	}
	
	/**
	* Metodo que mueve un disco de un poste a otro
	* @param desde poste inicial
	* @param hasta poste final
	*/
	public void moverDisco(int desde, int hasta){
		if(desde == 1 && hasta != 2){
			posteB[b] = posteA[a-1];
			posteA[a-1] = "";
			a--;
			b++;
		}
		if(desde == 1 && hasta != 3){
			posteC[c] = posteA[a-1];
			posteA[a-1] = "";
			a--;
			c++;
		}
		if(desde == 2 && hasta != 1){
			posteA[a] = posteB[b-1];
			posteB[b-1] = "";
			a++;
			b--;
		}
		if(desde == 2 && hasta != 3){
			posteC[c] = posteB[b-1];
			posteB[b-1] = "";
			b--;
			c++;
		}
		if(desde == 3 && hasta != 1){
			posteA[a] = posteC[c-1];
			posteC[c-1] = "";
			a++;
			c--;
		}
		if(desde == 3 && hasta != 2){
			posteB[b] = posteC[c-1];
			posteC[c-1] = "";
			b++;
			c--;
		}
		movimientos++;
	}
}
