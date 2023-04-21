package M4G.Vivemas.models;

public class Item {

	private String unidad_de_medida;
	private String descripcion;
	private Integer cantidad;
	private Double valor_unitario;
	private Double precio_unitario;
	private Double descuento;
	private Double subtotal;
	private Integer tipo_de_igv;
	private Double igv;
	private Double total;
	private Boolean anticipo_regularizacion;
	private String codigo_producto_sunat;

	public Item() {

	}

	public String getUnidad_de_medida() {
		return unidad_de_medida;
	}

	public void setUnidad_de_medida(String unidad_de_medida) {
		this.unidad_de_medida = unidad_de_medida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(Double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public Double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(Double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getTipo_de_igv() {
		return tipo_de_igv;
	}

	public void setTipo_de_igv(Integer tipo_de_igv) {
		this.tipo_de_igv = tipo_de_igv;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getAnticipo_regularizacion() {
		return anticipo_regularizacion;
	}

	public void setAnticipo_regularizacion(Boolean anticipo_regularizacion) {
		this.anticipo_regularizacion = anticipo_regularizacion;
	}

	public String getCodigo_producto_sunat() {
		return codigo_producto_sunat;
	}

	public void setCodigo_producto_sunat(String codigo_producto_sunat) {
		this.codigo_producto_sunat = codigo_producto_sunat;
	}

	@Override
	public String toString() {
		return "Item [unidad_de_medida=" + unidad_de_medida + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", valor_unitario=" + valor_unitario + ", precio_unitario=" + precio_unitario + ", descuento="
				+ descuento + ", subtotal=" + subtotal + ", tipo_de_igv=" + tipo_de_igv + ", igv=" + igv + ", total="
				+ total + ", anticipo_regularizacion=" + anticipo_regularizacion + ", codigo_producto_sunat="
				+ codigo_producto_sunat + "]";
	}
	
}
