package ProductorConsumidorPro;

public class Deposito {

	// Primera clase que se crea

	private int deposito;

	private static final int CAPACIDAD = 10;

	public Deposito() {
		// Inicializamos la variable
		this.deposito = 0;
	}

	public int getDeposito() {
		return this.deposito;
	}

	public synchronized void agregar() {
		while (this.deposito == CAPACIDAD) {
			System.out.println("El depósito está lleno, esperando...");
			// Nos quedamos esperando hsta que se desbloquea
			try {
				//Esto sería mas optimo para no llamar al metodo desde la otra clase
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		this.deposito++;
		System.out.println("Agregando producto, total: " + getDeposito());
		notify(); // cuando ponemos un wait y despues siempre un notify

	}

	public synchronized void retirar() {
		while (this.deposito == 0) {
			System.out.println("El dopósito está vacío, esperando...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.deposito--;
		System.out.println("Retiramos productos, total: " + getDeposito());
		notify();
	}

}
