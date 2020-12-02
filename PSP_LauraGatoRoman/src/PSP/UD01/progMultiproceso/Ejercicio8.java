package PSP.UD01.progMultiproceso;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<String> comandos = new ArrayList<String>();
		String comando = "CMD";
		String argumento1 = "/C";
		String argumento2 = "DIR";
		
		//primer proceso que muestra variables de entorno
		ProcessBuilder pb1 = new ProcessBuilder();
		Map<String, String> mapEnv = pb1.environment();
		System.out.println("Mostrando las variables de entorno\n" + mapEnv);
				
		try {
			comandos.add(comando);
			comandos.add(argumento1);
			comandos.add(argumento2);
			
			ProcessBuilder pb2 = new ProcessBuilder(comandos);
			System.out.println("Mostrando la ayuda del comando\n" + pb2.command());
			
			pb2.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
