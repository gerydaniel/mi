package bo.gob.egpp.almacen.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ALM_PRODUCTO_MOVIMIENTO")
@XmlRootElement
@Getter
@Setter
public class ProductoMovimiento extends AlmacenModel {

	@ManyToOne
	@JoinColumn(name = "PRODUCTO", nullable = false)
	private Producto producto;
	
	@Column(name = "CODIGO", nullable = false, length = 15)
	private String codigo;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "INGRESO", precision = 10, scale = 2)
	private BigDecimal ingreso;
	
	@Column(name = "SALIDA", precision = 10, scale = 2)
	private BigDecimal salida;
	
	@Column(name = "NUEVO_STOCK", precision = 10, scale = 2)
	private BigDecimal nuevoStock;
	
	public ProductoMovimiento() {
		
	}
	
	public ProductoMovimiento(Producto p, String codigo, Date fecha, 
			BigDecimal ingreso, BigDecimal salida, BigDecimal nuevoStock) {
		this.producto = p;
		this.codigo = codigo;
		this.fecha = fecha;
		this.ingreso = ingreso;
		this.salida = salida;
		this.nuevoStock = nuevoStock;
	}
	
	
}