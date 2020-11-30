package PSP.UD01.progMultiproceso;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Process p = null;
		//La clase PB funciona con arraylist
		List<String> comandos = new ArrayList<String>();
		String comando = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		String parametro = "https://www.youtube.com/watch?v=0lapF4DQPKQ";
		
		try {
			//Añadimos el comando y el parametro al arraylist
			comandos.add(comando);
			comandos.add(parametro);
			//le pasamos el arraylista al PB
			ProcessBuilder pb = new ProcessBuilder(comandos);
			
			//Con el método start arranca el proceso
			p = pb.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
