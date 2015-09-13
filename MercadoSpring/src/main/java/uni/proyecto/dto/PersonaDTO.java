package uni.proyecto.dto;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PersonaDTO {
	
	@NotNull(message = "Valio madreeeee")
	private Integer id;
	
	@Size(min = 2, max = 100, message = "No cumple con el tamaño")
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String nombres, paterno, materno, condicion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	public static void main(String[] args) {
		
		PersonaDTO persona = new PersonaDTO();
		persona.setCondicion("");
		
		ValidatorFactory fabrica = Validation.buildDefaultValidatorFactory();
		Validator validador = fabrica.getValidator();
		
		Set<ConstraintViolation<PersonaDTO>> violaciones = validador.validate(persona);
		for(ConstraintViolation<PersonaDTO> c : violaciones){
			System.out.println(c.getMessage());
		}
		
	}
	
}
