package es.ivan.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.ivan.stock.modelo.ListaMarcas;
import es.ivan.stock.modelo.ListaModelos;
import es.ivan.stock.modelo.Modelo;

@Service
public class MarcasService {

	@Autowired
	private RestTemplate restTemplate;
	
	public ListaMarcas getMarcas(){
		return restTemplate.getForObject("http://marcas-service/marcas", ListaMarcas.class);
	}

}
