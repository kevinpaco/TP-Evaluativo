package ar.edu.unju.fi.pvisual.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.pvisual.model.Usuarios;

public interface IUsuarioDAO extends JpaRepository<Usuarios, Long>{
      
	@Query("from Usuarios e order by e.provincia")
	public List<Usuarios> obtenerUsuarios();
}
