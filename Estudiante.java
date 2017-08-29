public class Estudiante
{
    private String nombre;
    private int clave;
    public int dimeClave;
    
    public Estudiante(int clavaIni, String nombreIni)
    {
        
    }
    
    public String dimeDetalles()
    {
        return "Clave: " + clave + "Nombre: " + nombre;
    }
    
    public int dimeClave()
    {
        return clave;
    }
}