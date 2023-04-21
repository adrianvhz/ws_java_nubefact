package M4G.Vivemas.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;


@Component
public class Utils {

Logger log = LoggerFactory.getLogger(Utils.class);
	
	public static boolean isJSONValid(String jsonInString) {
		Gson gson = new Gson();

	      try {
	          gson.fromJson(jsonInString, Object.class);
	          return true;
	      } catch(com.google.gson.JsonSyntaxException ex) { 
	          return false;
	      }
	  }
}
