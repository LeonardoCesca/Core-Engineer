package Envio2;

public class ThreadImpares extends Thread implements Main {

	public void run() {
		try {
			for(int i=0; i<6; i++) {
				System.out.println("Impar:" +geraNumero());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int geraNumero() {
		int n = (int) (Math.random() * 100);
		n += (n % 2 == 0 ? 1 : 0); //if ternário :D
		return n;

	}
}
