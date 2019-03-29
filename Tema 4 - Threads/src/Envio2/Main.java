package Envio2;

public interface Main {

	public default int geraNumero() {

		int n = (int) (Math.random() * 100);
		n += (n % 2 == 0 ? 0 : 1); //if ternário :D
		return n;

	}

	public static void main(String[] args) {

		ThreadPares threadPar = new ThreadPares();
		ThreadImpares threadImpar = new ThreadImpares();

		threadPar.start();
		threadImpar.start();
	}

}
