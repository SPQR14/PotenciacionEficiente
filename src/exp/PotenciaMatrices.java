/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
