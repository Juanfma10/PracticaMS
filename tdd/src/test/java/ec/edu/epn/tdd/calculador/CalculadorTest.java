package ec.edu.epn.tdd.calculador;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadorTest {
    Calculador c=null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setupClass()");
    }

    @Before
    public void setUp(){
        c=new Calculador();
        System.out.println("setup()");
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
        System.out.println("test 1 de Suma");
    }

    @Test
    public void given_two_integers_when_substraction_then_ok() {
        assertEquals(2, c.subtraction(4, 2));
        System.out.println("test 2 de resta");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        System.out.println("test 3 de Division para cero");
        assertEquals(2, c.division(4, 0));
        System.out.println("test 3 de Division");
    }

    @Test(timeout = 170)
    public void given_two_integers_when_multiplication_then_timeout() {
        assertEquals(8, c.multiplication(4, 2));
        System.out.println("test 4 de multiplicacion");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }




}
