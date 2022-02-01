package SoftwareCompany;

public class Proveedor {
	
	private String nombre;
	private int rut;
	private String producto;
	
	public Proveedor(String nombre, int rut, String producto) {
		
		this.nombre = nombre;
		this.rut = rut;
		this.producto = producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	

}
