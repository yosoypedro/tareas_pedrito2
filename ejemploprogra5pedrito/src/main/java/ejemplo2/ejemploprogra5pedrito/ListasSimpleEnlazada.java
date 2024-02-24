
package ejemplo2.ejemploprogra5pedrito;


public class ListasSimpleEnlazada {
    
    
    Nodo cabeza; //Referencia al primer nodo de la lista
    
    //constructor para inicializar la lista como vacia
    public ListasSimpleEnlazada(){
        
        this.cabeza=null;  //Inicializamos la lista vacia

    }
    
    //Metodo para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);  // Crea un nuevo nodo con el valor proporcionado
        nuevoNodo.siguiente = cabeza; // Establece el siguiente del nuevo nodo como la cabeza actual
        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
    }
    
    //Metodo para insertar un nuevo nodo al final de la lista
    
    public void insetarAlFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor proporcionado
        if(cabeza == null){ //Verifica si la lista esta vacia
            cabeza = nuevoNodo; // Si esta vacia, el nuevo nodo se convierte en la cabeza
        }  
        else {
            Nodo temp = cabeza; 
            while (temp.siguiente != null) { //Avanza hasta el ultimo nodo de la lista
                temp = temp.siguiente;
            }
        
        }
    }
    
    //Metodo para insertar un nuevo nodo en una posicion especifica de la lista
    
    public void insertarEnPosicion(int dato, int posicion){
        if(posicion < 0){ // Verifica si la posicion es valida
            System.out.println("La posicion debe ser un numero positivo.");
            return;    
    }
    if (posicion == 0) { // Inserta al inicio si la posicion es cero
        insertarAlInicio(dato);
        return;
    }
    Nodo nuevoNodo = new Nodo(dato);
    Nodo temp = cabeza;
    for (int i = 0; i< posicion - 1; i++) { //Avanza hasta la posicion anterior a la deseada
        if (temp == null) {
            System.out.println("La lista no tiene suficientes elementos");
            return;
        }
        temp = temp.siguiente;
    }
    if(temp == null){
        System.out.println("La lista no tiene suficientes elementos.");
        return;
    }
    nuevoNodo.siguiente = temp.siguiente; //inserta el nuevo nodo en la posicion especificada
   temp.siguiente = nuevoNodo;
    }
    
    // Meotdo para eliminar el primer nodo de la lista
    
    public void eliminarPrimero(){
        if (cabeza !=null){ //Verifica si la lista no está vacia
            cabeza = cabeza.siguiente;
            
        } else {
            System.out.println("La lista esta vacia.");
        }
    }
    
    
    
    // Metodo para eliminar el ultimo nodo de la lista
    public void eliminarUltimo(){
        if (cabeza == null){ //Verifica si la lista esta vacia
            System.out.println("La lista esta vacia");
            return;
        }
    if (cabeza.siguiente == null){ // Verifica si la lista tiene solo un elemento
    cabeza = null; // Si es asi, la lista queda vacia
    return;
    }
    
    Nodo temp = cabeza; 
    while (temp.siguiente.siguiente !=null){ // Avanza hasta el penultimo nodo
        temp = temp.siguiente;
        
    }
    temp.siguiente = null; // Elimina la referencia al ultimo nodo
    }
    
    // Metodo par aeliminar un nodo en una posicion especifica de la lista
    
    public void eliminarEnPosicion(int posicion){
        if (posicion < 0 ) { // Verifica si la posicion es valida
            System.out.println("La posicion debe ser un numero positivo.");
            return;
            
            
        }
        if(posicion == 0){ // Elimina el primer nodo si la posicion es cero
            eliminarPrimero();
            return;
        }
        Nodo temp = cabeza;
        for (int i = 0; temp != null && i < posicion - 1; i++) { // Avanza hasta la posicion anterior
            temp = temp.siguiente;
        } 
        if (temp == null || temp.siguiente == null){ // Verifica si la posicion es valida
            System.out.println("La lista no tiene suficientes elementos");
            return;
            
        }
    temp.siguiente = temp.siguiente.siguiente; // Elimina el nodo en la posicion especificada
    }
    //Metodo para buscar un elemento en la lista
        
        public boolean buscar(int dato) {
	Nodo temp = cabeza;
	while (temp != null) {//Recorre la lista
		if (temp.dato == dato) {//Compara el valor del nodo con el dato buscado
			return true;//Retorna true si lo encuentra
		}
		temp = temp.siguiente;
	}
	return false;//retorna false si no lo encuentra
}

        //Metodo para imprimir los elementos de la lista
        public void imprimirLista() {
	Nodo temp = cabeza;
	System.out.print("Lista: ");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}
}
    

