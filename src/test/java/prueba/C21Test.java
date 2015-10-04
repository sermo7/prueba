package prueba;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class C21Test {

    private c21 clase21;
    
    @Before
    public void before() {
        clase21 = new c21();
    }

    @Test
    public void testmA() {
        assertEquals("mA", clase21.mA());
    }

}
