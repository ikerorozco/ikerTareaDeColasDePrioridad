/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ikertareacolasdeprioridad;

/**
 *
 * @author ikero
 */
public class Nodo <T> {
    
    T valor;
    Nodo Siguiente;
    
    public Nodo(T valor)
    {
        this.valor = valor;
        this.Siguiente = null;
    }
    
    public Object obtenervalor()
    {
        return valor;
    }
    
    public void enlazarSiguiente(Nodo n)
    {
        Siguiente=n;
    }
    
    public Nodo obtenerSiguiente(){
        return Siguiente;
    }
    
}
