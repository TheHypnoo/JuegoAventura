import java.util.ArrayList;

public class Herramientas {

    private String NombreHerramienta = "";
    private String DescripcionHerramienta = "";
    public static ArrayList<Herramientas> ArrHerramientas = new ArrayList<Herramientas>();

    public Herramientas (String NombreHerramienta, String DescripcionHerramienta)
    {
        this.NombreHerramienta = NombreHerramienta;
        this.DescripcionHerramienta = DescripcionHerramienta;
    }

    public Herramientas(){

    }

    public ArrayList<Herramientas> crearHerramientas(){

        Herramientas Taller = new Herramientas("Taller", "Descripción");
        Herramientas Linterna = new Herramientas("Linterna","Descripción");
        Herramientas VestidoEspacial = new Herramientas("Vestido Espacial","Descripción");
        Herramientas TarjetaIdentificadora = new Herramientas("Tarjeta Identificadora","Descripción");
        Herramientas TarjetaTripulante = new Herramientas("Tarjeta Tripulante","Descripción");
        Herramientas Donuts = new Herramientas("Donuts","Descripción");
        ArrHerramientas.add(Taller);
        ArrHerramientas.add(Linterna);
        ArrHerramientas.add(VestidoEspacial);
        ArrHerramientas.add(TarjetaIdentificadora);
        ArrHerramientas.add(TarjetaTripulante);
        ArrHerramientas.add(Donuts);

        return ArrHerramientas;
    }


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
