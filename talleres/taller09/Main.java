import java.util.*;

/**
 *
 * @author 
 */
public class Main{
    
    //pedrito 1
    public static void agregar(Hashtable empresas,String key, String value){
        System.out.println("Agregado: "+key+"→"+value);
        empresas.put(key,value);
    }
    
    //pedrito 2
    public static void buscar(Hashtable empresas,String key){
        if(contienekey(empresas,key)){
          System.out.println(key+"→"+empresas.get(key));
        }else{
          System.out.println(key+" NO esta en la Tabla");
        }
    }
    //pedrito 3
    public static boolean contienekey(Hashtable empresas,String key){
        return empresas.containsKey(key);
    }
    
    public static void main(String[] args) {
        Hashtable empresas = new Hashtable();
        agregar(empresas,"Google","Estados Unidos");
        agregar(empresas,"La locura","Colombia");
        agregar(empresas,"Nokia","Finlandia");
        agregar(empresas,"Sony","Japón");
        buscar(empresas,"Google");
        buscar(empresas,"Motorola");
        System.out.println("Hay empresas de la Inida: "+empresas.contains("India"));
        
        
    }

}