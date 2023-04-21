package M4G.Vivemas.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import M4G.Vivemas.models.Boleta;
import M4G.Vivemas.models.Factura;
import M4G.Vivemas.models.NotaCredito;
import M4G.Vivemas.models.NotaDebito;
import M4G.Vivemas.models.Vivemas;
import M4G.Vivemas.repository.ComprobantesRepository;
import M4G.Vivemas.repository.VivemasRepository;

@Service
public class ComprobantesServiceImpl implements ComprobantesService {
	
	Logger log = LoggerFactory.getLogger(ComprobantesServiceImpl.class);

	@Autowired
	private ComprobantesRepository comprobantesRepository;

	@Autowired
	private VivemasRepository vivemasRepository;

	@Override
	public Map<String, Object> crearFactura(Factura factura) throws IOException {
		// TODO Auto-generated method stub
		factura.setOperacion("generar_comprobante");
		factura.setTipo_de_comprobante(1);
		Map<String,Object> response = new HashMap<>();
		
		Vivemas vivemas =null;
		
		if (!Objects.isNull(factura.getNumero()) ) {
			response = comprobantesRepository.crearFactura(factura);
			return response;
		}
		vivemas = vivemasRepository.findById(1L).orElse(null);
		System.out.println(vivemas);
		System.out.println(vivemas.getFactura());
		Integer numero = vivemas.getFactura()+1;
		vivemas.setFactura(numero);
		factura.setNumero(numero);
		
		vivemasRepository.save(vivemas);
		response = comprobantesRepository.crearFactura(factura);
		response.put("numero", numero);
		
		return response;
	}

	@Override
	public Map<String, Object> crearBoleta(Boleta boleta) throws IOException {
		// TODO Auto-generated method stub
		boleta.setOperacion("generar_comprobante");
		boleta.setTipo_de_comprobante(2);
		Map<String, Object> response = new HashMap<String, Object>();
		Vivemas vivemas = null;
		if (!Objects.isNull(boleta.getNumero())) {
			response = comprobantesRepository.crearBoleta(boleta);
			return response;
		}
		vivemas = vivemasRepository.findById(1L).orElse(null);
		Integer numero = vivemas.getBoleta()+1;
		
		vivemas.setBoleta(numero);
		boleta.setNumero(numero);
		vivemasRepository.save(vivemas);
		response = comprobantesRepository.crearBoleta(boleta);
		response.put("numero", numero);
		return response;
	}

	@Override
	public Map<String, Object> crearNotaCredito(NotaCredito notaCredito) throws IOException {
		// TODO Auto-generated method stub
		notaCredito.setOperacion("generar_comprobante");
		notaCredito.setTipo_de_comprobante(3);
		Integer numero;
		Map<String, Object> response = new HashMap<String, Object>();
		Vivemas vivemas = null;
		if (!Objects.isNull(notaCredito.getNumero() )) {
			response = comprobantesRepository.crearNotaCredito(notaCredito);
			return response;
		}
		
		vivemas = vivemasRepository.findById(1L).orElse(null);
		if (notaCredito.getSerie().equals("FN01")) {
			numero = vivemas.getNotaCreditoFactura()+1;
			vivemas.setNotaCreditoFactura(numero);	
		}
		else {
			numero = vivemas.getNotaCreditoBoleta()+1;
			vivemas.setNotaCreditoBoleta(numero);
		}
		notaCredito.setNumero(numero);
		vivemasRepository.save(vivemas);
		response = comprobantesRepository.crearNotaCredito(notaCredito);
		response.put("numero",numero);
		return response;
	}

	@Override
	public Map<String, Object> crearNotaDebito(NotaDebito notaDebito) throws IOException {
		// TODO Auto-generated method stub
		notaDebito.setOperacion("generar_comprobante");
		notaDebito.setTipo_de_comprobante(4);
		Vivemas vivemas = null;
		Map<String,Object> response = new HashMap<>();
		
		if (!Objects.isNull(notaDebito.getNumero())) {
			response = comprobantesRepository.crearNotaDebito(notaDebito);
			return response;
		}
//		somno = somnoRepository.findById(1L).orElse(null);
//		Integer numero = somno.getNotaDebito()+1;
//		
//		somno.setNotaDebito(numero);
//		notaDebito.setNumero(numero);
//		
//		somnoRepository.save(somno);
//		response = comprobantesRepository.crearNotaDebito(notaDebito);
//		
//		response.put("numero", numero);
		return response;
	}

}
