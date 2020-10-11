import java.util.Scanner;

public class AccionIR {
    Comandante Comandante = new Comandante();
    Habitaciones Habitaciones = new Habitaciones();
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
                    if(Habitaciones.ArrHabitaciones.get(1).getPuerta() == true){
                        System.out.println("Te has movido a Baños");
                        Comandante.setPosicion(1);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Comedor")) {
                    if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(0).getZona()) {
                    if (Habitaciones.ArrHabitaciones.get(7).getPuerta() == true) {
                        System.out.println("Te has movido al Comedor");
                        Comandante.setPosicion(7);
                    } else {
                        System.out.println("La puerta esta cerrada");
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
                    if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                        System.out.println("Te has movido a la Oficina");
                        Comandante.setPosicion(2);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Dormitorio")) {
                    if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(1).getZona()){
                    if (Habitaciones.ArrHabitaciones.get(0).getPuerta() == true) {
                        System.out.println("Te has movido al Dormitorio");
                        Comandante.setPosicion(0);
                    } else {
                        System.out.println("La puerta esta cerrada");
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
                if (Habitaciones.ArrHabitaciones.get(3).getPuerta() == true) {
                    System.out.println("Te has movido al Taller");
                    Comandante.setPosicion(3);
                } else {
                    System.out.println("La puerta esta cerrada.");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Comandamiento")) {
                if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                    if (Habitaciones.ArrHabitaciones.get(4).getPuerta() == true) {
                        System.out.println("Te has movido al Comandamiento");
                        Comandante.setPosicion(4);
                    } else {
                        System.out.println("La puerta esta cerrada.");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Vestuario")) {
                    if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                        if (Habitaciones.ArrHabitaciones.get(5).getPuerta() == true) {
                            System.out.println("Te has movido al Vestuario");
                            Comandante.setPosicion(5);
                        } else {
                            System.out.println("La puerta esta cerrada");
                        }
                    }
                } else {
                    if (pregunta.equalsIgnoreCase("Baños")) {
                        if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(2).getZona()) {
                            if (Habitaciones.ArrHabitaciones.get(1).getPuerta() == true) {
                                System.out.println("Te has movido a Baños");
                                Comandante.setPosicion(1);
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
        System.out.println(Habitaciones.ArrHabitaciones.get(2).getNombreHabitacions());//Oficinas

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Oficina") || pregunta.equalsIgnoreCase("Oficinas")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(3).getZona()){
                if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                    System.out.println("Te has movido a la Oficina");
                    Comandante.setPosicion(2);
                } else {
                    System.out.println("La puerta esta cerrada");
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
                if(Habitaciones.ArrHabitaciones.get(2).getPuerta() == true){
                    System.out.println("Te has movido a la Oficina");
                    Comandante.setPosicion(2);
                } else {
                    System.out.println("La puerta esta cerrada");
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
                if(Habitaciones.ArrHabitaciones.get(6).getPuerta() == true){
                    System.out.println("Te has movido a Baños");
                    Comandante.setPosicion(6);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Oficinas")) {
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(5).getZona()) {
                    if (Habitaciones.ArrHabitaciones.get(2).getPuerta() == true) {
                        System.out.println("Te has movido a Oficinas");
                        Comandante.setPosicion(2);
                    } else {
                        System.out.println("La puerta esta cerrada");
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
                if(Habitaciones.ArrHabitaciones.get(7).getPuerta() == true){
                    System.out.println("Te has movido al Comedor");
                    Comandante.setPosicion(7);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Vestuario")) {
                if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(6).getZona()) {
                    if (Habitaciones.ArrHabitaciones.get(5).getPuerta() == true) {
                        System.out.println("Te has movido al Vestuario");
                        Comandante.setPosicion(5);
                    } else {
                        System.out.println("La puerta esta cerrada");
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
                if (Habitaciones.ArrHabitaciones.get(8).getPuerta() == true) {
                    System.out.println("Te has movido a la Salida");
                    Comandante.setPosicion(8);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        } else {
            if (pregunta.equalsIgnoreCase("Dormitorio")) {
                if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(7).getZona()) {
                    if (Habitaciones.ArrHabitaciones.get(0).getPuerta() == true) {
                        System.out.println("Te has movido al Dormitorio");
                        Comandante.setPosicion(0);
                    } else {
                        System.out.println("La puerta esta cerrada");
                    }
                }
            } else {
                if (pregunta.equalsIgnoreCase("Cocina")) {
                    if (Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(7).getZona()) {
                        if (Habitaciones.ArrHabitaciones.get(6).getPuerta() == true) {
                            System.out.println("Te has movido a la Cocina");
                            Comandante.setPosicion(6);
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
        System.out.println(Habitaciones.ArrHabitaciones.get(7).getNombreHabitacions());//Comedor

        String pregunta = sc.next();


        if(pregunta.equalsIgnoreCase("Comedor")){
            if(Comandante.getPosicion() == Habitaciones.ArrHabitaciones.get(8).getZona()){
                if(Habitaciones.ArrHabitaciones.get(7).getPuerta() == true){
                    System.out.println("Te has movido al Comedor");
                    Comandante.setPosicion(7);
                } else {
                    System.out.println("La puerta esta cerrada");
                }
            }
        }
    }
}
