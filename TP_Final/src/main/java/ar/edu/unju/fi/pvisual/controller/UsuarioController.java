package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
      
	@GetMapping("/formulario")
	public String getUsuario(Model model) {
		
		return "usuario_form";
	}
	
	
}
