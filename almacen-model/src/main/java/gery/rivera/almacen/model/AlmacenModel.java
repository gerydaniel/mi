package gery.rivera.almacen.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class AlmacenModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "ID_USUARIO_ALTA", nullable = false, updatable = false)
	private Integer idUsuarioAlta;
	
	@Column(name = "ID_USUARIO_MODIFICACION", nullable = false, updatable = true)
	private Integer idUsuarioModificacion;
	
	@Column(name = "ID_USUARIO_BAJA", nullable = true, updatable = true)
	private Integer idUsuarioBaja;
	
	@Column(name = "FECHA_ALTA", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;
	
	@Column(name = "FECHA_MODIFICACION", nullable = false, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
	
	@Column(name = "FECHA_BAJA", nullable = true, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaBaja;

	
}