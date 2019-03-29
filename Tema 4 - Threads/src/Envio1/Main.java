package Envio1;

public class Main {

	public static void main(String[] args) {

		ThreadPares threadPar = new ThreadPares();
		ThreadImpares threadImpar = new ThreadImpares();

		threadPar.start();
		threadImpar.start();
	}

}