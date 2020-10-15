import java.util.ArrayList;

public class Herramientas extends ArrayList<Herramientas> {

    private String NombreHerramienta = "";
    private String DescripcionHerramienta = "";
    //public static ArrayList<Herramientas> ArrHerramientas = new ArrayList<Herramientas>();

    public Herramientas (String NombreHerramienta, String DescripcionHerramienta)
    {
        this.NombreHerramienta = NombreHerramienta;
        this.DescripcionHerramienta = DescripcionHerramienta;
    }

    public Herramientas(){

    }
/*
    public ArrayList<Herramientas> crearHerramientas(){

        Herramientas Destornillador = new Herramientas("Destornillador", "Sirve para reparar la nave o incluso atacar a alguien...");
        Herramientas Linterna = new Herramientas("Linterna","Sirve para ver a oscuras en una habitación sin luz");
        Herramientas VestidoEspacial = new Herramientas("Vestido Espacial","El Uniforme mas indispensable para salir de la nave");
        Herramientas TarjetaIdentificadora = new Herramientas("Tarjeta Identificadora","Tarjeta para abrir las puertas de la nave");
        Herramientas TarjetaTripulante = new Herramientas("Tarjeta Tripulante","Tarjeta que tienen los tripulantes para abrir las puertas de la nave");
        Herramientas Donuts = new Herramientas("Donuts","Es el alimento favorito del Alien, si le damos Donuts el Alien se tranquilizara");
        ArrHerramientas.add(Destornillador);
        ArrHerramientas.add(Linterna);
        ArrHerramientas.add(VestidoEspacial);
        ArrHerramientas.add(TarjetaIdentificadora);
        ArrHerramientas.add(TarjetaTripulante);
        ArrHerramientas.add(Donuts);

        return ArrHerramientas;
    }

*/
    //Establece el nombre de la herramienta
    public void setNombreHerramienta(String NombreHerramienta) {
        this.NombreHerramienta = NombreHerramienta;
    }
    //Consigue el nombre de la herramienta
    public String getNombreHerramienta(){
        return this.NombreHerramienta;
    }

    //Establece la descripcion de la herramienta
    public void setDescripcionHerramienta (String DescripcionHerramienta){
        this.DescripcionHerramienta = DescripcionHerramienta;
    }
    //Consigue la descripcion de la herramienta
    public String getDescripcionHerramienta (){
        return this.DescripcionHerramienta;
    }


}
