import View.View;

import java.util.Scanner;

/**
 * Código no terminado. Lista TODO para ver lo que falta
 */
public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View view = new View();
        view.menu_Inici();
        int opcio = opcion_Menu(sc, 3);

        switch (opcio){
            case 1: new Gestio_Floristeria().crear_Floristeria(sc);
                new Gestio_Floristeria().gestor_Floristeria(sc);
                break;
            case 2: // salir
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
