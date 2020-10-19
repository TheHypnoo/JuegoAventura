import java.util.ArrayList;

public class Bond extends Personas{

    protected ArrayList<Herramientas> InventarioComandante = new ArrayList<>();
    protected ArrayList<String> FrasesComandante = new ArrayList<>();

    public Bond(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.FrasesComandante = FrasesPersonas;
    }
    /*
    //Sin frases
    public Bond(String NombrePersona, int VivoMuerto, int Posicion, ArrayList<Herramientas> InventarioComandante) {
        super(NombrePersona, VivoMuerto, Posicion);
        this.InventarioComandante = InventarioComandante;
        this.FrasesComandante = FrasesPersonas;
    }
*/

    //Establezco los objetos del comandante
    public void setInventarioComandante(ArrayList<Herramientas> InventarioComandante){
        this.InventarioComandante = InventarioComandante;
    }
    //Consigo saber los objetos del comandante
    public ArrayList<Herramientas> getInventarioComandante() {
        return InventarioComandante;
    }
}
