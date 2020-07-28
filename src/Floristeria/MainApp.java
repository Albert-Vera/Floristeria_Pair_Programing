package Floristeria;

import Floristeria.Gestio.Gestio_Floristeria;
import Floristeria.View.View;

import java.util.Scanner;

/**
 * Exercici Pair Programming
 * En una floristeria, que té un nom, tenim arbres, flors i decoració.
 * Cada arbre té una alçadaa
 * Les flors tenen un color
 * La decoració té un tipus de material: fusta o plàstic.
 * Tots tenen un preu.
 * Fer funcionalitats en un Main:
 * crearFloristeria , afegirArbre, afegirFlor, afegirDecoracio , stock: tots els arbre, flors i decoració que té la floristeria 
 *  
 * @authors Albert Vera - Yohanna Mideros G.
 * @version 1.0
 * */

public class MainApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        View view = new View();
        view.menu_Inici();
        int opcio = opcion_Menu(sc, 3);

        switch (opcio){
            case 1:    new Gestio_Floristeria().crear_Floristeria(sc);
                       new Gestio_Floristeria().gestor_Floristeria(sc);
                break;
            case 2: System.exit(0);
                break;
        }
    }

    public static int opcion_Menu(Scanner sc, int tamany){
        boolean repetir= true;
        String texto = "";
        int numero = 0;

        while (repetir) {
            try {
                texto = sc.nextLine();
                numero = Integer.parseInt(texto);

                if ( numero > 0 && numero < tamany)  repetir = false;
                else{
                    System.out.println("\nEse valor no es válido");
                    System.out.print("\n\t\t\t\t\t\tEscoge una opción del menu: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEse valor no es válido");
                System.out.print("\n\t\t\t\t\t\tEscoge una opción del menu: ");
            }
        }
        return numero;
    }
}
