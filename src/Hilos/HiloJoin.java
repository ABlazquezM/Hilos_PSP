package Hilos;

public class HiloJoin extends Thread {

	private int n;

	// Constructor
	// n = Numero de veces que se ejecuta diciendo la info del hilo
	public HiloJoin(String nombre, int n) {
		// Se pasa la variable con el nombre del hilo
		super(nombre);
		this.n = n;
	}

	public void run() {
		// El bucle se ejecuta el numero de veces que le pasemos
		for (int i = 0; i < n; i++) {
			System.out.println("Hilo " + getName() + ": " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
			
			
		}

		System.out.println("Bucle de " + getName() + " finalizado");
		
	}

	public static void main(String[] args) {

		// Creacion de hilos
		HiloJoin Hj1 = new HiloJoin("Hilo_1", 2);
		HiloJoin Hj2 = new HiloJoin("Hilo_2", 5);
		HiloJoin Hj3 = new HiloJoin("Hilo_3", 7);

		// Inicio de los hilos
		Hj1.start();
		Hj2.start();
		Hj3.start();
		
		//Lanza los tres hilos y se itera el número de veces que les hemos mandado a cada uno
		
		
		try {
			//Se aplica el join a los hilos desde el main, de este modo espera a que termine su ejecucion para finalizar el main
			Hj1.join();
			Hj2.join();
			Hj3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");
		

	}

}
