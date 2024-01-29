package HilosSemaforos;

import java.util.concurrent.Semaphore;

public class PartidoResuelto extends Thread{
	
	//Primero declaramos el semaforo
	private Semaphore semaforo;

	//Creamos el contrusctor
	public PartidoResuelto(String nombre, Semaphore semaforo) {
		super(nombre);
		this.semaforo = semaforo;
	}
	
	//Creamos la funcion
	public void run() {
		try {
			semaforo.acquire(); //Decrementa en 1 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El partido "+getName()+" se está jugando");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Una vez que ha terminado el portido hacemos release()
		System.out.println("Ha terminado el partido "+getName());
		semaforo.release();
	}
	

}
