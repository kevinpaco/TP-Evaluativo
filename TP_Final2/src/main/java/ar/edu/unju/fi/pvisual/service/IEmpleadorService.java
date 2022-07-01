package ar.edu.unju.fi.pvisual.service;

import java.util.List;

import ar.edu.unju.fi.pvisual.model.Empleadores;

public interface IEmpleadorService {

	public void guardarEmpleador(Empleadores empleador);
	
	public List<Empleadores> obternerEmplador();
}
