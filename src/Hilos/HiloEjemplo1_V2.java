package Hilos;

public class HiloEjemplo1_V2 extends Thread {

	// Esta vez lo hacemos sin main, se ejecutará en otra clase
	// Es el mismo efecto pero

	private int hilo;
	// private int c;

	// Creamos el constructor
	public HiloEjemplo1_V2(int hilo) {
		this.hilo = hilo;
		System.out.println("Creando hilo: " + hilo);
	}

	// Método run
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo --> " + getName() + " C = " + i);
			try {
				//Añadimos como en el ejemplo anterior el sleep
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
