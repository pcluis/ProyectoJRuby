package uni.proyecto.dto;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class SocioDTO {
	
	private Integer id, sexo, estadocivil, tipodocumento;
	
	@NotEmpty()
	private String nombres, paterno, materno;
	
	@NotEmpty
	@Length(min = 8, max = 11)
	private String numerodocumento;
	
	private Date fechanacimiento;
	private byte[] foto, huella, firma;
	
	
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
	public Integer getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(Integer tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

}
