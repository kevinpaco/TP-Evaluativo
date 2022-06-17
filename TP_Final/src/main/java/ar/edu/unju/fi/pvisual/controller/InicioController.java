package ar.edu.unju.fi.pvisual.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleo")
public class InicioController {
    
	Logger logger = LoggerFactory.getLogger(InicioController.class);
	
	@GetMapping("/inicio")
	public String getInicio(Model model) {
		logger.info("se inicia la pagina");
		return "index";
	}
	
	@GetMapping("/logging")
	public String getLogging(Model model) {
		
		return "logearse";
	}
	
}
