package MonitoresParque;

public class Parque {

	//Primero creamos esta clase, la clase compartida
	
	private int cuenta = 0; //variable donde vamos a almacenar los visitantes (se incrementará)
	
	public int getCuenta() { //añadimos el getter para acceder
		return this.cuenta;
	}
	
	//Metodo que incremente uno por uno los visitantes, es el que hay que sincronizar	
	public synchronized void sumar() {
		cuenta++;
		System.out.println("Visitante numero"+getCuenta()+" ha entrado en el parque");
		//Para simular la espera
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
