package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Empleadores {
 
	 private Long cuit;
	 private String contraseña;
	 private String razonSocial;
	 private String nombreComercial;
	 private LocalDate inicioActividad;
	 private String email;
	 private Long telefono;
	private String domicilio;
	private String provincia;
	private String paginaWeb;
	private String descripcion;
	public Empleadores() {
		super();
	}
	public Empleadores(Long cuit, String contraseña, String razonSocial, String nombreComercial,
			LocalDate inicioActividad, String email, Long telefono, String domicilio, String provincia,
			String paginaWeb, String descripcion) {
		super();
		this.cuit = cuit;
		this.contraseña = contraseña;
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.inicioActividad = inicioActividad;
		this.email = email;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.provincia = provincia;
		this.paginaWeb = paginaWeb;
		this.descripcion = descripcion;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonsSocial) {
		this.razonSocial = razonsSocial;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public LocalDate getInicioActividad() {
		return inicioActividad;
	}
	public void setInicioActividad(LocalDate inicioActividad) {
		this.inicioActividad = inicioActividad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPaginaWeb() {
		return paginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
