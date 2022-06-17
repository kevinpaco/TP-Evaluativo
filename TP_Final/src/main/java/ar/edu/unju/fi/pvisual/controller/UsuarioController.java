package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Usuarios;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
      
	@GetMapping("/formulario")
	public String getUsuario(Model model) {
		
		return "usuario_form";
	}
	
	@PostMapping("/guardar")
	public ModelAndView Guardar(@ModelAttribute("datos")Usuarios datos) {
		ModelAndView mav = new ModelAndView("redirect:/pagina/principal_usu");
		
		return mav;
	}
	
}
