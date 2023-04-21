package M4G.Vivemas.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import M4G.Vivemas.models.NotaCredito;
import M4G.Vivemas.models.NotaDebito;
import M4G.Vivemas.models.Boleta;

import M4G.Vivemas.controller.ViveComController;
import M4G.Vivemas.models.Factura;
import M4G.Vivemas.services.ComprobantesService;

@RestController
@RequestMapping("/comprobante")
public class ViveComController {
	
Logger log = LoggerFactory.getLogger(ViveComController.class);
	
	@Autowired
	private ComprobantesService comprobantesService;
	
	@PostMapping("/factura")
	public ResponseEntity<?> crearFactura(@RequestBody Factura factura){
		log.info(factura.toString());
		Map<String,Object> response = new HashMap<>();
		try {
			response =  comprobantesService.crearFactura(factura);
			System.out.println(response);
		} catch (IOException e) {
			response.put("error", true);
			response.put("message", e.getMessage());
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	
	@PostMapping("/boleta")
	public ResponseEntity<?> crearBoleta(@RequestBody Boleta boleta){
		log.info(boleta.toString());
		Map<String,Object> response = new HashMap<>();
		try {
			response = comprobantesService.crearBoleta(boleta);
		} catch (IOException e) {
			
			response.put("error", true);
			response.put("message", e.getMessage());
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	@PostMapping("nota-credito")
	public ResponseEntity<?> crearNotaCredito(@RequestBody NotaCredito notaCredito){
		log.info(notaCredito.toString());
		Map<String, Object> response = new HashMap<String, Object>();
		
		try
		{
			response = comprobantesService.crearNotaCredito(notaCredito);
		}
		catch(IOException e)
		{
			response.put("error", true);
			response.put("message", e.getMessage());
			return new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	/*
	 * log.info(notaDebito.toString());
		Map<String,Object> response = new HashMap<>();
		try {
			response = comprobantesService.crearNotaDebito(notaDebito);
		} catch (IOException e) {
			
			response.put("error", true);
			response.put("message", e.getMessage());
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);*/
	@PostMapping("nota-debito")
	public ResponseEntity<?> crearNotaDebito(@RequestBody NotaDebito notaDebito ) {
		log.info(notaDebito.toString());
		Map<String, Object> response = new HashMap<String, Object>();
		try
		{
			response = comprobantesService.crearNotaDebito(notaDebito);
		}
		catch(IOException e)
		{
			response.put("error", true);
			response.put("message",e.getMessage());
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
	
}
