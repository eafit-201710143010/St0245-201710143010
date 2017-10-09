package bloques;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Andrés Sánchez, Santiago Soto, Jamerson Correa
 */
public class Bloques {
    static int cantBloques;
    static Stack<Integer> bloques[];
    static int[] posicion;
    static String linea; 
    static int a;
    static int b;
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        cantBloques = Integer.parseInt(entrada.nextLine());
        bloques = new Stack[cantBloques];
        posicion = new int[cantBloques];
        for(int i = 0; i < cantBloques; i++) {
            bloques[i] = new Stack<>();
            bloques[i].push(i);
            posicion[i] = i;
        }
        
        linea = "";
        while(!(linea = entrada.nextLine()).equals("quit")) {
            String operacion = linea;
            Scanner auxiliar = new Scanner(linea);
            String operacionPrim = auxiliar.next();
            a = auxiliar.nextInt();
            String operacionSec = auxiliar.next();
            b = auxiliar.nextInt();
            
            if(a == b){
            }
            if(operacionPrim.equals("move")) {
                if(operacionSec.equals("onto")) {
                    moveOnto(a, b);
                } else if(operacionSec.equals("over")) {
                    moveOver(a, b);
                }
            } else if(operacionPrim.equals("pile")) {
                if(operacionSec.equals("onto")) {
                    pileOnto(a, b);
                } else if(operacionSec.equals("over")) {
                    pileOver(a, b);
                }
            }
        }
        for(int i = 0; i < bloques.length; i++){ 
            System.out.println(salida(i));
        }
    }
    
    public static void moveOnto(int a, int b) {
        while(bloques[posicion[b]].peek() != b) {
           auxiliar(bloques[posicion[b]].pop());
        }
       
        while(bloques[posicion[a]].peek() != a) {
           auxiliar(bloques[posicion[a]].pop());
        }
       
        bloques[posicion[b]].push(bloques[posicion[a]].pop());
        posicion[a] = posicion[b];
    }
    
    public static void moveOver(int a, int b) {   
        while(bloques[posicion[a]].peek() != a) {
           auxiliar(bloques[posicion[a]].pop());
        }
        bloques[posicion[b]].push(bloques[posicion[a]].pop());
        posicion[a] = posicion[b];
    }
    
    public static void pileOnto(int a, int b) {
        while(bloques[posicion[b]].peek() != b) {
           auxiliar(bloques[posicion[b]].pop());
        }
       
        pileOver(a, b);
    }
    
    public static void pileOver(int a, int b) {
        Stack<Integer> aux = new Stack<>();
        while(bloques[posicion[a]].peek() != a) {
           aux.push(bloques[posicion[a]].pop());
        }
        aux.push(bloques[posicion[a]].pop());
        while(!aux.isEmpty()) {
            int temp = aux.pop();
            bloques[posicion[b]].push(temp);
            posicion[temp] = posicion[b];
        }
    }
    
    public static void auxiliar(int bloque) {   
        while(!bloques[bloque].isEmpty()) {
           auxiliar(bloques[bloque].pop());
        }
        bloques[bloque].push(bloque);
        posicion[bloque] = bloque;
    }
    
    public static String salida(int lugar) {
        String retorno = "";
        while(!bloques[lugar].isEmpty()){ 
            retorno = " " + bloques[lugar].pop() + retorno;
        }
        retorno = lugar + ":" + retorno;
        return retorno;
    }

}
