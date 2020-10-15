import java.util.ArrayList;

public class Nave {
    private String NombreNave = "";
    private ArrayList<Habitaciones> mapaHabitaciones = new ArrayList<Habitaciones>();
    //public ArrayList<Nave> ArrNave = new ArrayList<Nave>();
    Habitaciones Habitaciones = new Habitaciones();

    public Nave (String NombreNave, ArrayList<Habitaciones> mapaHabitaciones)
    {
        this.NombreNave = NombreNave;
        this.mapaHabitaciones = mapaHabitaciones;
    }

    public Nave(){

    }
/*
    public ArrayList<Nave> crearNave(){
        Nave PiaXXI = null;
        Nave.this.setNombreNave("PiaXXI");
        Nave.this.setMapa(Habitaciones.ArrHabitaciones);
        ArrNave.add(PiaXXI);
        //System.out.println(Nave.this.getNombreNave());
        return ArrNave;
    }
*/
    //Establece el nombre de la nave
    public void setNombreNave(String NombreNave) {
        this.NombreNave = NombreNave;
    }
    //Consigue el nombre de la nave
    public String getNombreNave(){
        return this.NombreNave;
    }

    //Establece el mapa
    public void setMapa (ArrayList<Habitaciones> mapaHabitaciones){
        this.mapaHabitaciones = mapaHabitaciones;
    }
    //Consigue el mapa
    public ArrayList<Habitaciones> getMapa (){
        return this.mapaHabitaciones;
    }



}
