package M4G.Vivemas.models;

public class VentaCredito {

	private Integer cuota;
	private String fecha_de_pago;
	private Double importe;
	public Integer getCuota() {
		return cuota;
	}
	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}
	public String getFecha_de_pago() {
		return fecha_de_pago;
	}
	public void setFecha_de_pago(String fecha_de_pago) {
		this.fecha_de_pago = fecha_de_pago;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "VentaCredito [cuota=" + cuota + ", fecha_de_pago=" + fecha_de_pago + ", importe=" + importe + "]";
	}
	
}
