
package ejemplo2.ejemploprogra5pedrito;


public class Nodo {
    
    
    int dato;  //Almacena el valor del nodo
    Nodo siguiente; //refetencia al siguiente nodo en la lista
    
            
            //constructor para crear un nuevo nodo econ el valor proporcionado
            public Nodo(int dato){
                
                this.dato=dato; //inicializamos el nodo
                this.siguiente=null; //inicializamos el siguiente nodo
            }
}
