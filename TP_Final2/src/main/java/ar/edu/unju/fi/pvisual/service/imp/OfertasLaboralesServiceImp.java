package ar.edu.unju.fi.pvisual.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.OfertasLaborales;
import ar.edu.unju.fi.pvisual.repository.IOfertasLaboralesRepository;
import ar.edu.unju.fi.pvisual.service.IOfertasLaboralesService;

@Service
public class OfertasLaboralesServiceImp implements IOfertasLaboralesService {

	@Autowired
	IOfertasLaboralesRepository ofertasLaboralesRepository;
	@Override
	public void guardarOfertas(OfertasLaborales ofertas) {
		// TODO Auto-generated method stub
	ofertasLaboralesRepository.save(ofertas);	
	}
	@Override
	public List<OfertasLaborales> obternerOfertas() {
		// TODO Auto-generated method stub
		return ofertasLaboralesRepository.obtenerOfertas();
	}

	
}
