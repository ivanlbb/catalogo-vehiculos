package es.ivan.stock;

import java.util.List;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.ivan.stock.modelo.ListaMarcas;
import es.ivan.stock.modelo.ListaModelos;
import es.ivan.stock.modelo.Modelo;

@Service
public class ModelosService {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Modelo> getModelos_(final String marcaId){
		return restTemplate.getForObject("http://modelos-service/modelos/marca/"+marcaId, List.class);
	}
	
	public List<Modelo> getModelos(final String marcaId){		
		String url = "http://modelos-service/modelos/marca/"+marcaId;
		HttpHeaders headers = new HttpHeaders();
        headers.set("X-Trace-Id", MDC.get("traceId"));

        HttpEntity<Void> entity = new HttpEntity<>(headers);
        ResponseEntity<List<Modelo>> response = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<>() {});
        return response.getBody();
	}
	

	//TODO hystrix
	public ListaModelos getFallbackModelos(final String marcaId) {
		return new ListaModelos();
	}
}
