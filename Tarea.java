import java.time.LocalDate;
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
    private int prioridad;
    private LocalDate fechaVencimiento;
    /**
     * Constructor for objects of class Tareas
     */
    public Tarea(String nombreTarea)
    {
        //Constructor de la Coleccion
        tareaEstaHecha = false;
        this.nombreTarea = nombreTarea;
        prioridad = 0;
        fechaVencimiento = null;
    }
    /**
     * Devuelve el balor del atributo tareaEstaHecha
     */
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
    public String toString()
    {
        String textoADevolver = nombreTarea + " (" + prioridad + ") ";
        if(tareaEstaHecha == true){
            textoADevolver = textoADevolver + " Hecha ";
        }
        if(fechaVencimiento != null){
            textoADevolver = textoADevolver + " (" + fechaVencimiento + ")";
        }
        return textoADevolver;
    }
    public void cambiarPrioridad(int nuevaPrioridad)
    {
        if(nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
            prioridad = nuevaPrioridad;
        }
    }
    public void cambiarFecha(int año, int mes, int dia)
    {
        fechaVencimiento = LocalDate.of(año,mes,dia);
    }
    public LocalDate getfechaVencimiento()
    {
        return fechaVencimiento;
    }
    public int getPrioridad()
    {
        return prioridad;
    }
}
