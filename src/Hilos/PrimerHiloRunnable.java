package Hilos;
//La creamos sin main y esta implemaenta la interfaz
public class PrimerHiloRunnable implements Runnable {
	
	

	@Override
	public void run() {
		System.out.println("Estamos en el hilo: "+Thread.currentThread().getId());
	}

}
