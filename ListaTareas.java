import java.util.ArrayList;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    private ArrayList<Tarea> listaDeTareas;

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        //Constructor de la Coleccion
        listaDeTareas = new ArrayList<Tarea>();
    }
    public void anadirTarea(String nombreTarea)
    {
        Tarea nuevaTarea = new Tarea(nombreTarea);
        listaDeTareas.add(nuevaTarea);
    }
}
