import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidarFechaTest {

    @Test
    public void testFechaValida() {
        ValidarFecha vf = new ValidarFecha();
        assertTrue(vf.fechaValida(15, 4, 2024));
    }

    @Test
    public void mesInvalido() {
        ValidarFecha vf = new ValidarFecha();
        assertFalse(vf.fechaValida(1, 13, 2024));
    }

    @Test
    public void diaInvalido() {
        ValidarFecha vf = new ValidarFecha();
        assertFalse(vf.fechaValida(31, 6, 2024));
    }

    @Test
    public void bisiesto() {
        ValidarFecha vf = new ValidarFecha();
        assertTrue(vf.fechaValida(29, 2, 2024));
        assertFalse(vf.fechaValida(29, 2, 2023));
    }

    @Test
    public void fechaFutura() {
        ValidarFecha vf = new ValidarFecha();
        assertFalse(vf.fechaValida(7, 1, 2027));
    }
}