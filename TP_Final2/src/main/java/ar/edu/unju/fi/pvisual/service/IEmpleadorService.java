package ar.edu.unju.fi.pvisual.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.pvisual.model.Empleadores;

public interface IEmpleadorService {

	public Empleadores guardarEmpleador(Empleadores empleador);
	
	public List<Empleadores> obternerEmplador();
	
	public Optional<Empleadores> encontrarEmpleador(Long cuit);
}
