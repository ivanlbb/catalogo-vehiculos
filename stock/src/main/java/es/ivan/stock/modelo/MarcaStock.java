package es.ivan.stock.modelo;

import java.util.List;

public class MarcaStock {

	private String nombre;
	private List<Modelo> listaModelos;
	public MarcaStock(String nombre, List<Modelo> listaModelos) {
		super();
		this.nombre = nombre;
		this.listaModelos = listaModelos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Modelo> getListaModelos() {
		return listaModelos;
	}
	public void setListaModelos(List<Modelo> listaModelos) {
		this.listaModelos = listaModelos;
	}
	
}
