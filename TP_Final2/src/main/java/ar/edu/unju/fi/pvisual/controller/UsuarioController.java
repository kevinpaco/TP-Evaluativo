package ar.edu.unju.fi.pvisual.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Usuarios;
import ar.edu.unju.fi.pvisual.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
	Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	private Usuarios usuario;
	
	@GetMapping("/formulario")
	public String getUsuario(Model model) {
		model.addAttribute("datos", usuario);
		return "usuario_form";
	}
	
	@PostMapping("/guardar")
	public ModelAndView Guardar(@Valid @ModelAttribute("datos") Usuarios datos, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("usuario_form");
			mav.addObject("datos", datos);
			logger.info("Ocurrio un error en el envio del formulario");
			return mav;
		}else {
		
			usuarioService.guardarUsuario(datos);
			ModelAndView mav = new ModelAndView("redirect:/ofertas/principal_usu");
			logger.info("El envio del formulario fue un exito");
			return mav;}
	}
	
}
