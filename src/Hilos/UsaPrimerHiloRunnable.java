package Hilos;

public class UsaPrimerHiloRunnable {

	public static void main(String[] args) {

		// Vamos a crear los hilos, los creamos de 3 formas distintas, pero todas hacen
		// lo mismo, utilziamos la que más nos guste

		// Primer hilo
		PrimerHiloRunnable hilo1 = new PrimerHiloRunnable();
		// Llamamos a la clase thread para iniciar el hilo que acabamos de instaciar, si
		// no, no se ejecutaría
		new Thread(hilo1).start();

		// Segundo hilo
		PrimerHiloRunnable hilo2 = new PrimerHiloRunnable();
		Thread hilo = new Thread(hilo2);
		hilo.start();

		// Tercer hilo
		new Thread(new PrimerHiloRunnable()).start();

	}

}
