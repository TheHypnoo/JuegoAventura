import java.util.ArrayList;

public class Tripulantes extends Personas{
    protected Boolean DormidoDespierto;
    protected ArrayList<Herramientas> ObjetosTripulante = new ArrayList<>();

    public Tripulantes(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, Boolean DormidoDespierto, ArrayList<Herramientas> ObjetosTripulante) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.DormidoDespierto = DormidoDespierto;
        this.ObjetosTripulante = ObjetosTripulante;
    }

    public Tripulantes(String NombrePersona, int VivoMuerto, int Posicion, Boolean DormidoDespierto) {
        super(NombrePersona, VivoMuerto, Posicion);
        this.DormidoDespierto = DormidoDespierto;
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
