
package ejec;

import exp.*;
import java.math.BigInteger;

/**
 *
 * @author spqr14
 */
public class Ejec {
    
    public static void main(String [] args){
        PotenciaInt i = new PotenciaInt();
        GrandesEnteros g = new GrandesEnteros();
        
        int [][] b = {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
        
        PotenciaMatrices pm = new PotenciaMatrices();
        Matriz m = new Matriz(b);
        System.out.println("La matriz b es:");
        m.imprimir();
        System.out.println("La matriz b elevada a la 14 es:");
        ((Matriz)(pm.potencia(m, 6))).imprimir();
        System.out.println("");
    }
    
}
