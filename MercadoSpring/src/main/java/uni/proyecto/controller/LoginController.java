package uni.proyecto.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uni.proyecto.dto.PersonaDTO;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value = "test")
	public String login(final Map<String, Object> map){
		System.out.println("Probando controller spring");
		PersonaDTO persona = new PersonaDTO();
		map.put("persona", persona);
		return "test";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "result")
	public String resultado(@Valid PersonaDTO persona, BindingResult bindingresult){
		System.out.println("entrando en result...");
		if(bindingresult.hasErrors()){
			System.out.println(bindingresult.getFieldError().getDefaultMessage());
			return "test";
		}
		
		return "home";
	}
	
}
