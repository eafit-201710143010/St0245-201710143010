 

/**
 * Esta clase modela el árbol genealógico de una persona
 * como un árbol binario, utilizando la implementación en java
 * de árboles binariosdefine
 * @author: Santigo Soto Marulanda, Andrés Sanchez Castrillón, Jamerson Correa Correa
 * @version: 14/10/2017
 */

public class BinaryTree {
    //atributo de la clase
    public Node root;
    /**
     * Constructor de la clase BinaryTree
     */
    public BinaryTree(){
        root = null;
    }

    public String getGrandMothersName(String name)
    {
        return auxGetGrandMothersName(name,root);
    }//cierre del metodo

    /**
     *  Este metodo es un ayudante paara el método getGrandMotherName y 
     *  se encarga de analizar en el árbolgenealógico de una persona 
     *  si se conoce su abuela materna
     *  @param name: es el nombre de la persona a la que se le buscara en un árbol genealógico la abuela materna
     *  @param root: es el nodo raíz de un árbol genealógico en el que se realizara la búsqueda
     *  @param estado: es el resultado de si la búsqueda fue exitosa
     *  @see auxIf()
     *  @return El resultado de la busqueda de la abuela de una persona
     *  
     */
    private String auxGetGrandMothersName(String name, Node root)
    {
        Node nieto = searchNode(root, name);
        if (nieto == null)
            return "";
            else 
            {
                if (nieto.left == null)
                    return "";
                    else 
                    {
                        if (nieto.left.left == null)
                            return "";
                        else
                            return nieto.left.left.data;
                    } 
           }    
    }//cierre del metodo
    
    /**
     * Este metodo es un ayudante del metodo search y 
     * se encarga de verificar si es posible encontrar una persona 
     * en un árbol genealógico
     * @param nodo: es el nodo en el que se estara buscando el nombre de la persona ingresada
     * @return la referencia donde esta la persona
     */
    private Node searchNode(Node nodo, String c)
    {
        if(nodo == null)
            return null;
        if(nodo.data.equalsIgnoreCase(c))
            return nodo;
        else{
            search(nodo.left,c);
            search(nodo.right,c) ; 
            return null;
        }
    }//cierre del metodo
    
    /**
     * Este metodo se encarga de realizar la búqueda de una persona en un árbol genealógico
     * @param c: es el nombre de la persona que se va a buscar
     * @see search()
     * @return Si fue posible encontrar la persona
     */
    public boolean search(String c)
    {
        return search(root,c);
    }//cierre del metodo
    
    /**
     * Este metodo es un ayudante del metodo search y 
     * se encarga de verificar si es posible encontrar una persona 
     * en un árbol genealógico
     * @param nodo: es el nodo en el que se estara buscando el nombre de la persona ingresada
     * @return Si fue posible o no encontrar la persona
     */
    private boolean search(Node nodo, String c)
    {
        if(nodo == null)
            return false;
        if(nodo.data.equalsIgnoreCase(c))
            return true;      
        return search(nodo.left,c) || search(nodo.right,c) ; 
    }//cierre del metodo

    /**
     * Este metodo se encarga de identificar entre el lado izquierdo y 
     * el lado derecho del árbol genealógico cuál es el mayor
     * @param i: es la altura del lado izquierdo
     * @param j: es la altura del lado derecho
     * @return La altura del lado mayor
     */
    private int max2(int i, int j)
    {
        if (i > j){
            return i;
        }
        return j;
    }//cierre del metodo

    /**
     * Este metodo es un ayudante de maxheight y 
     * se encarga de calcular la altura del árbol genealógico a 
     * partir del tamaño del lado mayor de éste
     * @param node: cumple el papel de ser las ramas del árbol genealógico
     * @see max2()
     * @return La altura alcanzada por el árbol
     */
    private int maxheightAUX(Node node)
    {
        if (node == null)
            return 0;
        else 
            return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }//cierre del metodo

    /**
     * Este metodo se encarga de dar a conocer la altura que posee el árbol
     * @see maxheightAUX()
     * @return La altula alcanzada por el árbol 
     */
    public int maxheight()
    {
        return maxheightAUX(root);
    }//cierre del metodo

    /**
     * Este metodo es un ayudande de recursivePrint y
     * se encarga de imprimir recursivamente
     * los nodos que posee el arból genealógico 
     * @param node: son los nodos que posee el árbol
     */
    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }//cierrre del metodo

    /**
     * Este metodo imprime los nodos que posee el árbol genealogico
     * @see recursivePrintAUX()
     */
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }//cierre del metodo

}