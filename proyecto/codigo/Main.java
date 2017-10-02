import java.util.Queue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
    public static void leerArchivo() throws FileNotFoundException, IOException
    {
        String cadena;
        FileReader f = new FileReader("juegos.txt");
        BufferedReader b = new BufferedReader(f);
        String dir = b.readLine();
        Archivo a1 = new Archivo(dir,"",dir,true);
        Arbol arbol = new Arbol(a1);           
        while(((cadena = b.readLine())!=null) && !(cadena.equals(""))) 
        {
            int contT = 0;
            for(int i=0;i<=cadena.lastIndexOf("[");i++)
            {   
                char c = (cadena.substring(i,i+1)).charAt(0);
                if(c == ' ' ||c == '│')
                {
                  contT++;
                }
            }
            contT=(contT+1)/2;;
            String direccion="";
            String[] temp = dir.split("/");
            for(int i=0;i<temp.length;i++)
            {
                if(i<contT){direccion+=temp[i]+'/';}
            }
            dir = direccion;
            int index = cadena.indexOf("]")+3;
            String subCadena = cadena.substring(index);
            if(subCadena.indexOf(".")>=0 || subCadena.indexOf("/")>=0 )
            {
                Archivo ar = new Archivo(subCadena,dir,dir+subCadena,false);
                System.out.println(cadena + "["+dir+"] "+contT);
                arbol.addNodo(new Nodo(ar));
            }else
            {
                Archivo ar = new Archivo(subCadena+'/',dir,dir+subCadena+'/',true);
                System.out.println(cadena + "["+subCadena+"] "+"["+dir+"]");
                arbol.addNodo(new Nodo(ar));
                dir = dir+subCadena;
            }
        }
        b.close();
    } 
    
    public static void tiempo()throws FileNotFoundException, IOException
    {
        for(int i=0;i<100;i++)
        {
            long startTime = System.currentTimeMillis();
            leerArchivo();
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(estimatedTime);
        }
    }

    
}
