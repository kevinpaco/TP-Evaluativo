package ar.edu.unju.fi.pvisual.service;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.until.ListaEmpleador;

public interface IEmpleadorService {
       
	 public Empleadores getEmpleador();
	 public boolean guardarEmpleado(Empleadores datos);
	 public void modificarEmpleado(Empleadores datos);
	 public void eliminarEmpleado(Empleadores datos);
	 public ListaEmpleador getListaEmpleado();
	 public Empleadores buscarEmpleador(int cuit);
}
