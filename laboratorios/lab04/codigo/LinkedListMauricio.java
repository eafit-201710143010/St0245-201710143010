
import java.lang.IndexOutOfBoundsException; 
public class LinkedListMauricio 
{
    private Node first;
    private int size;
    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return size;
    }

    // Inserta un dat   o en la posición index
    public void insert(int data, int index)
    {
        if(index==0){     
            Node nuevo = new Node(data);
            nuevo.next = first;
            first = nuevo;
        }else if(index>=0 && index<=size){
            Node temp = first;
            for(int i=0; i<index-1; i++){
               temp = temp.next; 
            }
            Node nuevo = new Node(data);
            nuevo.next = temp.next;
            temp.next = nuevo;
        }
        size++;
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
       if(first!=null){
            if(index==0){
            first=first.next;
            }else{
            Node temp = first;    
            for(int i=0;i<index-1;i++){
                temp =temp.next;
            }
            Node actual = temp;
            actual.next = (temp.next).next;
           }
            size--;
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        Node temp = first;
        while(temp != null){
            if(data == temp.data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args){
        LinkedListMauricio a = new LinkedListMauricio();
        a.insert(1, 0);
        a.insert(2, 1);
        a.insert(0, 0);
        LinkedListMauricio b = new LinkedListMauricio();
        b.insert(2, 0);
        b.insert(1, 0);
        b.insert(0, 0);
        //System.out.println(equals(a, b));
    }

}
