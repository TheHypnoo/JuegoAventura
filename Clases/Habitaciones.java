public class Habitaciones {

    private String NombreHabitacion;
    private Boolean Luz;
    private Herramientas ObjetosHabitacion;
    private int Zona;
    /*
    private int Arriba = 0;
    private int Abajo = 0;
    private int Derecha = 0;
    private int Izquierda = 0;*/
    private boolean Puerta;
    private String DescripcionHabitacion;


    public Habitaciones(String NombreHabitacion, Herramientas ObjetosHabitacion, Boolean Luz, int Zona, int Arriba, int Abajo, int Derecha, int Izquierda, boolean Puerta, String DescripcionHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
        this.ObjetosHabitacion = ObjetosHabitacion;
        this.Luz = Luz;
        this.Zona = Zona;
        /*
        this.Arriba = Arriba;
        this.Abajo = Abajo;
        this.Derecha = Derecha;
        this.Izquierda = Izquierda;
         */
        this.Puerta = Puerta;
        this.DescripcionHabitacion = DescripcionHabitacion;
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
    public void setObjetos(Herramientas ObjetosActuales){
        this.ObjetosHabitacion = ObjetosActuales;
    }
    //Consigue el objeto de la habitacion
    public Herramientas getObjetos(){
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
/*
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
*/
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
