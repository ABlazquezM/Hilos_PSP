package ProductorConsumidorPro;

public class Fabrica {
	
	public static void main(String[] args) {
		
		//Instaciamos el objeto compartido
		
		Deposito deposito = new Deposito();
		
		Productor productor = new Productor(deposito);
		Consumidor consumidor = new Consumidor(deposito);
		
		productor.start();
		consumidor.start();
		
		
	}

}
