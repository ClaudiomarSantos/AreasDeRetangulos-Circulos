package entidades;

import entidades.Enum.Color;

public class Circulo extends Figuras {
	private Double raio;

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Double areas() {
		return Math.PI * raio * raio;
	}

}
