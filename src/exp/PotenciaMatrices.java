
package exp;

/**
 *
 * @author spqr14
 */
public class PotenciaMatrices extends Exponenciacion{
    
    @Override
    public Object multiplica(Object a, Object b){
        return(((Matriz)a).multiplicaMatriz((Matriz)b));
    }
    
    @Override
    public Object identidad(Object a){
        return (((Matriz)a).identidad());
    }
    
}
