package ar.edu.unju.fi.pvisual.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.repository.IEmpleadorRepository;
import ar.edu.unju.fi.pvisual.service.IEmpleadorService;

@Service
public class EmpleadorServiceImp implements IEmpleadorService{

	@Autowired
	private IEmpleadorRepository empleadorRepository;
	
	@Override
	public void guardarEmpleador(Empleadores empleador) {
		// TODO Auto-generated method stub
		empleadorRepository.save(empleador);
	}

}
