package Floristeria.Gestio;

import static Floristeria.MainApp.opcion_Menu;
import Floristeria.dataValidation.DataValidation;
import Floristeria.Model.Decoracio.Decorat_Type;
import Floristeria.View.*;
import java.util.Scanner;

public class Gestio_Floristeria {

	FloristeriaController controller = new FloristeriaController();
	DataValidation validator = new DataValidation();

	public Gestio_Floristeria() {

	}

	public void crear_Floristeria(Scanner sc) throws Exception {

		new View().menu_Crear_Floristeria();

		String nameFlorist = addName(sc);

		System.out.print("\t\t\tPor favor ingrese la dirección: ");
		String address = lectura_Datos(sc);
		boolean validateAddress = validator.verifyData(address);

		while (!validateAddress) {
			System.out.print("\t\t\tPor favor ingrese la dirección: ");
			address = lectura_Datos(sc);
			validateAddress = validator.verifyData(address);
		}

		System.out.print("\t\t\tPor favor ingrese el teléfono: ");
		String phone = lectura_Datos(sc);
		boolean validatePhone = validator.verifyPhone(phone);

		while (!validatePhone) {
			System.out.print("\t\t\tPor favor ingrese el teléfono: ");
			phone = lectura_Datos(sc);
			validatePhone = validator.verifyData(phone);
		}

		controller.createFlorist(nameFlorist, address, phone);

	}

	public void gestor_Floristeria(Scanner sc) throws Exception {
		while (true) {
			new View().Gestor_Floristeria();
			int opcion = opcion_Menu(sc, 6);

			switch (opcion) {
			case 1:
				insertar_Arbol(sc);
				break;
			case 2:
				insertar_Flor(sc);
				break;
			case 3:
				insertar_Decoracion(sc);
				break;
			case 4:
				new View().ver_stock();
				break;
			case 5:
				System.exit(0);
			}
		}
	}

	void insertar_Arbol(Scanner sc) throws Exception {

		System.out.print("\n\t\t\t\t\t\t                            - ARBOL -  ");

		String treeName = addName(sc);

		System.out.print("\t\t\tPor favor ingrese el altura en centimetros: ");
		double treeHeight = 0;
		String hTree = lectura_Datos(sc);
		boolean validateHeight = validator.verifyDouble(hTree);

		while (!validateHeight) {
			System.out.print("\t\t\tPor favor ingrese la altura en centimetros: ");
			hTree = lectura_Datos(sc);
			validateHeight = validator.verifyDouble(hTree);
		}
		treeHeight = Double.parseDouble(hTree);

		double treePrice = addPrice(sc);

		controller.addTree(treeName, treePrice, treeHeight);

	}

	void insertar_Flor(Scanner sc) throws Exception {

		System.out.print("\n\t\t\t\t\t\t                            - FLOR -  ");

		String flowerName = addName(sc);

		System.out.print("\t\t\tPor favor ingrese el color: ");

		String flowerColor = lectura_Datos(sc);
		boolean validateColor = validator.verifyText(flowerColor);

		while (!validateColor) {
			System.out.print("\t\t\tPor favor ingrese el color: ");
			flowerColor = lectura_Datos(sc);
			validateColor = validator.verifyText(flowerColor);
		}

		double flowerPrice = addPrice(sc);

		controller.addFlower(flowerName, flowerPrice, flowerColor);

	}

	void insertar_Decoracion(Scanner sc) throws Exception {

		System.out.print("\n\t\t\t\t\t\t                            - DECORACIÓN -  ");

		String decorationName = addName(sc);
		Decorat_Type dF = Decorat_Type.FUSTA;
		Decorat_Type dP = Decorat_Type.PLASTIC;
		String typeMaterial = "";
		int option = 0;

		System.out.println("\t\t\t1. " + dF.name());
		System.out.println("\t\t\t2. " + dP.name());
		System.out.print("\t\t\tPor favor seleccione el material 1 o 2: ");
		String mDeco = lectura_Datos(sc);
		boolean validateOption = validator.verifyOp(mDeco);

		while (!validateOption) {

			System.out.println("\t\t\t1. " + dF.name());
			System.out.println("\t\t\t2. " + dP.name());
			System.out.print("\t\t\tPor favor seleccione el material 1 o 2: ");
			mDeco = lectura_Datos(sc);
			validateOption = validator.verifyOp(mDeco);
		}

		option = Integer.parseInt(mDeco);

		if (option == 1) {
			typeMaterial = dF.name();
		} else {
			if (option == 2) {
				typeMaterial = dP.name();
			}
		}

		double decorationPrice = addPrice(sc);

		controller.addDecoration(decorationName, decorationPrice, typeMaterial);

	}

	public String addName(Scanner sc) {

		System.out.print("\n\n\t\t\tPor favor ingrese el nombre: ");

		String name = lectura_Datos(sc);
		boolean validateName = validator.verifyName(name);

		while (!validateName) {
			System.out.print("\t\t\tPor favor ingrese el nombre: ");
			name = lectura_Datos(sc);
			validateName = validator.verifyName(name);
		}
		return name;
	}

	public double addPrice(Scanner sc) {

		double price = 0;
		System.out.print("\t\t\tPor favor ingrese el precio en  \u20AC : ");
		String pArticle = lectura_Datos(sc);
		boolean validatePrice = validator.verifyDouble(pArticle);

		while (!validatePrice) {
			System.out.print("\t\t\tPor favor ingrese el precio en \u20AC: ");
			pArticle = lectura_Datos(sc);
			validatePrice = validator.verifyDouble(pArticle);
		}
		return price = Double.parseDouble(pArticle);
	}

	private String lectura_Datos(Scanner sc) {
		String dato;
		dato = sc.nextLine();
		return dato;
	}	
}
