package Floristeria.Model;

/**
* @authors Albert Vera - Yohanna Mideros Giraldo
* @version 1.0 
* */

public class Flor extends Article {
    private String color;

    public Flor(String nom, double preu, String color) {
		super(nom, preu);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
