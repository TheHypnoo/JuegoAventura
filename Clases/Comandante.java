import java.util.ArrayList;

public class Comandante extends Personas{

    protected ArrayList<Mochila> InventarioComandante = new ArrayList<Mochila>();
    protected ArrayList<String> FrasesComandante = new ArrayList<String>();

    public Comandante(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, ArrayList<Mochila> InventarioComandante) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.InventarioComandante = InventarioComandante;
        this.FrasesComandante = FrasesPersonas;
    }
    public Comandante(){

    }

    public void crearComandante(){
        Comandante.super.setNombrePersona("Bond");
        Comandante.super.setPosicion(0);
        Comandante.super.setVivoMuerto(1);
        //Comandante.this.setInventarioComandante();
    }

    public void infoComandante(){
        Comandante.super.getNombrePersona();
        Comandante.super.getPosicion();
        Comandante.super.getVivoMuerto();
    }

    //Establezco los objetos del comandante
    public void setInventarioComandante(ArrayList<Mochila> InventarioComandante){
        this.InventarioComandante = InventarioComandante;
    }
    //Consigo saber los objetos del comandante
    public ArrayList<Mochila> getInventarioComandante() {
        return InventarioComandante;
    }
}
