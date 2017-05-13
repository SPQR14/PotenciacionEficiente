/*
el método multiplica, dice cómo multiplicar dos objetos
el método identidad dice lo que debe hacer el programa cuando n = 0
*/

package exp;

/**
 *
 * @author spqr14
 */
public abstract class Exponenciacion {

    public abstract Object multiplica(Object a, Object b);
    
    //retorna la identidad multiplicativa
    public abstract Object identidad(Object a);
    
    //eleva b a la n cuando n cuando n >= 0
    public Object potencia(Object b, int n){
        if(n == 0){
            return identidad(b); // b a la 0 es 1 por eso se retorna la identidad
        }
        Object c = potencia(b, n/2);
        c = multiplica(c, c);
        if(n % 2 == 0){
            return c; //n es par
        }else{
            return multiplica(c, b); //n es impar
        }
    }
    
}
