package mx.com.productos.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.productos.model.documents.Favorito;

@Repository
@Transactional(readOnly = false)
public interface FavoritosRepository extends MongoRepository<Favorito, String> {

}
