package M4G.Vivemas.services;

import java.io.IOException;
import java.util.Map;

import M4G.Vivemas.models.Boleta;
import M4G.Vivemas.models.Factura;
import M4G.Vivemas.models.NotaCredito;
import M4G.Vivemas.models.NotaDebito;

public interface ComprobantesService {

	public Map<String, Object> crearFactura(Factura factura) throws IOException;

	public Map<String, Object> crearBoleta(Boleta boleta) throws IOException;

	public Map<String, Object> crearNotaCredito(NotaCredito notaCredito) throws IOException;

	public Map<String, Object> crearNotaDebito(NotaDebito notaDebito) throws IOException;
}
