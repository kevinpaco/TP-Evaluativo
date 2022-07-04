package ar.edu.unju.fi.pvisual.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.model.OfertasLaborales;
import ar.edu.unju.fi.pvisual.repository.IEmpleadorRepository;
import ar.edu.unju.fi.pvisual.repository.IOfertasLaboralesRepository;
import ar.edu.unju.fi.pvisual.service.IOfertasLaboralesService;

@Service
public class OfertasLaboralesServiceImp implements IOfertasLaboralesService {

	@Autowired
	IOfertasLaboralesRepository ofertasLaboralesRepository;

	@Autowired
	IEmpleadorRepository empleadorRepository;

	@Override
	public void guardarOfertas(OfertasLaborales ofertas) {
		// TODO Auto-generated method stub
		Optional<Empleadores> empleador = this.empleadorRepository.findById(ofertas.getEmpleador().getId());
		//Optional<Empleadores> empleador = this.empleadorRepository.findByCuit(new Long(3));
		ofertas.setEmpleador(empleador.get());
		ofertasLaboralesRepository.save(ofertas);
	}

	@Override
	public List<OfertasLaborales> obternerOfertas() {
		// TODO Auto-generated method stub
		return ofertasLaboralesRepository.obtenerOfertas();
	}

	@Override
	public Optional<OfertasLaborales> encontrarOferta(Long id) {
		// TODO Auto-generated method stub
		Optional<OfertasLaborales> buscarOferta = ofertasLaboralesRepository.findById(id);
		return buscarOferta;
	}

}
