package Floristeria.persistence;

import java.util.ArrayList;
import java.util.List;

import Floristeria.Model.Floristeria;
import Floristeria.Model.Article;

/**
* @authors Albert Vera - Yohanna Mideros Giraldo
* @version 1.0 
* */

public class FloristeriaRepository {

	private static List<Article> articles = new ArrayList<>();
	private static Floristeria florist = new Floristeria();

	public FloristeriaRepository() {
	}

	public List<Article> getAllArticles() {
		return new ArrayList<>(articles);
	}

	public void addArticle(Article article) throws Exception {
		if (article == null)
			throw new Exception();
		articles.add(article);
	}

	public Floristeria getFlorist() {
		return florist;
	}

	public void setFlorist(Floristeria florist) {
		FloristeriaRepository.florist = florist;
	}
}
