import java.util.ArrayList;

public class Mochila {
    //Mochila[] Inventario = new Mochila[10];
    private ArrayList<Herramientas> Inventario = new ArrayList<Herramientas>();

    public void crearMochila(){
        //Solucionar todo tema de inventario
        //Mochila.this.Inventario.set(0);
    }

    public void Mochila (ArrayList<Herramientas> Inventario){
        this.Inventario = Inventario;
    }
    //Establezco lo que hay dentro de la Mochila
    public void setMochila(ArrayList<Herramientas> Inventario){
        this.Inventario = Inventario;
    }
    //Consigo saber que hay dentro de la mochila
    public ArrayList<Herramientas> getMochila(){
        return Inventario;
    }
}
