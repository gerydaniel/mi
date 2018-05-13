package gery.rivera.almacen.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ALM_PRODUCTO")
@XmlRootElement
@Getter
@Setter
public class Producto extends AlmacenModel {

	@Column(name="CODIGO", length=15, nullable=false, unique=true, updatable = false)
	private String codigo;
	
	@Column(name="NOMBRE", length = 100, nullable = false, unique = true)
	private String nombre;
	
	@Column(name="UNIDAD_MEDIDA", length = 10, nullable = false)
	private String unidadMedida;
	
	@Column(name = "PRECIO_COMPRA", precision = 10, scale = 2)
	private BigDecimal precioCompra;
	
	@Column(name = "PRECIO_VENTA", precision = 10, scale = 2)
	private BigDecimal precioVenta;
	
	@Column(name = "STOCK_ACTUAL", precision = 10, scale = 2)
	private BigDecimal stockActual;

		
}