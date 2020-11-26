package PSP.UD01.progMultiproceso;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		Process p = null;
		
		String comando = "CMD /C DIR";
		
		try {
			p = rt.exec(comando);
			
			//Recogemos el flujo de caracteres y lo convertimos con InputStreamReader
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//Aquí creamos el  archivo donde guardar la salida del comando
			try (BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("ficheros.txt"))){
				
				String linea;
				while ((linea = br.readLine()) != null) {
					filtroEscritura.append(linea);
					filtroEscritura.newLine();
				}
				
				filtroEscritura.close();				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
