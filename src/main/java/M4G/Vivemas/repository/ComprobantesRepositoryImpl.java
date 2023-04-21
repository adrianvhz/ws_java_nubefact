package M4G.Vivemas.repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import M4G.Vivemas.utils.Utils;
import M4G.Vivemas.models.Boleta;
import M4G.Vivemas.models.Factura;
import M4G.Vivemas.models.NotaCredito;
import M4G.Vivemas.models.NotaDebito;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Repository
public class ComprobantesRepositoryImpl implements ComprobantesRepository {

	/*Credenciales sommo api de acceso
	 * 	private final String urlEndpoint = "https://api.nubefact.com/api/v1/8e24e9e8-68e7-4844-b4e2-7b42c6b2ebac";
	 /*Credenciales activas y funcionales de vivemas*/
	private final String urlEndpoint = "https://api.nubefact.com/api/v1/c1a2d3c5-0e2d-4597-9c7e-8bb12eb77ea1";
	private final String token = "7ab3cfa964b04fc89c4d1712c0bca6639658489b2edd48b886974590b21dabc1m";
	@Override
	public Map<String, Object> crearFactura(Factura factura) throws IOException {

		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String jsonFactura = gson.toJson(factura);
		System.out.println("hola omar aqui estamos llamando al servicio de NFact con el json de factura");
		System.out.println(factura);
		System.out.println("*****fin*****");
		
		Map<String,Object> responseMap = new HashMap<>();
		OkHttpClient client = new OkHttpClient().newBuilder().build();
			MediaType mediatype = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediatype, jsonFactura);
			Request request = new Request.Builder()
				  .url(urlEndpoint)
				  .method("POST", body)
				  .addHeader("Authorization", "Token token="+token)
				  .addHeader("Content-Type", "application/json")
				  .build();
		Response response = client.newCall(request).execute();
		String responString = response.body().string();
		if (!Utils.isJSONValid(responString)) {
			responseMap.put("ok", false);
			responseMap.put("message", responString);
		}
		responseMap.put("ok", true);
		responseMap.put("data", responString);
		
		return responseMap;
	}
	
	@Override
	public Map<String, Object> crearBoleta(Boleta boleta) throws IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String jsonBoleta =  gson.toJson(boleta);
		Map<String,Object> responseMap = new HashMap<>();
		
		OkHttpClient client = new OkHttpClient().newBuilder().build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType, jsonBoleta);
				Request request = new Request.Builder()
						  .url(urlEndpoint)
						  .method("POST", body)
						  .addHeader("Authorization", "Token token="+token)
						  .addHeader("Content-Type", "application/json")
						  .build();
				Response response = client.newCall(request).execute();
	String responseString =  response.body().string();
				
	if (!Utils.isJSONValid(responseString)) {
				responseMap.put("ok", false);
				responseMap.put("message", responseString);
	} 
				responseMap.put("ok", true);
				responseMap.put("data", responseString); 
		return responseMap;
	}
	@Override
	public Map<String, Object> crearNotaCredito(NotaCredito notaCredito) throws IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String jsonNotaCredito =  gson.toJson(notaCredito);
		Map<String,Object> responseMap = new HashMap<>();
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType, jsonNotaCredito);
				Request request = new Request.Builder()
				  .url(urlEndpoint)
				  .method("POST", body)
				  .addHeader("Authorization", "Token token="+token)
				  .addHeader("Content-Type", "application/json")
				  .build();
				Response response = client.newCall(request).execute();
				String responseString =  response.body().string();
				
				if (!Utils.isJSONValid(responseString)) {
					responseMap.put("ok", false);
					responseMap.put("message", responseString);
				} 
				responseMap.put("ok", true);
				responseMap.put("data", responseString); 
		
		return responseMap;
	}
	@Override
	public Map<String, Object> crearNotaDebito(NotaDebito notaDebito) throws IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String jsonNotaDebito =  gson.toJson(notaDebito);
		Map<String,Object> responseMap = new HashMap<>();
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType, jsonNotaDebito);
				Request request = new Request.Builder()
				  .url(urlEndpoint)
				  .method("POST", body)
				  .addHeader("Authorization", "Token token="+token)
				  .addHeader("Content-Type", "application/json")
				  .build();
				Response response = client.newCall(request).execute();
				String responseString =  response.body().string();
				
				if (!Utils.isJSONValid(responseString)) {
					responseMap.put("ok", false);
					responseMap.put("message", responseString);
				} 
				responseMap.put("ok", true);
				responseMap.put("data", responseString); 
		
		return responseMap;
	}
	
	
}
