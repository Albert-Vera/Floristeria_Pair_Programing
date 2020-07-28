package Floristeria.View;

import java.util.List;

import Floristeria.Gestio.FloristeriaController;
import Floristeria.Model.*;

/**
* @authors Albert Vera - Yohanna Mideros Giraldo
* @version 1.0 
* */

public class View {
	public void menu_Inici() {
		System.out
				.println("\n\t\t\t\t\t\t############################################################################");
		System.out.println("\t\t\t\t\t\t#######################         M E N U             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################     1.   Crear Floristeria  ########################");
		System.out.println("\t\t\t\t\t\t#######################     2.   Salir              ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t############################################################################");
		System.out.print("\t\t\t\t\t\t                         Elije una opción: ");

	}

	public void menu_Crear_Floristeria() {
		System.out.println(
				"\n\n\n\t\t\t\t\t\t############################################################################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################         C R E A R           ########################");
		System.out.println("\t\t\t\t\t\t#######################    F L O R I S T E R I A    ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t############################################################################");
	}

	public void Gestor_Floristeria() {
		System.out
				.println("\n\t\t\t\t\t\t############################################################################");
		System.out.println("\t\t\t\t\t\t#######################         M E N U             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################                             ########################");
		System.out.println("\t\t\t\t\t\t#######################     1.   Añadir árbol       ########################");
		System.out.println("\t\t\t\t\t\t#######################     2.   Añadir Flor        ########################");
		System.out.println("\t\t\t\t\t\t#######################     3.   Añadir Decoración  ########################");
		System.out.println("\t\t\t\t\t\t#######################     4.   Ver Stock          ########################");
		System.out.println("\t\t\t\t\t\t#######################     5.   Salir              ########################");
		System.out.println("\t\t\t\t\t\t############################################################################");
		System.out.print("\t\t\t\t\t\t                         Elije una opción: ");
	}

	public void ver_stock() {

		FloristeriaController controller = new FloristeriaController();
		Floristeria florist = controller.getFlorist();

		List<Article> allArticles = controller.getAllFloritsArticles();

		System.out.println("\n\n\t\t\t\t\t FLORISTERIA: " + florist.getNom().toUpperCase() + " - " + "DIRECCIÓN: "
				+ florist.getAdress().toUpperCase() + " - " + "TELEFONO: " + florist.getPhone());

		System.out.print("\n\n\t\t\t\t\t\t                            - STOCK -  \n");

		for (Article a : allArticles) {

			if (a instanceof Arbre) {

				System.out.println("\n\t\t\t\t\t\tArbol -> " + "ID: " + a.getId() + " | " + "Nombre: " + a.getNom()
						+ " | " + "Precio:" + a.getPreu() + " \u20AC" + " | " + "Altura: " + ((Arbre) a).getAltura()
						+ " cm.");
			}
			if (a instanceof Flor) {
				System.out.println("\n\t\t\t\t\t\tFlor -> " + "ID: " + a.getId() + " | " + "Nombre: " + a.getNom()
						+ " | " + "Precio:" + a.getPreu() + " \u20AC" + " | " + "Color: " + ((Flor) a).getColor());
			}
			if (a instanceof Decoracio) {
				System.out.println("\n\t\t\t\t\t\tDecoracio -> " + "ID: " + a.getId() + " | " + "Nombre: " + a.getNom()
						+ " | " + "Precio:" + a.getPreu() + " \u20AC" + " | " + "Material: "
						+ ((Decoracio) a).getMaterial());
			}
		}
		System.out.print("\n\t\t\t\t\t                        - LA FLORISTERIA TIENE TOTAL " + allArticles.size()
				+ " ARTICULOS -  \n\n");
	}
}
