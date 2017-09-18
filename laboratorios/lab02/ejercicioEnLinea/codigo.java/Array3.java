
/**
 * Solución puntos de ejercicio en linea Array3
 * 
 * @author Andrés Sánchez, Jamerson Correa, Santiago Soto
 * @version septiembre 2017
 */
public class Array3
{
    /**
     * Solución fix34
     * 
     * @param  nums arreglo de enteros
     * @return nums
     */    
     public int[] fix34(int[] nums) {
         for (int i=0; i<nums.length; i++){ //n
             if (nums[i] == 3) { //c1*n
                 for (int j = i + 2; j < nums.length; j++){ //n*n
                     if (nums[j] == 4) nums[j] = nums[i+1]; //n*n*c2
                 }
                 nums[i + 1] = 4; //n*c3
             }
         }
         return nums; //c4
    }

    /**
     * Solución canBalance
     * 
     * @param  nums arreglo de enteros
     * @return booleano(canBalance)
     */    
    public boolean canBalance(int[] nums) {
        int sumIzq = 0; //c1
        int sumDer = 0; //c2
  
        for(int i=0; i<nums.length; i++){ //n
            sumDer += nums[i]; //n*c3
        }
  
        for(int i=0; i<nums.length; i++){ //n
            sumIzq += nums[i]; //n*c4
            sumDer -= nums[i]; //n*c5
            if(sumIzq==sumDer){ //n*c6
                return true; //n*c7
            }
        }
        return false; //c8
    }
    
    /**
     * Solución linearIn
     * 
     * @param  outer, inner arreglos de enteros
     * @return booleano(inner contenido en outer)
     */  
    public boolean linearIn(int[] outer, int[] inner) {
        int control = 0; //c1
        for(int i=0; i<inner.length; i++){ //n
            for(int j=0; j<outer.length; j++){ //m*n
                if(inner[i]==outer[j]){ //m*n*c2
                    control++; //m*n*c3
                    break;
                }
            }
        }
        return control == inner.length; //c4
    }
    
    /**
     * Solución squareUp
     * 
     * @param  n entero que define el patrón del arreglo
     * @return array (arreglo que sigue el patrón)
     */  
    public int[] squareUp(int n) {
        int[] r = new int[n * n]; //c1
        for(int i=1; i<=n; i++){ //n
            for(int j=i*(n-1); j<r.length; j+=n){ //n*n*n
                r[j] = i; //n*n*n*c2
            }
        }
        return r; //c3
    }
    
    /**
     * Solución seriesUp
     * 
     * @param  n entero que define el patrón del arreglo
     * @return array (arreglo que sigue el patrón)
     */  
    public int[] seriesUp(int n) {
        int control = 1; //c1
        int[] r = new int[n*(n+1)/2]; //c2
        int i = 0; //c3
        for(int j=1; j<=control && control<=n; j++){ //n*(n+1)/2
            r[i] = j; //(n*(n+1)/2)*c4
            i++; //(n*(n+1)/2)*c5
            if(j==control){ //(n*(n+1)/2)*c6
                control++; //(n*(n+1)/2)*c7
                j=0; //(n*(n+1)/2)*c8
            }
        }
        return r; //c9
    }
}
