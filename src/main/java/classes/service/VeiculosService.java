package classes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classes.model.Calculadora;
import classes.model.Veiculo;
import classes.repository.VeiculosRepository;

@Service
public class VeiculosService {
	
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	
	public java.util.List<Veiculo> listarTodos (){
		java.util.List<Veiculo> veiculos = veiculosRepo.findAll();
		for (Veiculo veiculo: veiculos) {
			veiculo.setAutonomia(calculadora.calculaAutonomia(veiculo.getLitrosTanque(), veiculo.getMediaKM()));
		}
		return veiculos;
	}

}
