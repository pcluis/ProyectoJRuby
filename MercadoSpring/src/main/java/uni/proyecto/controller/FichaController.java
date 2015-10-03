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

import uni.proyecto.dto.SocioDTO;
import uni.proyecto.util.ListasEstaticas.ESTADOCIVIL;
import uni.proyecto.util.ListasEstaticas.GENERO;
import uni.proyecto.util.ListasEstaticas.TIPODOCUMENTO;

@Controller
public class FichaController {

	@RequestMapping(value = "registrarficha.html", method = RequestMethod.POST)
	public ModelAndView registrarSocio(@Valid SocioDTO socioDTO, BindingResult bindingresult){
		
		if(bindingresult.hasErrors()){
			return new ModelAndView("registrarficha.html", "socioDTO", socioDTO);
		}
		
		return new ModelAndView();
		
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
