package es.ivan.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.ivan.stock.modelo.ListaMarcas;
import es.ivan.stock.modelo.ListaModelos;
import es.ivan.stock.modelo.Modelo;
import org.springframework.http.*;
import org.slf4j.MDC;

@Service
public class MarcasService {

	@Autowired
	private RestTemplate restTemplate;
	
	public ListaMarcas getMarcas_(){
		return restTemplate.getForObject("http://marcas-service/marcas", ListaMarcas.class);
		
	}

	public ListaMarcas getMarcas(){		
		String url = "http://marcas-service/marcas";
		HttpHeaders headers = new HttpHeaders();
        headers.set("X-Trace-Id", MDC.get("traceId"));

        HttpEntity<Void> entity = new HttpEntity<>(headers);
        ResponseEntity<ListaMarcas> response = restTemplate.exchange(url, HttpMethod.GET, entity, ListaMarcas.class);
        return response.getBody();
	}
	
}
