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
@Table(name="ALM_PROVEEDOR_MOVIMIENTO")
@XmlRootElement
@Getter
@Setter
public class ProveedorMovimiento extends AlmacenModel {

	@ManyToOne
	@JoinColumn(name = "PROVEEDOR", nullable = false)
	private Proveedor proveedor;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "CODIGO", nullable = false, length = 15)
	private String codigo;
	
	@Column(name = "IMPORTE_DEUDA", precision = 10, scale = 2)
	private BigDecimal importeDeuda;
	
	@Column(name = "IMPORTE_FAVOR", precision = 10, scale = 2)
	private BigDecimal importeFavor;
	
	@Column(name = "NUEVO_SALDO", precision = 10, scale = 2)
	private BigDecimal nuevoSaldo;

	public ProveedorMovimiento() {
		
	}
	
	public ProveedorMovimiento(Proveedor proveedor, Date fecha, String codigo, BigDecimal importeDeuda,
			BigDecimal importeFavor, BigDecimal nuevoSaldo) {
		this.proveedor = proveedor;
		this.fecha = fecha;
		this.codigo = codigo;
		this.importeDeuda = importeDeuda;
		this.importeFavor = importeFavor;
		this.nuevoSaldo = nuevoSaldo;
	}
	
	
	
}