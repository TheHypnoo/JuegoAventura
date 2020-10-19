
public class Herramientas {

    private String NombreHerramienta;
    private String DescripcionHerramienta;


    public Herramientas (String NombreHerramienta, String DescripcionHerramienta)
    {
        this.NombreHerramienta = NombreHerramienta;
        this.DescripcionHerramienta = DescripcionHerramienta;
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
