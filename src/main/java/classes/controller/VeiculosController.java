package classes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import classes.model.Veiculo;
import classes.repository.VeiculosRepository;
import classes.service.VeiculosService;

@Controller
public class VeiculosController {
	
	//@Autowired
	private VeiculosRepository veiculosRepo;
	
	@Autowired
	private VeiculosService veicService;
	
	@Autowired
	public VeiculosController(VeiculosRepository veicRepo){
		this.veiculosRepo = veicRepo;
	}
	
	@GetMapping("/lista")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("lista_veiculos");
		java.util.List<Veiculo> veiculos = veicService.listarTodos();
		mv.addObject(new Veiculo());
		mv.addObject("veiculos", veiculos);
		return mv;
	}
	
	@PostMapping("/lista")
	public String salvar (Veiculo veiculo) {
		veiculo.setId((long) 0);
		java.util.List<Veiculo> veiculos = veicService.listarTodos();
		for(int i = 0; i < veiculos.size(); i++) {
			if(veiculos.get(i).getId() > veiculo.getId()) veiculo.setId(veiculos.get(i).getId());
			else veiculo.setId(veiculo.getId()+1);
		}
		veicService.salvar(veiculo);
		return "redirect:/lista";
	}
	
	
	@Autowired
	public VeiculosRepository getVeiculosRepo() {
		return veiculosRepo;
	}

	@Autowired
	public void setVeiculosRepo(VeiculosRepository veiculosRepo) {
		this.veiculosRepo = veiculosRepo;
	} 
	
	
}
