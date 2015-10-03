package uni.proyecto.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UsuarioDTO {

	private Integer id;
	
	@NotEmpty(message = "El usuario no puede estar vacio")
	@Pattern(regexp = "[A-Za-z\u00f1\u00d1]{1,20}", message = "No se aceptan caracteres especiales")
	@Size(min = 2, max = 5, message = "El nombre de usuario debe estar entre 2 a 5")
	private String usuario;
	
	@NotEmpty(message = "La clave no puede estar vacia")
	private String clave;
	
	private String nombrecompleto;
	private String correo;
	private String token;
	private byte[] foto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
