package es.ivan.modelos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.ivan.modelos.modelo.ListaModelos;
import es.ivan.modelos.modelo.Modelo;

@RestController
public class ModelosController {

	@GetMapping("/modelos")
	public ListaModelos getAllModelos() {
		return modelosMockedList();
	}

	@GetMapping("/modelos/{id}")
	public Modelo getModelo(@PathVariable Long id) {
		return  modelosMockedList().getListaModelos().stream().filter(modelo -> modelo.getCodigo() == id).findFirst().get();
	}

	@GetMapping("/modelos/marca/{marcaId}")
	public List<Modelo> getModeloByMarca(@PathVariable String marcaId) {
		return  modelosMockedList()
				.getListaModelos()
				.stream()
				.filter(modelo -> modelo.getMarca().equals(marcaId))
				.collect(Collectors.toList());
	}
	
	private ListaModelos modelosMockedList() {
		ListaModelos result = new ListaModelos(); 
		result.setListaModelos(Arrays.asList(
				new Modelo (1L, "IBIZA","SEAT"), 
				new Modelo (2L, "LEON","SEAT"), 
				new Modelo (3L, "GOLF","VW"),
				new Modelo (4L, "PASSAT","VW"), 
				new Modelo (5L, "A1","AUDI"),				
				new Modelo (6L, "A3","AUDI")
				));
		
		return result;
	}
}
