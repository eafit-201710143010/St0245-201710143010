import java.util.ArrayList;
import java.util.Scanner;
public class Opcional1{
  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>();
       System.out.println("Ingrese un numero");
       int num=sc.nextInt();
       while(num!=-1){
           list.add(0,num);
           System.out.println("Ingrese un numero");
           num=sc.nextInt();
       }
       System.out.println(list);
    }
}
