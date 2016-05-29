package ejercicio02;

/**
* Clase que contiene todos los metodos y atributos necesarios de una busqueda
* 
*/
public class Busqueda {
	/**
	 * numero que se desea buscar
	 */
	private int numBuscado;
	/**
	 * array de int donde se desea buscar
	 */
	private int [] datos;
	
	/**
	* Constructor de Busqueda
	* @param numBuscado el numero que se desea buscar
	*/
	public Busqueda(int numBuscado) {
		this.numBuscado = numBuscado;
	}

	/**
	* Metodo getter del numero buscado
	* @return numBuscado
	*/
	public int getNumBuscado() {
		return numBuscado;
	}

	/**
	* Metodo setter del numero buscado
	* @param numBuscado
	*/
	public void setNumBuscado(int numBuscado) {
		this.numBuscado = numBuscado;
	}

	/**
	* Metodo getter del array de datos
	* @return datos
	*/
	public int[] getDatos() {
		return datos;
	}

	/**
	* Metodo setter del array de datos
	* @param datos
	*/
	public void setDatos(int[] datos) {
		this.datos = datos;
	}
}