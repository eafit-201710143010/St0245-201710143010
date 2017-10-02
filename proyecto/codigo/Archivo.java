
/**
 * Write a description of class Archivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archivo
{
    private String nombre;
    private String directorio;
    private String direccion;
    private boolean esDirectorio;
    
    public Archivo(String nombre, String directorio, String direccion, boolean esDirectorio)
    {
        this.nombre = nombre;
        this.directorio = directorio;
        this.direccion = direccion;
        this.esDirectorio = esDirectorio;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getDirectorio()
    {
        return directorio;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public boolean getEsDiretorio()
    {
        return esDirectorio;
    }
}
