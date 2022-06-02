package es.ivan.marcas;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ivan.marcas.modelo.ListaMarcas;
import es.ivan.marcas.modelo.Marca;

@RestController
public class MarcasController {

	@GetMapping("/marcas")
	public ListaMarcas getMarcas() {
		ListaMarcas result = new ListaMarcas();
		result.setListaMarcas(Arrays.asList(new Marca("VW","VOLKSWAGEN"),new Marca("AUDI","AUDI"), new Marca("SEAT","SEAT")));
		return result; 
	}
}
