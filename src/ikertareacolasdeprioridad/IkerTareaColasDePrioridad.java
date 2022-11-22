/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ikertareacolasdeprioridad;

/**
 *
 * @author ikero
 */
public class IkerTareaColasDePrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BoundredPriorityQueue colaPrior = new BoundredPriorityQueue(5);
        
        System.out.println("La lista esta vacia? "+colaPrior.is_empty());
        
        colaPrior.enqueue(0,"niÃ±os");
        
        colaPrior.enqueue(0,"niÃ±as");
        
        colaPrior.enqueue(1,"mujeres");
        
        colaPrior.enqueue(1,"personas mayores");
        
        colaPrior.enqueue(2,"personas jovenes");
        
        colaPrior.enqueue(3,"hombres");
        
        colaPrior.enqueue(4,"personal de trabajo");
        
        colaPrior.enqueue(4,"capitan");
        
        System.out.println("La lista esta vacia? "+colaPrior.is_empty());
        
        System.out.println("Cual es el tamaÃ±o de la cola de prioridad? "+colaPrior.length());
        
        colaPrior.dequeue();
        
        System.out.println("Cual es el tamaÃ±o de la cola de prioridad? "+colaPrior.length());
        
        System.out.println("La forma de la lista es: "+colaPrior.toString());
        
    }
    
}
