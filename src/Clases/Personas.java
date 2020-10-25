package Clases;

import java.util.ArrayList;

public class Personas {
    protected String NombrePersona;
    protected boolean VivoMuerto;
    protected ArrayList<String> FrasesPersonas = new ArrayList<>();
    protected int Posicion;

    public Personas(String NombrePersona, boolean VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion){
        this.NombrePersona = NombrePersona;
        this.VivoMuerto = VivoMuerto;
        this.FrasesPersonas = FrasesPersonas;
        this.Posicion = Posicion;
    }

    public Personas(String NombrePersona, boolean VivoMuerto, int Posicion){
        this.NombrePersona = NombrePersona;
        this.VivoMuerto = VivoMuerto;
        this.Posicion = Posicion;
    }

    //Establezco el nombre de la persona
    public void setNombrePersona(String NombrePersona){
        this.NombrePersona = NombrePersona;
    }
    //Consigo el nombre de la persona
    public String getNombrePersona(){
        return NombrePersona;
    }
    //Establezco si esta vivo o muerto
    public void setVivoMuerto(boolean VivoMuerto){
        this.VivoMuerto = VivoMuerto;
    }
    //Consigo saber si esta vivo o muerto
    public boolean getVivoMuerto(){
        return VivoMuerto;
    }
    //Establezco las frases de cada persona
    public void setFrasesPersonas(ArrayList<String> FrasesPersonas){
        this.FrasesPersonas = FrasesPersonas;
    }
    //Consigo las frases de cada persona
    public ArrayList<String> getFrasesPersonas(){
        return FrasesPersonas;
    }
    //Establezco la posicion de la persona
    public void setPosicion(int Posicion){
        this.Posicion = Posicion;
    }
    //Consigo saber la posicion de la persona
    public int getPosicion(){
        return Posicion;
    }
}
