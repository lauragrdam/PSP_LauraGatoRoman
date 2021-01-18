package PSP.UD02.progMultihilo.EjemploHilo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea =new Tarea();
		
		tarea.start();
		System.out.println("Yo soy el hilo principal y sigo haciendo mi trabajo");
		System.out.println("Fin del hilo principal");
	}

}
