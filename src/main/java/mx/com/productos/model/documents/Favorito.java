package mx.com.productos.model.documents;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "favoritos")
public class Favorito implements Serializable {

	private static final long serialVersionUID = 1912704456033557943L;

	@Id
	@NotNull
	private String id;
	
	@NotNull
	private String imagen;
	
	@NotNull
	private String producto;
	
	@NotNull
	private BigDecimal precio;
}
