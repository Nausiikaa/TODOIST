

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TareaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TareaTest
{
    private ListaTareas listaTar1;

    

    

    /**
     * Default constructor for test class TareaTest
     */
    public TareaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listaTar1 = new ListaTareas();
        listaTar1.anadirTarea("Sacar al perro");
        listaTar1.anadirTarea("hacer cama");
        listaTar1.anadirTarea("hacer colada");
        listaTar1.muestraTareas();
        listaTar1.completarTarea(1);
        listaTar1.muestraTareas();
        listaTar1.asignarFechaDeVencimiento(1, 2017, 1, 9);
        listaTar1.asignarFechaDeVencimiento(2, 2020, 1, 1);
        listaTar1.asignarFechaDeVencimiento(3, 2020, 2, 2);
        listaTar1.muestraTareas();
        listaTar1.muestraTareas();
        listaTar1.muestraTareas();
        listaTar1.asignarPrioridad(1, 5);
        listaTar1.asignarPrioridad(2, 4);
        listaTar1.asignarPrioridad(3, 5);
        listaTar1.muestraTareas();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
