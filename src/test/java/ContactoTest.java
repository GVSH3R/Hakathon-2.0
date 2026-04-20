package test.java;
import main.java.Contacto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class ContactoTest {

    /** Expiración para que ninguna prueba tarde más de 4 segundos */
    @Rule
    public Timeout expiracion = Timeout.seconds(4);

    /** Variable de la clase Contacto. */
    private Contacto contacto;

    /** Ejecuta al método antes del test. */
    @Before
    public void contactoConstructor() {
        contacto = new Contacto("Gustavo", "Hernandez", "3311002299");
    }

    /** Prueba para el constructor de la clase Contacto. */
    @Test
    public void testConstructor() {
        Contacto c = new Contacto("Maria", "Lopez", "3311002298");
        Assert.assertEquals("Maria", c.getNombre());
        Assert.assertEquals("Lopez", c.getApellido());
        Assert.assertEquals("3311002298", c.getTelefono());
    }

    @Test
    public void testGetters() {
        Assert.assertEquals("Gustavo", contacto.getNombre());
        Assert.assertEquals("Hernandez", contacto.getApellido());
        Assert.assertEquals("3311002299", contacto.getTelefono());
    }

    @Test
    public void testSetTelefono() {
        contacto.setTelefono("3311002290");
        Assert.assertEquals("3311002290", contacto.getTelefono());
    }

    @Test
    public void testToString() {
        String expected = "Gustavo Hernandez - 3311002299";
        Assert.assertEquals(expected, contacto.toString());
    }
}
