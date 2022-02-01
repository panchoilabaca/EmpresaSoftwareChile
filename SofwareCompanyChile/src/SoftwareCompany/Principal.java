package SoftwareCompany;

public class Principal {

	public static void main(String[] args) {
		 Programador programador1 = new Programador("Francisco ", "Gonzalez ", "Programador Junior");
		 Programador programador2 = new Programador("Manuel ", "Perez ","Programador semi-senor");
		 Programador programador3 = new Programador ("Jose ", "Gonzalez ", "Programador senior");
		 
		 Producto producto1 = new Producto("Software MTT Evasion RED ", "Licencia hasta 2025 ", 12022);
		 Producto producto2 = new Producto("Software control Clinica Bupa ", "Licencia hasta 2029 ", 22022);
		 Producto producto3 = new Producto("Software Fallecidos por infeccion Zombi", "Licencia hasta 2030 ", 32022);
		 Producto producto4 = new Producto("Software Control ingreso Estadio UC ", "Licencia hasta 2025 ", 42022);
		 Producto producto5 = new Producto("Software control misiles MINDEF ", "Licencia hasta 2050 ", 52022);
		 
		 Cliente_privado cliente_privado1 = new Cliente_privado("Clinica Bupa ", 2035, "Salud ");
		 Cliente_privado cliente_privado2 = new Cliente_privado("CDUC ", 7070, "Club deportivo");
		 
		 Cliente_publico cliente_publico1 = new Cliente_publico("Ministerio Transportes ", 6060, 202021, "Ministerio ");
		 Cliente_publico cliente_publico2 = new Cliente_publico("Ministerio de salud ", 7070, 152021, "Ministerio ");
		 Cliente_publico cliente_publico3 = new Cliente_publico("Ministerio de defensa ", 6060, 202021, "Ministerio ");
		 
		 Proveedor proveedor1 = new Proveedor("Amazon web services ", 0, "Cloud");
		 Proveedor proveedor2 = new Proveedor("Microsoft ", 0, "Software");
		 Proveedor proveedor3 = new Proveedor("Movistar ", 2020, "Internet");
		 Proveedor proveedor4 = new Proveedor("PC Factory ", 8080, "Equipos computacionales");
		 Proveedor proveedor5 = new Proveedor("Private Military services ",0, "Servicios militares secretos");
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-----------------------------------------Informe Software Company Chile--------------------------------------------------------------------------------------");
		 
		 System.out.println("\nEl cliente " + cliente_privado1.getNombre() + "Solicitó un " + producto2.getNombre_producto());
		 System.out.println("Con " + producto2.getLicencia_producto() + "y el ID del producto es " + producto2.getId_producto());
		 System.out.println("El Proveedor de la nube del servicio es " + proveedor1.getNombre());
		 System.out.println("El programador que realizó el proyecto es " + programador1.getNombre() + programador1.getApellido() + programador1.getCargo());
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		 
		 
		 System.out.println("\nEl cliente " + cliente_privado2.getNombre() + "Solicitó un " + producto4.getNombre_producto());
		 System.out.println("Con " + producto4.getLicencia_producto() + "y el ID del producto es " + producto4.getId_producto());
		 System.out.println("El Proveedor de la nube del servicio es " + proveedor2.getNombre() + "y " + proveedor3.getNombre());
		 System.out.println("El programador que realizó el proyecto es " + programador2.getNombre() + programador2.getApellido() + programador3.getCargo());
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		 

		 System.out.println("\nEl cliente " + cliente_publico3.getNombre() + "Solicitó un " + producto5.getNombre_producto());
		 System.out.println("Con " + producto5.getLicencia_producto() + "y el ID del producto es " + producto5.getId_producto());
		 System.out.println("El Proveedor del servicio es " + proveedor5.getNombre());
		 System.out.println("Los programadores que realizaron el proyecto son " + programador3.getNombre() + programador3.getApellido() + programador3.getCargo() + " y " + programador2.getNombre() + programador2.getApellido() + programador2.getCargo());
		 System.out.println("El ID convenio Marco es: " + cliente_publico3.getId_publicacion() );
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		 
		 System.out.println("\nEl cliente " + cliente_publico2.getNombre() + "Solicitó un " + producto3.getNombre_producto());
		 System.out.println("Con " + producto3.getLicencia_producto() + "y el ID del producto es " + producto3.getLicencia_producto());
		 System.out.println("El Proveedor del servicio es " + proveedor5.getNombre());
		 System.out.println("Los programadores que realizaron el proyecto son " + programador3.getNombre() + programador3.getApellido() + programador3.getCargo() + " y " + programador2.getNombre() + programador2.getApellido() + programador2.getCargo());
		 System.out.println("El ID convenio Marco es: " + cliente_publico2.getId_publicacion() );
		 
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		 
		 System.out.println("\nEl cliente " + cliente_publico1.getNombre() + "Solicitó un " + producto1.getNombre_producto());
		 System.out.println("Con " + producto1.getLicencia_producto() + "y el ID del producto es " + producto1.getId_producto());
		 System.out.println("El Proveedor del servicio es " + proveedor1.getNombre());
		 System.out.println("Los programadores que realizaron el proyecto son " + programador1.getNombre() + programador1.getApellido() + programador1.getCargo() + " y " + programador2.getNombre() + programador2.getApellido() + programador2.getCargo());
		 System.out.println("El ID convenio Marco es: " + cliente_publico1.getId_publicacion() );
		 
		 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		 
		 System.out.println("\n El Principal proveedor de Insumos informáticos de nuestra compañía es " + proveedor4.getNombre() + " su rut es " + proveedor4.getRut() + " y nos provee de " +  proveedor4.getProducto());
		 
		 
		 
		 

	}

}
