package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Usuarios {

	 private Long dni;
	 private Long NroTrámite;
	 private String Email;
	 private String EstadoCivil;
	 private String provincia;
	 private Long telefono;
	 private LocalDate fechaNacimiento;
	 private String contraseña;
	public Usuarios() {
		super();
	}
	public Usuarios(Long dni, Long nroTrámite, String email, String estadoCivil, String provincia, Long telefono,
			LocalDate fechaNacimiento, String contraseña) {
		super();
		this.dni = dni;
		NroTrámite = nroTrámite;
		Email = email;
		EstadoCivil = estadoCivil;
		this.provincia = provincia;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.contraseña = contraseña;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public Long getNroTrámite() {
		return NroTrámite;
	}
	public void setNroTrámite(Long nroTrámite) {
		NroTrámite = nroTrámite;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEstadoCivil() {
		return EstadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	 
	 
}
