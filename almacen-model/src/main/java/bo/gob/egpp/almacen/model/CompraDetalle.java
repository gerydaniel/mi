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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ALM_COMPRA_DETALLE")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class CompraDetalle extends AlmacenModel {

	@ManyToOne
	@JoinColumn(name = "COMPRA", nullable = false)
	@XmlTransient
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCTO", nullable = false)
	private Producto producto;
	
	@Column(name = "CANTIDAD", precision = 10, scale = 2)
	private BigDecimal cantidad;
	
	@Column(name = "PRECIO_UNITARIO", precision = 10, scale = 2)
	private BigDecimal precioUnitario;
	
	@Column(name = "PRECIO_TOTAL", precision = 10, scale = 2)
	private BigDecimal precioTotal;
	
	
}