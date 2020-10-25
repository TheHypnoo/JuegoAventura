package Clases;

import java.util.ArrayList;

public class Tripulantes extends Personas {
    protected Boolean DormidoDespierto;
    protected Herramientas ObjetosTripulante;

    public Tripulantes(String NombrePersona, boolean VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, Boolean DormidoDespierto, Herramientas ObjetosTripulante) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.DormidoDespierto = DormidoDespierto;
        this.ObjetosTripulante = ObjetosTripulante;
    }


    //Establece Si el tripulante esta dormido o despierto
    public void setDormidoDespierto(Boolean DormidoDespierto){
        this.DormidoDespierto = DormidoDespierto;
    }
    //Consigue saber si el tripulante esta dormido o despierto
    public Boolean getDormidoDespierto(){
        return DormidoDespierto;
    }
    //Establezco los objetos del tripulante
    public void setObjetosTripulante(Herramientas ObjetosTripulante){
        this.ObjetosTripulante = ObjetosTripulante;
    }
    //Consigo saber los objetos del tripulante
    public Herramientas getObjetosTripulante() {
        return ObjetosTripulante;
    }
}
