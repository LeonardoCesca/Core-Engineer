package Envio2;

public class ThreadPares extends Thread implements Main {

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
}

