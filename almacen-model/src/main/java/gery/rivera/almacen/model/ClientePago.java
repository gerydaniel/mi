package gery.rivera.almacen.model;

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
@Table(name="ALM_CLIENTE_PAGO")
@XmlRootElement
@Getter
@Setter
public class ClientePago extends AlmacenModel {

	@Column(name = "CODIGO", nullable = false, length = 15)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE", nullable = false)
	private Cliente cliente;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "USUARIO", nullable = false)
	private Usuario usuario;
	
	@Column(name = "IMPORTE", precision = 10, scale = 2)
	private BigDecimal importe;
	
	@Column(name = "COMENTARIOS", length = 255)
	private String comentarios;
	
	
}