public class Start {
    Herramientas Herramientas = new Herramientas();
    Habitaciones Habitaciones = new Habitaciones();
    Nave Nave = new Nave();
    Comandante Comandante = new Comandante();
    Alien Alien = new Alien();
    Tripulantes Tripulantes = new Tripulantes();
    menuSecundario menuSecundario = new menuSecundario();
    public void IniciaClases(){
        Mochila.crearMochila();
        Herramientas.crearHerramientas();
        Habitaciones.crearHabitaciones();
        Nave.crearNave();
        Comandante.crearComandante();
        Alien.crearAlien();
        Alien.PosAlien();
        Tripulantes.crearTripulantes();
        System.out.println(Nave.getNombreNave());
        //System.out.println(Nave.getMapa().get(0).getNombreHabitacions());
        Comandante.infoComandante();
        Alien.InfoAlien();
        menuSecundario.Menu();
    }
}