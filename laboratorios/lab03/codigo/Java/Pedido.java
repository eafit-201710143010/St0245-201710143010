/**
 * Laboratorio 3 de Estructuras de Datos 1
 * 
 * @authors: Santiago Soto, Andrés Sanchez, Jamerson Correa
 * @version 034/09/17
 */
public class Pedido{ 
    //Declaración de atributos.
    String cliente;
    int cant;
    
    /**
    * Método constructor.
    *
     * @param cliente
     * @param cant
    */
    public Pedido(String cliente, int cant){   
        this.cliente = cliente;
        this.cant = cant;
    }
}
