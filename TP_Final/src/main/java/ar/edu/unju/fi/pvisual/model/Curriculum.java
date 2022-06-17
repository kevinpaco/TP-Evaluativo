package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Curriculum {
   
	private String nombre;
	private LocalDate fecha_na;
	private String email;
	private long telefono;
	private int experiencia;
	private String primaria;
	private String secundaria;
	private String terciario;
	private String universidad;
	private String idiomas;
	private String conosimientosInfor;
	private int experiencialabo;
	private String info;
	private String domicilio;
	public Curriculum() {
		super();
	}
	public Curriculum(String nombre, LocalDate fecha_na, String email, long telefono, int experiencia, String primaria,
			String secundaria, String terciario, String universidad, String idiomas, String conosimientosInfor,
			int experiencialabo, String info, String domicilio) {
		super();
		this.nombre = nombre;
		this.fecha_na = fecha_na;
		this.email = email;
		this.telefono = telefono;
		this.experiencia = experiencia;
		this.primaria = primaria;
		this.secundaria = secundaria;
		this.terciario = terciario;
		this.universidad = universidad;
		this.idiomas = idiomas;
		this.conosimientosInfor = conosimientosInfor;
		this.experiencialabo = experiencialabo;
		this.info = info;
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getPrimaria() {
		return primaria;
	}
	public void setPrimaria(String primaria) {
		this.primaria = primaria;
	}
	public String getSecundaria() {
		return secundaria;
	}
	public void setSecundaria(String secundaria) {
		this.secundaria = secundaria;
	}
	public String getTerciario() {
		return terciario;
	}
	public void setTerciario(String terciario) {
		this.terciario = terciario;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
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
	public int getExperiencialabo() {
		return experiencialabo;
	}
	public void setExperiencialabo(int experiencialabo) {
		this.experiencialabo = experiencialabo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
