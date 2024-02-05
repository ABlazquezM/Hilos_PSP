package BloqueoHilos_monitores;

////Clse con el código que va a ejecutar cada uno de los hilos

//Sincronizamos la parte donde estamos 

public class HiloCadena extends Thread {

	private ObjetoCompartido objetoCompartido;
	String cadena;

	public HiloCadena(ObjetoCompartido objeto, String cadena) {
		objetoCompartido = objeto;
		this.cadena = cadena;
	}

	public void run() {

		synchronized (objetoCompartido) {

			for (int i = 0; i < 10; i++) {
				objetoCompartido.escribeCadena(cadena);
				// en el momento que terminarmos notificamos que ya hemos terminado de usar el
				// objeto

				objetoCompartido.notify();

				try {
					objetoCompartido.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("He terminado de ejecutar el hilo: "+getName());
			objetoCompartido.notify();
		}

	}
} // Vamos a bloquear el hilo de forma que cuando muestra la cadeana.. vastaria
	// con añadir dentro del for