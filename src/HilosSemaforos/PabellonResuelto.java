package HilosSemaforos;

import java.util.concurrent.Semaphore;

public class PabellonResuelto {

	public static void main(String[] args) {
		
		//en el main declaramos el semáforo
		Semaphore semaforo = new Semaphore(8); // porque puede ejecutarse de forma silmultanea 8 partidos
		
		PartidoResuelto partido1 = new PartidoResuelto("P1",semaforo);
		PartidoResuelto partido2 = new PartidoResuelto("P2",semaforo);
		PartidoResuelto partido3 = new PartidoResuelto("P3",semaforo);
		PartidoResuelto partido4 = new PartidoResuelto("P4",semaforo);
		PartidoResuelto partido5 = new PartidoResuelto("P5",semaforo);
		PartidoResuelto partido6 = new PartidoResuelto("P6",semaforo);
		PartidoResuelto partido7 = new PartidoResuelto("P7",semaforo);
		PartidoResuelto partido8 = new PartidoResuelto("P8",semaforo);
		PartidoResuelto partido9 = new PartidoResuelto("P9",semaforo);
		PartidoResuelto partido10 = new PartidoResuelto("P10",semaforo);
		PartidoResuelto partido11 = new PartidoResuelto("P11",semaforo);
		
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
		
		
	}

}
