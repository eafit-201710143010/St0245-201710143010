import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
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

// Inserta un dato en la posición index
public void insert(int data, int index)
{
    if(index==0){
        
        Node nuevo = new Node(data);
        nuevo.next = first;
        first = nuevo;
    } else if(index>=0 && index<=size){
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
    if(index==0){        
        first = first.next;
    } else if(index>=0 && index<=size){
        Node temp = first;
        for(int i=0; i<index-1; i++){
           temp = temp.next; 
        }
        Node aux = temp.next;
        temp.next = aux.next;
    }
    
}

// Verifica si está un dato en la lista
public boolean contains(int data)
{
    Node aux = first;
    for(int i=1; i<=size-1; i++){
        if(aux.data==data){
            return true;
        }
        aux = aux.next;
    }
    return false;
}

public static boolean equals(LinkedListMauricio a, LinkedListMauricio b){
    Node nA = a.first;
    Node nB = b.first;
    for(int i=1; i<=a.size; i++){
        if(nA.data!=nB.data){
            return false;
        }
        if(nA.next!=null){
            nA = nA.next;
            nB = nB.next;
        }
    }
    return true;
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
    System.out.println(equals(a, b));
}
}

