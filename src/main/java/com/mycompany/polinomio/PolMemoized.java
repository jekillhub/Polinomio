package com.mycompany.polinomio;;

import java.util.HashMap;
import java.util.Map;

public class PolMemoized {

    public PolMemoized() {}

    public static Map<Integer, Long> factoriales = new HashMap<Integer, Long>(); //Cache de factoriales.
    private String respuesta = "";
    
    static {
        factoriales.put(0, 1L);//factorial(0)
        factoriales.put(1, 1L);//factorial(1)
    }

    //Calculo memoized de Factorial.
    
    public long factorialMem(int numero) {

        if (factoriales.containsKey(numero)) {
            return factoriales.get(numero);
        } else {
            long resp = (numero < 2) ? numero : numero*factorialMem(numero - 1);
            factoriales.put(numero, resp);
            return resp;
        }
    }
    
    //Método que da como resultado el desarrollo del polinomio, tiene como entrada al exponente de (a1*a+b1*b), a1 y b1
    //son coeficientes que acompañan a "a" y "b".
    
    public String desarrolloPolMem(int exp,int a1, int b1){
        String respuesta = "";

        if  (exp<0){
            this.respuesta =  "Exponente inválido";
            }
        
        if  (exp==0){
            this.respuesta = "1";
            }
        
        if  (exp==1){
            this.respuesta = a1+"a"+b1+"b";
            }
        
        else{
            int coef = 0;
            int m1 = 0;
            int m2 = 0;
            
            for (int i=0; i<exp+1; i++){
                coef = (int) (factorialMem(exp)/(factorialMem(exp - i)*factorialMem(i)));
                m1 = (int)Math.pow(a1, exp-i);
                m2 = (int)Math.pow(b1, i);
                this.respuesta += coef*m1+"a^("+(exp-i)+")"+m2+"b^("+i+") + ";  
            } 
        }
        return this.respuesta;        
    }    
}
    

