package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "curriculum")
public class Curriculum {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TELEFONO")
	private long telefono;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "CARNET_CONDUCCION")
	private String carnetConducir;

	@Column(name = "FECHA_NACIMIENTO")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha_na;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "EXPERIENCIA")
	private int experiencia;
	
	@Column(name = "EDUCASION")
	private String educasion;
	
	@Column(name = "IDIOMAS")
	private String idiomas;
	
	@Column(name = "CONOSIMIENTOS_INFORMATICA")
	private String conosimientosInfor;
	
	@Column(name = "EXPERIENCIA_LABORAL")
	private String experiencialabo;
	
	@Column(name = "INFORMACION")
	private String info;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "PAIS")
	private String pais;
	public Curriculum() {
		super();
	}
	public Curriculum(String nombre, String apellido, String carnetConducir, LocalDate fecha_na, String email,
			long telefono, int experiencia, String educasion, String idiomas, String conosimientosInfor,
			String experiencialabo, String info, String direccion, String pais) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.carnetConducir = carnetConducir;
		this.fecha_na = fecha_na;
		this.email = email;
		this.telefono = telefono;
		this.experiencia = experiencia;
		this.educasion = educasion;
		this.idiomas = idiomas;
		this.conosimientosInfor = conosimientosInfor;
		this.experiencialabo = experiencialabo;
		this.info = info;
		this.direccion = direccion;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarnetConducir() {
		return carnetConducir;
	}
	public void setCarnetConducir(String carnetConducir) {
		this.carnetConducir = carnetConducir;
	}
	public LocalDate getFecha_na() {
		return fecha_na;
	}
	public void setFecha_na(LocalDate fecha_na) {
		this.fecha_na = fecha_na;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getEducasion() {
		return educasion;
	}
	public void setEducasion(String educasion) {
		this.educasion = educasion;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getConosimientosInfor() {
		return conosimientosInfor;
	}
	public void setConosimientosInfor(String conosimientosInfor) {
		this.conosimientosInfor = conosimientosInfor;
	}
	public String getExperiencialabo() {
		return this.experiencialabo;
	}
	public void setExperiencialabo(String experiencialabo) {
		this.experiencialabo = experiencialabo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
