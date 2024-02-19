package MonitoresParque;

public class Torno extends Thread{
	
	//Es la segunda clase que creamos, va a ejecutar el codigo de los hilos
	
	//Necesitamos la clase parque para poder incrementar el contador de visitas
	private Parque parque;
	
	//añadimos una booleana que 
	private boolean continua = true;
	
	//Cantidad por cada puerta, inidivicual pro torno
		private int cuenta = 0;
	
	//Le pasamos el parque (la comertida) y La puerta por la que vamos a acceder
	public Torno (Parque parque, String numeroTorno) {
		super(numeroTorno);
		this.parque = parque;
	}
	
	public void parar() {
		continua = false;
	}
	
	//Llamamos al método compartido para incrementar el número de visitantes
	public void run() {
		while(continua) {
			parque.sumar();
			System.out.println("El visitante"+parque.getCuenta()+" a pasado por el tonor "+getName());
			cuenta++;
		}
		
		System.out.println("Total visitantes por "+getName()+": "+cuenta);
		
	}

}
