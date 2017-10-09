import java.util.*;

public class Laboratorio3 {
    
    public static void simular(Queue<String>[] filas)
    {
        int contCajero = 1;
        int contPilasVacias = 0;
        while(contPilasVacias<4)
        {
            contPilasVacias = 0;
            for(int i = 0;i < 4;i++)
            {
                if(filas[i].peek()!=null)
                {
                    System.out.println("Caja ["+contCajero+"]: Atendiendo a: " + filas[i].poll());
                    contCajero = (contCajero==2)?1:contCajero+1;
                    
                }
                if(filas[i].peek()==null)
                {
                    contPilasVacias++;
                }
            }   
        }   
    }
        
    public static void main(String[] args)
    {
       /* LinkedListMauricio list = new LinkedListMauricio();
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list.contains(3));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        Queue<String>[] filas = new Queue[4];
        filas[0] = new LinkedList();
        filas[1] = new LinkedList();
        filas[2] = new LinkedList();
        filas[3] = new LinkedList();
        filas[0].add("Santiago");
        filas[0].add("Andres");
        filas[0].add("Jamerson");
        filas[1].add("Sebastian");
        filas[1].add("Andrea");
        filas[2].add("Sandra");
        filas[2].add("Alvaro");
        filas[2].add("Jorge");
        filas[2].add("Nicolas");
        simular(filas);*/
    }
    
}
