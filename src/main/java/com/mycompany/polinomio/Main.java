package com.mycompany.polinomio;

public class Main {
    public static void main(String[] args) {
        //Se he creado un Main debido a que las pruebas unitarias arrojaban una alta cantidad de errores con al testear
        //los resultados de los polinomios.
        
        
        
        PolMemoized pm = new PolMemoized();
        PolRec pr = new PolRec();
        
        //System.out.println("RESULTADO MEMOIZED:");
        //System.out.println("");
        System.out.println(pm.desarrolloPolMem(3, 2, 2));
        //System.out.println(pm.desarrolloPolMem(4, 2, 2));
        
        //System.out.println("");
        
        //System.out.println("RESULTADO RECURSIVO");
        //System.out.println("");
        //System.out.println(pr.desarrolloPolRec(3, 2, 2));
        //System.out.println(pr.desarrolloPolRec(4, 2, 2));
    }
}
