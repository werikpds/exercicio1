package classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import classes.model.Veiculo;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculo, Long> {
	
}
