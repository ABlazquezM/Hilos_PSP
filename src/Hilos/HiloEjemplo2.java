package Hilos;

public class HiloEjemplo2 extends Thread {

	public void run() {
		// Como obtener información de los hilos que estamos ejecutando
		System.out.println("Dentro del hilo: " + Thread.currentThread().getName()); // Es lo mismo mas o menos, nos
																					// aseguramos que nos muestra la
																					// info del hilo actual con
																					// Threas.curr..
		System.out.println("Prioridad: " + Thread.currentThread().getPriority());
		System.out.println("Indetificador: " + Thread.currentThread().getId());
		System.out.println("Hilos Activos: " + Thread.currentThread().activeCount());
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("Principal");
		System.out.println("Nombre: " + Thread.currentThread().getName());
		System.out.println("Nombre: " + Thread.currentThread().toString()); //Devuelve: Nombre, prioridad y grupo de hilos

		HiloEjemplo2 h = null;

		// Para ejecutarlos
		for (int i = 0; i < 3; i++) {
			// Creamos el hilo
			h = new HiloEjemplo2();
			// Vamos a cambiar el nombre, le asignamos uno
			h.setName("Hilo " + i);
			// Vamos a asignar prioridad al hilo
			h.setPriority(i + 1);
			// Una vez hemos seteados estos datos, iniciamos el hilo
			h.start();

			System.out.println("Información del hilo: " + h.getName() + ": " + h.toString());
		}

		// Una vez estan inicializados todos los hilos...
		System.out.println("3 hilos crados...");
		System.out.println("Hilos Activos: " + Thread.activeCount());

	}

}
