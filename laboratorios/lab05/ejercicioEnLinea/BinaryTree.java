
public class BinaryTree {
    public Node root;
    
    public BinaryTree(){
        root = null;
    }

    public void insert(int n){
        insertAux(root, n);
    }
    
    private void insertAux(Node nodo, int n)
    {
        if(nodo == null)
            root = new Node(n);
        else if(n >= nodo.data)
        {
            if(nodo.right == null)
                nodo.right = new Node(n);
            else
                insertAux(nodo.right,n);
        }
        else {
            if(nodo.left == null)
                nodo.left = new Node(n);
            else
                insertAux(nodo.left,n);
        }
    }
    

    private void recorridoPosOrdenAux(Node node){
        if (node != null){
            recorridoPosOrdenAux(node.left);
            recorridoPosOrdenAux(node.right);
            System.out.println(node.data);
        }

    }
    
    public void recorridoPosOrden(){
        recorridoPosOrdenAux(root);
    }	
}
