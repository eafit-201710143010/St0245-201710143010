
public class BinaryTree 
{
    public Node root;
    
    public BinaryTree()
    {
        root = null;
    }
    
    public boolean search(int n)
    {
        return search(root,n);
    }
    
    private boolean search(Node nodo, int n)
    {
        if(nodo == null)
            return false;
        if(nodo.data == n)
            return true;
        if(nodo.data < n)
            return search(nodo.right,n);        
        return search(nodo.left,n); 
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
    
    private void addNodo(Node nodo, Node raiz)
    {
       if(raiz == null)
            root = nodo;
        else if(nodo.data >= raiz.data)
        {
            if(nodo.right == null)
                raiz.right = nodo;
            else
                addNodo(nodo,raiz.right);
        }
        else {
            if(raiz.left == null)
                raiz.left = nodo;
            else
                addNodo(nodo,raiz.left);
        }  
    }

    public void delete(int n)
    {
        delete(root,n);
    }
    
    private void delete(Node nodo,int n)
    {
        if(nodo == null)
            return;
        if(nodo.data == n)
        {
           Node nodoTemp = (nodo.left);
            root = (nodo.right);
            if(nodoTemp!=null)
                addNodo(nodoTemp,root);
            return;
        }
        if(nodo.right != null)
        {
            if((nodo.right).data == n)
            {
                Node nodoTemp = ((nodo.right).left);
                (nodo.right) = (nodo.right).right;
                if(nodoTemp!=null)
                    addNodo(nodoTemp,root);
                return;
           }
           else if(n >= nodo.data)
            delete(nodo.right,n);  
        }
        if(nodo.left != null)
        {
            if((nodo.left).data == n)
            {
                Node nodoTemp = (nodo.left).right;
                (nodo.left) = (nodo.left).left;
                if(nodoTemp!=null)
                    addNodo(nodoTemp,root);
                return;
            }
            else if(n < nodo.data)
                delete(nodo.left,n); 
        }    
    }
    
    private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }
    
    private int maxheightAUX(Node node)
    {
        if (node == null)
                return 0;
        else 
                return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }
    
    public int maxheight()
    {
       return maxheightAUX(root);
    }

    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }
  
    }
    
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }
        
}
