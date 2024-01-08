package Hilos;

//Vamos a trabajar con la prioridades, será en aplicaciones que se estén ejecutando al mismo tiempo, pero en windows no pasa esto
//Hablamos de prioridad para que un pproceos no pare de ejecutarse, seguira en ejecución.
//Depende de la plataforma y de los otrs hilos en la plataforma en la que nosotros estamos trabajando.
//Creamos una clase para dar prioridad, y despues un main para poder ver las prioridades

public class HiloPrioridad1 extends Thread {

	private int c = 0;
	// La vamos a incrementar en el metodo run
	private boolean stopHilo = false;
	// Vamos a crear otro método para parar el hilo

	// Constructor al que le pasamos el nombre del hilo
	public HiloPrioridad1(String nombre) {
		super(nombre);
	}

	// Pra obtener el valor del contador incrementado en cada hilo
	public int getContador() {
		return c;
	}

	// Metodo para finalizar el hilo, con la variable que está chequeando en el
	// bucle de haca hilo en ejecución
	public void paraHilo() {
		stopHilo = true;
		// Cuando pasa a true, sale del bucle
	}

	
	//Metodo RUN
	public void run() {
		while (!stopHilo) {// Seguirá incremetando la varible hasta que con cambiemos el estado a true
			
			try {
				sleep(4); //Ponemos esto para que no incremente tanto
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			c++;
			
		}
		// Cuando sale del bucle se imprime
		System.out.println("Fin del hilo " + getName());
	}

}
