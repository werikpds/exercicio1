package classes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	//Teste com merge 222 aaa
	@Id
	@GeneratedValue
	private Long id;
	private String modelo, marca, cor;
	private int anoFabricacao;
	private double mediaKM, litrosTanque, autonomia;
	
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
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getMediaKM() {
		return mediaKM;
	}
	public void setMediaKM(double mediaKM) {
		this.mediaKM = mediaKM;
	}
	public double getLitrosTanque() {
		return litrosTanque;
	}
	public void setLitrosTanque(double litrosTanque) {
		this.litrosTanque = litrosTanque;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

}
