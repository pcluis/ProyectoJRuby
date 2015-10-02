package uni.proyecto.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import uni.proyecto.dto.PersonaDTO;
import uni.proyecto.dto.UsuarioDTO;

@Controller
@RequestMapping("/")
public class LoginController extends WebMvcConfigurerAdapter {
	
	@RequestMapping(method = RequestMethod.POST, value = "valida.html")
	public ModelAndView login(@Valid UsuarioDTO usuario, BindingResult bindingresult){

		if(bindingresult.hasErrors()){
			System.out.println("Error");
			return new ModelAndView("login.html", "usuarioDTO", usuario);
		}
		System.out.println("Exito");
		return new ModelAndView("login.html", "usuarioDTO", usuario);
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
