package ar.edu.unju.fi.pvisual.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.service.IEmpleadorService;
import ar.edu.unju.fi.pvisual.until.ListaEmpleador;

@Service("empleadorServ")
public class EmpleadorServiceImp implements IEmpleadorService {

	 @Autowired
	 private ListaEmpleador listaEmpleador;
	
	@Override
	public Empleadores getEmpleador() {
		// TODO Auto-generated method stub
		return new Empleadores();
	}

	@Override
	public boolean guardarEmpleado(Empleadores datos) {
		// TODO Auto-generated method stub
		boolean resp = listaEmpleador.getListaEmpleador().add(datos);
		return resp;
	}

	@Override
	public void modificarEmpleado(Empleadores datos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarEmpleado(Empleadores datos) {
		// TODO Auto-generated method stub

	}

	@Override
	public ListaEmpleador getListaEmpleado() {
		// TODO Auto-generated method stub
		return listaEmpleador;
	}

	@Override
	public Empleadores buscarEmpleador(int cuit) {
		// TODO Auto-generated method stub
		return null;
	}

}
