package SoftwareCompany;

public class Programador {
	
	private String nombre;
	private String apellido;
	private String cargo;
	
	
	public Programador(String nombre, String apellido, String cargo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
