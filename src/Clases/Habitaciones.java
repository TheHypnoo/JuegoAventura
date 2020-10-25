package Clases;

public class Habitaciones {

    private String NombreHabitacion;
    private Boolean Luz;
    private Herramientas ObjetosHabitacion;
    private int Zona;
    private boolean Puerta;
    private String DescripcionHabitacion;


    public Habitaciones(String NombreHabitacion, Herramientas ObjetosHabitacion, Boolean Luz, int Zona, boolean Puerta, String DescripcionHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
        this.ObjetosHabitacion = ObjetosHabitacion;
        this.Luz = Luz;
        this.Zona = Zona;
        this.Puerta = Puerta;
        this.DescripcionHabitacion = DescripcionHabitacion;
    }

    //Establece el nombre de la habitacion
    public void setNombreHabitaciones(String NombreHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
    }
    //Consigue el nombre de la habitacion
    public String getNombreHabitaciones(){
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
    //Establece la puerta
    public void setPuerta(boolean Puerta){
        this.Puerta = Puerta;
    }
    //Consigue saber si la puerta esta abierta o cerrada
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
