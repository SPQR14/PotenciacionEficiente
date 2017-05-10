
package exp;

/**
 *
 * @author spqr14
 */
public class PotenciaInt extends Exponenciacion{
    
    @Override
    public Object multiplica(Object c, Object d){
        int a = ((Integer)c);
        int b = ((Integer)d);
        return a * b;
    }
    
    @Override
    public Object identidad(Object a){
        return 1;
    }
    
}
