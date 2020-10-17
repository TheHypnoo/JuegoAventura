import java.util.ArrayList;

public class Bond extends Personas{

    protected ArrayList<Herramientas> InventarioComandante = new ArrayList<Herramientas>();
    protected ArrayList<String> FrasesComandante = new ArrayList<String>();

    public Bond(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, ArrayList<Herramientas> InventarioComandante) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.InventarioComandante = InventarioComandante;
        this.FrasesComandante = FrasesPersonas;
    }
    public Bond(){

    }
    //Sin frases
    public Bond(String NombrePersona, int VivoMuerto, int Posicion, ArrayList<Herramientas> InventarioComandante) {
        super(NombrePersona, VivoMuerto, Posicion);
        this.InventarioComandante = InventarioComandante;
        this.FrasesComandante = FrasesPersonas;
    }

    public Bond(String NombrePersona, int VivoMuerto, int Posicion) {
        super(NombrePersona, VivoMuerto, Posicion);
    }
/*
    public void crearComandante(){
        Bond.super.setNombrePersona("Bond");
        Bond.super.setPosicion(0);
        Bond.super.setVivoMuerto(1);
        //Bond.this.setInventarioComandante();
    }

    public void infoComandante(){
        System.out.println("Nombre del Bond: "+Bond.super.getNombrePersona());
        System.out.println("Posicion del Bond: "+Bond.super.getPosicion());
        System.out.println("Estado del Bond: "+Bond.super.getVivoMuerto());

        for(int i=0;i<Mochila.getMochila().size();i++)
        {
            if(InventarioComandante.get(i) != null)
            {
                System.out.println(InventarioComandante.get(i));
            }
            else {
                System.out.println("Inventario del Bond: Vacio");
            }
        }
    }

    public void buscarObjetos(int pos) throws InterruptedException {
        for(int x = 0; x < Habitaciones.ArrHabitaciones.size(); x++){
            if(pos == Habitaciones.ArrHabitaciones.get(x).getZona()){
                System.out.println("Buscando objetos dentro de la habitación..");
                Thread.sleep(3500);
                if(Habitaciones.ArrHabitaciones.get(x).getObjetos() != null) {
                    System.out.println("Hay estos objetos: "+Habitaciones.ArrHabitaciones.get(x).getObjetos());
                } else {
                    System.out.println("No hay objetos en esta habitación");
                }
            }
        }
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
