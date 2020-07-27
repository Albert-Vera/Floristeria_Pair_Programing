package Floristeria.Model;

public class Arbre extends Article {

	private double altura;

	public Arbre(String nom, double preu, double altura) {

		super(nom, preu);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}