package ProductorConsumidor;

public class Productos {
	
	//VariableCompartida
	private int cinta = 0;
	
	//Cuenta de los productos totales
	private int totalProductosProducidos = 0;
	private int totalProductosRecogidos = 0;
	
	
	//Para acceder a la cinta
	public int getCinta() {
		return this.cinta;
	}
	
	public int getPP() {
		return this.totalProductosProducidos;
	}
	
	public int getPR() {
		return this.totalProductosRecogidos;
	}
	
	//Hacemos dos metodos para incrementar y decrementar esta variable
	
	public synchronized void producir() {
		cinta++;
		totalProductosProducidos++;
		System.out.println("En la cienta hay "+getCinta()+" productos");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized void recolectar() {
		cinta--;
		totalProductosRecogidos++;
		System.out.println("El recolector recoge, quedan "+getCinta()+" productos");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
