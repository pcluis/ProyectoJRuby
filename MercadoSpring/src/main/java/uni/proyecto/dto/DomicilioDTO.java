package uni.proyecto.dto;

import java.util.Date;

public class DomicilioDTO {
	
	private Integer id, socios_id;
	private String direccion, codigoubigeo;
	private Date created_at, updated_at;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSocios_id() {
		return socios_id;
	}
	public void setSocios_id(Integer socios_id) {
		this.socios_id = socios_id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigoubigeo() {
		return codigoubigeo;
	}
	public void setCodigoubigeo(String codigoubigeo) {
		this.codigoubigeo = codigoubigeo;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
