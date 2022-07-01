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

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.service.IEmpleadorService;


@Controller
@RequestMapping("/empleador")
public class EmpleadorController {
  
	Logger logger = LoggerFactory.getLogger(EmpleadorController.class);
	
	@Autowired
    IEmpleadorService empleadorService;
	
	@Autowired
	private Empleadores empleador;

	
	@GetMapping("/formulario")
	public String getEmpleador(Model model) {
		model.addAttribute("datosEmpleador",new Empleadores());
		return "empleador_form";
	}
	
    @PostMapping("/guardarEmp")
     public ModelAndView empleadoGuardar(@Valid @ModelAttribute("datosEmpleador") Empleadores empleador, BindingResult bindingResult) {
    	 
    	 if(bindingResult.hasErrors()) {
    		  ModelAndView mav = new ModelAndView("empleador_form");
    		  mav.addObject("datosEmpleador", empleador);
    		  logger.info("Ocurrio un error en el Formulario");
    		  return mav;
    	 }else {
    	   empleadorService.guardarEmpleador(empleador);    	
    	   ModelAndView mav = new ModelAndView("redirect:/pagina/principal");
    	   logger.info("El envio del formulario fue un exito");
    	   return mav;}
     }
    
    @GetMapping("/mostrarEmp")
    public String VerDatosEmpleador(Model model)
    {
    	model.addAttribute("datosEmp", empleadorService.obternerEmplador());
    	return "Ver_datos_empleador";
    }
     
	/*@PostMapping("/guardar")
	public String guadarEmpleador(@Valid @ModelAttribute("datos")Empleadores datos,BindingResult result, Model model) {
		if(result.hasErrors()) {
			logger.info("ocurrio un error");
			model.addAttribute("datosEmpleador", datos);
			return "empleador_form";
		}else {			
			try {
				empleadorService.guardarEmpleador(datos);
			}catch (Exception e){
				
				model.addAttribute("FormErrorMessage", e.getMessage());
			}
			return "redirect:/pagina/principal";
		}
		
		
	}*/
    
}
