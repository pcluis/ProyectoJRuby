package uni.proyecto.model;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import uni.proyecto.dto.SocioDTO;
import uni.proyecto.util.JRuby;

@Service
public class SocioDAO  {
	
	private JRuby jruby = new JRuby();
	
	private Gson gson = new Gson();
	

	public void createSocio(SocioDTO socio, String ruta){
		
		ScriptingContainer contenedor = jruby.getContainer();
		contenedor.runScriptlet(PathType.ABSOLUTE, ruta+jruby.SOCIORB);
		
		String parametros = gson.toJson(socio);
		
		Object socioruby = contenedor.get("Socio");
		contenedor.callMethod(socioruby, "nuevoSocio", parametros);
		
	}
	

	public SocioDTO readSocio(Integer id, String ruta){
		
		ScriptingContainer contenedor = jruby.getContainer();
		contenedor.runScriptlet(PathType.RELATIVE, ruta+jruby.SOCIORB);
		
		Object socioruby = contenedor.get("Socio");
		String sociojson = (String) contenedor.callMethod(socioruby, "leerSocio", id);
		
		JsonParser parser = new JsonParser();
		JsonObject objetoJSON = parser.parse(sociojson).getAsJsonObject();
		JsonElement elementoJSON =  objetoJSON.get("socio");
		
		SocioDTO socio = gson.fromJson(elementoJSON, SocioDTO.class);
		
		return socio;
		
	}
	
}
