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
        for(i=0; i<estudiantes.length; i++)
      {
        if(estudiantes[i] == null)
        {
           estudiantes[i] = unEstudiante;
        }
      }
    }
    
    
  
    public void darDeBaja(int claveBaja)
    {
        //buscar al estudiante con su clave
        //le asignamos null
        int i;
        for(i=0; i<estudiantes.length;i++)
          if(estudiantes[i].dimeClave == claveBaja)
        {
            estudiantes[i] = null;
        }
    }
}
