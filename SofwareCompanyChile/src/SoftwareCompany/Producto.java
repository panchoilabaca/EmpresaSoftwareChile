package SoftwareCompany;

public class Producto {
	
	private String nombre_producto;
	private String licencia_producto; //Fecha caducidad
	private int id_producto;
	
	
	public Producto(String nombre_producto, String licencia_producto, int id_producto) {
		
		this.nombre_producto = nombre_producto;
		this.licencia_producto = licencia_producto;
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public String getLicencia_producto() {
		return licencia_producto;
	}


	public void setLicencia_producto(String licencia_producto) {
		this.licencia_producto = licencia_producto;
	}


	public int getId_producto() {
		return id_producto;
	}


	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	

}
