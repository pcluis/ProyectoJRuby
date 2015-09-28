package uni.proyecto.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FichaDTO {

	private Integer id, estado;
	private String observacion;
	private Date fecharegistro, created_at, updated_at;
	
	private List<SocioFichaDTO> lstSocioFichaDTO = new ArrayList<SocioFichaDTO>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
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
	public List<SocioFichaDTO> getLstSocioFichaDTO() {
		return lstSocioFichaDTO;
	}
	public void setLstSocioFichaDTO(List<SocioFichaDTO> lstSocioFichaDTO) {
		this.lstSocioFichaDTO = lstSocioFichaDTO;
	}

}
