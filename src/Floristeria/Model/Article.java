package Floristeria.Model;

public class Article {
	protected int id;
	private String nom;
	private double preu;
	private static int COUNTER_ARTICLES = 1;

	public Article() {
	}

	public Article(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
		id = COUNTER_ARTICLES;
    	COUNTER_ARTICLES++;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
}
