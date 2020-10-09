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
        Habitaciones Dormitorio = new Habitaciones("Dormitorio",null,true,0,0,0,0,0,true,"");
        Habitaciones Banyos = new Habitaciones("Banyos",null,true,1,0,0,0,0,true,"");
        Habitaciones Oficinas = new Habitaciones("Oficinas",null,true,2,0,0,0,0,true,"");
        Habitaciones Taller = new Habitaciones("Taller",null,true,3,0,0,0,0,true,"");
        Habitaciones Comandamiento = new Habitaciones("Comandamiento",null,true,4,0,0,0,0,true,"");
        Habitaciones Vestuario = new Habitaciones("Vestuario",null,true,5,0,0,0,0,true,"");
        Habitaciones Cocina = new Habitaciones("Cocina",null,true,6,0,0,0,0,true,"");
        Habitaciones Comedor = new Habitaciones("Comedor",null,true,7,0,0,0,0,true,"");
        Habitaciones Salida = new Habitaciones("Salida",null,true,8,0,0,0,0,true,"");

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
