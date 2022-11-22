/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ikertareacolasdeprioridad;

/**
 *
 * @author ikero
 */
public class BoundredPriorityQueue <T>{
    
    Nodo inicioCola,finalCola;
    String cola="";
    int tamanio=0;
    Lista cadenaCola[];

    public BoundredPriorityQueue(int niveles){
        
        this.tamanio=niveles;
        cadenaCola=new Lista[niveles];
        inicioCola=null;
        finalCola=null;
        
    }
    
    public boolean is_empty(){
    
        if(inicioCola==null){
        
        return true;
                
        }else{
        
            return false;
        
        }
    
    }
    
    public void enqueue(int prioridad,T elem){
    
        Nodo nuevoNodo=new Nodo(elem);
                
        if(prioridad>=0&&prioridad<=tamanio){
            
            for(int i=0;i>=cadenaCola.length;i++){
            
                if(prioridad==i){
                
                    cadenaCola[i]= new Lista();
                    cadenaCola[i].push(nuevoNodo);
                    cadenaCola[i].UltimoValor=nuevoNodo;
                
                }
            
            }
           
        
        }
          
        if(is_empty()){
        
            inicioCola=nuevoNodo;
            finalCola=nuevoNodo;
            
        }else{
        
            finalCola.Siguiente=nuevoNodo;
            finalCola=nuevoNodo;
        
        }
        
    
    }
    
    public T dequeue(){
    
        if(!is_empty()){
        
            T informacion = (T) inicioCola.valor;
            
            if(inicioCola==finalCola){
            
                inicioCola=null;
                finalCola=null;
            
            }else{
            
                inicioCola = inicioCola.Siguiente;
            
            }
        
            return informacion;
        }else{
        
          return null;
        
        }
        
    
    }
    
    public int length(){   
    
        return tamanio;
    
    }
    
    public void to_string(){
    
        Nodo aux = inicioCola;
        
        String colaInvertida = "";
        
        while(aux != null){
            
          cola += aux.valor+ " ";
          aux = aux.Siguiente;
                  
        }
        
        String cadena[] =cola.split(" "); 
    
        for(int i = cadena.length-1 ; i>=0 ; i--){
        
            colaInvertida += " "+ cadena[i];
        
        }
    
        
        cola ="";
    }
    
    }
