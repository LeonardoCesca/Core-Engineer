package Envio1;

public class ThreadPares extends Thread {

	public void run() {
		try {
			for(int i=0; i<6; i++) {
				System.out.println("Par: " +geraNumero());
				Thread.sleep(500);				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private int geraNumero() {

		int n = (int) (Math.random() * 100);
		int calc = n + (n % 2);

		if( calc == 0) {
			calc = n;
		}
		return calc;
	}
}
