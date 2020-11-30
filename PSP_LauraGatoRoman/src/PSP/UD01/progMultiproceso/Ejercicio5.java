package PSP.UD01.progMultiproceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		String comando = "CMD /C DIRRR";
		int status = 0;
		BufferedReader br = null;
		String linea = null;
		
		try {
			p = rt.exec(comando);
			status = p.waitFor();
			
			//Para que podamos leer el error, es necesario crear un BufferedReader y pasarle la informacion de ImputStreamReader
			//Aquí guardamos el error del comando en un InputStream
			InputStream error = p.getErrorStream();
			
			//Recuerda que sin el conversor(InputStreamReader) no puedes pasar InputStream a BufferedReader
			br = new BufferedReader(new InputStreamReader(error));
			
			System.out.println("La ejecución del comando ha resultado: " + status +"\nLa salida ha sido: ");
		
			//Leemos línea a línea el flujo de lectura y lo añadimos a un string para imprimirlo
			linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
