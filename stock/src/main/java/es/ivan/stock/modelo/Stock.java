package es.ivan.stock.modelo;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  private ArrayList<MarcaStock> marcas;
  private List datosMarcas;

public ArrayList<MarcaStock> getMarcas() {
	return marcas;
}

public void setMarcas(ArrayList<MarcaStock> marcas) {
	this.marcas = marcas;
}

public List getDatosMarcas() {
	return datosMarcas;
}

public void setDatosMarcas(List datosMarcas) {
	this.datosMarcas = datosMarcas;
}
	
}
