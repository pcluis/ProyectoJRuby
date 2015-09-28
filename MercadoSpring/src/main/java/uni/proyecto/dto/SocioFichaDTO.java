package uni.proyecto.dto;

import java.util.Date;

public class SocioFichaDTO {
	
	private Integer id, socios_id, fichas_id, establecimientos_id;
	private Double preciocompra;
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
	public Integer getFichas_id() {
		return fichas_id;
	}
	public void setFichas_id(Integer fichas_id) {
		this.fichas_id = fichas_id;
	}
	public Integer getEstablecimientos_id() {
		return establecimientos_id;
	}
	public void setEstablecimientos_id(Integer establecimientos_id) {
		this.establecimientos_id = establecimientos_id;
	}
	public Double getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(Double preciocompra) {
		this.preciocompra = preciocompra;
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
