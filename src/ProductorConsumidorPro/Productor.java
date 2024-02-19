package ProductorConsumidorPro;

public class Productor extends Thread{
	
	//Segunda clase creada
	//Instacioanmos la clase compartida
	
	private Deposito deposito;
	
	public Productor(Deposito deposito) {
		this.deposito = deposito;
	}

	public void run() {
		for (int i=0 ; i<20; i++) {
			deposito.agregar();
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
