package classes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String modelo, marca, cor;
	private int anoFabiracacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFabiracacao() {
		return anoFabiracacao;
	}
	public void setAnoFabiracacao(int anoFabiracacao) {
		this.anoFabiracacao = anoFabiracacao;
	}
	
	
}
