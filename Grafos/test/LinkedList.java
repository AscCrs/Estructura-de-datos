package test;
public class LinkedList {
    private Nodo source;
    private int size;

    LinkedList() {
        source = null;
        size = 0;

    }

    public int getSize() {
        return size;
    }

    public void add(Object edge) {
        Nodo nodo = new Nodo(edge);
        if (source != null) {
            Nodo aux = source;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        } else {
            source = nodo;
        }
        size ++;
    }

    public Object deleteRear() {
        Nodo aux = source;
        Object delete = 0;
        for (int i = 0; i < size - 1; i++) { 
            aux = aux.getSiguiente();
        }
        Nodo siguiente = aux.getSiguiente();
        delete = aux.getDato();
        aux.setSiguiente(siguiente.getSiguiente());

        size --;
        return delete;
    }

    public boolean exist(Object dato) {
        boolean find = false;
        Nodo aux = source;
        while (aux != null) {
            if (aux.getDato() == dato) {
                find = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return find;
    }

    public Object getData(Object data) {
        

        return null;
    }
}