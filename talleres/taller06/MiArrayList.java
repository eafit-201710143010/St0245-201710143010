import java.util.Arrays;
public class MiArrayList {
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];

          // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros.
        public MiArrayList() {
            size=0;
            elements = new int[DEFAULT_CAPACITY];
        }

          // Retorna el tamaño de la lista
        public int size() {
            return size;
        }
        
          // Agrega un elemento e a la última posición de la lista
        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        
          // Agrega un elemento e a la última posición de la lista
        public void add(int e) {
           if (size==elements.length) {
            ensureCapa();
           }
           elements[size]=e;
           size++;
        }

          // Retorna el elemento que se encuentra en la posición i de la lista
        public int get(int i) {
           if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
           }  
           return  elements[i];
        }

          // Agrega un elemento e en la posición index de la lista
        public void add(int index, int e) {
           if (size==elements.length) {
            ensureCapa();
           }
           for(int i=size;i>=index;i--) {
              elements[i+1]=elements[i]; 
           }
           elements[0]=e;
           size++;
        }
}
