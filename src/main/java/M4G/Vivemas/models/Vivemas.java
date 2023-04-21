package M4G.Vivemas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vivemastest")
public class Vivemas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "factura")
	private Integer factura;

	@Column(name = "boleta")
	private Integer boleta;

	@Column(name = "nota_credito_factura")
	private Integer notaCreditoFactura;
	
	@Column(name = "nota_credito_boleta")
	private Integer notaCreditoBoleta;
	public Vivemas(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFactura() {
		return factura;
	}

	public void setFactura(Integer factura) {
		this.factura = factura;
	}

	public Integer getBoleta() {
		return boleta;
	}

	public void setBoleta(Integer boleta) {
		this.boleta = boleta;
	}

	public Integer getNotaCreditoFactura() {
		return notaCreditoFactura;
	}

	public void setNotaCreditoFactura(Integer notaCreditoFactura) {
		this.notaCreditoFactura = notaCreditoFactura;
	}

	public Integer getNotaCreditoBoleta() {
		return notaCreditoBoleta;
	}

	public void setNotaCreditoBoleta(Integer notaCreditoBoleta) {
		this.notaCreditoBoleta = notaCreditoBoleta;
	}

	@Override
	public String toString() {
		return "Vivemas [id=" + id + ", factura=" + factura + ", boleta=" + boleta + ", notaCreditoFactura="
				+ notaCreditoFactura + ", notaCreditoBoleta=" + notaCreditoBoleta + "]";
	}
	
}
