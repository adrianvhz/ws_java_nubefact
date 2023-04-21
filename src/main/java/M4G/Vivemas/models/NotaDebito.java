package M4G.Vivemas.models;

import java.util.List;

import M4G.Vivemas.models.Item;
import M4G.Vivemas.models.VentaCredito;

public class NotaDebito {

	private String operacion;
	private Integer tipo_de_comprobante;
	private String serie;
	private Integer numero;
	private Integer sunat_transaction;
	private String cliente_tipo_de_documento;
	private String cliente_numero_de_documento;
	private String cliente_denominacion;
	private String cliente_direccion;
	private String cliente_email;
	private String fecha_de_emision;
	private String fecha_de_vencimiento;
	private Integer moneda;
	private Double tipo_de_cambio;
	private Double porcentaje_de_igv;
	private Double total_descuento;
	private Double total_gravada;
	private Double total_igv;
	private Double total;
	private Boolean detraccion;
	private String observaciones;
	private Integer documento_que_se_modifica_tipo;
	private String documento_que_se_modifica_serie;
	private Integer documento_que_se_modifica_numero;
	private Integer tipo_de_nota_de_debito;
	private Boolean enviar_automaticamente_a_la_sunat;
	private Boolean enviar_automaticamente_al_cliente;
	private String condiciones_de_pago;
	private List<Item> items;
	
	private List<VentaCredito> venta_al_credito;
	
	private String medio_de_pago;

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Integer getTipo_de_comprobante() {
		return tipo_de_comprobante;
	}

