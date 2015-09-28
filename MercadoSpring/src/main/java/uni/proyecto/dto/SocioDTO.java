package uni.proyecto.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocioDTO {
	
	private Integer id, sexo, estadocivil;
	private String nombres, paterno, materno;
	private Date fechanacimiento, created_at, updated_at;
	private byte[] foto, huella, firma;
	
	private List<DocumentoDTO> lstDocumentos = new ArrayList<DocumentoDTO>();
	private List<DomicilioDTO> lstDomicilios = new ArrayList<DomicilioDTO>();
	private List<FichaDTO> lstFichas = new ArrayList<FichaDTO>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public Integer getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(Integer estadocivil) {
		this.estadocivil = estadocivil;
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
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public byte[] getHuella() {
		return huella;
	}
	public void setHuella(byte[] huella) {
		this.huella = huella;
	}
	public byte[] getFirma() {
		return firma;
	}
	public void setFirma(byte[] firma) {
		this.firma = firma;
	}
	public List<DocumentoDTO> getLstDocumentos() {
		return lstDocumentos;
	}
	public void setLstDocumentos(List<DocumentoDTO> lstDocumentos) {
		this.lstDocumentos = lstDocumentos;
	}
	public List<DomicilioDTO> getLstDomicilios() {
		return lstDomicilios;
	}
	public void setLstDomicilios(List<DomicilioDTO> lstDomicilios) {
		this.lstDomicilios = lstDomicilios;
	}
	public List<FichaDTO> getLstFichas() {
		return lstFichas;
	}
	public void setLstFichas(List<FichaDTO> lstFichas) {
		this.lstFichas = lstFichas;
	}

}
