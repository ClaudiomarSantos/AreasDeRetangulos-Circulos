package entidades;

import entidades.Enum.Color;

public abstract class Figuras {

	private Color color;

	public Figuras(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double areas();

}
