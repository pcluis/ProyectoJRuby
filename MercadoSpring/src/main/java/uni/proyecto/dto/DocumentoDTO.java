package uni.proyecto.dto;

import java.util.Date;

public class DocumentoDTO {

	private Integer id, socios_id;
	private String tipo, numero;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
