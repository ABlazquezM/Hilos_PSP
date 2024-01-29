package HilosMonitores;

public class Compartir {

	public static void main(String[] args) {
		
		Contador contador = new Contador(100);
		
		HiloIncrementar incrementar = new HiloIncrementar("Incrementar", contador);
		HiloDecrementar decrementar = new HiloDecrementar("Decrementar", contador);
		
		decrementar.start();
		incrementar.start();
		

	}

}
