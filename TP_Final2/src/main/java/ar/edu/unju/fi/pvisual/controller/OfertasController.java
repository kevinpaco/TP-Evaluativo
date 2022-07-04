package ar.edu.unju.fi.pvisual.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.pvisual.model.Empleadores;
import ar.edu.unju.fi.pvisual.model.OfertasLaborales;
import ar.edu.unju.fi.pvisual.service.IEmpleadorService;
import ar.edu.unju.fi.pvisual.service.IOfertasLaboralesService;

@Controller
@RequestMapping("/ofertas")
public class OfertasController {

	@Autowired
	IOfertasLaboralesService ofertasLaboralesService;
	@Autowired
	private OfertasLaborales ofertasLaborales;
     @Autowired
     IEmpleadorService encontrarEmp;
     
     private Long a;
     
	@GetMapping("/ofertar/{id}")
	public String getOfertar(@PathVariable Long id, Model model) {
        Optional<Empleadores> encontrado = encontrarEmp.encontrarEmpleador(id);
	    a = id;
        ofertasLaborales.setEmpleador(encontrado.get());
        model.addAttribute("ofertas", ofertasLaborales);
		return "crear_oferta";
	}

	/*@PostMapping("/guardar")
	public String guardarOferta(@Valid OfertasLaborales ofertasLaborales, Model model) {

		ofertasLaboralesService.guardarOfertas(ofertasLaborales);
		/*Falta investigar como sacar un objeto del html,
		 * y verificar si el objeto esta ya en esta pagina
		 * ModelAndView mav = new ModelAndView("redirect:/pagina/principal");
		mav.addObject("empleador", empleadore);
		return "principal";
	}*/
	@PostMapping("/guardar")
	public ModelAndView guardarOferta(@Valid OfertasLaborales ofertasLaborales, Model model) {

		ofertasLaboralesService.guardarOfertas(ofertasLaborales);
		Optional<Empleadores> enc = encontrarEmp.encontrarEmpleador(a);
	   
		if(encontrarEmp.encontrarEmpleador(a).equals(enc)) {                 
		                                                    // Optional<Empleadores> enc = encontrarEmp.encontrarEmpleador(ofertasLaborales.getEmpleador().getId());
		ModelAndView mav = new ModelAndView("principal");
		List<Empleadores> emp = encontrarEmp.obternerEmplador();

		mav.addObject("empleador", enc.get());
		System.out.println("entro");
		return mav;
		
		}
		System.out.println("no esta entrando");
	   ModelAndView mav = new ModelAndView("principal");
		/*Falta investigar como sacar un objeto del html,
		 * y verificar si el objeto esta ya en esta pagina
		 * ModelAndView mav = new ModelAndView("redirect:/pagina/principal");
		mav.addObject("empleador", empleadore);*/
		return mav; 
	}
	@GetMapping("/misOfertas/{id}")
	public String verMisOfertas(@PathVariable Long id, Model model) {
		Optional<OfertasLaborales> verOfertas = ofertasLaboralesService.encontrarOferta(id);
		if(ofertasLaboralesService.encontrarOferta(id).equals(verOfertas)) {
			System.out.println("si entro: "+id);
			System.out.println(verOfertas);
			model.addAttribute("verOferta", verOfertas.get().getBeneficios());
		}
		else {
			System.out.println("No entro");
		}
			
		
		
		
		return "ver_ofertas";
		
	}

	@GetMapping("/principal_usu")
	public String getVistaUsusario(Model model) {
		List<OfertasLaborales> listaOfertas = ofertasLaboralesService.obternerOfertas();

		model.addAttribute("datos", listaOfertas);
		return "principal_usuario";
	}

}
