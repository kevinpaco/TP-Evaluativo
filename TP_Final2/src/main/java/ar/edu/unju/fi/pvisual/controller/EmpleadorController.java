package ar.edu.unju.fi.pvisual.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		model.addAttribute("datosEmpleador", new Empleadores());
		return "empleador_form";
	}

	@PostMapping("/guardarEmp")
	public ModelAndView empleadoGuardar(@Valid @ModelAttribute("datosEmpleador") Empleadores empleador,
			BindingResult bindingResult) {
		
		/*Empleadores empleadorewa = this.repository.findByCuit(empleador.getCuit();
		if( !empleadorewa.getCuit().equals(null) ) {
			
		}*/

		if (bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("empleador_form");
			mav.addObject("datosEmpleador", empleador);
			logger.info("Ocurrio un error en el Formulario");
			return mav;
		} else {
			Empleadores empleadore = empleadorService.guardarEmpleador(empleador);
			ModelAndView mav = new ModelAndView("principal");
			mav.addObject("empleador", empleadore);
			logger.info("El envio del formulario fue un exito");
			return mav;
		}
	}
	/*@GetMapping("/principal/{cuit}")
	public String getPrincipal(Model model,@PathVariable(name= "cuit")Long cuit ) {
		model.addAttribute("empleador", empleadorService.encontrarEmpleador(cuit));
		return "principal";
	}*/

	@GetMapping("/mostrarEmp/{id}")
	public String VerDatosEmpleador(@PathVariable Long id, Model model) {
		Optional<Empleadores> encon = empleadorService.encontrarEmpleador(id);
		if(empleadorService.encontrarEmpleador(id).equals(encon)) {
			System.out.println("entro a la pagina de los datos");
			model.addAttribute("datosEmp", encon.get());
			return "Ver_datos_empleador";
		}
		System.out.println("No entro");
		return "Ver_datos_empleador";
	}
	  
	@GetMapping("/editar/{id}")
	public String editarEmp(@PathVariable Long id, Model model) {
		Optional<Empleadores> modEmpleador = empleadorService.encontrarEmpleador(id);
		model.addAttribute("datosEmpleador", modEmpleador);
		return "empleador_form";
		
		
		
	}
	
	
	  /*@PostMapping("/guardarEmp") 
	  public String guadarEmpleador(@Valid @ModelAttribute("datos")Empleadores datos,BindingResult result, Model model) { 
		  if(result.hasErrors()) {
	             logger.info("ocurrio un error");
	             model.addAttribute("datosEmpleador", datos);
	            return "empleador_form";
	            }else {
	            	try {
	                        empleadorService.guardarEmpleador(datos); }catch (Exception e){
	  
	                         model.addAttribute("FormErrorMessage", e.getMessage()); }
	               return "redirect:/empleador/principal"; }
	  
	  
	  }*/
	 

}