	public void setTipo_de_comprobante(Integer tipo_de_comprobante) {
		this.tipo_de_comprobante = tipo_de_comprobante;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getSunat_transaction() {
		return sunat_transaction;
	}

	public void setSunat_transaction(Integer sunat_transaction) {
		this.sunat_transaction = sunat_transaction;
	}

	public String getCliente_tipo_de_documento() {
		return cliente_tipo_de_documento;
	}

	public void setCliente_tipo_de_documento(String cliente_tipo_de_documento) {
		this.cliente_tipo_de_documento = cliente_tipo_de_documento;
	}

	public String getCliente_numero_de_documento() {
		return cliente_numero_de_documento;
	}

	public void setCliente_numero_de_documento(String cliente_numero_de_documento) {
		this.cliente_numero_de_documento = cliente_numero_de_documento;
	}

	public String getCliente_denominacion() {
		return cliente_denominacion;
	}

	public void setCliente_denominacion(String cliente_denominacion) {
		this.cliente_denominacion = cliente_denominacion;
	}

	public String getCliente_direccion() {
		return cliente_direccion;
	}

	public void setCliente_direccion(String cliente_direccion) {
		this.cliente_direccion = cliente_direccion;
	}

	public String getCliente_email() {
		return cliente_email;
	}

	public void setCliente_email(String cliente_email) {
		this.cliente_email = cliente_email;
	}

	public String getFecha_de_emision() {
		return fecha_de_emision;
	}

	public void setFecha_de_emision(String fecha_de_emision) {
		this.fecha_de_emision = fecha_de_emision;
	}

	public String getFecha_de_vencimiento() {
		return fecha_de_vencimiento;
	}

	public void setFecha_de_vencimiento(String fecha_de_vencimiento) {
		this.fecha_de_vencimiento = fecha_de_vencimiento;
	}

	public Integer getMoneda() {
		return moneda;
	}

	public void setMoneda(Integer moneda) {
		this.moneda = moneda;
	}

	public Double getTipo_de_cambio() {
		return tipo_de_cambio;
	}

	public void setTipo_de_cambio(Double tipo_de_cambio) {
		this.tipo_de_cambio = tipo_de_cambio;
	}

	public Double getPorcentaje_de_igv() {
		return porcentaje_de_igv;
	}

	public void setPorcentaje_de_igv(Double porcentaje_de_igv) {
		this.porcentaje_de_igv = porcentaje_de_igv;
	}

	public Double getTotal_descuento() {
		return total_descuento;
	}

	public void setTotal_descuento(Double total_descuento) {
		this.total_descuento = total_descuento;
	}

	public Double getTotal_gravada() {
		return total_gravada;
	}

	public void setTotal_gravada(Double total_gravada) {
		this.total_gravada = total_gravada;
	}

	public Double getTotal_igv() {
		return total_igv;
	}

	public void setTotal_igv(Double total_igv) {
		this.total_igv = total_igv;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getDetraccion() {
		return detraccion;
	}

	public void setDetraccion(Boolean detraccion) {
		this.detraccion = detraccion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getDocumento_que_se_modifica_tipo() {
		return documento_que_se_modifica_tipo;
	}

	public void setDocumento_que_se_modifica_tipo(Integer documento_que_se_modifica_tipo) {
		this.documento_que_se_modifica_tipo = documento_que_se_modifica_tipo;
	}

	public String getDocumento_que_se_modifica_serie() {
		return documento_que_se_modifica_serie;
	}

	public void setDocumento_que_se_modifica_serie(String documento_que_se_modifica_serie) {
		this.documento_que_se_modifica_serie = documento_que_se_modifica_serie;
	}

	public Integer getDocumento_que_se_modifica_numero() {
		return documento_que_se_modifica_numero;
	}

	public void setDocumento_que_se_modifica_numero(Integer documento_que_se_modifica_numero) {
		this.documento_que_se_modifica_numero = documento_que_se_modifica_numero;
	}

	public Integer getTipo_de_nota_de_debito() {
		return tipo_de_nota_de_debito;
	}

	public void setTipo_de_nota_de_debito(Integer tipo_de_nota_de_debito) {
		this.tipo_de_nota_de_debito = tipo_de_nota_de_debito;
	}

	public Boolean getEnviar_automaticamente_a_la_sunat() {
		return enviar_automaticamente_a_la_sunat;
	}

	public void setEnviar_automaticamente_a_la_sunat(Boolean enviar_automaticamente_a_la_sunat) {
		this.enviar_automaticamente_a_la_sunat = enviar_automaticamente_a_la_sunat;
	}

	public Boolean getEnviar_automaticamente_al_cliente() {
		return enviar_automaticamente_al_cliente;
	}

	public void setEnviar_automaticamente_al_cliente(Boolean enviar_automaticamente_al_cliente) {
		this.enviar_automaticamente_al_cliente = enviar_automaticamente_al_cliente;
	}

	public String getCondiciones_de_pago() {
		return condiciones_de_pago;
	}

	public void setCondiciones_de_pago(String condiciones_de_pago) {
		this.condiciones_de_pago = condiciones_de_pago;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<VentaCredito> getVenta_al_credito() {
		return venta_al_credito;
	}

	public void setVenta_al_credito(List<VentaCredito> venta_al_credito) {
		this.venta_al_credito = venta_al_credito;
	}

	public String getMedio_de_pago() {
		return medio_de_pago;
	}

	public void setMedio_de_pago(String medio_de_pago) {
		this.medio_de_pago = medio_de_pago;
	}

	@Override
	public String toString() {
		return "NotaDebito [operacion=" + operacion + ", tipo_de_comprobante=" + tipo_de_comprobante + ", serie="
				+ serie + ", numero=" + numero + ", sunat_transaction=" + sunat_transaction
				+ ", cliente_tipo_de_documento=" + cliente_tipo_de_documento + ", cliente_numero_de_documento="
				+ cliente_numero_de_documento + ", cliente_denominacion=" + cliente_denominacion
				+ ", cliente_direccion=" + cliente_direccion + ", cliente_email=" + cliente_email
				+ ", fecha_de_emision=" + fecha_de_emision + ", fecha_de_vencimiento=" + fecha_de_vencimiento
				+ ", moneda=" + moneda + ", tipo_de_cambio=" + tipo_de_cambio + ", porcentaje_de_igv="
				+ porcentaje_de_igv + ", total_descuento=" + total_descuento + ", total_gravada=" + total_gravada
				+ ", total_igv=" + total_igv + ", total=" + total + ", detraccion=" + detraccion + ", observaciones="
				+ observaciones + ", documento_que_se_modifica_tipo=" + documento_que_se_modifica_tipo
				+ ", documento_que_se_modifica_serie=" + documento_que_se_modifica_serie
				+ ", documento_que_se_modifica_numero=" + documento_que_se_modifica_numero + ", tipo_de_nota_de_debito="
				+ tipo_de_nota_de_debito + ", enviar_automaticamente_a_la_sunat=" + enviar_automaticamente_a_la_sunat
				+ ", enviar_automaticamente_al_cliente=" + enviar_automaticamente_al_cliente + ", condiciones_de_pago="
				+ condiciones_de_pago + ", items=" + items + ", venta_al_credito=" + venta_al_credito
				+ ", medio_de_pago=" + medio_de_pago + "]";
	}
}
