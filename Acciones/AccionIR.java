import java.util.Scanner;

public class AccionIR {
    Comandante Comandante = new Comandante();
    Herramientas Herramientas = new Herramientas();
    Habitaciones Habitaciones = new Habitaciones();
    Nave Nave = new Nave();
    Alien Alien = new Alien();
    Tripulantes Tripulantes = new Tripulantes();
    Scanner sc = new Scanner(System.in);

    /*
    SOLUCIONAR METODO
    public String Preguntar(){
        System.out.println("¿Donde quieres ir?");
        String pregunta = sc.next();
        return pregunta;
    }*/

    public void ir(){
        switch(Comandante.getPosicion()){
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
        System.out.println(Habitaciones.ArrHabitaciones.get(1).getNombreHabitacions());//Baño
        System.out.println(Habitaciones.ArrHabitaciones.get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


            if(pregunta.equalsIgnoreCase("Banyos") || pregunta.equalsIgnoreCase("Baños")){
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(0).getZona()){
                    System.out.println("Estas en la habitacion");
                    if(Habitaciones.ArrHabitaciones.get(1).getPuerta() == true){
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(1);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Comedor")) {
                    if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(0).getZona()) {
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(7).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(7);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            }
        }
    }

    public void desdeBanyos(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(2).getNombreHabitacions());//Oficina
        System.out.println(Habitaciones.ArrHabitaciones.get(0).getNombreHabitacions());//Dormitorio

        String pregunta = sc.next();

            if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(1).getZona()){
                    System.out.println("Estas en la habitacion");
                    if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(2);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Dormitorio")) {
                    if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(1).getZona()){
                        System.out.println("Estas en la habitacion");
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(0).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(0);
                    }
                }
            }
        }
    }

    public void desdeOficinas() {
        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(3).getNombreHabitacions());//Taller
        System.out.println(Habitaciones.ArrHabitaciones.get(4).getNombreHabitacions());//Comandamiento
        System.out.println(Habitaciones.ArrHabitaciones.get(5).getNombreHabitacions());//Vestuario
        System.out.println(Habitaciones.ArrHabitaciones.get(1).getNombreHabitacions());//Baños

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Taller")) {
            if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                System.out.println("Estas en la habitacion");
                if (Habitaciones.ArrHabitaciones.get(3).getPuerta() == true) {
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(3);
                    System.out.println(Comandante.getPosicion());
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comandamiento")) {
                if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(4).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(4);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Vestuario")) {
                    if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                        System.out.println("Estas en la habitacion");
                        if (Habitaciones.ArrHabitaciones.get(5).getPuerta() == true) {
                            System.out.println("La puerta esta abierta puedes pasar");
                            Comandante.setPosicion(5);
                            System.out.println(Comandante.getPosicion());
                        }
                    }
                } else {
                    if (pregunta.equalsIgnoreCase("Baños")) {
                        if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                            System.out.println("Estas en la habitacion");
                            if (Habitaciones.ArrHabitaciones.get(1).getPuerta() == true) {
                                System.out.println("La puerta esta abierta puedes pasar");
                                Comandante.setPosicion(1);
                                System.out.println(Comandante.getPosicion());
                            }
                        }
                    }
                }
            }
        }
    }

    public void desdeTaller(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(3).getZona()){
                System.out.println("Estas en la habitacion");
                if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(2);
                    System.out.println(Comandante.getPosicion());
                }
            }
        }
    }

    public void desdeComandamiento(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(4).getZona()){
                System.out.println("Estas en la habitacion");
                if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(2);
                    System.out.println(Comandante.getPosicion());
                }
            }
        }
    }

    public void desdeVestuario(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(6).getNombreHabitacions());//Cocina
        System.out.println(Habitaciones.ArrHabitaciones.get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Cocina") || pregunta.equalsIgnoreCase("Baños")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(5).getZona()){
                System.out.println("Estas en la habitacion");
                if(Habitaciones.ArrHabitaciones.get(6).getPuerta() == true){
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(6);
                    System.out.println(Comandante.getPosicion());
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Oficinas")) {
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(5).getZona()) {
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(2).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(2);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            }
        }
    }

    public void desdeCocina(){
        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(7).getNombreHabitacions());//Comedor
        System.out.println(Habitaciones.ArrHabitaciones.get(5).getNombreHabitacions());//Vestuario

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(6).getZona()){
                System.out.println("Estas en la habitacion");
                if(Habitaciones.ArrHabitaciones.get(7).getPuerta() == true){
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(7);
                    System.out.println(Comandante.getPosicion());
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Vestuario")) {
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(6).getZona()) {
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(5).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(5);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            }
        }
    }

    public void desdeComedor(){
        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(8).getNombreHabitacions());//Salida
        System.out.println(Habitaciones.ArrHabitaciones.get(0).getNombreHabitacions());//Dormitorio
        System.out.println(Habitaciones.ArrHabitaciones.get(6).getNombreHabitacions());//Cocina

        String pregunta = sc.next();


        if (pregunta.equalsIgnoreCase("Salida")) {
            if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(7).getZona()) {
                System.out.println("Estas en la habitacion");
                if (Habitaciones.ArrHabitaciones.get(8).getPuerta() == true) {
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(8);
                    System.out.println(Comandante.getPosicion());
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(7).getZona()) {
                    System.out.println("Estas en la habitacion");
                    if (Habitaciones.ArrHabitaciones.get(0).getPuerta() == true) {
                        System.out.println("La puerta esta abierta puedes pasar");
                        Comandante.setPosicion(0);
                        System.out.println(Comandante.getPosicion());
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Cocina")) {
                    if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(7).getZona()) {
                        System.out.println("Estas en la habitacion");
                        if (Habitaciones.ArrHabitaciones.get(6).getPuerta() == true) {
                            System.out.println("La puerta esta abierta puedes pasar");
                            Comandante.setPosicion(6);
                            System.out.println(Comandante.getPosicion());
                        }
                    }
                }
            }
        }
    }

    public void desdeSalida(){

        System.out.println("Lugares donde puedes ir:");
        System.out.println(Habitaciones.ArrHabitaciones.get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(8).getZona()){
                System.out.println("Estas en la habitacion");
                if(Habitaciones.ArrHabitaciones.get(7).getPuerta() == true){
                    System.out.println("La puerta esta abierta puedes pasar");
                    Comandante.setPosicion(7);
                    System.out.println(Comandante.getPosicion());
                }
            }
        }
    }
}
