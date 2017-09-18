
/**
 * Laboratorio 4 de Estructuras de Datos 1
 * 
 * @author Código tomado de https://github.com/mauriciotoro y adaptado por Santiago Soto, Andrés Sanchez, Jamerson Correa
 * @version 02/09/17
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Laboratory2
{
  /**
   * Calcula la suma de un arreglo
   * @param A: Un arreglo de enteros
   * @return int : suma de de numeros del arreglo
   */
  public static int ArraySum(int[] A)
  {          
      int sum = 0;
      for (int i = 0; i < A.length; i++)
      {
         sum = sum + A[i];
         try{
             TimeUnit.SECONDS.sleep(1);
         }catch(Exception e){}
      }
      return sum;
  }
  
  /**
   * Calcula el valor maximo de un arreglo
   * @param A: Un arreglo de enteros
   * @return int : El valor maximo de un arreglo
   */
  public static int ArrayMax(int[] A)
  {
      int max = A[0];
      for (int i = 0; i < A.length; i++)
      {
         if (A[i] > max)
           max = A[i];
         try{
             TimeUnit.SECONDS.sleep(1);
         }catch(Exception e){}
      }
      return max;
  }
  
 /**
   * Ordena el areglo de menor a mayor
   * @param A: Un arreglo de enteros
   */
  public static void InsertionSort(int[] A)
  {
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
               try{
                   TimeUnit.SECONDS.sleep(1);
               }catch(Exception e){}
            }
         try{
                   TimeUnit.SECONDS.sleep(1);
         }catch(Exception e){}
       }
  }

   /**
   * Ordena el areglo recursivamente de menor a mayor
   * @param a: Un arreglo de enteros
   */
    public static void mergeSort(int [ ] a)
    {
        int[] tmp = new int[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }


    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
        {
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){}
        }

        while(left <= leftEnd) 
        {// Copy rest of first half
            tmp[k++] = a[left++];
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){}
        }

        while(right <= rightEnd)
        {  // Copy rest of right half
            tmp[k++] = a[right++];
            try{
               TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){}
        }

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
        {
            a[rightEnd] = tmp[rightEnd];
            try{
               TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){}
        }
    }
  
   /**
   * Ejecuta el programa 
   * @param args : es un arreglo de caracteres
   */
  public static void main(String[] args)
  {
      int[] a;
      System.out.println("ArraySum()");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        TakeTime(a,1,i);
      }
      System.out.println("\nArrayMax()");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        TakeTime(a,2,i);
      }
      System.out.println("\nInsertionSort()");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        TakeTime(a,3,i);
      }
      System.out.println("\nmergeSort");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        TakeTime(a,4,i);
      }
  }
  
   /**
   * Genera un arreglo de tamaño n
   * @param n : es el la longitud del arreglo
   * @return array : devuelve el arreglo
    */
  public static int[] ArrayGenerador(int n)
  {
       int[] array = new int[n];
       Random generator = new Random();
       for (int i =0; i<n; i++){
        array[i] = generator.nextInt(5000);
       }//fin ciclo
       return array;
  }
  
   /**
   * Toma el tiempo que tarda en ejecutarse un método
   * @param m : es el número del método a ejecutar
   * @param n : es el tamaño del arreglo
   */
  public static void TakeTime(int[] a, int m, int n){
      long startTime = System.currentTimeMillis();
      switch (m) {
            case 1:  ArraySum(a);
                     break;
            case 2:  ArrayMax(a);
                     break;
            case 3:  InsertionSort(a);
                     break;
            case 4:  mergeSort(a);
                     break;
      }
      long estimatedTime = System.currentTimeMillis() - startTime;
      System.out.println(n+": "+estimatedTime);
  }
}
