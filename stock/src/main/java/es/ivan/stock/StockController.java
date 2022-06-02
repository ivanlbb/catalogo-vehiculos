package es.ivan.stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import es.ivan.stock.modelo.ListaMarcas;
import es.ivan.stock.modelo.MarcaStock;
import es.ivan.stock.modelo.Stock;
import es.ivan.stock.modelo.Modelo;

@RestController
public class StockController {

	@GetMapping("/stock")
	public Stock getStockVehiculos() {
		RestTemplate restTemplate = new RestTemplate();
		ListaMarcas listaMarcas = restTemplate.getForObject("http://localhost:8080/marcas", ListaMarcas.class);
		
		Stock stock = new Stock();
		stock.setDatosMarcas(listaMarcas.getListaMarcas());
		
		stock.setMarcas(new ArrayList<MarcaStock>());
		listaMarcas.getListaMarcas().forEach(marca -> {
			List<Modelo> modelos = restTemplate.getForObject("http://localhost:8081/modelos/marca/"+marca.getCodigo(), List.class);
			stock.getMarcas().add(new MarcaStock(marca.getNombre(), modelos));
		});
		
		return stock;
	}
}
