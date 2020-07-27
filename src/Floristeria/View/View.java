package Floristeria.View;

/**
 * Esta clase solo es para printar menus.
 */
public class View {
    public void menu_Inici(){
        System.out.println("\n\t\t\t\t\t\t############################################################################");
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
    public void menu_Crear_Floristeria(){
        System.out.println("\n\n\n\t\t\t\t\t\t############################################################################");
        System.out.println("\t\t\t\t\t\t#######################                             ########################");
        System.out.println("\t\t\t\t\t\t#######################         C R E A R           ########################");
        System.out.println("\t\t\t\t\t\t#######################    F L O R I S T E R I A    ########################");
        System.out.println("\t\t\t\t\t\t#######################                             ########################");
        System.out.println("\t\t\t\t\t\t#######################                             ########################");
        System.out.println("\t\t\t\t\t\t############################################################################");
    }
    public void Gestor_Floristeria(){
        System.out.println("\n\t\t\t\t\t\t############################################################################");
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
    public void ver_stock(){
        //TODO qui falta printar el stock, aunque lo suyo es hacer la lógica en un método en Gestion_Floristeris y
        //TODO aqui solo imprimir por pantalla.
    }
}
