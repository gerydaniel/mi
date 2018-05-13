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
@Table(name="ALM_USUARIO_SESION")
@XmlRootElement
@Getter
@Setter
public class UsuarioSesion extends AlmacenModel {

	@ManyToOne
	@JoinColumn(name = "USUARIO", nullable = false)
	private Usuario usuario;
	
	@Column(name = "FECHA_INICIO", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;
	
	@Column(name = "FECHA_ULTIMA_OPERACION", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimaOperacion;
	
	@Column(name = "FECHA_FINAL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFinal;
	
	@Column(name = "TOKEN", length = 40, nullable = false, unique = true, updatable = false)
	private String token;
	
	@Column(name = "IP", length = 15, nullable = false)
	private String ip;
	
	@Column(name = "ACTIVA")
	private boolean activa;

	public UsuarioSesion(Usuario usuario, Date fechaInicio, String token,
			String ip) {
		super();
		this.usuario = usuario;
		this.fechaInicio = fechaInicio;
		this.fechaUltimaOperacion = fechaInicio;
		this.fechaFinal = null;
		this.token = token;
		this.ip = ip;
		this.activa = true;
	}
	
	public UsuarioSesion() {

	}
	
	
}