package ejercicio03;

import java.io.IOException;

public class PruebaTorresHanoi {
	
	
	public static void main(String[] args)throws IOException{
		int n = 3;
		TorresHanoi torresHanoi = new TorresHanoi(n);
		torresHanoi.solucionRec(n, 1, 3, 2);
	}
	
	public void PruebaTorresHanoi(){
		// TODO
	}

}
