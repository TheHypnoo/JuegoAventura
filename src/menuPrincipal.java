import java.util.InputMismatchException;
import java.util.Scanner;

public class menuPrincipal  {

    static Scanner sc = new Scanner(System.in);
    Creditos Creditos = new Creditos();
    Start Start = new Start();
    Colores Colores = new Colores();

    public void Menu() {
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(Colores.ANSI_CYAN + "-------------------------------------");
            System.out.println(Colores.ANSI_GREEN + "Escoge el modo: ");
            System.out.println(Colores.ANSI_BLACK + "1.Empezar videojuego");
            System.out.println("2.Creditos");
            System.out.println("3.Salir");
            System.out.println(Colores.ANSI_CYAN + "-------------------------------------");
            try {
                System.out.println(Colores.ANSI_WHITE + "Escribe una de las opciones");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> Start.IniciaClases();
                    case 2 -> Creditos.Creditos();
                    case 3 -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(Colores.ANSI_RED + Colores.ANSI_BOLD + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException | InterruptedException e) {
                System.out.println(Colores.ANSI_RED + Colores.ANSI_BOLD + "Debes insertar un número correspondiente al que se te indica.");
                sc.next();
            }
        }
    }
}
