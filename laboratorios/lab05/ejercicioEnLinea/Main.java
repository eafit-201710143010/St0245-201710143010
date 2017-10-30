
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        BinaryTree arbolBinario = new BinaryTree();
        Scanner entrada = new Scanner(System.in);
        do
        {
            String num = entrada.nextLine();
            if(!num.isEmpty()){
              int valor = Integer.parseInt(num);
              arbolBinario.insert(valor);
              continue;
            }
            break;
        }
        while(true);
        arbolBinario.recorridoPosOrden();
    }
}
