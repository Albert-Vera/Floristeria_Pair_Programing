package persistence;

import java.util.ArrayList;
import java.util.List;

import Model.Article;
import Model.Floristeria;

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
