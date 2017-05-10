
package exp;

/**
 *
 * @author spqr14
 */
public class Matriz {
    
    private int filas;
    private int columnas;
    private int [][] matriz;
    
    public Matriz(int f, int c){
        filas = f;
        columnas = c;
        matriz = new int[filas][columnas];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = 0;
            }
        }
    }
    
    public Matriz(int [][] m){
        filas = m.length;
        columnas = m[0].length;
        matriz = m;
    }
    
    public Matriz multiplicaMatriz(Matriz m){ //multiplica "estas" veces m
        if(columnas != filas){
            System.out.println("La multiplicación no está definida");
            return null;
        }
        Matriz intermedio = new Matriz(filas, m.columnas); //intermedio es el producto de "estas" veces m
        int i, j, k, sum;
        for(i = 0; i < filas; i++){
            for(j = 0; j < m.columnas; j++){
                sum = 0;
                for(k = 0; k < columnas; k++){
                    sum += matriz[i][k] * m.matriz[k][j];
                }
                intermedio.matriz[i][j] = sum;
            }
        }
        return intermedio;
    }
    
    public Matriz identidad(){
        Matriz i = new Matriz(filas, columnas);
        int minimo = filas;
        if(filas > columnas){
            minimo = columnas;
        }
        for(int j = 0; j < minimo; j++){
            i.matriz[j][j] = 1;
        }
        return i;
    }
    
    public void imprimir(){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
    }
    
}
