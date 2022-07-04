package ar.edu.unju.fi.pvisual.repository;

import java.util.List; 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.pvisual.model.Empleadores;

public interface IEmpleadorRepository extends JpaRepository<Empleadores, Long>{
	
	@Query("from Empleadores a order by a.cuit")
    public List<Empleadores> obtenerEmpleador();
	
	public Optional<Empleadores> findById(Long id);
}
