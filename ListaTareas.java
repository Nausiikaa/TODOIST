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
    public void muestraTareas(){
        int index = 0;
        while(index < listaDeTareas.size()){
            System.out.println((index + 1) + ". " + listaDeTareas.get(index).getNombre() + " " +
                               listaDeTareas.get(index).getCompletada());
            index ++;
        }
    }
    public void completarTarea(int posicion)
    {
        int index = posicion;
        listaDeTareas.get(index - 1).completar();
    }
}
