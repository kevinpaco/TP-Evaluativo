package ar.edu.unju.fi.pvisual.service;

import java.util.List;

import ar.edu.unju.fi.pvisual.model.Usuarios;

public interface IUsuarioService {

	public void guardarUsuario(Usuarios usuario);
	
	public List<Usuarios> obtenerUsuarios();

}
