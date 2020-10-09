import java.util.ArrayList;

public class Nave {
    private String NombreNave = "";
    protected ArrayList<Habitaciones> Mapa = new ArrayList<Habitaciones>();
    Habitaciones Habitaciones = new Habitaciones();

    public Nave (String NombreNave, ArrayList<Habitaciones> Mapa)
    {
        this.NombreNave = NombreNave;
        this.Mapa = Mapa;
    }

    public Nave(){

    }

    public void crearNave(){
        Nave PiaXXI = new Nave("PiaXXI",Habitaciones.ArrHabitaciones);
    }

    //Establece el nombre de la nave
    public void setNombreNave(String NombreNave) {
        this.NombreNave = NombreNave;
    }
    //Consigue el nombre de la nave
    public String getNombreNave(){
        return this.NombreNave;
    }

    //Establece el mapa
    public void setMapa (ArrayList<Habitaciones> Mapa){
        this.Mapa = Mapa;
    }
    //Consigue el mapa
    public ArrayList<Habitaciones> getMapa (){
        return this.Mapa;
    }



}
