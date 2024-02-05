package Cajero;

public class Cuenta {

	// creamos una variable para el saldo, es lo que tendremos que comprobar
	private int saldo;

	// constructor
	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	// Uin getter para ver el sado que quenremos
	public int getSaldo() {
		return saldo;
	}

	// Un método para indicar el dinero que queremos sacar y restar
	void restarSaldo(int cantidad) {
		saldo = saldo - cantidad;
	}

	// Debemos comprobas si tenemso suficiente dinero para sacar, y no pedimos mas
	// de lo que tenemos
	
	//Para evitar que los dos procesoso se cruce, vamos a sincronizar

	synchronized void comprobarDinero(int cantidad, String nombre) {
		if (getSaldo() >= cantidad) {
			System.out.println(nombre + " va a sacar dinero. Saldo actual: " + getSaldo() + " €");
		
			restarSaldo(cantidad);
			System.out.println(nombre + " ha sacado: " + cantidad + " €. El saldo actual es de: " + getSaldo() + " €");
		} else {
			System.out.println(
					nombre + " no puede sacar dinero, no hay saldo suficiente. Saldo actual: " + getSaldo() + " €");

		}
	}

}
