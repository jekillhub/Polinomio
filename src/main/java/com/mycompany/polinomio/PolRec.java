package com.mycompany.polinomio;

public class PolRec {

    private int contador;
    private String respuesta;
    
    
    public PolRec() {
        this.contador = 0;
        this.respuesta = "";
    }
    
    
    //Primera parte Factorial Recursivo, este metodo recibe el llamado y evalúa al número, devuelve -1 si es inválido.
    
    public long factorialRec(long numero){
        if(numero<0){
            return -1;
        }
        if(numero==0){
            return 1;
        }
        return factorialRec(numero,numero);
    }
    
    //Segunda parte Factorial Recursivo, este método recibe el llamado del primer método y se encarga de hacer las 
    //respectivas multiplicaciones.
    
    public long factorialRec(long numero, long ultimo){
        if(ultimo == 1){
            return numero;
        }
        else{
            return factorialRec(numero*(ultimo - 1),ultimo - 1);
        }
    }
    
    //Método que da como resultado el desarrollo del polinomio, tiene como entrada al exponente de (a1*a+b1*b), a1 y b1
    //son coeficientes que acompañan a "a" y "b".
    
    public String desarrolloPolRec(int exp, int a1, int b1){
        int coef = 0;
        String respuesta = "";
        int m1 = 0;
        int m2 = 0;
        
        if(exp>-1){
            if(this.contador < exp+1){
        
                if  (exp==0){
                    this.respuesta = "1";
                }
        
                if  (exp==1){
                    this.respuesta = a1+"a"+b1+"b";
                }
        
                else{
                    coef = (int) (factorialRec(exp)/(factorialRec(exp - contador)*factorialRec(contador)));
                    m1 =  (int)Math.pow(a1, exp-contador);
                    m2 =  (int)Math.pow(b1, contador); 
                    this.respuesta += coef*m1+"a^("+(exp-contador)+")"+m2+"b^("+contador+") + ";
                    contador = contador+1;           
                    return desarrolloPolRec(exp,a1,b1);
                }
            }
        }
        else{
            this.respuesta =  "Exponente ingresado inválido";
        }
        return this.respuesta;
    
    }
}
