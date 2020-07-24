package Model;

public class Arbre  {
    private String nom;
    private double altura;

    public Arbre(String nom, double altura) {
        this.nom = nom;
        this.altura = altura;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
