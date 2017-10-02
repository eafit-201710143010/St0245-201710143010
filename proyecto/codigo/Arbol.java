
public class Arbol {
 
    // Atributos 
    private Nodo raiz;
 
    // Contructor   
    public Arbol( Archivo archivo )
    {
        this.raiz = new Nodo( archivo );
    }
 
    public Arbol( Nodo raiz ) 
    {
        this.raiz = raiz;
    }
 
    // Setters y Getters 
    public Nodo getRaiz() 
    {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) 
    {
        this.raiz = raiz;
    }
    
    public void addNodo( Nodo nodo, Nodo raiz ) 
    {
            // 4.- En caso negativo preguntamos: X < Nodo 
            if(((nodo.getArchivo()).getDirectorio()).equals((raiz.getArchivo()).getDirectorio()))
            {
                 // 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 // que acabamos de preguntar y repetimos desde el paso 2 
                 //partiendo del Nodo al que acabamos de visitar 
                 
                if (raiz.getHermano() == null) 
                {
                    raiz.setHermano(nodo);
                }
                else 
                {
                    addNodo( nodo, raiz.getHermano() );
                }
            }
            else if(((nodo.getArchivo()).getDirectorio()).equals((raiz.getArchivo()).getDireccion()))
            { 
                 // 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 //cual hicimos con el caso anterior repetimos desde el paso 2
                 //partiendo de este nuevo Nodo.  
                
                if (raiz.getHijo() == null) 
                {
                    raiz.setHijo(nodo);
                }
                else 
                {
                    addNodo( nodo , raiz.getHijo() );
                }
            }
            else
            {
               if(raiz.getHermano()==null)
                {
                 addNodo( nodo , raiz.getHijo());   
                }
                else
                {
                    if((((raiz.getArchivo()).getNombre()).indexOf((nodo.getArchivo()).getDirectorio()))>=0)
                    {

                       addNodo( nodo , raiz.getHijo() );  
                    }
                    else
                    {
                      addNodo( nodo , raiz.getHermano() );  
                    }
               }
           }
    }    
    
    public void addNodo( Nodo nodo ) 
    {
        this.addNodo( nodo , this.raiz );
    }
    
    public void inorden(Nodo raiz) 
    {
        if(raiz != null)
        {
            inorden(raiz.getHijo());
            System.out.print(((raiz.getArchivo()).getDireccion())+ " - ");
            inorden(raiz.getHermano());
        }
    }

}