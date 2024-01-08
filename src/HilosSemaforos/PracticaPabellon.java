package HilosSemaforos;
import java.util.concurrent.Semaphore;
public class PracticaPabellon extends Thread{
	
	
	private static Semaphore semaforo = new Semaphore(8);  
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public PracticaPabellon(String nombre) {
		this.nombre = nombre;
	}
	public void run() {
		
		//System.out.println("Al empezar "+semaforo);
			try {
				
				semaforo.acquire();
				sleep(5000);
				System.out.println(getNombre());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			semaforo.release();
			//System.out.println("Al acabar "+semaforo);
		
	}
	public static void main(String[] args) {
		
		PracticaPabellon partido1 = new PracticaPabellon("Partido 1");
		PracticaPabellon partido2 = new PracticaPabellon("Partido 2");
		PracticaPabellon partido3 = new PracticaPabellon("Partido 3");
		PracticaPabellon partido4 = new PracticaPabellon("Partido 4");
		PracticaPabellon partido5 = new PracticaPabellon("Partido 5");
		PracticaPabellon partido6 = new PracticaPabellon("Partido 6");
		PracticaPabellon partido7 = new PracticaPabellon("Partido 7");
		PracticaPabellon partido8 = new PracticaPabellon("Partido 8");
		PracticaPabellon partido9 = new PracticaPabellon("Partido 9");
		PracticaPabellon partido10 = new PracticaPabellon("Partido 10");
		PracticaPabellon partido11 = new PracticaPabellon("Partido 11");
		PracticaPabellon partido12 = new PracticaPabellon("Partido 12");
		PracticaPabellon partido13 = new PracticaPabellon("Partido 13");
		PracticaPabellon partido14 = new PracticaPabellon("Partido 14");
		partido1.start();
		partido2.start();
		partido3.start();
		partido4.start();
		partido5.start();
		partido6.start();
		partido7.start();
		partido8.start();
		partido9.start();
		partido10.start();
		partido11.start();
		partido12.start();
		partido13.start();
		partido14.start();
	}

}
