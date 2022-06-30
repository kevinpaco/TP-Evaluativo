package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;   

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name = "usuarios")
public class Usuarios {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	 private Long dni;
	  
	  @Column(name = "NUR_TRAMITE")
	 private Long nroTrámite;
	  
	 @Column(name = "EMAIL")
	 @NotEmpty(message = "Debe ingresar un Mail")
	 @Email
	 private String email;
	 
	 @Column(name = "ESTADO_CIVIL")
	 @NotEmpty(message = "Debe ingresar el estado Civil")
	 private String estadoCivil;
	 
	 @Column(name = "PROVINCIA")
	 @NotEmpty(message = "Debe ingresar la Provincia" )
	 private String provincia;
	 
	 @Column(name = "TELEFONO")
	 //@Size(min=10, message = "El numero de tener minimo 10 dijitos" )
	 private Long telefono;
	 
	 @Column(name = "FECHA_DE_NACIMIENTO")
     @NotNull
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private LocalDate fechaNacimiento;
	 
	@Column(name = "CONTRASEÑA")
	@NotEmpty(message = "Debe ingresar la Contraseña" )
	 private String contraseña;
	
	 public Usuarios() {
		super();
	}
	public Usuarios(Long dni, Long nroTrámite, String email, String estadoCivil, String provincia, Long telefono,
			LocalDate fechaNacimiento, String contraseña) {
		super();
		this.dni = dni;
		this.nroTrámite = nroTrámite;
		this.email = email;
		this.estadoCivil = estadoCivil;
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
		return nroTrámite;
	}
	public void setNroTrámite(Long nroTrámite) {
		this.nroTrámite = nroTrámite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
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
