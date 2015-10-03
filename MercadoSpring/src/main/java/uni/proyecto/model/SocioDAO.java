package uni.proyecto.model;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

import com.google.gson.Gson;

import uni.proyecto.dto.SocioDTO;
import uni.proyecto.util.JRuby;

public class SocioDAO {
	
	private JRuby jruby = new JRuby();
	private Gson gson = new Gson();

	public void createSocio(SocioDTO socio){
		
		ScriptingContainer contenedor = jruby.getContainer();
		contenedor.runScriptlet(PathType.RELATIVE, jruby.SOCIORB);
		
		String parametros = gson.toJson(socio);
		System.out.println(parametros);
		
		Object socioruby = contenedor.get("Socio");
		contenedor.callMethod(socioruby, "nuevoSocio", parametros);
		
	}
	
	public static void main(String[] args) {
		
		SocioDAO a = new SocioDAO();
		
		SocioDTO b = new SocioDTO();
		b.setNombres("aa");
		b.setPaterno("paterno");
		b.setEstadocivil(1);
		b.setSexo(2);
		
		a.createSocio(b);
		
	}
	
}
