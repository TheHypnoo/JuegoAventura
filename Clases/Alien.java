import java.util.ArrayList;
import java.util.Random;

public class Alien extends Personas {
    protected int ContadorEncontradoAliado = 0;
    protected Boolean AlteradoTranquilo = false;
    Comandante Comandante = new Comandante();

    public Alien(String NombrePersona, int VivoMuerto, ArrayList<String> FrasesPersonas, int Posicion, int ContadorEncontradoAlien, Boolean AlteradoTranquilo) {
        super(NombrePersona, VivoMuerto, FrasesPersonas, Posicion);
        this.ContadorEncontradoAliado = ContadorEncontradoAlien;
        this.AlteradoTranquilo = AlteradoTranquilo;
    }

    public Alien(){

    }

    public void crearAlien(){
        Alien.super.setNombrePersona("Bargalian");
        Alien.super.setPosicion(8);
        Alien.super.setVivoMuerto(1);
        Alien.this.AlteradoTranquilo = false;
        Alien.this.ContadorEncontradoAliado = 0;
    }


    public void InfoAlien(){
        System.out.println("Nombre del Alien: "+Alien.super.getNombrePersona());
        System.out.println("Posicion del Alien: "+Alien.super.getPosicion());
        System.out.println("Estado del Alien: "+Alien.super.getVivoMuerto());
        System.out.println("Alterado? "+Alien.this.getAlteradoTranquilo());
        System.out.println("ContadorEncontrado: "+Alien.this.getContadorEncontradoAliado());
    }

    public void PosAlien(){
        if(Comandante.getPosicion() == Alien.super.getPosicion()) {
            Random random = new Random();
            int randomNumber = random.nextInt(8 + 1 - 1) + 1;
            Alien.super.setPosicion(randomNumber);
        }
    }

    //Establezco el contador de cuantas veces ha encontrado un aliado
    public void setContadorEncontradoAliado(int ContadorEncontradoAliado){
        this.ContadorEncontradoAliado = ContadorEncontradoAliado;
    }
    //Consigo saber cuantas veces ha encontrado un aliado
    public int getContadorEncontradoAliado(){
        return ContadorEncontradoAliado;
    }
    //Establezco si esta Alterado o tranquilo
    public void setAlteradoTranquilo(Boolean AlteradoTranquilo) {
        this.AlteradoTranquilo = AlteradoTranquilo;
    }
    //Consigo saber si esta Alterado o Tranquilo
    public Boolean getAlteradoTranquilo(){
        return AlteradoTranquilo;
    }
}
