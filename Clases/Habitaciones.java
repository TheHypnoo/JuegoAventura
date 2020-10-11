import java.util.ArrayList;

public class Habitaciones {

    private String NombreHabitacion = "";
    private Boolean Luz = false;
    private ArrayList<Herramientas> ObjetosHabitacion = new ArrayList<Herramientas>();
    public static ArrayList<Habitaciones> ArrHabitaciones = new ArrayList<Habitaciones>();
    private int Zona = 0;
    private int Arriba = 0;
    private int Abajo = 0;
    private int Derecha = 0;
    private int Izquierda = 0;
    private boolean Puerta = true;
    private String DescripcionHabitacion = "";


    public Habitaciones (String NombreHabitacion, ArrayList<Herramientas> ObjetosHabitacion, Boolean Luz, int Zona, int Arriba, int Abajo, int Derecha, int Izquierda, boolean Puerta , String DescripcionHabitacion)
    {
        this.NombreHabitacion = NombreHabitacion;
        this.ObjetosHabitacion = ObjetosHabitacion;
        this.Luz = Luz;
        this.Zona = Zona;
        this.Arriba = Arriba;
        this.Abajo = Abajo;
        this.Derecha = Derecha;
        this.Izquierda = Izquierda;
        this.Puerta = Puerta;
        this.DescripcionHabitacion = DescripcionHabitacion;
    }


    public Habitaciones(){

    }

    public ArrayList<Habitaciones> crearHabitaciones(){
        //Solucionar problema con objetos de herramientas!!
        Habitaciones Dormitorio = new Habitaciones("Dormitorio",Herramientas.ArrHerramientas.get(0).crearHerramientas(),true,0,1,-1,-1,1,true,"La sala donde duerme la tripulacion");
        Habitaciones Banyos = new Habitaciones("Baños",null,true,1,-1,1,-1,1,true,"Son los unicos baños de la nave y no estan muy limpios...");
        Habitaciones Oficinas = new Habitaciones("Oficinas",null,false,2,1,1,1,1,true,"La sala donde estan todos los documentos de la nave");
        Habitaciones Taller = new Habitaciones("Taller",null,false,3,-1,1,-1,-1,true,"Zona donde estan las herramientas de la nave");
        Habitaciones Comandamiento = new Habitaciones("Comandamiento",null,true,4,1,-1,-1,-1,true,"Sala donde se controla totalmente toda la nave");
        Habitaciones Vestuario = new Habitaciones("Vestuario",null,false,5,-1,1,1,-1,true,"Lugar donde se cambia la tripulación");
        Habitaciones Cocina = new Habitaciones("Cocina",null,false,6,1,-1,1,-1,true,"Zona donde se cocina para los tripulantes");
        Habitaciones Comedor = new Habitaciones("Comedor",null,true,7,-1,1,1,1,true,"Sala donde la tripulación come");
        Habitaciones Salida = new Habitaciones("Salida",null,true,8,1,-1,-1,-1,true,"La salida de la nave");

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

    public void infoHabitacion(int pos) throws InterruptedException {
        if(pos == Habitaciones.ArrHabitaciones.get(0).getZona()){
            System.out.println("Estas en el Dormitorio");
            System.out.println("Objetos dentro de Dormitorio: "+null);
            if(Habitaciones.ArrHabitaciones.get(0).getLuzHabitacion() == true){
                System.out.println("La luz esta encendida");
            } else {
                System.out.println("La luz esta apagada");
            }
            //En proceso de creación..
        }

        Thread.sleep(2500);
    }


    //Establece el nombre de la habitacion
    public void setNombreHabitacions(String NombreHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
    }
    //Consigue el nombre de la habitacion
    public String getNombreHabitacions(){
        return this.NombreHabitacion;
    }

    //Establece la luz de la habitacion
    public void setLuzHabitacion (Boolean Luz){
        this.Luz = Luz;
    }
    //Consigue la luz de la habitacion
    public Boolean getLuzHabitacion (){
        return this.Luz;
    }

    //Establece el objeto de la habitacion
    public void setObjetos(ArrayList<Herramientas> ObjetosActuales){
        this.ObjetosHabitacion = ObjetosHabitacion;
    }
    //Consigue el objeto de la habitacion
    public ArrayList<Herramientas> getObjetos(){
        return this.ObjetosHabitacion;
    }

    //Establece saber en que zona esta
    public void setZona(int Zona){
        this.Zona = Zona;
    }
    //Consigue saber en que zona esta
    public int getZona(){
        return this.Zona;
    }

    //Establece ir arriba
    public void setArriba(int Arriba) {
        this.Arriba = Arriba;
    }
    //Consigue saber si va a arriba
    public int getArriba(){
        return this.Arriba;
    }

    //Establece ir Abajo
    public void setAbajo(int Abajo) {
        this.Abajo = Abajo;
    }
    //Consigue saber si va a Abajo
    public int getAbajo(){
        return this.Abajo;
    }

    //Establece ir a la Derecha
    public void setDerecha(int Derecha) {
        this.Derecha = Derecha;
    }
    //Consigue saber si va a la Derecha
    public int getDerecha(){
        return this.Derecha;
    }

    //Establece ir a la Izquierda
    public void setIzquierda(int Izquierda) {
        this.Izquierda = Izquierda;
    }
    //Consigue saber si va a la Izquierda
    public int getIzquierda(){
        return this.Izquierda;
    }

    public void setPuerta(boolean Puerta){
        this.Puerta = Puerta;
    }

    public boolean getPuerta(){
        return this.Puerta;
    }

    //Establece la descripcion de la habitacion
    public void setDescripcionHabitacion(String DescripcionHabitacion) {
        this.DescripcionHabitacion = DescripcionHabitacion;
    }
    //Consigue la descripcion de la habitacion
    public String getDescripcionHabitacion(){
        return this.DescripcionHabitacion;
    }

}
