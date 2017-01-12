import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    private ArrayList<Tarea> listaDeTareas;
    private int contadorId;
    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        //Constructor de la Coleccion
        listaDeTareas = new ArrayList<Tarea>();
        contadorId = 10;
    }
    public void anadirTarea(String nombreTarea)
    {
        if(contadorId >= 10 && contadorId <= 99){
            Tarea nuevaTarea = new Tarea(nombreTarea, contadorId);
            listaDeTareas.add(nuevaTarea);
            contadorId++;
        }
        else{
            System.out.println("Has alcanzado el maximo de tareas.");
        }
    }
    public void muestraTareas(){
        int index = 0;
        while(index < listaDeTareas.size()){
            System.out.println((index + 1) + ". " + listaDeTareas.get(index).toString());
            index ++;
        }
    }
    public void completarTarea(int posicion)
    {
        int index = posicion;
        if(index > 0 && index <= listaDeTareas.size()){
            listaDeTareas.get(index - 1).completar();
        }
        else{
            System.out.println("No existe esa Tarea");
        }
    }
    public void mostrarTareasCoincidentes(String textoCoincidente)
    {
        int index = 0;
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getNombre().contains(textoCoincidente)){

                System.out.println((index + 1) + ". " + listaDeTareas.get(index).toString() + " " + listaDeTareas.get(index).getfechaVencimiento());
            }
            index ++;
        }
    }
    public void eliminarTarea(int posicion)
    {
        int index = posicion;
        if(index > 0 && index <= listaDeTareas.size()){
            listaDeTareas.remove(index - 1);
        }
        else{
            System.out.println("No existe esa Tarea");
        }
    }
    public void asignarPrioridad(int posicion, int nuevaPrioridad)
    {
       int index = posicion;
       if(posicion > 0 && posicion <= listaDeTareas.size()){
           if( nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
               listaDeTareas.get(index - 1).cambiarPrioridad(nuevaPrioridad);
            }
           else{
               System.out.println("La prioridad " + nuevaPrioridad + " no es valida. Asigne una prioridad entre 0 y 5");
           }
       }
       else{
           System.out.println("La tarea " + posicion + " no existe.");
       }
    }
    public void asignarFechaDeVencimiento(int posicion, int año, int mes, int dia)
    {
        int index = posicion - 1;
        listaDeTareas.get(index).cambiarFecha(año,mes,dia);
    }
    public void mostrarTareasConFechaDeVencimientoHoy()
    {
        int index = 0;
        LocalDate ahora = LocalDate.now();
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getfechaVencimiento() != null){
                if(listaDeTareas.get(index).getfechaVencimiento().isEqual(ahora)){
                    System.out.println((index + 1) + ". " + listaDeTareas.get(index).toString());
                }
            }
            index++;
        }
    }
    public void mostrarVencidas(){
        int index = 0;
        LocalDate ahora = LocalDate.now();
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getfechaVencimiento() != null){
                if(listaDeTareas.get(index).getfechaVencimiento().isBefore(ahora)){
                    System.out.println((index + 1) + ". " + listaDeTareas.get(index).toString());
                }
            }
            index++;
        }
    }
    public void verTareaMasPrioritaria(){
        int maximaPrioridad = 0;
        int index = 0;
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getPrioridad() > maximaPrioridad){
                maximaPrioridad = listaDeTareas.get(index).getPrioridad();
            }
            index++;
        }
        index = 0;
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getPrioridad() == maximaPrioridad){
                System.out.println((index + 1) + ". " + listaDeTareas.get(index).toString());
            }
            index++;
        }
    }
    public void verTareaMasPrioritaria2(){
        int maximaPrioridad = 0;
        int index = 0;
        Tarea tareaConPrioridadMaxima = null;
        while(index < listaDeTareas.size()){
            if(listaDeTareas.get(index).getPrioridad() >= maximaPrioridad){
                maximaPrioridad = listaDeTareas.get(index).getPrioridad();
                tareaConPrioridadMaxima = listaDeTareas.get(index);
            }
            index++;
        }
        if(tareaConPrioridadMaxima != null){
            System.out.println(tareaConPrioridadMaxima);
        }
    }
}