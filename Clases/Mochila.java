import java.util.ArrayList;

public class Mochila {
    private ArrayList<Herramientas> Inventario = new ArrayList<Herramientas>();

    public Mochila(ArrayList<Herramientas> Inventario){
        this.Inventario=Inventario;
    }

    //Establezco lo que hay dentro de la Mochila
    public void setMochila(ArrayList<Herramientas> Inventario){
        this.Inventario = Inventario;
    }
    //Consigo saber que hay dentro de la mochila
    public ArrayList<Herramientas> getMochila(){
        return this.Inventario;
    }
}
