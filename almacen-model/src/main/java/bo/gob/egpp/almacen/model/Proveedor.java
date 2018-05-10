package bo.gob.egpp.almacen.model;

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
@Table(name="ALM_PROVEEDOR")
@XmlRootElement
@Getter
@Setter
public class Proveedor extends AlmacenModel {

	@Column(name="CI_NIT", length=15,nullable=false, unique=true, updatable = false)
	private String ciNit;
	
	@Column(name="RAZON_SOCIAL", length = 100, nullable = false)
	private String razonSocial;
	
	@Column(name = "SALDO_ACTUAL", precision = 10, scale = 2)
	private BigDecimal saldoActual;

		
}