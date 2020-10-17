import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Colores Colores = new Colores();
    Personas Personas = new Personas();
    ArrayList<Habitaciones> ArrHabitaciones = new ArrayList<Habitaciones>();
    ArrayList<Herramientas> ArrHerramientas = new ArrayList<Herramientas>();
    ArrayList<Mochila> ArrInventario = new ArrayList<Mochila>();
    ArrayList<Nave> ArrNave = new ArrayList<Nave>();
    ArrayList<Personas> ArrPersonas = new ArrayList<Personas>();
    ArrayList<HiHall> ArrFrasesHiHall = new ArrayList<HiHall>();
    Alien Bargalian;
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
                    case 1 -> {
                        IniciaClases();
                    }
                    case 2 -> System.out.println("JEJE");
                    case 3 -> {
                        salir = true;
                        System.out.println("El Juego de Aventura a Finalizado correctamente.");
                        return;
                    }
                    default -> System.out.println(Colores.ANSI_RED + Colores.ANSI_BOLD + "Error, vuelve a introducir el modo nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println(Colores.ANSI_RED + Colores.ANSI_BOLD + "Debes insertar un número correspondiente al que se te indica.");
                sc.next();
            }
        }
    }

    public void menuSecundario() {
        String opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println(Colores.ANSI_CYAN + "-------------------------------------");
            System.out.println(Colores.ANSI_GREEN + "Escoge el modo: ");
            System.out.println(Colores.ANSI_BLACK + "IR");
            System.out.println("INFO");
            System.out.println("BUSCAR");
            System.out.println("LUZ");
            System.out.println(Colores.ANSI_CYAN + "-------------------------------------");
            try {
                System.out.println(Colores.ANSI_WHITE + "Escribe una de las opciones");
                opcion = sc.next();
                switch (opcion.toUpperCase()) {
                    case "IR" -> moveComandante();
                    case "INFO" ->  infoComandante();
                    case "BUSCAR" ->  buscarObjetos();
                    case "LUZ" -> ApagaEnciendeLuz();
                    case "SALIR" -> {
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

    public void IniciaClases(){
        crearMochila();
        crearHerramientas();
        crearHabitaciones();
        Bond = crearComandante();
        Bargalian = crearAlien();
        Dormilon = crearTripulantes();
        PiaXXI = crearNave();
        crearMochila().get(0).setMochila(crearHerramientas().get(0));
        //System.out.println("Mochilon: "+crearHerramientas().get(0).getNombreHerramienta()+"JEJE"+crearMochila().get(0).getMochila().get(0).getNombreHerramienta());
        System.out.println("TEST");
        //Alien.PosAlien();
        //Alien.InfoAlien();
        menuSecundario();
    }

    //Creacion

    /*public HiHall crearFrases(){
        HiHall HiHall = new HiHall(ArrFrasesHiHall.get(0)));
        return null;
    }*/

    public ArrayList<Mochila> crearMochila(){

        Mochila InventarioComandante = new Mochila(crearHerramientas().get(0));
        ArrInventario.add(InventarioComandante);
        return ArrInventario;
    }

    public ArrayList<Herramientas> crearHerramientas(){

        Herramientas Destornillador = new Herramientas("Destornillador", "Sirve para reparar la nave o incluso atacar a alguien...");
        Herramientas Linterna = new Herramientas("Linterna","Sirve para ver a oscuras en una habitación sin luz");
        Herramientas VestidoEspacial = new Herramientas("Vestido Espacial","El Uniforme mas indispensable para salir de la nave");
        Herramientas TarjetaIdentificadora = new Herramientas("Tarjeta Identificadora","Tarjeta para abrir las puertas de la nave");
        Herramientas TarjetaTripulante = new Herramientas("Tarjeta Tripulante","Tarjeta que tienen los tripulantes para abrir las puertas de la nave");
        Herramientas Donuts = new Herramientas("Donuts","Es el alimento favorito del Alien, si le damos Donuts el Alien se tranquilizara");
        ArrHerramientas.add(0,Destornillador);
        ArrHerramientas.add(1,Linterna);
        ArrHerramientas.add(2,VestidoEspacial);
        ArrHerramientas.add(3,TarjetaIdentificadora);
        ArrHerramientas.add(4,TarjetaTripulante);
        ArrHerramientas.add(5,Donuts);

        return ArrHerramientas;
    }

    public ArrayList<Habitaciones> crearHabitaciones() {
        Habitaciones Dormitorio = new Habitaciones("Dormitorio", crearHerramientas().get(1), true, 0, 1, -1, -1, 1, true, "La sala donde duerme la tripulacion");
        Habitaciones Banyos = new Habitaciones("Baños", null, true, 1, -1, 1, -1, 1, true, "Son los unicos baños de la nave y no estan muy limpios...");
        Habitaciones Oficinas = new Habitaciones("Oficinas", crearHerramientas().get(3), false, 2, 1, 1, 1, 1, true, "La sala donde estan todos los documentos de la nave");
        Habitaciones Taller = new Habitaciones("Taller", crearHerramientas().get(0), false, 3, -1, 1, -1, -1, false, "Zona donde estan las herramientas de la nave");
        Habitaciones Comandamiento = new Habitaciones("Comandamiento", null, true, 4, 1, -1, -1, -1, true, "Sala donde se controla totalmente toda la nave");
        Habitaciones Vestuario = new Habitaciones("Vestuario", crearHerramientas().get(2), false, 5, -1, 1, 1, -1, true, "Lugar donde se cambia la tripulación");
        Habitaciones Cocina = new Habitaciones("Cocina", crearHerramientas().get(5), false, 6, 1, -1, 1, -1, true, "Zona donde se cocina para los tripulantes");
        Habitaciones Comedor = new Habitaciones("Comedor", null, true, 7, -1, 1, 1, 1, true, "Sala donde la tripulación come");
        Habitaciones Salida = new Habitaciones("Salida", null, true, 8, 1, -1, -1, -1, true, "La salida de la nave");

        ArrHabitaciones.add(Dormitorio);
        ArrHabitaciones.add(Banyos);
        ArrHabitaciones.add(Oficinas);
        ArrHabitaciones.add(Taller);
        ArrHabitaciones.add(Comandamiento);
        ArrHabitaciones.add(Vestuario);
        ArrHabitaciones.add(Cocina);
        ArrHabitaciones.add(Comedor);
        ArrHabitaciones.add(Salida);

        return ArrHabitaciones;
    }

    public Nave crearNave(){
        Nave Nave = new Nave("PiaXXI",ArrHabitaciones);
        return Nave;
    }

    public Bond crearComandante(){
        Bond Comandante = new Bond("Bond",1,0,crearHerramientas().get(0));
        return Comandante;
    }

    public Tripulantes crearTripulantes(){
        Tripulantes Tripulantes = new Tripulantes("Tripulante",1,0,false);
        return Tripulantes;
    }

    public Alien crearAlien(){
        Alien Alien = new Alien("Bergalian",1,8,0,true);
        return Alien;
    }


    //Movimiento

    public void moveComandante(){
        switch(Bond.getPosicion()){
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

    public void desdeDormitorio(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(1).getNombreHabitacions());//Baño
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Banyos") || pregunta.equalsIgnoreCase("Baños")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()){
                if(PiaXXI.getMapa().get(1).getLuzHabitacion() == true) {
                    if(PiaXXI.getMapa().get(1).getPuerta() == true){
                        System.out.println("Te has movido a Baños");
                        Bond.setPosicion(1);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                    }
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comedor")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()) {
                    if (PiaXXI.getMapa().get(7).getPuerta() == true) {
                        System.out.println("Te has movido al Comedor");
                        Bond.setPosicion(7);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            }
        }
    }

    public void desdeBanyos(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficina
        System.out.println(PiaXXI.getMapa().get(0).getNombreHabitacions());//Dormitorio

        String pregunta = sc.next();

        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta() == true){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()){
                    if (PiaXXI.getMapa().get(0).getPuerta() == true) {
                        System.out.println("Te has movido al Dormitorio");
                        Bond.setPosicion(0);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            }
        }
    }

    public void desdeOficinas() {
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(3).getNombreHabitacions());//Taller
        System.out.println(PiaXXI.getMapa().get(4).getNombreHabitacions());//Comandamiento
        System.out.println(PiaXXI.getMapa().get(5).getNombreHabitacions());//Vestuario
        System.out.println(PiaXXI.getMapa().get(1).getNombreHabitacions());//Baños

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Taller")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                if (PiaXXI.getMapa().get(3).getPuerta() == true) {
                    System.out.println("Te has movido al Taller");
                    Bond.setPosicion(3);
                } else {
                    System.out.println("La puerta esta cerrada.");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comandamiento")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                    if (PiaXXI.getMapa().get(4).getPuerta() == true) {
                        System.out.println("Te has movido al Comandamiento");
                        Bond.setPosicion(4);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Vestuario")) {
                    if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                        if (PiaXXI.getMapa().get(5).getPuerta() == true) {
                            System.out.println("Te has movido al Vestuario");
                            Bond.setPosicion(5);
                        } else {
                            System.out.println("La puerta esta cerrada");
                        }
                    }
                } else {
                    if (pregunta.equalsIgnoreCase("Baños")) {
                        if (Bond.getPosicion() == PiaXXI.getMapa().get(2).getZona()) {
                            if (PiaXXI.getMapa().get(1).getPuerta() == true) {
                                System.out.println("Te has movido a Baños");
                                Bond.setPosicion(1);
                            } else {
                                System.out.println("La puerta esta cerrada");
                            }
                        }
                    }
                }
            }
        }
    }

    public void desdeTaller(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(3).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta() == true){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        }
    }

    public void desdeComandamiento(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(4).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta() == true){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        }
    }

    public void desdeVestuario(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(6).getNombreHabitacions());//Cocina
        System.out.println(PiaXXI.getMapa().get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Cocina") || pregunta.equalsIgnoreCase("Baños")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()){
                if(PiaXXI.getMapa().get(6).getPuerta() == true){
                    System.out.println("Te has movido a Baños");
                    Bond.setPosicion(6);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Oficinas")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()) {
                    if (PiaXXI.getMapa().get(2).getPuerta() == true) {
                        System.out.println("Te has movido a Oficinas");
                        Bond.setPosicion(2);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            }
        }
    }

    public void desdeCocina(){
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor
        System.out.println(PiaXXI.getMapa().get(5).getNombreHabitacions());//Vestuario

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()){
                if(PiaXXI.getMapa().get(7).getPuerta() == true){
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Vestuario")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()) {
                    if (PiaXXI.getMapa().get(5).getPuerta() == true) {
                        System.out.println("Te has movido al Vestuario");
                        Bond.setPosicion(5);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            }
        }
    }

    public void desdeComedor(){
        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(8).getNombreHabitacions());//Salida
        System.out.println(PiaXXI.getMapa().get(0).getNombreHabitacions());//Dormitorio
        System.out.println(PiaXXI.getMapa().get(6).getNombreHabitacions());//Cocina

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Salida")) {
            if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                if (PiaXXI.getMapa().get(8).getPuerta() == true) {
                    System.out.println("Te has movido a la Salida");
                    Bond.setPosicion(8);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                    if (PiaXXI.getMapa().get(0).getPuerta() == true) {
                        System.out.println("Te has movido al Dormitorio");
                        Bond.setPosicion(0);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Cocina")) {
                    if (Bond.getPosicion() == PiaXXI.getMapa().get(7).getZona()) {
                        if (PiaXXI.getMapa().get(6).getPuerta() == true) {
                            System.out.println("Te has movido a la Cocina");
                            Bond.setPosicion(6);
                        } else {
                            System.out.println("La puerta esta cerrada");
                        }
                    }
                }
            }
        }
    }

    public void desdeSalida(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(8).getZona()){
                if(PiaXXI.getMapa().get(7).getPuerta() == true){
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        }
    }

    //Lo ziguiente...

    public void buscarObjetos() throws InterruptedException {
        boolean encontrado = false;
        for(int x = 0; x < PiaXXI.getMapa().size() && !encontrado; x++){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(x).getZona()){
                System.out.println("Buscando objetos dentro de la habitación..");
                Thread.sleep(3500);
                if(PiaXXI.getMapa().get(x).getObjetos() != null) {
                    System.out.println("Hay estos objetos: "+PiaXXI.getMapa().get(x).getObjetos().get(x).getNombreHerramienta());
                    encontrado = true;
                } else {
                    System.out.println("No hay objetos en esta habitación");
                }
            }
        }
    }

    public void infoComandante() {
        System.out.println("Nombre del Bond: " + Bond.getNombrePersona());
        //Lo siguiente sera por vidas..
        if (Bond.getVivoMuerto() == 1) {
            System.out.println("Estado del Bond: Vivo");
        } else {
            System.out.println("Estado del Bond: Muerto");
        }

        System.out.println("Lugar: " + PiaXXI.getMapa().get(Bond.getPosicion()).getNombreHabitacions());
        if (PiaXXI.getMapa().get(Bond.getPosicion()).getLuzHabitacion() == true) {
            System.out.println("Luz: encendida");
        } else {
            System.out.println("Luz: apagada");
        }
        //INVENTARIOOO ARREGLAR!

        for(int x = 0; x < 3; x++){
            //Bond.setInventarioComandante();
            if(Bond.getInventarioComandante() != null){
                System.out.println("Hay cositas"+Bond.getInventarioComandante());
            } else {
                System.out.println("No hay nada");
            }
        }



        //System.out.println(Bond.getInventarioComandante().get(0));
        //Bond.setInventarioComandante(crearHerramientas().get(0));
/*
        for(int i = 0; i < crearHerramientas().size(); i++) {
            if(Bond.InventarioComandante.get(i).getMochila().get(i) != null)
            {
                System.out.println(crearMochila().get(i).getMochila().get(i).getNombreHerramienta());
            }
            else if(crearMochila().get(i).getMochila().get(i) == null){
                System.out.println("Inventario del Bond: Vacio");
            }
        }
*/
    }
    public void ApagaEnciendeLuz() throws InterruptedException {
        System.out.println(Colores.ANSI_BLACK+"APAGAR");
        System.out.println(Colores.ANSI_BLACK+"ENCENDER");
        String option = sc.next();
        switch (option.toUpperCase()) {
            case "APAGAR" -> {
                for(int x = 0; x < PiaXXI.getMapa().size(); x++) {
                    if(PiaXXI.getMapa().get(x).getZona() == Bond.getPosicion()) {
                        if(PiaXXI.getMapa().get(x).getLuzHabitacion() == true){
                            System.out.println("Apagando luz...");
                            Thread.sleep(1500);
                            System.out.println("Luz apagada");
                            PiaXXI.getMapa().get(x).setLuzHabitacion(false);
                        } else if(PiaXXI.getMapa().get(x).getLuzHabitacion() == false) {
                            System.out.println("La luz estaba apagada... La dejamos igual");
                            Thread.sleep(1500);
                        }
                    }
                }
            }
            case "ENCENDER" -> {
                for(int x = 0; x < PiaXXI.getMapa().size(); x++) {
                    if (PiaXXI.getMapa().get(x).getZona() == Bond.getPosicion()) {
                        if (PiaXXI.getMapa().get(x).getLuzHabitacion() == false) {
                            System.out.println("Encendiendo luz...");
                            Thread.sleep(1500);
                            System.out.println("Luz encendida");
                            PiaXXI.getMapa().get(x).setLuzHabitacion(true);
                        } else if (PiaXXI.getMapa().get(x).getLuzHabitacion() == true) {
                            System.out.println("La luz estaba encendida... La dejamos igual");
                            Thread.sleep(1500);
                        }
                    }
                }
            }
            default -> System.out.println("Error,vuelve a introducirlo nuevamente");
        }
    }

    public ArrayList<Nave> crearNave1(){
        Nave Nave = new Nave("PiaXXI",ArrHabitaciones);
        ArrNave.add(Nave);
        return ArrNave;
    }
    public ArrayList<Personas> crearPersonas(){
        Bond Comandante = new Bond("Bond",1,0);
        Tripulantes Tripulantes = new Tripulantes("Tripulante",1,0,false);
        Alien Alien = new Alien("Bergalian",1,0,0,true);
        ArrPersonas.add(Comandante);
        ArrPersonas.add(Tripulantes);
        ArrPersonas.add(Alien);
        return ArrPersonas;
    }

}