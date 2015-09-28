package uni.proyecto.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstablecimientoDTO {

	private Integer id, estado;
	private String tipo, numero, pabellon, giro, mapakey;
	private Double precio;
	private Date created_at, updated_at;
	private List<EstablecimientoFotoDTO> lstFotos = new ArrayList<EstablecimientoFotoDTO>();
	
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
	public String getPabellon() {
		return pabellon;
	}
	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getMapakey() {
		return mapakey;
	}
	public void setMapakey(String mapakey) {
		this.mapakey = mapakey;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
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
	public List<EstablecimientoFotoDTO> getLstFotos() {
		return lstFotos;
	}
	public void setLstFotos(List<EstablecimientoFotoDTO> lstFotos) {
		this.lstFotos = lstFotos;
	}

}
