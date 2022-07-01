package ar.edu.unju.fi.pvisual.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Usuarios;
import ar.edu.unju.fi.pvisual.repository.IUsuarioRepository;
import ar.edu.unju.fi.pvisual.service.IUsuarioService;

@Service
public class UsuarioServiceImp implements IUsuarioService{
    @Autowired
    IUsuarioRepository usuarioRepository;
    
	@Override
	public void guardarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuarios> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.obtenerUsuarios();
	}

}
