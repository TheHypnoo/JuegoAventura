package Clases;

import java.util.ArrayList;

public class Bond extends Personas {

    protected ArrayList<Herramientas> InventarioComandante = new ArrayList<>();
    protected ArrayList<String> FrasesComandante;
    protected boolean Vestido;

    public Bond(String NombrePersona, boolean VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.FrasesComandante = FrasesPersonas;
    }

    //Establezco los objetos del comandante
    public void setInventarioComandante(ArrayList<Herramientas> InventarioComandante){
        this.InventarioComandante = InventarioComandante;
    }
    //Consigo saber los objetos del comandante
    public ArrayList<Herramientas> getInventarioComandante() {
        return InventarioComandante;
    }
    //Le pongo el traje o no
    public void setVestido(boolean vestido) {
        Vestido = vestido;
    }
    //Consigo saber si tiene el traje o no
    public boolean getVestido() {
        return Vestido;
    }
}
