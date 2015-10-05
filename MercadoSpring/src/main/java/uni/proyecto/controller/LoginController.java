package uni.proyecto.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import uni.proyecto.dto.PersonaDTO;
import uni.proyecto.dto.SocioDTO;
import uni.proyecto.dto.UsuarioDTO;
import uni.proyecto.util.ListasEstaticas.ESTADOCIVIL;
import uni.proyecto.util.ListasEstaticas.GENERO;
import uni.proyecto.util.ListasEstaticas.TIPODOCUMENTO;

@Controller
@RequestMapping("/")
public class LoginController extends WebMvcConfigurerAdapter {
	
	@RequestMapping(method = RequestMethod.POST, value = "valida.html")
	public ModelAndView login(@Valid UsuarioDTO usuario, BindingResult bindingresult){

		if(bindingresult.hasErrors()){
			return new ModelAndView("login", "usuarioDTO", usuario);
		}
		SocioDTO socioDTO = new SocioDTO();
		return new ModelAndView("dashboard", "socioDTO", socioDTO);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "result")
	public String resultado(@Valid PersonaDTO persona, BindingResult bindingresult){
		System.out.println("entrando en result...");
		if(bindingresult.hasErrors()){
			System.out.println(bindingresult.getFieldError().getDefaultMessage());
			return "test";
		}
		
		return "home";
	}
	
	@ModelAttribute("tipoDocumento")
	public Map<Integer, String> listarTipoDocumento(){
		
		Map<Integer, String> mapaDocumento = new HashMap<Integer, String>();
		for(TIPODOCUMENTO t : TIPODOCUMENTO.values()){
			mapaDocumento.put(t.getValue(), t.toString());
		}
		
		return mapaDocumento;
	}
	
	@ModelAttribute("genero")
	public Map<Integer, String> listarGenero(){
		
		Map<Integer, String> mapaGenero = new HashMap<Integer, String>();
		for(GENERO g : GENERO.values()){
			mapaGenero.put(g.getValue(), g.toString());
		}
		
		return mapaGenero;
	}
	
	@ModelAttribute("estadoCivil")
	public Map<Integer, String> listarEstadoCivil(){
		
		Map<Integer, String> mapaEstadoCivil = new HashMap<Integer, String>();
		for(ESTADOCIVIL e : ESTADOCIVIL.values()){
			mapaEstadoCivil.put(e.getValue(), e.toString());
		}
		
		return mapaEstadoCivil;
	}
	
}
