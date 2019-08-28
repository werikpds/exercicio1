package classes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import classes.model.Veiculo;
import classes.repository.VeiculosRepository;

@Controller
public class VeiculosController {
	
	@Autowired
	VeiculosRepository veiculosRepo;
	
	@GetMapping("/lista")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("lista_veiculos");
		java.util.List<Veiculo> veiculos = veiculosRepo.findAll();
		mv.addObject("veiculos", veiculos);
		return mv;
	}
}
