package HilosMonitores;

public class HiloIncrementar extends Thread {

	private Contador contador;

	public HiloIncrementar(String nombre, Contador c) {
		super(nombre);
		this.contador = c;
	}

	// Método run
	public void run() {
		// Cremaos el bucle para incrementar el contador
		synchronized (contador) { //Cuando uno accede el otro se queda a la espera

			for (int i = 0; i < 300; i++) {
				contador.incrementar();

			}
			System.out.println("En el hilo " + getName() + " el contador vale " + contador.getContador());
		}
	}
}
