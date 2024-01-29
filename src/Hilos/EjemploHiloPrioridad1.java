package Hilos;


//Creamos la clase desde la que vamos ainstaciar la HiloPrioridad1
public class EjemploHiloPrioridad1 {

	public static void main(String[] args) {
		
		//Çreamos los hilos 
		HiloPrioridad1 h1 = new HiloPrioridad1("Hilo_1");
		HiloPrioridad1 h2 = new HiloPrioridad1("Hilo_2");
		HiloPrioridad1 h3 = new HiloPrioridad1("Hilo_3");

		//Asignamos prioridad con el metodo:
		
		//Cuanto mayor prioridad se asigne a un hilo, su objeto debería incrementar el constador un mayor numero de veces que el resto
		h1.setPriority(Thread.NORM_PRIORITY); //Los valores son 5
		h2.setPriority(Thread.MAX_PRIORITY); //10
		h3.setPriority(Thread.MIN_PRIORITY); //1 es asi por defecto
		
		//Iniciamos
		h1.start();
		h2.start();
		h3.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		h1.paraHilo();
		h2.paraHilo();
		h3.paraHilo ();
		
		//No siempre va a pasar que el hilo con mayor prioridad se ejecuten antes
		System.out.println("h2 (Priodidad Máxima): "+h2.getContador());
		System.out.println("h2 (Priodidad Normal): "+h1.getContador());
		System.out.println("h2 (Priodidad Mínima): "+h3.getContador());
	}

}
