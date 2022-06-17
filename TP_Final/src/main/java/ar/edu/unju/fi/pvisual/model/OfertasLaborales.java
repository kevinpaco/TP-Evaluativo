package ar.edu.unju.fi.pvisual.model;

import org.springframework.stereotype.Component;

@Component
public class OfertasLaborales {
     
	private int cantidadVacantes;
	private String puestorequerido;
	private String resumenPuesto;
	private String disponHoraria;
	private String principalesTareas;
	private long datosContacto;
	private  String Jornada;
	private String requisitos;
	private double salario;
	private String beneficios;
	private boolean disponible;
	public OfertasLaborales() {
		super();
	}
	public OfertasLaborales(int cantidadVacantes, String puestorequerido, String resumenPuesto, String disponHoraria,
			String principalesTareas, long datosContacto, String jornada, String requisitos, double salario,
			String beneficios, boolean disponible) {
		super();
		this.cantidadVacantes = cantidadVacantes;
		this.puestorequerido = puestorequerido;
		this.resumenPuesto = resumenPuesto;
		this.disponHoraria = disponHoraria;
		this.principalesTareas = principalesTareas;
		this.datosContacto = datosContacto;
		Jornada = jornada;
		this.requisitos = requisitos;
		this.salario = salario;
		this.beneficios = beneficios;
		this.disponible = disponible;
	}
	public int getCantidadVacantes() {
		return cantidadVacantes;
	}
	public void setCantidadVacantes(int cantidadVacantes) {
		this.cantidadVacantes = cantidadVacantes;
	}
	public String getPuestorequerido() {
		return puestorequerido;
	}
	public void setPuestorequerido(String puestorequerido) {
		this.puestorequerido = puestorequerido;
	}
	public String getResumenPuesto() {
		return resumenPuesto;
	}
	public void setResumenPuesto(String resumenPuesto) {
		this.resumenPuesto = resumenPuesto;
	}
	public String getDisponHoraria() {
		return disponHoraria;
	}
	public void setDisponHoraria(String disponHoraria) {
		this.disponHoraria = disponHoraria;
	}
	public String getPrincipalesTareas() {
		return principalesTareas;
	}
	public void setPrincipalesTareas(String principalesTareas) {
		this.principalesTareas = principalesTareas;
	}
	public long getDatosContacto() {
		return datosContacto;
	}
	public void setDatosContacto(long datosContacto) {
		this.datosContacto = datosContacto;
	}
	public String getJornada() {
		return Jornada;
	}
	public void setJornada(String jornada) {
		Jornada = jornada;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}