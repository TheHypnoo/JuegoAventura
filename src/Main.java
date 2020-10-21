import Clases.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<Habitaciones> ArrHabitaciones = new ArrayList<>();
    ArrayList<Herramientas> ArrHerramientas = new ArrayList<>();
    ArrayList<Herramientas> ArrInventario = new ArrayList<>();
    ArrayList<String> ArrFrasesBond = new ArrayList<>();
    ArrayList<String> ArrFrasesDormilon = new ArrayList<>();
    ArrayList<String> ArrFrasesHiHall = new ArrayList<>();
    int posComandante;
    int cuentaAtras;
    Alien Bargalien;
    Bond Bond;
    Tripulantes Dormilon;
    Nave PiaXXI;

    public static void main(String[] args) {
        Main Start = new Main();
        Start.menuPrincipal();
    }

    //Inicial

    public void menuPrincipal() {
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(Ansi.CYAN + "-------------------------------------");
            System.out.println(Ansi.GREEN + "Escoge el modo: ");
            System.out.println(Ansi.BLACK + "1.Empezar videojuego");
            System.out.println("2.Creditos");
            System.out.println("3.Salir");
            System.out.println(Ansi.CYAN + "-------------------------------------");
            try {
                System.out.println(Ansi.WHITE + "Escribe una de las opciones");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> IniciaClases();
                    case 2 -> System.out.println("Null");
                    case 3 -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Debes insertar un número correspondiente al que se te indica.");
                sc.next();
            }
        }
    }

    public void menuSecundario() {
        String opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(Ansi.CYAN + "-------------------------------------");
            System.out.println(Ansi.GREEN + "Escoge el modo: ");
            System.out.println(Ansi.BLACK + "IR");
            System.out.println("INFO");
            System.out.println("COJER");
            System.out.println("DEJAR");
            System.out.println("USAR");
            if(Bond.getPosicion() == PiaXXI.getMapa().get(4).getZona()) {
                if (PiaXXI.getReparado()){
                    System.out.println("INICIAR");
                }
            }
            System.out.println("HABLAR");
            System.out.println(Ansi.CYAN + "-------------------------------------");
            try {
                System.out.println(Ansi.WHITE + "Escribe una de las opciones");
                opcion = sc.next();
                switch (opcion.toUpperCase()) {
                    case "IR" -> {moveComandante();
                        if (Bargalien.getAlteradoTranquilo()){
                            ++cuentaAtras;
                        }}
                    case "INFO" -> {infoComandante();
                        if (Bargalien.getAlteradoTranquilo()){
                            ++cuentaAtras;
                        }}
                    case "USAR" -> {usaObjeto();
                        if (Bargalien.getAlteradoTranquilo()){
                            ++cuentaAtras;
                        }}
                    case "COJER" -> {cojeObjeto();
                        if (Bargalien.getAlteradoTranquilo()){
                            ++cuentaAtras;
                        }}
                    case "DEJAR" -> {dejaObjeto();
                        if (Bargalien.getAlteradoTranquilo()){
                            ++cuentaAtras;
                        }}
                    case "INICIAR" -> {
                        System.out.println("Has terminado la partida");
                        salir = true;
                    }
                    case "HABLAR" -> menuHablar();
                    case "SALIR" -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException | InterruptedException e) {
                System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Debes insertar un número correspondiente al que se te indica.");
                sc.next();
            }
        }
    }

    public void IniciaClases() {
        crearMochila();
        crearHerramientas();
        crearHabitaciones();
        Bond = crearComandante();
        Bargalien = crearAlien();
        Dormilon = crearTripulantes();
        PiaXXI = crearNave();
        posLinterna();
/*
        //Texto en modo prueba
            System.out.println(Colores.ANSI_BLACK+"Any 2120 D.C.\n" +
                    Colores.ANSI_GREEN+"La nau PiaXXII explora l’espai inhòspit en direcció al planeta SUMMEM on es creu que hi poden haver les\n" +
                    "condicions idònies per arrelar una nova vida, que ja no es possible dur a terme en el planeta Pia.\n" +
                    "Després d’un llarg període d’hivernació provocada pel llarg viatge al planeta SUMMEM, el cap de la tripulació\n" +
                    "de la PiaXXII es desperta del son induït. L’ordinador de la nau iHall ha detectat una anomalia en el sistema i\n" +
                    "necessita de la intervenció del cap de la tripulació per resoldre’l.");
            Thread.sleep(17500);

            System.out.println(Colores.ANSI_BLACK+"HiHall: " +Colores.ANSI_RED+ "Que tal ha dormit capità Bond?. Em sap greu destorbar-lo però he detectat una anomalia a la nau.\n" +
                                "Sembla ser que se’ns gira feina.");
            Thread.sleep(8950);
            System.out.println(Colores.ANSI_BLACK+"Capita Bond: "+Colores.ANSI_CYAN+"Espero que hagi estat indispensable haver-me destorbat el són!. \n" +
                    "Sinó preparat per que et programi unes quantes sessions de Treball cooperatiu amb un tal Lago....");
            Thread.sleep(8950);
            System.out.println(Colores.ANSI_BLACK+"HiHall: "+Colores.ANSI_RED+"Li garanteixo Capità Bond que no és una falsa alarma, no m’arriscaria a patir un càstig similar...");
            Thread.sleep(8950);
            System.out.println(Colores.ANSI_BLACK+"Capita Bond: "+Colores.ANSI_CYAN+ "Està bé iHall, donem l’informe de la situació i... anem per feina!, que vull tornar a agafar el son.");
            Thread.sleep(13000);
        //Texto finalizado
*/
        //Alien.PosAlien();
        //Alien.InfoAlien();
        menuSecundario();
    }

    public void menuHablar() {
        String opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(Ansi.CYAN + "-------------------------------------");
            System.out.println(Ansi.GREEN + "Escoge el modo: ");
            System.out.println(Ansi.BLACK + "HiHall");
            if(Bond.getPosicion() == Dormilon.getPosicion()) {
                System.out.println("Tripulante");
            }
            System.out.println(Ansi.CYAN + "-------------------------------------");
            try {
                System.out.println(Ansi.WHITE + "Escribe una de las opciones");
                opcion = sc.next();
                switch (opcion.toUpperCase()) {
                    case "HIHALL" -> System.out.println("Null");
                    case "Tripulante" -> System.out.println("Null");
                    case "SALIR" -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println(Ansi.RED + Ansi.HIGH_INTENSITY + "Debes insertar una palabra correspondiente al que se te indica.");
                sc.next();
            }
        }
    }

    //Creacion

    /*public HiHall crearFrases(){
        HiHall HiHall = new HiHall(ArrFrasesHiHall.get(0)));
        return null;
    }*/

    public void crearMochila() {

        new Mochila(crearHerramientas());
    }

    public ArrayList<Herramientas> crearHerramientas() {

        Herramientas Destornillador = new Herramientas("Destornillador", "Sirve para reparar la nave o incluso atacar a alguien...");
        Herramientas Linterna = new Herramientas("Linterna", "Sirve para ver a oscuras en una habitación sin luz");
        Herramientas Traje = new Herramientas("Traje", "El Uniforme mas indispensable para salir de la nave");
        Herramientas Tarjeta = new Herramientas("Tarjeta", "Tarjeta para abrir las puertas de la nave");
        Herramientas TarjetaTripulante = new Herramientas("TarjetaTripulante", "Tarjeta que tienen los tripulantes para abrir las puertas de la nave");
        Herramientas Donuts = new Herramientas("Donuts", "Es el alimento favorito del Alien, si le damos Donuts el Alien se tranquilizara");
        ArrHerramientas.add(0, Destornillador);
        ArrHerramientas.add(1, Linterna);
        ArrHerramientas.add(2, Traje);
        ArrHerramientas.add(3, Tarjeta);
        ArrHerramientas.add(4, TarjetaTripulante);
        ArrHerramientas.add(5, Donuts);

        return ArrHerramientas;
    }

    public void crearHabitaciones() {
        //Dormitorio con Linterna prueba..
        Habitaciones Dormitorio = new Habitaciones("Dormitorio", crearHerramientas().get(1), true, 0, 1, -1, -1, 1, true, "La sala donde duerme la tripulacion");
        Habitaciones Banyos = new Habitaciones("Baños", null, true, 1, -1, 1, -1, 1, true, "Son los unicos baños de la nave y no estan muy limpios...");
        Habitaciones Oficinas = new Habitaciones("Oficinas", crearHerramientas().get(3), false, 2, 1, 1, 1, 1, true, "La sala donde estan todos los documentos de la nave");
        Habitaciones Taller = new Habitaciones("Taller", crearHerramientas().get(0), false, 3, -1, 1, -1, -1, false, "Zona donde estan las herramientas de la nave");
        Habitaciones Comandamiento = new Habitaciones("Comandamiento", null, true, 4, 1, -1, -1, -1, true, "Sala donde se controla totalmente toda la nave");
        Habitaciones Vestuario = new Habitaciones("Vestuario", crearHerramientas().get(2), false, 5, -1, 1, 1, -1, true, "Lugar donde se cambia la tripulación");
        Habitaciones Cocina = new Habitaciones("Cocina", crearHerramientas().get(5), false, 6, 1, -1, 1, -1, true, "Zona donde se cocina para los tripulantes");
        Habitaciones Comedor = new Habitaciones("Comedor", null, true, 7, -1, 1, 1, 1, true, "Sala donde la tripulación come");
        Habitaciones Salida = new Habitaciones("Salida", null, true, 8, 1, -1, -1, -1, true, "La salida de la nave");

        ArrHabitaciones.add(0, Dormitorio);
        ArrHabitaciones.add(1, Banyos);
        ArrHabitaciones.add(2, Oficinas);
        ArrHabitaciones.add(3, Taller);
        ArrHabitaciones.add(4, Comandamiento);
        ArrHabitaciones.add(5, Vestuario);
        ArrHabitaciones.add(6, Cocina);
        ArrHabitaciones.add(7, Comedor);
        ArrHabitaciones.add(8, Salida);

    }

    public Nave crearNave() {
        return new Nave("PiaXXI", ArrHabitaciones,false);
    }

    public Bond crearComandante() {
        return new Bond("Bond", 1, ArrFrasesBond, 0);
    }

    //En modo prueba el tripulante
    public Tripulantes crearTripulantes() {
        return new Tripulantes("Tripulante", 1, ArrFrasesBond, 0, false, crearHerramientas().get(4));
    }

    //En modo prueba el Alien
    public Alien crearAlien() {
        return new Alien("Bergalian", 1, ArrFrasesBond, 8, 0, true);
    }

    //Movimiento

    public void moveComandante() throws InterruptedException {
        switch (Bond.getPosicion()) {
            case 0 -> desdeDormitorio();
            case 1 -> desdeBanyos();
            case 2 -> desdeOficinas();
            case 3 -> desdeTaller();
            case 4 -> desdeComandamiento();
            case 5 -> desdeVestuario();
            case 6 -> desdeCocina();
            case 7 -> desdeComedor();
            case 8 -> desdeSalida();
        }
    }

    public void desdeDormitorio() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(1).getNombreHabitacions());//Baño
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Banyos") || pregunta.equalsIgnoreCase("Baños")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()) {
                if (PiaXXI.getMapa().get(1).getLuzHabitacion()) {
                    if (PiaXXI.getMapa().get(1).getPuerta()) {
                        System.out.println("Te has movido a Baños");
                        Bond.setPosicion(1);
                        ++posComandante;
                        moveAlien();
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                        Thread.sleep(2750);
                    }
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comedor")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()) {
                    if (PiaXXI.getMapa().get(7).getPuerta()) {
                        System.out.println("Te has movido al Comedor");
                        Bond.setPosicion(7);
                        ++posComandante;
                        moveAlien();
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            }
        }
    }

    public void desdeBanyos() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficina
        System.out.println(PiaXXI.getMapa().get(0).getNombreHabitacions());//Dormitorio

        String pregunta = sc.next();

        if (pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()) {
                if (PiaXXI.getMapa().get(2).getPuerta()) {
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()) {
                    if (PiaXXI.getMapa().get(0).getPuerta()) {
                        System.out.println("Te has movido al Dormitorio");
                        Bond.setPosicion(0);
                        ++posComandante;
                        moveAlien();
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada");
                        Thread.sleep(2750);
                    }
                }
            }
        }
    }

    public void desdeOficinas() throws InterruptedException {
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(3).getNombreHabitacions());//Taller
        System.out.println(PiaXXI.getMapa().get(4).getNombreHabitacions());//Comandamiento
        System.out.println(PiaXXI.getMapa().get(5).getNombreHabitacions());//Vestuario
        System.out.println(PiaXXI.getMapa().get(1).getNombreHabitacions());//Baños

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Taller")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                if (PiaXXI.getMapa().get(3).getPuerta()) {
                    System.out.println("Te has movido al Taller");
                    Bond.setPosicion(3);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada.");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comandamiento")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                    if (PiaXXI.getMapa().get(4).getPuerta()) {
                        System.out.println("Te has movido al Comandamiento");
                        Bond.setPosicion(4);
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                        Thread.sleep(2750);
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Vestuario")) {
                    if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                        if (PiaXXI.getMapa().get(5).getPuerta()) {
                            System.out.println("Te has movido al Vestuario");
                            Bond.setPosicion(5);
                            Thread.sleep(3750);
                        } else {
                            System.out.println("La puerta esta cerrada");
                            Thread.sleep(2750);
                        }
                    }
                } else {
                    if (pregunta.equalsIgnoreCase("Baños")) {
                        if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                            if (PiaXXI.getMapa().get(1).getPuerta()) {
                                System.out.println("Te has movido a Baños");
                                Bond.setPosicion(1);
                                Thread.sleep(3750);
                            } else {
                                System.out.println("La puerta esta cerrada");
                                Thread.sleep(2750);
                            }
                        }
                    }
                }
            }
        }
    }

    public void desdeTaller() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(3).getZona()) {
                if (PiaXXI.getMapa().get(2).getPuerta()) {
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        }
    }

    public void desdeComandamiento() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(4).getZona()) {
                if (PiaXXI.getMapa().get(2).getPuerta()) {
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        }
    }

    public void desdeVestuario() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(6).getNombreHabitacions());//Cocina
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Cocina")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()) {
                if (PiaXXI.getMapa().get(6).getPuerta()) {
                    System.out.println("Te has movido a Cocina");
                    Bond.setPosicion(6);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Oficinas")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()) {
                    if (PiaXXI.getMapa().get(2).getPuerta()) {
                        System.out.println("Te has movido a Oficinas");
                        Bond.setPosicion(2);
                        ++posComandante;
                        moveAlien();
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada");
                        Thread.sleep(2750);
                    }
                }
            }
        }
    }

    public void desdeCocina() throws InterruptedException {
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor
        System.out.println(PiaXXI.getMapa().get(5).getNombreHabitacions());//Vestuario

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Comedor")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()) {
                if (PiaXXI.getMapa().get(7).getPuerta()) {
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Vestuario")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()) {
                    if (PiaXXI.getMapa().get(5).getPuerta()) {
                        System.out.println("Te has movido al Vestuario");
                        Bond.setPosicion(5);
                        ++posComandante;
                        moveAlien();
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada");
                        Thread.sleep(2750);
                    }
                }
            }
        }
    }

    public void desdeComedor() throws InterruptedException {
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(8).getNombreHabitacions());//Salida
        System.out.println(PiaXXI.getMapa().get(0).getNombreHabitacions());//Dormitorio
        System.out.println(PiaXXI.getMapa().get(6).getNombreHabitacions());//Cocina

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Salida")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                if (PiaXXI.getMapa().get(8).getPuerta()) {
                    System.out.println("Te has movido a la Salida");
                    Bond.setPosicion(8);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                    if (PiaXXI.getMapa().get(0).getPuerta()) {
                        System.out.println("Te has movido al Dormitorio");
                        Bond.setPosicion(0);
                        posComandante++;
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada");
                        Thread.sleep(2750);
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Cocina")) {
                    if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                        if (PiaXXI.getMapa().get(6).getPuerta()) {
                            System.out.println("Te has movido a la Cocina");
                            Bond.setPosicion(6);
                            posComandante++;
                            Thread.sleep(3750);
                        } else {
                            System.out.println("La puerta esta cerrada");
                            Thread.sleep(2750);
                        }
                    }
                }
            }
        }
    }

    public void desdeSalida() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Comedor")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(8).getZona()) {
                if (PiaXXI.getMapa().get(7).getPuerta()) {
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
                    ++posComandante;
                    moveAlien();
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        }
    }

    //Lo ziguiente...

    public boolean buscarObjetos() throws InterruptedException {
        boolean encontrado = false;
        for (int x = 0; x < PiaXXI.getMapa().size() && !encontrado; x++) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(x).getZona()) {
                if (PiaXXI.getMapa().get(x).getObjetos() != null) {
                    encontrado = true;
                } else {
                    System.out.println(Ansi.SANE+Ansi.RED+"No hay objetos en esta habitación");
                    Thread.sleep(1750);
                }
            }
        }
        return encontrado;
    }

    public void cojeObjeto() throws InterruptedException {
        if (buscarObjetos()) {
            boolean encontrado = false;
            int aux = 0;
            String coger = "";
            String objeto = "";
            boolean coje = true;
            for (int x = 0; x < PiaXXI.getMapa().size() && !encontrado; x++) {
                if (PiaXXI.getMapa().get(x).getObjetos() != null) {
                    if (Bond.getPosicion() == PiaXXI.getMapa().get(x).getZona()) {
                        if (PiaXXI.getMapa().get(x).getLuzHabitacion()) {
                            System.out.println(Ansi.BLUE+"Hay estos objetos: " +Ansi.HIGH_INTENSITY+Ansi.YELLOW+Ansi.UNDERLINE+ PiaXXI.getMapa().get(x).getObjetos().getNombreHerramienta());
                            aux = x;
                            encontrado = true;
                        } else {
                            System.out.println(Ansi.SANE+Ansi.RED+"Como vas a cojer algo sin ver nada");
                            Thread.sleep(1750);
                            coje = false;
                        }
                    }
                }
            }
            if (PiaXXI.getMapa().get(Bond.getPosicion()).getObjetos() == null) {
                System.out.println(Ansi.SANE+Ansi.RED+"No puedes cojer algo que no hay");
                Thread.sleep(1750);
                coje = false;
            }
            if (coje) {
                System.out.println(Ansi.SANE+Ansi.MAGENTA+"Elige que objeto quieres coger");
                coger = sc.next();
                objeto = PiaXXI.getMapa().get(aux).getObjetos().getNombreHerramienta();
            }
            if (coger.equalsIgnoreCase(objeto) && coje) {
                System.out.println(Ansi.BLUE+"Has cogido " +Ansi.HIGH_INTENSITY+Ansi.YELLOW+Ansi.UNDERLINE+PiaXXI.getMapa().get(aux).getObjetos().getNombreHerramienta());
                ArrInventario.add(0, PiaXXI.getMapa().get(aux).getObjetos());
                Bond.setInventarioComandante(ArrInventario);
                PiaXXI.getMapa().get(aux).setObjetos(null);
            }
            Thread.sleep(1750);
        }
        System.out.println(Ansi.SANE);
    }

    public void dejaObjeto() throws InterruptedException {
        int aux = 0;
        String buscadejar;
        if (Bond.getInventarioComandante() == null) {
            System.out.println("No puedes dejar nada que no tienes");
            Thread.sleep(1750);
        }
        if (PiaXXI.getMapa().get(Bond.getPosicion()).getObjetos() == null) {
            for (int x = 0; x < Bond.getInventarioComandante().size(); x++) {
                if (Bond.getInventarioComandante().get(x) != null) {
                    System.out.println(Ansi.BLUE+"Hay estos objetos: " +Ansi.HIGH_INTENSITY+Ansi.YELLOW+Ansi.UNDERLINE+ Bond.getInventarioComandante().get(x).getNombreHerramienta());
                    aux = x;
                }
            }
            if (PiaXXI.getMapa().get(Bond.getPosicion()).getObjetos() == null) {
                if (Bond.getInventarioComandante().size() == 0) {
                    System.out.println(Ansi.SANE+Ansi.RED+"No hay nada en el Inventario que podamos dejar");
                    Thread.sleep(1750);
                } else {
                    System.out.println(Ansi.SANE+Ansi.MAGENTA+"Elige que objeto quieres dejar");
                    buscadejar = sc.next();
                    if (Bond.getInventarioComandante().get(aux).getNombreHerramienta().equalsIgnoreCase(buscadejar)) {
                        System.out.println(Ansi.SANE+Ansi.BLUE+"Has dejado " +Ansi.HIGH_INTENSITY+Ansi.YELLOW+Ansi.UNDERLINE+ Bond.getInventarioComandante().get(aux).getNombreHerramienta());
                        Thread.sleep(1750);
                        PiaXXI.getMapa().get(aux).setObjetos(Bond.getInventarioComandante().get(aux));
                        ArrInventario.remove(Bond.getInventarioComandante().get(aux));
                    } else {
                        System.out.println(Ansi.SANE+Ansi.RED+"No es igual a lo que tienes en tu mochila");
                        Thread.sleep(1750);
                    }
                }
            }
        } else {
            System.out.println(Ansi.SANE+Ansi.RED+"Dentro de la habitación hay cosas, no podemos meter mas cosas");
            Thread.sleep(1750);
        }
        System.out.println(Ansi.SANE);
    }

    public void infoComandante() throws InterruptedException {
        System.out.println(Ansi.BLACK + "Nombre del Comandante: " + Ansi.WHITE + Bond.getNombrePersona());
        //Lo siguiente sera por vidas..
        if (Bond.getVivoMuerto() == 1) {
            System.out.println(Ansi.BLACK + "Estado del Comandante:" + Ansi.WHITE + " Vivo");
        } else {
            System.out.println(Ansi.BLACK + "Estado del Comandante:" + Ansi.WHITE + " Muerto");
        }

        System.out.println(Ansi.BLACK + "Lugar: " + Ansi.WHITE + PiaXXI.getMapa().get(Bond.getPosicion()).getNombreHabitacions());
        if (PiaXXI.getMapa().get(Bond.getPosicion()).getLuzHabitacion()) {
            System.out.println(Ansi.BLACK + "Luz:" + Ansi.WHITE + " Encendida");
        } else {
            System.out.println(Ansi.BLACK + "Luz:" + Ansi.WHITE + " Apagada");
        }

        for (int x = 0; x < Bond.getInventarioComandante().size(); x++) {
            if (Bond.getInventarioComandante().get(x) != null) {
                System.out.println(Ansi.BLACK + "Inventario del Bond: " + Ansi.WHITE + Bond.getInventarioComandante().get(x).getNombreHerramienta());
            }
        }
        if (Bond.getInventarioComandante().size() == 0) {
            System.out.println(Ansi.WHITE + "No hay nada en el Inventario del Comandante");
        }
        System.out.println("T-MoveAlien: " + posComandante);
        Thread.sleep(4750);
    }

    public void moveAlien() {
        if (posComandante % 2 == 0) {
            int posR = (int) (Math.random() * 8);
            Bargalien.setPosicion(posR);
            System.out.println("Test-Alien movido");
        }
        if (Bargalien.getPosicion() == Bond.getPosicion()) {
            System.out.println("Test-Alien en el mismo lugar que el Comandante");
        }
    }

    public void posLinterna() {
        int posR = (int) (Math.random() * 8);
        if (PiaXXI.getMapa().get(posR).getObjetos() == null) {
            PiaXXI.getMapa().get(posR).setObjetos(crearHerramientas().get(1));
        }
    }

    public void usaObjeto() throws InterruptedException {
        boolean usar = true;
        String usarobjeto;
        ArrayList<Integer> Aux = new ArrayList<>();

        //Muestra el interior de la mochila
        for (int x = 0; x < Bond.getInventarioComandante().size(); x++) {
            if (Bond.getInventarioComandante().get(x) != null) {
                System.out.println(Ansi.BLACK + "Mochila: " + Ansi.WHITE + Bond.getInventarioComandante().get(x).getNombreHerramienta());
                Aux.add(x);
            }
        }

        //Posibles errores que pueden suceder
        if (Bond.getInventarioComandante() == null) {
            System.out.println("No puedes utilizar nada que no tienes");
            usar = false;
        }
        if (Bond.getInventarioComandante().size() == 0) {
            System.out.println(Ansi.WHITE + "No hay nada en el Inventario que podamos utilizar");
            usar = false;
        }
        //Sino, se usa...
        if (usar) {
            usarobjeto = sc.next();
            for (int i = 0; i < Aux.size(); i++) {
                if (Bond.getInventarioComandante().get(i).getNombreHerramienta().equalsIgnoreCase(usarobjeto)) {
                    if (usarobjeto.equalsIgnoreCase("Tarjeta") || usarobjeto.equalsIgnoreCase("tarjetatripulante")) {
                        if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                            System.out.println("Puedes abrir:" + PiaXXI.getMapa().get(3).getNombreHabitacions());
                            Thread.sleep(3500);
                            if (!PiaXXI.getMapa().get(3).getPuerta()) {
                                System.out.println("Abriendo puerta...");
                                PiaXXI.getMapa().get(3).setPuerta(true);
                                Thread.sleep(1500);
                            } else {
                                System.out.println("La puerta ya esta abierta");
                                Thread.sleep(1500);
                            }
                        } else {
                            System.out.println("No hay nada que puedas utilizar con la tarjeta");
                            Thread.sleep(1500);
                        }
                    }
                    if (usarobjeto.equalsIgnoreCase("linterna")) {
                        for (int x = 0; x < PiaXXI.getMapa().size(); x++) {
                            if (PiaXXI.getMapa().get(x).getZona() == Bond.getPosicion()) {
                                if (!PiaXXI.getMapa().get(x).getLuzHabitacion()) {
                                    System.out.println("Encendiendo luz...");
                                    Thread.sleep(1500);
                                    System.out.println("Luz encendida");
                                    PiaXXI.getMapa().get(x).setLuzHabitacion(true);
                                    Thread.sleep(1500);
                                } else {
                                    System.out.println("La luz ya esta encendida");
                                    Thread.sleep(1500);
                                }
                            }
                        }
                    }
                    if (usarobjeto.equalsIgnoreCase("Traje")) {
                        if(!Bond.getVestido()) {
                            System.out.println("Vistiendote...");
                            Bond.setVestido(true);
                            Thread.sleep(1500);
                            System.out.println("Vestido");
                            Thread.sleep(1500);
                        }
                    }
                    if (usarobjeto.equalsIgnoreCase("Donuts")) {
                        if(Bargalien.getPosicion() == Bond.getPosicion()) {
                            if(!Bargalien.getAlteradoTranquilo()) {
                                System.out.println("Das de comer al Alien para que se tranquilize...");
                                Bargalien.setAlteradoTranquilo(true);
                                Thread.sleep(1500);
                            }
                        }
                    }
                    if (usarobjeto.equalsIgnoreCase("Destornillador")) {
                        if(Bargalien.getPosicion() == Bond.getPosicion()) {
                            //True si esta alterado
                            if (Bargalien.getAlteradoTranquilo()) {
                                System.out.println("El alien esta en la misma posición que tu y esta muy alterado");
                                if(Bond.getInventarioComandante().get(i).getNombreHerramienta().equalsIgnoreCase("Donuts")){
                                    System.out.println("Puedes darle los donuts para que se tranquilice");
                                }
                                System.out.println("No puedes huir, deberas atacarle con el destornillador");
                                Thread.sleep(1500);
                                System.out.println("Atacando...");
                                Thread.sleep(3500);
                                System.out.println("El alien se ha colado por tu garganta...");
                                Thread.sleep(2500);
                                cuentaAtras = 0;
                            }
                        }
                        if(Bond.getPosicion() == PiaXXI.getMapa().get(8).getZona()) {
                            for(int traje = 0; traje < Bond.getInventarioComandante().size(); traje++) {
                                if (Bond.getInventarioComandante().get(traje).getNombreHerramienta().equalsIgnoreCase("Traje")) {
                                    System.out.println("Saliendo a reparar los motores...");
                                    PiaXXI.setReparado(true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void Hablar(){
        //Conversación entre Tripulante y Comandante
        ArrFrasesDormilon.add(0,"Espero que me hayas despertado para algo razonable");
        ArrFrasesDormilon.add(1,"Que quieres? dejame seguir durmiendo!");
        ArrFrasesDormilon.add(2,"Mi tarjeta? Para que?");
        ArrFrasesDormilon.add(3,"Espero que soluciones esto, anda toma, que me marcho a dar vueltas por la nave");
        ArrFrasesDormilon.add(4,"Ya te he dado lo que necesitabas, no quiero hablar más necesito aire libre");
        ArrFrasesBond.add(0,"Despierta,Despierta,Despierta. Necesito de tu ayuda!!");
        ArrFrasesBond.add(1,"Necesito tu tarjeta y te dejare en paz");
        ArrFrasesBond.add(2,"No encuentro mi tarjeta y necesito abrir las puertas, tengo un encargo pendiente en la nave");
        ArrFrasesBond.add(3,"Gracias, ya te dejo tranquilo! Voy a seguir con mi encargo");
        ArrFrasesBond.add(4,"Vale, vale. Tranquilo");
        //Conversación entre HiHall y Comandante
        ArrFrasesHiHall.add(0,"Bond, Bond,Bond!! Despierta, esto es una emergencia!!");
        ArrFrasesBond.add(5,"Que pasa HiHall? Que necesitas de mi, espero que me hayas despertado por una buena razón");
        ArrFrasesHiHall.add(1,"Hay un problema con la nave, necesitamos de ti para que puedas repararlo");
        ArrFrasesBond.add(6,"Espero que sea verdad lo que digas, guiame!");
        ArrFrasesHiHall.add(2,"Creeme, sin ti esto no podria solucionarse");
    }
}