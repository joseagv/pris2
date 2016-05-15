package pisdos;

import java.util.List;
import java.util.Scanner;

public class Ejercicio3Programa {
	
	private Ejercicio3Programa(){
		//vacio
	}

	public static void main(String[] args) {


		Ejercicio3 ej3 = new Ejercicio3();

		List<Double> listaResultado;
		Scanner leerTeclado = new Scanner(System.in);

		System.out.println("Introducir xizq:");
		double xizq = leerTeclado.nextDouble();
		System.out.println("Introducir xder:");
		double xder = leerTeclado.nextDouble();

		listaResultado = ej3.comprobarRaiz(xizq, xder);

		boolean hayraiz = ej3.hayraiz;

		System.out.println("Valor de xr: " + listaResultado.get(0));

		if (hayraiz) {
			System.out.println("Valor de f(xr): " + listaResultado.get(1));
		}
	}

}