package es.ivan.stock.modelo;


public class Marca {

	private String codigo;
	private String nombre;
	 
	public Marca(String codigo, String nombre) {
		super();
		this.setCodigo(codigo);
		this.setNombre(nombre);
	}
	public Marca() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
