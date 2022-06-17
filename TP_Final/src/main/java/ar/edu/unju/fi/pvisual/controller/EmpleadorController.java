package ar.edu.unju.fi.pvisual.controller;

 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.service.IEmpleadorService;

@Controller
@RequestMapping("/empleador")
public class EmpleadorController {
  
	Logger logger = LoggerFactory.getLogger(EmpleadorController.class);
	
	@Autowired
	@Qualifier("empleadorServ")
	private IEmpleadorService empleadorService;
	
	@GetMapping("/formulario")
	public String getEmpleador(Model model) {
		model.addAttribute("datos", new Empleadores());
		return "empleador_form";
	}
	
     @PostMapping("/guardar")
     public ModelAndView empleadoGuardar(@ModelAttribute("datos")Empleadores datos) {
    	 ModelAndView mav = new ModelAndView("redirect:/pagina/principal");
    	 empleadorService.guardarEmpleado(datos);
    	 logger.info("se guarda los datos del Empleador");
    	 return mav;
    	 
     }
	
}
