package Listas;

public class Lista {
    private Nodo inicio; // Puntero al inicio la lista 
    private int size; // Atributo que define el tamaño de la lista 
    
    Lista() { 
        inicio = null;
        size = 0;
    }

    public boolean isEmpty() { return (inicio == null); }

    public Object getInicio() { return inicio.dato; }

    public int getSize() { return size; }

    public void addEnd(Object dato) {
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        if (!isEmpty()) {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        } else { inicio = nodo; }

        size ++;
    }

    public void addStart(Object dato) {
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        if(!isEmpty()) {
            nodo.setSiguiente(inicio);
            inicio = nodo;
        } else { inicio = nodo; }

        size ++;
    }

    public Object getDato(int index) throws Exception {
        if (index >= 0 && index < size) {
            if (index == 0) {
                return inicio.getDato();
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < index; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getDato();
            }
        } else {
            throw new Exception("No existe esta posición en la lista");
        }
    }

    public void delete() {
        inicio = null;
        size = 0;
    }

    public boolean search(Object referencia) {
        Nodo aux = inicio;
        boolean find = false;
        while (aux != null && find != true) {
            if (referencia == aux.getDato()) {
                find = true;
            } else aux = aux.getSiguiente();
        }

        return find;
    }

    public void removeReference(Object referencia) {
        if (!(search(referencia))) {
            size --;
        } else {
            if (!(inicio.getDato() == referencia)) {
                Nodo aux = inicio;
                while (aux.getSiguiente().getDato() != referencia) {
                    aux = aux.getSiguiente();
                }

                Nodo siguiente = aux.getSiguiente().getSiguiente();

                aux.setSiguiente(siguiente);
            } else { inicio.getSiguiente(); }
        }
    }

    public void list() {
        if (!isEmpty()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null) {
                System.out.print(i + " .[ " +  aux.getDato() + " ] " + " -> ");
                aux = aux.getSiguiente();
                i ++;
            }
        }
    }
}
