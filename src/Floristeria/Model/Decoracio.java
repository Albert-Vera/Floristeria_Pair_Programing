package Floristeria.Model;

/**
* @authors Albert Vera - Yohanna Mideros Giraldo
* @version 1.0 
* */

public class Decoracio extends Article {

	private String material;

	public Decoracio() {
	}

	public Decoracio(String nom, double preu, String material) {
		super(nom, preu);
		this.material = material;
	}

	public enum Decorat_Type {
		FUSTA, PLASTIC
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
