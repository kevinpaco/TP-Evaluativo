package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.model.Curriculum;
import ar.edu.unju.fi.pvisual.model.OfertasLaborales;
import ar.edu.unju.fi.pvisual.until.ListOfertas;

@Controller
@RequestMapping("/pagina")
public class PrincipalController {

	@GetMapping("/principal")
	public String getPrincipal(Model model) {
	    ListOfertas listaOfertas= new ListOfertas(); 
		model.addAttribute("datos", listaOfertas.getOfert());
		return "principal";
	}
   @GetMapping("/ofertar")
   public String getOfertar(Model model) {
	   model.addAttribute("ofertas", new OfertasLaborales());
	   return "crear_oferta";
   }
   
   @GetMapping("/principal_usu")
   public String getVistaUsusario(Model model) {
	   ListOfertas list=new ListOfertas();
	   model.addAttribute("datos", list.getOfert());
	   
	   return "principal_usuario";
   }
   
   @GetMapping("/curriculum")
   public String getCurriculum(Model model) {
	   model.addAttribute("curriculos",new Curriculum());
	   
	   return "curriculum";
   }
}
