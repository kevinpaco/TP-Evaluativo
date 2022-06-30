package ar.edu.unju.fi.pvisual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.model.OfertasLaborales;
import ar.edu.unju.fi.pvisual.service.IOfertasLaboralesService;

@Controller
@RequestMapping("/ofertas")
public class OfertasController {

	@Autowired 
	IOfertasLaboralesService ofertasLaboralesService;
	@Autowired
	private OfertasLaborales ofertasLaborales;
	
	 @GetMapping("/ofertar")
	   public String getOfertar(Model model) {
		   model.addAttribute("ofertas", ofertasLaborales);
		   return "crear_oferta";
	   }
	 
	 @PostMapping("/guardar")
	 public String guardarOferta(@Valid OfertasLaborales ofertasLaborales, Model model) {
		 
		 ofertasLaboralesService.guardarOfertas(ofertasLaborales);
		 
		 return "redirect:/pagina/principal";
	 }
	
	 @GetMapping("/principal_usu")
	   public String getVistaUsusario(Model model) {
		  List<OfertasLaborales> listaOfertas = ofertasLaboralesService.obternerOfertas();
		 
		   model.addAttribute("datos", listaOfertas);
		   return "principal_usuario";
	   }
	
}
