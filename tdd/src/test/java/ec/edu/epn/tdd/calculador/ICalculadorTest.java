package ec.edu.epn.tdd.calculador;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculadorTest {

    @Test
    public void given_two_integers_when_addition_ok() {
        ICalculador c= Mockito.mock(ICalculador.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

    @Test
    public void given_two_integers_when_substration_ok() {
        ICalculador c= Mockito.mock(ICalculador.class);
        Mockito.when(c.substration(3,2)).thenReturn(1);
        assertEquals(1,c.substration(3,2));
    }

    @Test
    public void given_two_integers_when_division_ok() {
        ICalculador c= Mockito.mock(ICalculador.class);
        Mockito.when(c.division(25,5)).thenReturn(5);
        assertEquals(5,c.division(25,5));
    }

    @Test
    public void given_two_integers_when_multiplication_ok() {
        ICalculador c= Mockito.mock(ICalculador.class);
        Mockito.when(c.multiplication(5,5)).thenReturn(25);
        assertEquals(25,c.division(5,5));
    }
}