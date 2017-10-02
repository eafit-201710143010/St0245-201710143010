public class Nodo
{
  // Declaraciones de variables
  private Archivo archivo;
  private Nodo padre;
  private Nodo hijo;
  private Nodo hermano;
  
  // Constructor 
    public Nodo(Archivo archivo) {
        this.archivo = archivo;
    }
 
    /* Setters y Getters */
    public void setValor(Archivo archivo) {
        this.archivo = archivo;
    }
 
    public Archivo getArchivo() {
        return archivo;
    }
    
     public Nodo getPadre() {
        return padre;
    }
    
    public void setPadre(Nodo padre) {
        this.hijo = padre;
    }
 
    public Nodo getHijo() {
        return hijo;
    }
 
    public void setHijo(Nodo hijo) {
        this.hijo = hijo;
    }
 
    public Nodo getHermano() {
        return hermano;
    }
 
    public void setHermano(Nodo hermano) {
        this.hermano = hermano;
    }

}
