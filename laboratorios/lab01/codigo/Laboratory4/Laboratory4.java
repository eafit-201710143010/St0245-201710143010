
/**
 * Laboratorio 4 de Estructuras de Datos 1
 * 
 * @author Código tomado de https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab01/codigo/Java/Laboratory4/Laboratory4.java
 * adaptado por Santiago Soto, Andrés Sanchez, Jamerson Correa
 * @version 02/09/17
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Laboratory4
{
  
  /**
   * Computa la suma de un arreglo recursivamente 
   * @param A: es el arreglo que contiene los números
   * @param n: es el tamaño el arreglo
   * @return sum: suma de los elementos del arreglo
     */
  public static int ArraySum(int[] A, int n)
  {   
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      try{
         TimeUnit.SECONDS.sleep(1);
      }
      catch(Exception e){}
      return sum;
      
  }//fin método
  
  /**
   * Computa el valor máximo de un arreglo recursivamente
   * @param A : es el arreglo 
   * @param n : n es el tamaño el arreglo
   * @return max: devuelve el elemento de mayor valor en el arreglo
     */
  public static int ArrayMax(int[] A, int n)
  {
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
       try{
         TimeUnit.SECONDS.sleep(1);
      }
      catch(Exception e){}
      return max;
  }//fin método
  
  /**
   * Computa la serie de fibonacci recursivamente
   * @param n : es el término n-simo de la serie de fibonacci
   * @return result: devuelve el resultado que se obtiene 
     */
  public static int Fibonnacci(int n)
  {
     int result;
     if (n == 0 || n == 1)
       result = n;
     else
       result = Fibonnacci(n-1) + Fibonnacci(n-2);
     try{
         TimeUnit.SECONDS.sleep(1);
      }
      catch(Exception e){}  
     return result;
  }//fin método
  
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
        TakeTime(a,i,1);
      }//fin ciclo
      System.out.println("\nArrayMax()");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        
        TakeTime(a,i,2);
      }//fin ciclo
      System.out.println("\nFibonnacci()");
      for(int i =1; i<=10; i++)
      {
        a= ArrayGenerador(i);
        TakeTime(a,i,3);
      }//fin ciclo
  }//fin método 
  
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
  }//fin método
  
  
  /**
   * Toma el tiempo que tarda en ejecutarse un método
   * @param m : es el número del método a ejecutar
   * @param n : es el número que será ingresado en el método
     */
  public static void TakeTime(int[] a, int n, int m){
      long startTime = System.currentTimeMillis();
      switch (m) {
            case 1:  ArraySum(a,n-1);
                     break;
            case 2:  ArrayMax(a,n-1);
                     break;
            case 3:  Fibonnacci(n-1);
                     break;
      }
      long estimatedTime = System.currentTimeMillis() - startTime;
      System.out.println(n+": "+estimatedTime);
  }//fin del método
}
