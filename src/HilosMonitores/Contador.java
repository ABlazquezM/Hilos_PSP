package HilosMonitores;

public class Contador {
	// Clase del objeto que vamos a instaciar y a compartir por los dos hilos
	
	private int contador = 0;
	
	public Contador(int c) {
		this.contador = c;
		}
	
	//Incrementar contador
	public void incrementar() {
		contador++; 
	}
	
	public void decrementar() {
		contador--; 
	}

	public int getContador() {
		return contador;
	}


	
	
}
