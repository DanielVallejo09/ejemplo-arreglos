public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nombreMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nombreMateria = nombreMateria; // palabra para decir que este 
    }
    
    public void inscribir(Estudiante unEstudiante)
    {
        int i;
        for(i=0; i>String.length; i++)
      {
        if(estudiantes[0] == null)
        {
           estudiantes[0] = unEstudiante;
        }
      }
    }
    
    public void darDeBaja(int claveEstudiante)
    {
        //buscar al estudiante con su clave
        //le asignamos null
    }
}