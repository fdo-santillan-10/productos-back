package mx.com.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.productos.dao.FavoritosRepository;
import mx.com.productos.model.documents.Favorito;

@Service
public class FavoritosService {

	@Autowired
	private FavoritosRepository dao;
	
	public void guardar(Favorito favorito) {
		dao.insert(favorito);
	}
	
	public List<Favorito> consultaFavoritos() {
		return dao.findAll();
	}
	
	public void eliminar(String id) {
		dao.deleteById(id);
	}
}
