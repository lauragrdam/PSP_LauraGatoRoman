package PSP.UD01.progMultiproceso;

import java.io.*;
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		ArrayList<String>comandos = new ArrayList<String>();
		String comando = "CMD";
		String argumento1 = "/C";
		String argumento2 = "DIRR";
		
		comandos.add(comando);
		comandos.add(argumento1);
		comandos.add(argumento2);
		
		File fileOutput = new File("salida_ejercicio9.txt");
		File fileError = new File("log_ejercicio9.txt");
		
		try {
			ProcessBuilder pb = new ProcessBuilder(comandos);
			
			pb.redirectOutput(fileOutput);
			pb.redirectError(fileError);
			
			//pb.start();
			
			//Para indicar qué archivo hay que comprobar si hay errores
			Process p = pb.start();
			if(p.waitFor() != 0) {
				System.out.println("Ha ocurrido un error, consulte el archivo 'log_ejercicio9'");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
