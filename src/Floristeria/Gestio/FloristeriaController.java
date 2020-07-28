package Floristeria.Gestio;

import Floristeria.Model.Floristeria;
import Floristeria.persistence.FloristeriaRepository;
import Floristeria.Model.Article;
import Floristeria.Model.Decoracio;
import Floristeria.Model.Flor;

import java.util.ArrayList;
import java.util.List;

import Floristeria.Model.Arbre;

public class FloristeriaController {

	private FloristeriaRepository repository = new FloristeriaRepository();

	public FloristeriaController() {

	}

	public void createFlorist(String name, String address, String phone) throws Exception {
		Floristeria florist = new Floristeria(name, address, phone);
		repository.setFlorist(florist);
	}

	public void addTree(String name, double price, double height) throws Exception {
		Arbre tree = new Arbre(name, price, height);
		repository.addArticle(tree);
	}

	public void addFlower(String name, double price, String color) throws Exception {
		Flor flower = new Flor(name, price, color);
		repository.addArticle(flower);
	}

	public void addDecoration(String name, double price, String material) throws Exception {
		Decoracio decoration = new Decoracio(name, price, material);
		repository.addArticle(decoration);
	}

	public List<Article> getAllFloritsArticles() {
		List<Article> articlesList = new ArrayList<>();
		articlesList = repository.getAllArticles();
		return articlesList;
	}

	public Floristeria getFlorist() {
		Floristeria floristeria = new Floristeria();
		floristeria = repository.getFlorist();
		return floristeria;
	}
}
