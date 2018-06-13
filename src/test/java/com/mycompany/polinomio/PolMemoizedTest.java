package com.mycompany.polinomio;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PolMemoizedTest {
    
    //Prueba Factorial Memoized.
    
    @Test
    public void testFactorialMem(){
        PolMemoized pm = new PolMemoized();
        assertEquals(120, pm.factorialMem(5));
        //assertEquals(1, pm.factorialMem(0));
        //assertEquals(1, pm.factorialMem(1));
    }

    //Prueba Desarrollo Polinomio Memoized....
    
    @Ignore
    public void testdesarrolloPolMem(){
        PolMemoized pm = new PolMemoized();
        assertEquals(1, pm.desarrolloPolMem(0, 1, 1));
    }
    

}
