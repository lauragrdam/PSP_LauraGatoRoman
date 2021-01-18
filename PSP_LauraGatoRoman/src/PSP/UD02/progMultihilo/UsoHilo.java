package PSP.UD02.progMultihilo;

public class UsoHilo {

	public static void main(String[] args){
		
		HiloSimple hs = new HiloSimple();
		
		hs.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Fuera del hilo...");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
