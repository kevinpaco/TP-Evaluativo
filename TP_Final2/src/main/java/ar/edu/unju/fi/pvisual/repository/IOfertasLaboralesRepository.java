package ar.edu.unju.fi.pvisual.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.pvisual.model.OfertasLaborales;

public interface IOfertasLaboralesRepository extends JpaRepository<OfertasLaborales, Long >{

	@Query("from OfertasLaborales e order by e.puestorequerido")
	public List<OfertasLaborales> obtenerOfertas();
}
