package bo.gob.egpp.almacen.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ALM_COMPRA")
@XmlRootElement
@Getter
@Setter
public class Compra extends AlmacenModel {

	@Column(name="CODIGO", length=15,nullable=false, unique=true, updatable = false)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "PROVEEDOR", nullable = false)
	private Proveedor proveedor;
	
	@ManyToOne
	@JoinColumn(name = "USUARIO", nullable = false)
	private Usuario usuario;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "IMPORTE_TOTAL", precision = 10, scale = 2)
	private BigDecimal importeTotal;
	
	@OneToMany(mappedBy = "compra", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OrderColumn(name = "ORDEN")
	List<CompraDetalle> detalles;


		
}