package bo.gob.egpp.almacen.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ALM_USUARIO")
@XmlRootElement
@Getter
@Setter
public class Usuario extends AlmacenModel {

	@Column(name="NOMBRES", length = 100, nullable = false)
	private String nombres;
	
	@Column(name="APELLIDOS", length = 100, nullable = false)
	private String apellidos;
	
	@Column(name="CI", length=15,nullable=false, unique=true, updatable = false)
	private String ci;
	
	@Column(name = "FECHA_NACIMIENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name="LOGIN", length = 30, nullable = false)
	private String login;
	
	@Column(name="PASSWORD", length = 40, nullable = false)
	private String password;

		
}