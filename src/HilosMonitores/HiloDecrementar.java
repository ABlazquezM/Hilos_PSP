package HilosMonitores;

public class HiloDecrementar extends Thread {

	private Contador contador;

	// El contructor recibe el nombre y el objeto compartido
	public HiloDecrementar(String nombre, Contador c) {
		super(nombre);
		this.contador = c;
	}

	public void run() {
		// Contador que decrementa el contador
		synchronized (contador) {

			for (int i = 0; i < 300; i++) {
				contador.decrementar();

			}
			System.out.println("En el hilo " + getName() + " el contador vale " + contador.getContador());
		}
	}

}
