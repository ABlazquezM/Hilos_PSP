package Hilos;

//Se crean 3 hilos en el main

//Cada hilo muestra un mensaje del hilo (thread) que se está ejecuntando.

public class HilosEjemplo1 extends Thread {

	// Creamos el constructor (con supreclass)
	// Le vamos a pasar como parámetro el nombre del hilo, si no se pasa->
	// Java asingna un nombre automáticamente (Therad-0, Thread-1... Thread-n)
	public HilosEjemplo1(String nombre) {
		super(nombre);
		System.out.println("Creando  hilo: " + getName());
		// Ponemos el syso en el constructor para que al crearse se imprima
	}

	// Vamos a crear el método, este tíene el código que se va a ejecutar de cada
	// hilo
	public void run() { // Este método se hereda de la clase Thread

		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo --> " + getName() + " C = " + i);
			
			try {
				//Vamos a usar un metodo de la clase thread que pausa, interrumpe un hilo
				sleep(1000); //Se está pasando 1 segundo
				//Si lo paro, la cpu le da paso a otro proceso
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		// Vamos a crear los Hilos:
		HilosEjemplo1 h1 = new HilosEjemplo1("Hilo 1");
		HilosEjemplo1 h2 = new HilosEjemplo1("Hilo 2");
		HilosEjemplo1 h3 = new HilosEjemplo1("Hilo 3");

		// Para ejecutar los hilos
		//Cuando se instacia se ejecuta el método run
		h1.start();
		h2.start();
		h3.start();

		System.out.println("\n3 Hilos iniciados...\n");
		//Los hilos se ejecutan como le parece a la cpu, es quien elige

	}

	//Vamos a usar un metodo de la clase thread que pausa, interrumpe un hilo
}
