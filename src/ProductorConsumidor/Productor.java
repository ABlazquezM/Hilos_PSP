package ProductorConsumidor;

public class Productor extends Thread{
	
	//Instaciamos la cinta para acceder a los metodos de sumar y restar
	private Productos productos;	
	
	
	//añadimos una booleana que 
	private boolean abierto = true;
	
	
	public Productor(Productos productos, String nombre) {
		super(nombre);
		this.productos = productos;
	}
	
	public void parar() {
		abierto = false;
	}
	
	public void run() {
		while(abierto) {
			if (productos.getCinta()<=10) {
				productos.producir();
			}
		}
	}

}
