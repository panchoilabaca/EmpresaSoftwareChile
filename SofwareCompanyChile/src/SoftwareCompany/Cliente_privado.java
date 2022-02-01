package SoftwareCompany;

public class Cliente_privado {
	
	private String nombre;
	private int rut;
	private String rubro;
	Programador programador;
	
	
	
	public Cliente_privado(String nombre, int rut, String rubro) {
	
		this.nombre = nombre;
		this.rut = rut;
		this.rubro = rubro;
		
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



	public String getRubro() {
		return rubro;
	}



	public void setRubro(String rubro) {
		this.rubro = rubro;
	}



	public Programador getProgramador() {
		return programador;
	}



	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	

	}


