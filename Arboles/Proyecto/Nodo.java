public class Nodo {
    //miembros de acceso
    Nodo izquierda;
    int dato;
    Nodo derecha;
    
    //iniciar dato y hacer de este nodo un nodo hoja
    public Nodo(int datos) {
        this.dato = datos;
        izquierda = derecha = null; //el nodo no tiene hijos
    }
    
    //buscar punto de insercion e inserter nodo nuevo
    public synchronized void insertar(int dato) {
        //insertar en subarbol izquierdo
        if(this.dato > dato) {
            //insertar en subarbol izquierdo
            if(izquierda == null)
                izquierda = new Nodo(dato);
            else    //continua recorriendo subarbol izquierdo
                izquierda.insertar(dato);
        }
        
        //insertar nodo derecho
        else if(this.dato < dato) {
            //insertar nuevo nodoArbol
            if(derecha == null)
                derecha = new Nodo(dato);
            else
                derecha.insertar(dato);
        }
    }

    // obtener el nodo izquierdo
    public Nodo getIzquierda() {
        return izquierda;
    }

    // obtener el nodo derecho
    public Nodo getDerecha() {
        return derecha;
    }

    // Obtener el dato almacenado en el nodo
    public int getDatos() {
        return dato;
    }
}
