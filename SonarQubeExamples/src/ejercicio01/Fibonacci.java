package ejercicio01;

/**
 * Clase con dos metodos estaticos para el valor de una posición de la sucesion de Fibonacci
 * 
 */
public class Fibonacci {
	/**
	 * Metodo estatico que el valor de una posición dada en la sucesion de Fibonacci de forma iterativa
	 * @param n el numero cuya posicion se quiere calcular
	 * @return el resultado
	 */
	public static int fibonacciIter(int n){
		int resultado = 0;
		int anterior1 = 1;
		int anterior2 = 0;
		if(n == 0){
			resultado = 0;
		}
		if(n == 1){
			resultado = 1;
		}
		else{
			for(int i = 2; i <= n; i++){
				resultado = anterior1 + anterior2;
				anterior2 = anterior1;
				anterior1 = resultado;
			}
		}
		return resultado;
	}
	
	/**
	 * Metodo estatico que el valor de una posición dada en la sucesion de Fibonacci de forma recursiva
	 * @param n el numero cuya posicion se quiere calcular
	 * @return el resultado
	 */
	public static int fibonacciRec(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		else{
			return fibonacciRec(n-1) + fibonacciRec(n-2);
		}
	}
}
