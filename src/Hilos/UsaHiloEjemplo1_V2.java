package Hilos;

public class UsaHiloEjemplo1_V2 {

	// Para poder ejecutarlo creamos otra clase con el método main

	public static void main(String[] args) {

		// Instancioamos
		HiloEjemplo1_V2 h = null;

		// Vamos a hacer un bucle para ejecutar 3 hilos
		for (int i = 1; i < 4; i++) { // Para que i no sea 0
			h = new HiloEjemplo1_V2(i);
			h.start();
		}

		System.out.println("\n3 Hilos iniciados...\n");

	}

}


//En este ejemplo no pasamos nombre, y vemos que java lo pone por defecto: Thread-0, Tread-2 ...

