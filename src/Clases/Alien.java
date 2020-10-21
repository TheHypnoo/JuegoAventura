package Clases;

import java.util.ArrayList;

public class Alien extends Personas {
    protected int ContadorEncontradoAliado;
    protected Boolean AlteradoTranquilo;

    public Alien(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, int ContadorEncontradoAlien, Boolean AlteradoTranquilo) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.ContadorEncontradoAliado = ContadorEncontradoAlien;
        this.AlteradoTranquilo = AlteradoTranquilo;
    }

    public Alien(String NombrePersona, int VivoMuerto, int Posicion, int ContadorEncontradoAlien, Boolean AlteradoTranquilo) {
        super(NombrePersona, VivoMuerto, Posicion);
        this.ContadorEncontradoAliado = ContadorEncontradoAlien;
        this.AlteradoTranquilo = AlteradoTranquilo;
    }

    //Establezco el contador de cuantas veces ha encontrado un aliado
    public void setContadorEncontradoAliado(int ContadorEncontradoAliado){
        this.ContadorEncontradoAliado = ContadorEncontradoAliado;
    }
    //Consigo saber cuantas veces ha encontrado un aliado
    public int getContadorEncontradoAliado(){
        return ContadorEncontradoAliado;
    }
    //Establezco si esta Alterado o tranquilo
    public void setAlteradoTranquilo(Boolean AlteradoTranquilo) {
        this.AlteradoTranquilo = AlteradoTranquilo;
    }
    //Consigo saber si esta Alterado o Tranquilo
    public Boolean getAlteradoTranquilo(){
        return AlteradoTranquilo;
    }
}
