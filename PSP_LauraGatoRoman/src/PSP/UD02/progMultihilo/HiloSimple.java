package PSP.UD02.progMultihilo;

public class HiloSimple extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("En el hilo...");
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
