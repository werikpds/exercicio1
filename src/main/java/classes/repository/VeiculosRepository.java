package classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.model.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long> {
	
}
