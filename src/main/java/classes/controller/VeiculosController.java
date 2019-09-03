package classes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		mv.addObject(new Veiculo());
		return mv;
	}
	
	@PostMapping("/lista")
	public String salvar (Veiculo veiculo) {
		veiculo.setId((long) 0);
		java.util.List<Veiculo> veiculos = veiculosRepo.findAll();
		for(int i = 0; i < veiculos.size(); i++) {
			if(veiculos.get(i).getId() > veiculo.getId()) veiculo.setId(veiculos.get(i).getId());
			else veiculo.setId(veiculo.getId()+1);
		}
		veiculosRepo.save(veiculo);
		return "redirect:/lista";
	} 
}
