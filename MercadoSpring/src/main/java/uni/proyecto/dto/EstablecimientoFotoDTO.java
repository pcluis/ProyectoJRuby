package uni.proyecto.dto;

import java.util.Date;

public class EstablecimientoFotoDTO {

	private Integer id, establecimiento_id;
	private String descricion;
	private byte[] foto;
	private Date created_at, updated_at;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEstablecimiento_id() {
		return establecimiento_id;
	}
	public void setEstablecimiento_id(Integer establecimiento_id) {
		this.establecimiento_id = establecimiento_id;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
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
