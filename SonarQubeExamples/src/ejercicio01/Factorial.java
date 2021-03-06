package ejercicio01;

/**
 * Clase con dos metodos estaticos para calcular el factorial de un numero
 * @
 */
public class Factorial {
	/**
	 * Metodo estatico que calcula el factorial de un numero de forma iterativa
	 * @param n el numero cuyo factorial se quiere calcular
	 * @return el resultado
	 */
	public static int factorialIter(int n){
		int resultado = 1;
		for(int i = 1; i <= n; i++){
			resultado *= i;
		}
		return resultado;
	}
	
	/**
	 * Metodo estatico que calcula el factorial de un numeor de forma recursiva
	 * @param n el numero cuyo factorial se quiere calcular
	 * @return el resultado
	 */
	public static int factorialRec(int n){
		if(n <= 1){
			return 1;
		}
		else{
			return n*factorialRec(n-1);
		}
	}
}
