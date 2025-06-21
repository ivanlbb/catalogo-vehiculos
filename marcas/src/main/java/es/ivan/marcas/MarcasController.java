package es.ivan.marcas;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ivan.marcas.modelo.ListaMarcas;
import es.ivan.marcas.modelo.Marca;

@RestController
public class MarcasController {
	private static final Logger logger = LoggerFactory.getLogger(MarcasController.class);
	
	@GetMapping("/marcas")
	public ListaMarcas getMarcas() {
		logger.info("Petición getMarcas");
		ListaMarcas result = new ListaMarcas();
		result.setListaMarcas(Arrays.asList(new Marca("VW","VOLKSWAGEN"),new Marca("AUDI","AUDI"), new Marca("SEAT","SEAT")));
		return result; 
	}
}
