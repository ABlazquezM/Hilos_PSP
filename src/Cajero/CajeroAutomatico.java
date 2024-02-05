package Cajero;

public class CajeroAutomatico {
	
	//MONITORES
	
	//Se ejecutaran los hilos

	public static void main(String[] args) {

		
		Cuenta c = new Cuenta(60);
		
		SacarDinero SC1 = new SacarDinero("Agustín", c);
		SacarDinero SC2 = new SacarDinero("Javier", c);
		
		SC1.start();
		SC2.start();
		
	}

}
