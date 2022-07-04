package ar.edu.unju.fi.pvisual.service;


import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.pvisual.model.OfertasLaborales;

public interface IOfertasLaboralesService {

	public void guardarOfertas(OfertasLaborales ofertas);
	
	public List<OfertasLaborales> obternerOfertas();
	
	public Optional<OfertasLaborales> encontrarOferta(Long id);
}
