package PSP.UD01.progMultiproceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		
		String comando = "CMD /C DIR";
		
		try {
			p = rt.exec(comando);
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
