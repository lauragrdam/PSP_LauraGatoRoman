package PSP.UD01.progMultiproceso;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		String comando = "CMD /C DIRRRRR";
		int error = 0;
		
		try {
			p = rt.exec(comando);
			error = p.waitFor();
		} catch (Exception e) {
			e.getMessage();
		}

			System.out.println("El resultado de la ejecución es " + error);
	}

}
