package es.ivan.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.ivan.stock.modelo.ListaModelos;
import es.ivan.stock.modelo.Modelo;

@Service
public class ModelosService {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Modelo> getModelos(final String marcaId){
		return restTemplate.getForObject("http://modelos-service/modelos/marca/"+marcaId, List.class);
	}

	//TODO hystrix
	public ListaModelos getFallbackModelos(final String marcaId) {
		return new ListaModelos();
	}
}
