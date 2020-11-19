package PSP.UD01.progMultiproceso;

import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		try {
			//En windows tienes que poner la ruta donde se encuentra el .exe
			rt.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
