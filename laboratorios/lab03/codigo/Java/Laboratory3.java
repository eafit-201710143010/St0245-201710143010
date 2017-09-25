/**
 * Laboratorio 3 de Estructuras de Datos 1
 * 
 * @authors: Santiago Soto, Andrés Sanchez, Jamerson Correa
 * @version 034/09/17
 */
import java.util.*;

public class Laboratory3 {


    /**
     * Ejercicio 1.1
     * Retorna el producot de los enteros de una lista. 
     * @param list - lista de enteros.
     * @return int.
     */
    public static int multiply(List<Integer> list) { //O(n)
        int mult = 1; 
        System.out.print("["); 
        int i = 0; 
        for (Iterator<Integer> it = list.iterator(); it.hasNext();) { 
            int a = it.next(); 
            mult *= a; 
            i++; 
            System.out.print(a); 
            if(i!=list.size()){
                System.out.print(", "); 
            }
        }
        System.out.println("]"); 
        return mult; 
    }
    
    /**
     * Ejercicio 1.2
     * Returns a list. 
     * @param l - list of integers
     * @param data - integer
     * @return the same list that include the element data.
     */
    public static List smartInsert(List<Integer> l, int data){ //O(n)  
        if(l.contains(data)){ 
            return l; 
        }
        l.add(data);
        return l; 
    }
    
    /**
     * Ejercicio 1.3
     * Retorna el pivote de una lista(La posición donde mejor balaceado quedaría la lista ). 
     * @param list - lista de enteros.
     * @return int.
     */
    public static int pivote(List<Integer> list){ //O(n)
        if(list.size()==1){return 0;}
        int pivo=1,sumI=0,sumD;
        int dif = 2000000000;
        int sumList =sumList(list.iterator());
        Iterator itr1 = list.iterator();
        Iterator itr2 =list.iterator();
        itr2.next();
        for(int i=1;i<list.size()-1;i++){
            sumI+=(int)itr1.next();
            sumD=sumList-sumI-((int)itr2.next());
            int difT=Math.abs(sumD-sumI);
            if(difT<dif){
                dif=difT;
                pivo=i;
            }
        }
        return pivo;
    }
      
    /**
     * Metodo axuliar
     * Retorna la suma de los elementos de una lista. 
     * @param list - lista de enteros.
     * @return int.
     */
    public static int sumList(Iterator itr){//O(n)
        int sum = 0;
        while(itr.hasNext()) {
         sum+=(int)itr.next();
        }
        return sum;
    }
    
    /**
     * Ejercicio 1.4
     * Print all the scheduled deliveries. 
     * @param neveras - a list that include the fridges of the store
     * @param solicitudes - a list that include the request of the clients
     */
    public static void ejercicio4(List<Nevera> neveras, List<Pedido> solicitudes){ //O(n*m) 
        int i = 0; 
        
        LinkedList<Nevera> neve = new LinkedList<>(); 
        Iterator<Nevera> ite; 
        for (ite = neveras.iterator(); ite.hasNext();) {
            Nevera nevera = ite.next(); 
            neve.addFirst(nevera); 
        }
        
        LinkedList<Pedido> ped = new LinkedList<>(); 
        Iterator<Pedido> iter; 
        for (iter = solicitudes.iterator(); iter.hasNext();) {
            Pedido pedido = iter.next(); 
            ped.addFirst(pedido); 
        }
                
        
        System.out.print("[");
        for (iter = ped.iterator(); iter.hasNext();) { 
            Pedido pedido = iter.next(); 
            String cliente = pedido.cliente; 
            System.out.print("("); 
            System.out.print("'" + cliente + "', "); 
            
            System.out.print("[");
            
            int j = 0; 
            
            for (ite = neve.iterator(); ite.hasNext();) { 
                if(j<pedido.cant){ 
                    Nevera nevera = ite.next(); 
                    String codigo = nevera.cod;
                    String marca = nevera.marca; 
                    System.out.print("(" + codigo + " '" + marca + "')");
                    j++; 
                    if(j!=pedido.cant){ //c19*n*m
                        System.out.print(", "); 
                    }
                } else { 
                    break; 
                }
            }
            
            System.out.print("])"); 
            
            i++;
            if(i!=solicitudes.size()){ 
                    System.out.print(", "); 
                }
        }
        System.out.print("]"); 
    }
    
    
    /**
     * Ejercicio 2.1
     * Retorna una cadena reorganizada. 
     * @param String - Cadena de caracteres.
     * @return String.
     */
    public static String tecladoRoto(String cadena){
        LinkedList<Character>lista = new LinkedList<>();
        LinkedList<Character>lista2 = new LinkedList<>();
        for (char c : cadena.toCharArray()) {
            lista.add(c);
        }
        Iterator itr1 = lista.iterator();
        Iterator itr2 = lista.iterator();
        char c=(char)itr1.next();
        itr2.next();
        int j=0;
        int numsLlaves=0;
        for(int i=0;i<cadena.length();i++){
            if(c=='['){
                char d=(char)itr2.next();
                if(d==']' || d=='[' || !itr2.hasNext()){
                    j=0;
                    itr1=itr2;
                    c=d;
                    numsLlaves++;
                }else{
                    lista2.add(j,d);
                    j++;
                }
            }
            else if(c==']'){
                char d=(char)itr2.next();
                if(d==']' || d=='[' || !itr2.hasNext()){
                    itr1=itr2;
                    c=d;
                    numsLlaves++;
                }else{
                    lista2.add(d);
                }
            }
            else{
                lista2.add(c);
                if(itr1.hasNext()){
                    c=(char)itr1.next();
                    itr2.next();
                }
            }
        }
        char [] cadena2 = new char[cadena.length()- numsLlaves];
        int k=0;
        for(char s : lista2){
            cadena2[k]=s;
            k++;
        }
        return (String.valueOf(cadena2));
    }

    
    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {10, 20, 5, 3, 20, 10}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {10, 2, 4, 8}));
        
        // Multiply
        
        System.out.println(multiply(linked));
        System.out.println(multiply(array));
        
        // smartInsert
        System.out.println(smartInsert(linked,10));
        System.out.println(smartInsert(array,8));
        
        // Pivote
        
        System.out.println(pivote(linked));
        System.out.println(pivote(array));
        
        // 1.4
        
        LinkedList<Nevera> neveras = new LinkedList<>();
        Nevera a = new Nevera("lg", "9");
        Nevera b = new Nevera("haceb", "3");
        Nevera c = new Nevera("lg", "10");
        neveras.addAll(Arrays.asList(new Nevera[] {a, b, c}));
        
        LinkedList<Pedido> pedidos = new LinkedList<>();
        Pedido d = new Pedido("eafit", 2);
        Pedido e = new Pedido("d1", 1);        
        pedidos.addAll(Arrays.asList(new Pedido[] {d, e}));
        
        ejercicio4(neveras, pedidos);

    }
}
