package bo.gob.egpp.almacen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALM_CLIENTE")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="CI_NIT",length=15,nullable=false,unique=true,updatable=false)
	private String ciNit;
	@Column(name="RAZON_SOCIAL",length=100,nullable=false)
	private String razonSocial;
	
	public String getCiNit() {
		return ciNit;
	}
	public void setCiNit(String ciNit) {
		this.ciNit = ciNit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}
