public class Inicializar {
    Herramientas Herramientas = new Herramientas();
    Habitaciones Habitaciones = new Habitaciones();
    Nave Nave = new Nave();
    Comandante Comandante = new Comandante();
    Alien Alien = new Alien();
    Tripulantes Tripulantes = new Tripulantes();
    AccionIR AccionIR = new AccionIR();
    menuSecundario menuSecundario = new menuSecundario();
    public void IniciaClases(){
        Herramientas.crearHerramientas();
        Habitaciones.crearHabitaciones();
        Nave.crearNave();
        Comandante.crearComandante();
        Alien.crearAlien();
        Tripulantes.crearTripulantes();
        menuSecundario.Menu();
    }
}
