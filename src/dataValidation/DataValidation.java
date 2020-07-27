package dataValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {

	public DataValidation() {
		
	}
	public boolean verifyData(String textUser) {
		boolean validT;
		String patternText = "[a-z\\sA-Z\\s0-9_-]+";
		Pattern pattern = Pattern.compile(patternText);
		Matcher matcher = pattern.matcher(textUser);

		if (textUser.isEmpty()) {
			validT = false;
			System.out.println("\t\t\tIngrese un texto valido.");
		} else {
			if ((textUser.length() < 3) || (textUser.length() > 150)) {
				validT = false;
				System.out.println("\t\t\tIngrese un texto valido,  mínimo 3 caracteres y máximo 150");
			} else {
				if (!matcher.matches()) {
					validT = false;
					System.out.println("\t\t\tIngrese un texto valido.");
				} else {
					validT = true;
				}
			}
		}
		return validT;
	}
	
	public boolean verifyPhone(String phone) {

		boolean validPhone;

		if (phone.isEmpty()) {
			validPhone = false;
			System.out.println("\t\t\tIngrese un teléfono valido.");
		} else {
			if (!phone.matches("^(\\+34|0034|34)?[ -]*(6|7|9)[ -]*([0-9][ -]*){8}")) {
				validPhone = false;
				System.out.println("\t\t\tIngrese un teléfono valido para el area de España.");
			} else {
				validPhone = true;
			}
		}
		return validPhone;
	}
	
	public boolean verifyName(String textName) {
		boolean validName;
		String patternText = "[a-z\\sA-Z\\s0-9]+";
		Pattern pattern = Pattern.compile(patternText);
		Matcher matcher = pattern.matcher(textName);

		if (textName.isEmpty()) {
			validName = false;
			System.out.println("\t\t\tIngrese un nombre valido.");
		} else {
			if ((textName.length() < 3) || (textName.length() > 150)) {
				validName = false;
				System.out.println("\t\t\tIngrese un texto valido,  mínimo 3 caracteres y máximo 150");
			} else {
				if (!matcher.matches()) {
					validName = false;
					System.out.println("\t\t\tIngrese un nombre valido.");
				} else {
					validName = true;
				}
			}
		}
		return validName;
	}

}
