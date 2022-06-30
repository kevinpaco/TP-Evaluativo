package ar.edu.unju.fi.pvisual.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.service.IUsuarioService;







@Controller
@RequestMapping("/pagina")
public class PrincipalController {

    @Autowired
    IUsuarioService usuarioService;
	
	@GetMapping("/principal")
	public String getPrincipal(Model model) {
	       model.addAttribute("datos", usuarioService.obtenerUsuarios());
	
		return "principal";
	}   
   
}
