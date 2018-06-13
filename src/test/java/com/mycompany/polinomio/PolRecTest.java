package com.mycompany.polinomio;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PolRecTest {

    
    //Prueba Factorial Recursivo.
    
    @Test
    public void testFactorialRec(){
        PolRec pr = new PolRec();
        //assertEquals(120, pr.factorialRec(5));
        //assertEquals(1, pr.factorialRec(0));
        assertEquals(-1, pr.factorialRec(-1));
    }
    
    //Prueba Desarrollo Polinomio Recursivo....
    
    @Ignore
    public void testdesarrolloPolRec(){
        PolRec pr = new PolRec();
        assertEquals(1, pr.desarrolloPolRec(0, 1, 1));
    }

    
}
