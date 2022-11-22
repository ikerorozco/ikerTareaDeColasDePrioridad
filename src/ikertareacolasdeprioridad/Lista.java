/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ikertareacolasdeprioridad;

/**
 *
 * @author ikero
 */
public class Lista <T> {
    
    Nodo UltimoValor;
    int tamanio;
    String Lista = "";

    public Lista() {
        UltimoValor = null;
        tamanio=0;
    }

    
    public boolean isEmpty(){
    
        return UltimoValor==null;
    
    }
    
    public int length(){
    
        return tamanio;
    
    } 
    
    public T pop() {
    
        T aux = (T) UltimoValor;
        UltimoValor=UltimoValor.Siguiente;
        tamanio--;
        return aux;
    
    }
    
    public T peek(){
    
        return (T) UltimoValor.valor;
    
    } 
    
    public void push( Nodo<T> nodo ){
    
        Nodo<T> nuevoNodo = new Nodo(nodo);
        nuevoNodo.Siguiente = UltimoValor;
        UltimoValor=nuevoNodo;
        tamanio++;
    
    } 

    @Override
    public String toString() {
        Nodo recorrido=UltimoValor;
        while(recorrido !=null){
        
            Lista+=recorrido.valor+"\n";
            recorrido=recorrido.Siguiente;
        
        }
    
        return Lista;
    }
  
}

