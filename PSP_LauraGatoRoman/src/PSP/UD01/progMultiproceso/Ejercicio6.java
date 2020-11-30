package PSP.UD01.progMultiproceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		String comando = "CMD /C DIRRR";
		int status;
		String linea;
		
		try {
			p = rt.exec(comando);
			status = p.waitFor();
			
			//Guardar el error en InputStream
			InputStream error = p.getErrorStream();
			
			//Metemos en un flujo de lectura el error convertido ya
			BufferedReader br = new BufferedReader(new InputStreamReader(error));
			//Necesitamos un flujo de escritura para escribir en el fichero
			BufferedWriter bw = new BufferedWriter(new FileWriter("errorComando.txt"));
			
			//Escribe línea línea en el fichero
			linea = br.readLine();
			while (linea != null) {
				bw.write(linea);
				linea = br.readLine();
				
			}
			
			bw.close();
			br.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
