
/**
 * Write a description of class Tareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    private boolean tareaEstaHecha;
    private String nombreTarea;
    /**
     * Constructor for objects of class Tareas
     */
    public Tarea(String nombreTarea)
    {
        //Constructor de la Coleccion
        tareaEstaHecha = false;
        this.nombreTarea = nombreTarea;
    }
    public boolean getCompletada()
    {
        return tareaEstaHecha;
    }
    public String getNombre()
    {
        return nombreTarea;
    }
    public void completar()
    {
        tareaEstaHecha = true;
    }
}
