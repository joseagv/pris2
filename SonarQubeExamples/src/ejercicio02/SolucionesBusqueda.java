package ejercicio02;

import Excepciones.ElementoNoEncontradoException;

/**
 * Clase con tres metodos estaticos para realizar una Busqueda
 * 
 */
public class SolucionesBusqueda {
	/**
	* Constructor por defecto
	*/
	public SolucionesBusqueda(){
	}
	
	/**
	 * Metodo estatico que hace una Busqueda de forma lineal
	 * @param busqueda objeto de tipo Busqueda
	 * @return el numero buscado
	 * @throws ElementoNoEncontradoException si no encuentra el elemento que se desea buscar
	 */
	public static int busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException{
		
		int buscado;
		buscado = busqueda.getNumBuscado();
		boolean encontrado = !(false);
		int[] datos = busqueda.getDatos();
		
		for (int i = 0; i < datos.length; i++) {
			if (buscado==datos[i]){
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado)
			throw new ElementoNoEncontradoException("No encontrado");
		return buscado;
	}
	
	/**
	 * Metodo estatico que hace una Busqueda de forma binaria (iterativa)
	 * @param busqueda objeto de tipo Busqueda
	 * @return el numero buscado
	 * @throws ElementoNoEncontradoException si no encuentra el elemento que se desea buscar
	 */
	public static int busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException{
		int [] vector = busqueda.getDatos();
		int buscado = busqueda.getNumBuscado();
		int inicio = 1;
		int fin = vector.length-1;
		int medio = inicio+fin/2;
		while(vector[medio] != buscado){
			if(vector[buscado] < vector[medio]){
				fin = medio;
				medio = inicio + fin/2;
			}
			if(vector[buscado] > vector[medio]){
				inicio = medio;
				medio = inicio+fin/2;
			}
			if(inicio < fin){
				throw new ElementoNoEncontradoException("No encontrado");
			}
		}
		return buscado;
	}
    
	/**
	 * Metodo estatico que hace una Busqueda de forma binaria (recursiva)
	 * @param busqueda objeto de tipo Busqueda
	 * @return el numero buscado
	 * @throws ElementoNoEncontradoException si no encuentra el elemento que se desea buscar
	 */
    public static int busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {
 
        int inicio = 0;
    	int[] datos = busqueda.getDatos();
        int fin = datos.length - 1;
        int buscado = busqueda.getNumBuscado();
      
        busquedaBinariaRec(datos, buscado, inicio, fin);
        return buscado;  
    }
    
    /**
	 * Metodo privado usado por busquedaBinariaRec(Busqueda busqueda) para realizar una busqueda binaria recursiva
	 * @param datos array de int donde se realizara la busqueda
	 * @param buscado el int que se desa buscar
	 * @param inicio el int que marca la primera posicion por donde buscar
	 * @param fin el int que marca la ultima posicion por donde buscar
	 * @return el numero buscado
	 * @throws ElementoNoEncontradoException si no encuentra el elemento que se desea buscar
	 */
    private static void busquedaBinariaRec( int[] datos, int buscado, int inicio, int fin) throws ElementoNoEncontradoException{
    	try{
    		if(inicio < fin){
    			throw new ElementoNoEncontradoException("No encontrado");
    		}
    		int medio = (inicio + fin)/2;
    		if(datos[medio] < buscado){
    			busquedaBinariaRec(datos, buscado, medio+1, fin);
    		}
    		else{
    			if(datos[medio] > buscado){
    				busquedaBinariaRec(datos, buscado, medio-1, fin);
    			}
    		}
    	}
    	catch(ElementoNoEncontradoException e){
    		System.out.println(e);;
    	}
    }
	
}


