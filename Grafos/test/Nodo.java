package test;
public class Nodo {
    private Object dato;
    private Nodo siguiente;

    Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}