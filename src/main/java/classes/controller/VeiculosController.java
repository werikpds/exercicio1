package classes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VeiculosController {
	
	@GetMapping("/hello")
	public String hello() {
		return "lista_veiculos";
	}
}
