import java.util.ArrayList;

public class Tripulantes extends Personas{
    protected Boolean DormidoDespierto = false;
    protected ArrayList<Herramientas> ObjetosTripulante = new ArrayList<Herramientas>();

    public Tripulantes(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, Boolean DormidoDespierto, ArrayList<Herramientas> ObjetosTripulante) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.DormidoDespierto = DormidoDespierto;
        this.ObjetosTripulante = ObjetosTripulante;
    }

    public Tripulantes(){

    }

    public void crearTripulantes(){
        Tripulantes.super.setNombrePersona("Tripulante");
        Tripulantes.super.setPosicion(0);
        Tripulantes.super.setVivoMuerto(1);
        Tripulantes.this.setDormidoDespierto(true);
        //Tripulantes.this.setObjetosTripulante();
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
    public void setObjetosTripulante(ArrayList<Herramientas> ObjetosTripulante){
        this.ObjetosTripulante = ObjetosTripulante;
    }
    //Consigo saber los objetos del tripulante
    public ArrayList<Herramientas> getObjetosTripulante() {
        return ObjetosTripulante;
    }
}
