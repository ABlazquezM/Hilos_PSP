package ProductorConsumidorPro;

public class Consumidor extends Thread {

	// Tercera clase creada

	// Instaciamos el objeto compartido
	private Deposito deposito;

	// El constructor siempre debe recibir el objeto compartido
	public Consumidor(Deposito deposito) {
		this.deposito = deposito;
	}

	// Cambiar el for con el while y el booleano con tiempo
	public void run() {
		for (int i = 0; i < 10; i++) {
			deposito.retirar();

			try {
				sleep(100); //Cambiar el sleep de las dos clases a aleatorio.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
