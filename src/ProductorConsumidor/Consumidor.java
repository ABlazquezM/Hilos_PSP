package ProductorConsumidor;

public class Consumidor extends Thread{
	
	private Productos productos;
	
	private boolean abierto = true;
	
	public Consumidor(Productos productos, String nombre) {
		super(nombre);
		this.productos = productos;
	}
	
	public void parar() {
		abierto = false;
	}
	
	public void run() {
		while(abierto) {
			if (productos.getCinta()>0) {
				productos.recolectar();
			}
		}
	

	}}
