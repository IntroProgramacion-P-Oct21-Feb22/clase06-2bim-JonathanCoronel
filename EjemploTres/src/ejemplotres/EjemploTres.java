/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotres;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author reroes
 */
public class EjemploTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int a = 10;
        int b = 100;
        int num;
        num = (NumberUtils.compare(a, b));
        if (num == 0) {
            System.out.printf("El numero %d es igual al numero %d\n", a, b);
        } else {
            if (num == 1) {
                System.out.printf("El numero %d es mayor al numero %d\n", a, b);
            } else {
                if (num == -1) {
                    System.out.printf("El numero %d es menor al numero %d\n", a, b);
                }
            }
        }
        //System.out.println( obtenerDecimal("10.2") + 20 );
        System.out.printf("El número mayor es: %.2f\n", 
             NumberUtils.max(10.2, 1.1, 4.2) );
    }

    public static double obtenerDecimal(String cadena) {
        double d = NumberUtils.createDouble(cadena);
        return d;
    }

}
