package Clases;

import java.util.ArrayList;

public class Nave {
    private String NombreNave;
    private ArrayList<Habitaciones> mapaHabitaciones;
    private boolean Reparado;

    public Nave (String NombreNave, ArrayList<Habitaciones> mapaHabitaciones, boolean Reparado)
    {
        this.NombreNave = NombreNave;
        this.mapaHabitaciones = mapaHabitaciones;
        this.Reparado = Reparado;
    }

    //Establece el nombre de la nave
    public void setNombreNave(String NombreNave) {
        this.NombreNave = NombreNave;
    }
    //Consigue el nombre de la nave
    public String getNombreNave(){
        return this.NombreNave;
    }

    //Establece el mapa
    public void setMapa (ArrayList<Habitaciones> mapaHabitaciones){
        this.mapaHabitaciones = mapaHabitaciones;
    }
    //Consigue el mapa
    public ArrayList<Habitaciones> getMapa (){
        return this.mapaHabitaciones;
    }
    //Establezco si esta reparado o no
    public void setReparado(boolean reparado) {
        Reparado = reparado;
    }
    //Consigo saber si esta reparado o no
    public boolean getReparado() {
        return Reparado;
    }
}
