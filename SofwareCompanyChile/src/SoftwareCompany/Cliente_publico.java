package SoftwareCompany;

public class Cliente_publico {
	
	private String nombre;
	private int rut;
	private int id_publicacion;
	private String reparticion_estado;
	Programador programador;
	
	
	public Cliente_publico(String nombre, int rut, int id_publicacion, String reparticion_estado) {
		
		this.nombre = nombre;
		this.rut = rut;
		this.id_publicacion = id_publicacion;
		this.reparticion_estado = reparticion_estado;
		
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


	public int getId_publicacion() {
		return id_publicacion;
	}


	public void setId_publicacion(int id_publicacion) {
		this.id_publicacion = id_publicacion;
	}


	public String getReparticion_estado() {
		return reparticion_estado;
	}


	public void setReparticion_estado(String reparticion_estado) {
		this.reparticion_estado = reparticion_estado;
	}


	public Programador getProgramador() {
		return programador;
	}


	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	

}





	
	
	


