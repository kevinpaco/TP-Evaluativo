package ar.edu.unju.fi.pvisual.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.model.Curriculum;
import ar.edu.unju.fi.pvisual.service.ICurriculumService;

@Controller
@RequestMapping("/curriculum")
public class CurriculumController {

	@Autowired
	ICurriculumService curriculumService;
	
	@Autowired
	private Curriculum curriculumDatos;
	
	@GetMapping("/datos")
	public String MostrarCurri(Model model) {
		    model.addAttribute("datos", curriculumDatos);
		return "curriculum";
	}
	
	@PostMapping("/guardar")
	public String guardarCurriculum(@Valid Curriculum curriculum, Model model ) {
	       curriculumService.guardarCurriculum(curriculum);
		return "redirect:/pagina/principal_usu";
	}
}
