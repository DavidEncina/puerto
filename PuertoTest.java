

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
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

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(2, "1111", 10, 1998);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(200, "2222", 14, 2000);
        Yate yate1 = new Yate(120, 3, "3333", 16, 2005);
        Cliente cliente1 = new Cliente("Paco", "111111Q");
        Cliente cliente2 = new Cliente("Fran", "222222Q");
        Cliente cliente3 = new Cliente("Chus", "333333Q");
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(4, cliente3, yate1));
        puerto1.verEstadoAmarres();
        assertEquals(60280, puerto1.liquidarAlquiler(1), 0.1);
    }
    
    @Test
    public void test002()
    {
        Puerto Coruña = new Puerto();
        Yate yate1 = new Yate(6, 200, "AAA", 20, 2001);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(50, "BBB", 15, 2002);
        Velero velero1 = new Velero(2, "CCC", 20, 1986);
        Cliente cliente1 = new Cliente("Paco", "715488484F");
        Cliente cliente2 = new Cliente("PEPE", "71555125H");
        Cliente cliente3 = new Cliente("Paula", "715552345H");
        Cliente cliente4 = new Cliente("LUIS", "71678787P");
        Cliente cliente5 = new Cliente("Antonio", "345676557K");
        assertEquals(0, Coruña.addAlquiler(20, cliente1, yate1));
        assertEquals(1, Coruña.addAlquiler(6, cliente2, embarcac1));
        assertEquals(2, Coruña.addAlquiler(8, cliente3, velero1));
        assertEquals(15900, Coruña.liquidarAlquiler(1), 0.1);
    }
    
    @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
}

