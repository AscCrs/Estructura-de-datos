package ProyectoEstructuraLineal;

public class Nodo {
    public Nodo siguiente;
    public Nodo anterior;
    public Object dato;

    Nodo() {
        siguiente = null;
        anterior = null;
        dato = null;
    }

    Nodo(Object dato) {
        siguiente = null;
        anterior = null;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
