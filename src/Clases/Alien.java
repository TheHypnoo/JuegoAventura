package Clases;

public class Alien extends Personas {
    protected Boolean AlteradoTranquilo;

    public Alien(String NombrePersona, boolean VivoMuerto, int Posicion, Boolean AlteradoTranquilo) {
        super(NombrePersona, VivoMuerto, Posicion);
        this.AlteradoTranquilo = AlteradoTranquilo;
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
