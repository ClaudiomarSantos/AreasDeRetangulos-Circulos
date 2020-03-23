package entidades;

import entidades.Enum.Color;

public class Retangulo extends Figuras {

	private Double base;
	private Double altura;

	public Retangulo(Color color, Double base, Double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double areas() {
		return base * altura;
	}

}
