public class Inicializar {
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
        Tripulantes.crearTripulantes();
        Comandante.infoComandante();
        Alien.InfoAlien();
        menuSecundario.Menu();
    }
}
