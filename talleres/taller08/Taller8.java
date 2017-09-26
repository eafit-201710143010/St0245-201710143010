/**
 * Write a description of class Taller8 here.
 * 
 * @author Santiago Soto, Andrés Snachez, Jamerson Correa
 * @version (2017/09/25)
 */
import java.util.*;
public class Taller8
{
     //Punto1
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack<Integer>();
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        
        return stack2;
    }
    
    //Punto2
    public static void cola (Queue<String> queue){
        while(queue.peek()!=null){
            System.out.println("Atendiendo a " + queue.poll());
        }
    }
    
    //notacion polaca
    public static int polaca  (String string){
        Stack<Integer> nums = new Stack<>();
        String[] cadena = string.split(" ");
        for(int i=0;i<cadena.length;i++){
            char c = (cadena[i]).charAt(0);
            if(c=='+' || c =='-' || c=='*' || c=='/'){
              switch(c){
                case '+':
                    nums.push(nums.pop()+nums.pop());
                    break;
                case '-':
                    nums.push((nums.pop()*-1)+nums.pop());
                    break;
               case '*':
                    nums.push(nums.pop()*nums.pop());
                    break;
               case '/':
                    int num1=nums.pop();int num2=nums.pop();
                    nums.push(num2/num1);
                    break;
            }  
            }else{
                nums.push(Integer.parseInt(cadena[i]));
            }
        }
        return nums.pop();
    }
}