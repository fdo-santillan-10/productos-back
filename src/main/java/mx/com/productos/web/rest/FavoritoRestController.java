package mx.com.productos.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.productos.common.base.rest.AbstractBaseRestController;
import mx.com.productos.model.documents.Favorito;
import mx.com.productos.service.FavoritosService;

@RestController
@RequestMapping(path = "/productos")
public class FavoritoRestController extends AbstractBaseRestController {

	@Autowired
	private FavoritosService service;
	
	@CrossOrigin
	@PostMapping(path = "/guardar")
	public void guardar(@RequestBody Favorito favorito) {		
		service.guardar(favorito);
	}
	
	@CrossOrigin
	@GetMapping(path = "/consultar")
	public List<Favorito> getFavoritos() {
		return service.consultaFavoritos();
	}
	
	@CrossOrigin
	@DeleteMapping(path = "/eliminar")
	public void eliminar(String id) {
		service.eliminar(id);
	}
}
