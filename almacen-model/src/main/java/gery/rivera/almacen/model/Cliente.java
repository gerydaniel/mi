package gery.rivera.almacen.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="ALM_CLIENTE")
@XmlRootElement
@Getter
@Setter
public class Cliente extends AlmacenModel {
	
	@Column(name="CI_NIT",length=15,nullable=false,unique=true,updatable=false)
	private String ciNit;
	@Column(name="RAZON_SOCIAL",length=100,nullable=false)
	private String razonSocial;
	
	@Column (name="MONTO_LIMITE", precision=10, scale=2)
	private BigDecimal montoLimite;
	
	@Column (name="SALDO_ACTUAL", precision=10, scale=2)
	private BigDecimal saldoActual;


}
