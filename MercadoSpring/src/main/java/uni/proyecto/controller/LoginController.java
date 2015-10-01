package uni.proyecto.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uni.proyecto.dto.PersonaDTO;
import uni.proyecto.dto.UsuarioDTO;

@Controller
@RequestMapping("/usuario")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET, value = "valida.htm")
	public ModelAndView login(){
		System.out.println("entro a login");
		UsuarioDTO usuario = new UsuarioDTO();
		ModelAndView model = new ModelAndView("login", "usuario", usuario);
		
		return model;
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
	
}
