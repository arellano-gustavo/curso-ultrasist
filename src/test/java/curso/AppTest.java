package curso;

import curso.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
    public void testDivide() {
        App app = new App();
        int res = app.divide(-7, -7);
        int esperado = 1;
        assertTrue(esperado == res);
        
        try {
          res = app.divide(-7, 0);
          System.out.println("esta linea nunca se debería ejecutar !!!!!");
          assertTrue(false);
        } catch(Exception e) {
          System.out.println("ouch....");
          assertTrue(true);
        }
        
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        App app = new App();
        int res = app.suma(2, 3);
        int esperado = 5;
        assertTrue(esperado == res);
    }
    public void testApp2() {
        App app = new App();
        
        int res = app.multiplica(-2, -3);
        int esperado = 6;
        assertTrue(esperado == res);
        
        res = app.multiplica(2, -3);
        esperado = -6;
        assertTrue(esperado == res);

//        res = app.multiplica(6, 3);
//        esperado = 18;
//        assertTrue(esperado == res);

        res = app.multiplica(0, 3);
        esperado = 0;
        assertTrue(esperado == res);

        res = app.multiplica(-2, 3);
        esperado = -6;
        assertTrue(esperado == res);
        
        res = app.multiplica(1, 1);
        esperado = 1;
        assertTrue(esperado == res);

        res = app.multiplica(6, 6);
        esperado = 36;
        assertTrue(esperado == res);        
        
        res = app.multiplica(0, 1);
        esperado = 0;
        assertTrue(esperado == res);
        
        res = app.multiplica(0, 2);
        esperado = 0;
        assertTrue(esperado == res);
        
        res = app.multiplica(0, 3);
        esperado = 0;
        assertTrue(esperado == res);
        
        res = app.multiplica(0, 4);
        esperado = 0;
        assertTrue(esperado == res);
        
        res = app.multiplica(0, 5);
        esperado = 0;
        assertTrue(esperado == res);
        
        res = app.multiplica(0, 6);
        esperado = 0;
        assertTrue(esperado == res);

        // una prueba unitaria sirve para "sospechar" que un código está bien hecho, pero
        // NUNCA vamos a poder demostrar que ese código sirve SIEMPRE a la perfección.

        // ahora bien, en caso de que la prueba falle con un sólo caso,
        // eso SI demuestra al 100% que el código está mal hecho.
    }
}
