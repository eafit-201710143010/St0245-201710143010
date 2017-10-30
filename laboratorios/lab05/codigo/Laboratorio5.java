 

/** La clase Laboratorio5 se encarga de ejecutar el programa
 * @author: Santiago Soto Marulanda, Andrés Sanchez Castrillón, Jamerson Correa Correa
 * @version: 14/10/2017
 */
public class Laboratorio5 {

    /**
     * Este metodo se encarga de dibujar el árbol
     * @param a: es el arbol a dibujar
     * @see dibujarArbolAux()
     */
    public static void dibujarArbol(BinaryTree a)
    {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
        System.out.println("digraph arbolito {");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }//cierre del metodo

    /**
     * Este metodo es un ayudante para dibujarArbol
     * @param nodo: son los nodos a dibujar del árbol
     */
    public static void dibujarArbolAux(Node nodo)
    {
        if (nodo != null)
        //"x_\n__" -> "xo\n__";
            for(Node n: new Node[] {nodo.left, nodo.right} ){
                if (n != null)
                    System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
                dibujarArbolAux(n);
            }//cierre del ciclo
    }//cierre del metodo

    /**
     * Este metodo se encarga de generar la instancia del árbol
     * @see dibujarArbol()
     * 
     */
    public static void main(String[] args) 
    {
        //Crea el árbol familiar
        BinaryTree tree = new BinaryTree();

        tree.root = new Node("Santiago");
            (tree.root).left = new Node("Luz Dary");
                ((tree.root).left).left = new Node("Nubia");
                    (((tree.root).left).left).left = new Node("Maria Aurora");
                    (((tree.root).left).left).right = new Node("Francisco");
                ((tree.root).left).right = new Node("Alfredo");
            (tree.root).right = new Node("Jaime");
                ((tree.root).right).left = new Node("Blanca");
                ((tree.root).right).right = new Node("Antonio");
        // ...

        //Imprime el árbol familiar
        tree.recursivePrint();

        //Dibuja el árbol familiar
        dibujarArbol(tree);

        //Altura del arbol
        System.out.println("La altura del arbol es: "+tree.maxheight());

        //Buscar
        System.out.println("Esta Santiago: "+tree.search("Santiago"));
        System.out.println("Esta Camilo: "+tree.search("Camilo"));

        //System.out.println(tree.getGrandMothersName("Santiago"));

    }//cierre del metodo
}