package ProductorConsumidor;

public class Fabrica {

	public static void main(String[] args) {

		// Instaciamos el método compartido
		Productos productos = new Productos();

		Productor productor = new Productor(productos, "Productor");
		Consumidor consumidor = new Consumidor(productos, "productos");

		productor.start();
		consumidor.start();

		// El tiemo que queremos que esté ejecutandose:
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		productor.parar();
		consumidor.parar();
		
		//Para poder imprimri la cantidad total. Si no lo ponemos, cuando pasen los 10 segunos, va a empezar a ejecutar 
		//lo siguiente, imprimiría el sisy antes de que acaben los procesoso, por eso necesitamos añadir el join
		//Para que sea vera lo debemos poner.
		
		try {
			productor.join();
			consumidor.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Cerrado, se ha producido "+productos.getPP()+" y se han recogido "+productos.getPR()+" productos");

	}

}
