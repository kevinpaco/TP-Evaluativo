package ar.edu.unju.fi.pvisual.service.imp;

import java.util.List; 
import java.util.Optional;

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
	public Empleadores guardarEmpleador(Empleadores empleador) {
		// TODO Auto-generated method stub
		return empleadorRepository.save(empleador);
	}

	@Override
	public List<Empleadores> obternerEmplador() {
		// TODO Auto-generated method stub
		return empleadorRepository.obtenerEmpleador();
	}

	@Override
	public Optional<Empleadores> encontrarEmpleador(Long cuit) {
		// TODO Auto-generated method stub
		 Optional<Empleadores> encontrado = empleadorRepository.findById(cuit);
	     return encontrado;
	}
}
