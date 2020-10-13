import java.util.InputMismatchException;
import java.util.Scanner;

public class menuSecundario {

    static Scanner sc = new Scanner(System.in);
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_BLACK = "\u001b[30;1m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_WHITE = "\u001B[37m";
    static final String ANSI_BOLD = "\u001b[1m";
    AccionIR AccionIR = new AccionIR();
    Habitaciones Habitaciones = new Habitaciones();
    Comandante Comandante = new Comandante();

    public void Menu() {
        String opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(ANSI_CYAN + "-------------------------------------");
            System.out.println(ANSI_GREEN + "Escoge el modo: ");
            System.out.println(ANSI_BLACK + "IR");
            System.out.println("INFO");
            System.out.println("BUSCAR");
            System.out.println(ANSI_CYAN + "-------------------------------------");
            try {
                System.out.println(ANSI_WHITE + "Escribe una de las opciones");
                opcion = sc.next();
                switch (opcion.toUpperCase()) {
                    case "IR" -> AccionIR.ir();
                    case "INFO" -> Habitaciones.infoHabitacion(Comandante.getPosicion());
                    case "BUSCAR" -> Comandante.buscarObjetos(Comandante.getPosicion());
                    case "SALIR" -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(ANSI_RED + ANSI_BOLD + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException | InterruptedException e) {
                System.out.println(ANSI_RED + ANSI_BOLD + "Debes insertar un número correspondiente al que se te indica.");
                sc.next();
            }
        }
    }
}
