package Cajero;

public class SacarDinero extends Thread {

	// Instaciamos cuenta par apoder llamar al método
	private Cuenta cuenta;
	String nombre;

	public SacarDinero(String nombre, Cuenta cuenta) {
		super(nombre);
		// setNombre(nombre) Tambien se puede hacer así
		this.cuenta = cuenta;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			// get Name sacamos el nombre del hilo
			// Se ejecuta el hilo 5 veces, comprueba el saldo y si se puede saca el dinero
			//Le decimos cuanto queremos sacar
			cuenta.comprobarDinero(20, getName());

			//Ponermos el sleep para dejar margen al otro hilo para que acceda al cajero y pueda sacer dinero
			//Podrías poner un sleep aleatorio
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

}

