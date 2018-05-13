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
@Table(name="ALM_CLIENTE_MOVIMIENTO")
@XmlRootElement
@Getter
@Setter
public class ClienteMovimiento extends AlmacenModel {

	public ClienteMovimiento() {
		
	}
	
	public ClienteMovimiento(Cliente cliente, Date fecha, String codigo, BigDecimal importeDeuda,
			BigDecimal importeFavor, BigDecimal nuevoSaldo) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.codigo = codigo;
		this.importeDeuda = importeDeuda;
		this.importeFavor = importeFavor;
		this.nuevoSaldo = nuevoSaldo;
	}

	@ManyToOne
	@JoinColumn(name = "CLIENTE", nullable = false)
	private Cliente cliente;
	
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
	
	
	
}