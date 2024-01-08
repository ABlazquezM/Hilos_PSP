package Hilos;

public class HiloInterrumpido extends Thread {
	//Cualquier hilo que hazamos iniciado anteriormente se puede interrumpir con interrup, metodo proporcionado por la clase thread

	public void run() {
		//Vamos a ejecutar un único hilo, y lo vamos a tinterrumpir
		try {
		while(!isInterrupted()) {
			
			System.out.println("Estamos en el hilo");
				sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("Ha ocurrido una excepción");

			}
			
		//Una vez que haya finalizado el hilo:
		System.out.println("Hilo finalizado");
	}
	
	
	public static void main(String[] args) {
		
		//Creamos el hilo
		HiloInterrumpido H1 = new HiloInterrumpido();
		
		//Lo iniciamos
		H1.start();
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Se interrumpe la suspensión del hilo en ejecución");
		}
		H1.interrupt();

	}

}

