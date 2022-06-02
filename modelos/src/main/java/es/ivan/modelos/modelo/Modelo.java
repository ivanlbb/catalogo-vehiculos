package es.ivan.modelos.modelo;

public class Modelo {

	private Long codigo;
	private String nombre;
	private String marca;
	public Modelo(Long codigo, String nombre, String marca) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
