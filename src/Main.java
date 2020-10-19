import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<Habitaciones> ArrHabitaciones = new ArrayList<>();
    ArrayList<Herramientas> ArrHerramientas = new ArrayList<>();
    ArrayList<Herramientas> ArrInventario = new ArrayList<>();
    ArrayList<String> ArrFrasesBond = new ArrayList<>();
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
                    case 1 -> //ArrInventario.set(0,ArrHerramientas.get(0));
                            //System.out.println("Inventario:" +ArrInventario.get(0));
                            IniciaClases();
                    case 2 -> System.out.println("Null");
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
            System.out.println("COJER");
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
                    case "COJER" -> CojeObjeto();
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

    public void IniciaClases() {
        crearMochila();
        crearHerramientas();
        crearHabitaciones();
        Bond = crearComandante();
        Bargalian = crearAlien();
        Dormilon = crearTripulantes();
        PiaXXI = crearNave();
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

    //Creacion

    /*public HiHall crearFrases(){
        HiHall HiHall = new HiHall(ArrFrasesHiHall.get(0)));
        return null;
    }*/

    public void crearMochila(){

        new Mochila(crearHerramientas());
    }

    public ArrayList<Herramientas> crearHerramientas(){

        Herramientas Destornillador = new Herramientas("Destornillador", "Sirve para reparar la nave o incluso atacar a alguien...");
        Herramientas Linterna = new Herramientas("Linterna","Sirve para ver a oscuras en una habitación sin luz");
        Herramientas VestidoEspacial = new Herramientas("VestidoEspacial","El Uniforme mas indispensable para salir de la nave");
        Herramientas TarjetaIdentificadora = new Herramientas("TarjetaIdentificadora","Tarjeta para abrir las puertas de la nave");
        Herramientas TarjetaTripulante = new Herramientas("TarjetaTripulante","Tarjeta que tienen los tripulantes para abrir las puertas de la nave");
        Herramientas Donuts = new Herramientas("Donuts","Es el alimento favorito del Alien, si le damos Donuts el Alien se tranquilizara");
        ArrHerramientas.add(0,Destornillador);
        ArrHerramientas.add(1,Linterna);
        ArrHerramientas.add(2,VestidoEspacial);
        ArrHerramientas.add(3,TarjetaIdentificadora);
        ArrHerramientas.add(4,TarjetaTripulante);
        ArrHerramientas.add(5,Donuts);

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

        ArrHabitaciones.add(Dormitorio);
        ArrHabitaciones.add(Banyos);
        ArrHabitaciones.add(Oficinas);
        ArrHabitaciones.add(Taller);
        ArrHabitaciones.add(Comandamiento);
        ArrHabitaciones.add(Vestuario);
        ArrHabitaciones.add(Cocina);
        ArrHabitaciones.add(Comedor);
        ArrHabitaciones.add(Salida);

    }

    public Nave crearNave(){
        return new Nave("PiaXXI",ArrHabitaciones);
    }

    public Bond crearComandante(){
        return new Bond("Bond",1,ArrFrasesBond,0);
    }

    //En modo prueba el tripulante
    public Tripulantes crearTripulantes(){
        return new Tripulantes("Tripulante",1,ArrFrasesBond,0,false,ArrHerramientas);
    }

    //En modo prueba el Alien
    public Alien crearAlien(){
        return new Alien("Bergalian",1,ArrFrasesBond,8,0,true);
    }

    //Movimiento

    public void moveComandante() throws InterruptedException {
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

    public void desdeDormitorio() throws InterruptedException {

        System.out.println("Lugares donde puedes ir:");
        System.out.println(PiaXXI.getMapa().get(1).getNombreHabitacions());//Baño
        System.out.println(PiaXXI.getMapa().get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Banyos") || pregunta.equalsIgnoreCase("Baños")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()){
                if(PiaXXI.getMapa().get(1).getLuzHabitacion()) {
                    if(PiaXXI.getMapa().get(1).getPuerta()){
                        System.out.println("Te has movido a Baños");
                        Bond.setPosicion(1);
                        Thread.sleep(3750);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                        Thread.sleep(2750);
                    }
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comedor")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(0).getZona()) {
                    if (PiaXXI.getMapa().get(7).getPuerta()) {
                        System.out.println("Te has movido al Comedor");
                        Bond.setPosicion(7);
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

        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta()){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(1).getZona()){
                    if (PiaXXI.getMapa().get(0).getPuerta()) {
                        System.out.println("Te has movido al Dormitorio");
                        Bond.setPosicion(0);
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


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(3).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta()){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
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


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(4).getZona()){
                if(PiaXXI.getMapa().get(2).getPuerta()){
                    System.out.println("Te has movido a la Oficina");
                    Bond.setPosicion(2);
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


        if(pregunta.equalsIgnoreCase("Cocina") || pregunta.equalsIgnoreCase("Baños")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()){
                if(PiaXXI.getMapa().get(6).getPuerta()){
                    System.out.println("Te has movido a Baños");
                    Bond.setPosicion(6);
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Oficinas")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(5).getZona()) {
                    if (PiaXXI.getMapa().get(2).getPuerta()) {
                        System.out.println("Te has movido a Oficinas");
                        Bond.setPosicion(2);
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


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()){
                if(PiaXXI.getMapa().get(7).getPuerta()){
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
                    Thread.sleep(3750);
                } else {
                    System.out.println("La puerta esta cerrada");
                    Thread.sleep(2750);
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Vestuario")) {
                if(Bond.getPosicion() == PiaXXI.getMapa().get(6).getZona()) {
                    if (PiaXXI.getMapa().get(5).getPuerta()) {
                        System.out.println("Te has movido al Vestuario");
                        Bond.setPosicion(5);
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


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(8).getZona()){
                if(PiaXXI.getMapa().get(7).getPuerta()){
                    System.out.println("Te has movido al Comedor");
                    Bond.setPosicion(7);
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
        for(int x = 0; x < PiaXXI.getMapa().size() && !encontrado; x++){
            if(Bond.getPosicion() == PiaXXI.getMapa().get(x).getZona()){
                //System.out.println("Buscando objetos dentro de la habitación..");
                //Thread.sleep(3500);
                if(PiaXXI.getMapa().get(x).getObjetos() != null) {
                    //System.out.println("Hay estos objetos: "+PiaXXI.getMapa().get(x).getObjetos().getNombreHerramienta());
                    encontrado = true;
                } else {
                    System.out.println("No hay objetos en esta habitación");
                    Thread.sleep(4500);
                }
            }
        }
        return encontrado;
    }

    public void CojeObjeto() throws InterruptedException {
        if(buscarObjetos()) {
            boolean encontrado = false;
            int aux = 0;
            String coger;
            String objeto;
            for(int x = 0; x < PiaXXI.getMapa().size() && !encontrado; x++) {
                if (PiaXXI.getMapa().get(x).getObjetos() != null) {
                    if(Bond.getPosicion() == PiaXXI.getMapa().get(x).getZona()) {
                        System.out.println("Hay estos objetos: " + PiaXXI.getMapa().get(x).getObjetos().getNombreHerramienta());
                        aux = x;
                        encontrado = true;
                    }
                }
            }
            System.out.println("Elige que objeto quieres coger");
            coger = sc.next();
            objeto = PiaXXI.getMapa().get(aux).getObjetos().getNombreHerramienta();

            if(coger.equalsIgnoreCase(objeto)) {
                System.out.println("Has cogido "+PiaXXI.getMapa().get(aux).getObjetos().getNombreHerramienta());
                ArrInventario.add(0,PiaXXI.getMapa().get(aux).getObjetos());
                Bond.setInventarioComandante(ArrInventario);
                PiaXXI.getMapa().get(aux).setObjetos(null);
            } else {
                System.out.println("No has cogido el objeto");
            }
            Thread.sleep(3500);
        }
    }

    public void infoComandante() throws InterruptedException {
        System.out.println(Colores.ANSI_BLACK+"Nombre del Comandante: " +Colores.ANSI_WHITE+ Bond.getNombrePersona());
        //Lo siguiente sera por vidas..
        if (Bond.getVivoMuerto() == 1) {
            System.out.println(Colores.ANSI_BLACK+"Estado del Comandante:"+Colores.ANSI_WHITE+" Vivo");
        } else {
            System.out.println(Colores.ANSI_BLACK+"Estado del Comandante:"+Colores.ANSI_WHITE+" Muerto");
        }

        System.out.println(Colores.ANSI_BLACK+"Lugar: " +Colores.ANSI_WHITE+ PiaXXI.getMapa().get(Bond.getPosicion()).getNombreHabitacions());
        if (PiaXXI.getMapa().get(Bond.getPosicion()).getLuzHabitacion()) {
            System.out.println(Colores.ANSI_BLACK+"Luz:"+Colores.ANSI_WHITE+" Encendida");
        } else {
            System.out.println(Colores.ANSI_BLACK+"Luz:"+Colores.ANSI_WHITE+" Apagada");
        }

        for(int x = 0; x < Bond.getInventarioComandante().size(); x++){
            if(Bond.getInventarioComandante().get(x) != null) {
                System.out.println(Colores.ANSI_BLACK+"Inventario del Bond: "+Colores.ANSI_WHITE+Bond.getInventarioComandante().get(x).getNombreHerramienta());
            }
        }
        if(Bond.getInventarioComandante().size() == 0) {
            System.out.println(Colores.ANSI_WHITE+"No hay nada en el Inventario del Comandante");
        }
        Thread.sleep(4750);
    }

    public void ApagaEnciendeLuz() throws InterruptedException {
        System.out.println(Colores.ANSI_BLACK +"APAGAR");
        System.out.println(Colores.ANSI_BLACK+"ENCENDER");
        String option = sc.next();
        switch (option.toUpperCase()) {
            case "APAGAR" -> {
                for(int x = 0; x < PiaXXI.getMapa().size(); x++) {
                    if(PiaXXI.getMapa().get(x).getZona() == Bond.getPosicion()) {
                        if(PiaXXI.getMapa().get(x).getLuzHabitacion()){
                            System.out.println("Apagando luz...");
                            Thread.sleep(1500);
                            System.out.println("Luz apagada");
                            PiaXXI.getMapa().get(x).setLuzHabitacion(false);
                        } else if(!PiaXXI.getMapa().get(x).getLuzHabitacion()) {
                            System.out.println("La luz estaba apagada... La dejamos igual");
                            Thread.sleep(1500);
                        }
                    }
                }
            }
            case "ENCENDER" -> {
                for(int x = 0; x < PiaXXI.getMapa().size(); x++) {
                    if (PiaXXI.getMapa().get(x).getZona() == Bond.getPosicion()) {
                        if (!PiaXXI.getMapa().get(x).getLuzHabitacion()) {
                            System.out.println("Encendiendo luz...");
                            Thread.sleep(1500);
                            System.out.println("Luz encendida");
                            PiaXXI.getMapa().get(x).setLuzHabitacion(true);
                        } else if (PiaXXI.getMapa().get(x).getLuzHabitacion()) {
                            System.out.println("La luz estaba encendida... La dejamos igual");
                            Thread.sleep(1500);
                        }
                    }
                }
            }
            default -> System.out.println("Error,vuelve a introducirlo nuevamente");
        }
    }

    /*public void alienMove() {
        if(MoveComandante == 2) {
            while(MoveComandante > 2) {
            int PosAleatoria = (int) Math.floor(Math.random() * (0 - (9 + 1)) + (9));
            crearAlien().setPosicion(PosAleatoria);
            if(crearComandante().getPosicion() < crearAlien().getPosicion()) {
                System.out.println("Tienes cerca a alguien... Debes ir con precaución.");
            }
            }
        }
    }

    /*
    public void Movimiento(){
        if(crearHabitaciones().get(Bond.getPosicion()).getArriba() == 1) {
            System.out.println("Te puedes mover arriba");
            if(crearHabitaciones().get(Bond.getPosicion() + 1).getPuerta() == true) {
                System.out.println("Puedes pasar");
                Bond.setPosicion(Bond.getPosicion() + 1);
            }
        } else if(crearHabitaciones().get(Bond.getPosicion()).getAbajo() == 1) {
            System.out.println("Te puedes mover abajo");
        } else if(crearHabitaciones().get(Bond.getPosicion()).getIzquierda() == 1) {
            System.out.println("Te puedes mover a la izquierda");
        } else if(crearHabitaciones().get(Bond.getPosicion()).getDerecha() == 1) {
            System.out.println("Te puedes mover a la derecha");
        }
    }
 */

}