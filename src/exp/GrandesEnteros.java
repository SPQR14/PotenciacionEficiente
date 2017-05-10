
package exp;

import java.math.BigInteger;

/**
 *
 * @author spqr14
 */
public class GrandesEnteros extends Exponenciacion{
    
    @Override
    public Object multiplica(Object c, Object d){
        return ((BigInteger)c).multiply((BigInteger)d);
    }
    
    @Override
    public Object identidad(Object a){
        return new BigInteger("1");
    }
    
}
