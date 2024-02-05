package BloqueoHilos_monitores;

public class BloqueoHilos {

	//Vamos a crear y lanzar los hilo para qyue empiecen a ejecutarse
	public static void main(String[] args) {

		
		ObjetoCompartido OC = new ObjetoCompartido();
		HiloCadena Hc1 = new HiloCadena(OC, "A");
		HiloCadena Hc2 = new HiloCadena(OC, "B");
		
		Hc1.start();
		Hc2.start();
	}

}
