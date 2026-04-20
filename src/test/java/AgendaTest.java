package test.java;

import main.java.Contacto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import main.java.Agenda;


public class AgendaTest {

    private Agenda agenda;

    /** Expiración para que ninguna prueba tarde más de 4 segundos */
    @Rule
    public Timeout expiracion = Timeout.seconds(4);

    /** Ejecuta al método antes del test. */
    @Before
    public void agendaConstructor() {
       agenda = new Agenda();
    }

    /** Prueba para la creacion de un contacto. */
    @Test
    public void testAñadirContacto() {
        Contacto c = new Contacto ("Gustavo", "Hernandez", "3311002299");
        agenda.añadirContacto(c);
        Assert.assertNotNull(agenda.getContacto("Gustavo", "Hernandez"));
        Assert.assertNull(agenda.getContacto("Maria", "Lopez"));
    }

    @Test
    public void testAñadirContactoDuplicado() {
        Contacto c1 = new Contacto("Gustavo", "Hernandez", "3311002299");
        Contacto c2 = new Contacto("Gustavo", "Hernandez", "3311002299");
        agenda.añadirContacto(c1);
        agenda.añadirContacto(c2);
        Assert.assertEquals(9, agenda.espaciosLibres());
    }

    @Test
    public void testEspaciosLibresAgendaVacia() {
        Assert.assertEquals(10, agenda.espaciosLibres());
    }

    @Test
    public void testEspaciosLibresDespuesDeAgregar3Contactos() {
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        Assert.assertEquals(7, agenda.espaciosLibres());
    }

    @Test
    public void testEspaciosLibresAgendaLlena() {
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        agenda.añadirContacto(new Contacto("Ana", "Garcia", "3311002296"));
        agenda.añadirContacto(new Contacto("Luis", "Martinez", "3311002295"));
        agenda.añadirContacto(new Contacto("Sofia", "Rodriguez", "3311002294"));
        agenda.añadirContacto(new Contacto("Carlos", "Gomez", "3311002293"));
        agenda.añadirContacto(new Contacto("Laura", "Sanchez", "3311002292"));
        agenda.añadirContacto(new Contacto("Diego", "Diaz", "3311002291"));
        agenda.añadirContacto(new Contacto("Eduardo", "Rodriguez", "123121231"));
        agenda.añadirContacto(new Contacto("Marta", "Lopez", "123123123"));
        Assert.assertEquals(0, agenda.espaciosLibres());
    }

    @Test
    public void testEliminarContacto() {
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        Assert.assertEquals(7, agenda.espaciosLibres());
        agenda.eliminarContacto("Maria", "Lopez");
        Assert.assertEquals(8, agenda.espaciosLibres());
    }

    @Test
    public void testEliminarContactoNoExistente() {
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        Assert.assertEquals(7, agenda.espaciosLibres());
        agenda.eliminarContacto("Ana", "Garcia");
        Assert.assertEquals(7, agenda.espaciosLibres());
    }

    @Test
    public void testContactosOrdenados(){
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        agenda.añadirContacto(new Contacto("Ana", "Garcia", "3311002296"));
        agenda.añadirContacto(new Contacto("Luis", "Martinez", "3311002295"));
        agenda.añadirContacto(new Contacto("Sofia", "Rodriguez", "3311002294"));
        agenda.añadirContacto(new Contacto("Carlos", "Gomez", "3311002293"));
        agenda.añadirContacto(new Contacto("Laura", "Sanchez", "3311002292"));
        agenda.añadirContacto(new Contacto("Diego", "Diaz", "3311002291"));
        Assert.assertEquals(9, agenda.getContactosOrdenados().size());
        Assert.assertEquals("Ana", agenda.getContactosOrdenados().get(0).getNombre());
        Assert.assertEquals("Sofia", agenda.getContactosOrdenados().get(8).getNombre());
    }

    @Test
    public void testBuscarContacto() {
        agenda.añadirContacto(new Contacto("Gustavo", "Hernandez", "3311002299"));
        agenda.añadirContacto(new Contacto("Maria", "Lopez", "3311002298"));
        agenda.añadirContacto(new Contacto("Juan", "Perez", "3311002297"));
        Assert.assertEquals("3311002298", agenda.getContacto("Maria", "Lopez").getTelefono());
        Assert.assertNull(agenda.getContacto("Ana", "Garcia"));
    }
}// Fin de la clase AgendaTest
