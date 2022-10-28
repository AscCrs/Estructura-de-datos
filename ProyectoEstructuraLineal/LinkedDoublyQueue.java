/*
 * Utilizar un puntero al siguiente nodo y al anterior
 */
package ProyectoEstructuraLineal;

public class LinkedDoublyQueue {
    private Nodo inicio;
    private Nodo fin;
    private int size;

    LinkedDoublyQueue() {
        inicio = null;
        fin = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Object getInicio() {
        return inicio.dato;
    }

    public Object getFin() {
        return fin.dato;
    }

    public Object getNextFront() {
        return inicio.siguiente.dato;
    }

    public Object getLastRear() {
        return fin.anterior.dato;
    }

    public void pushFront(Object dato) {
        try {
            System.out.println("Añadiendo elemente al frente: " + dato);
            Nodo nodo = new Nodo();
            nodo.setDato(dato);
            nodo.setSiguiente(inicio);
            if (inicio != null)
                inicio.setAnterior(nodo);
            if (inicio == null)
                fin = nodo;
            inicio = nodo;
            size++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pushRear(Object dato) {
        try {
            System.out.println("Añadiendo elemento al final: " + dato);
            Nodo nodo = new Nodo();
            nodo.setDato(dato);
            nodo.setAnterior(fin);
            if (fin != null)
                fin.setSiguiente(nodo);
            if (fin == null)
                inicio = nodo;
            fin = nodo;
            size++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void popFront() {
        if (inicio == null) {
            System.out.println("Error - Underflow");
            return;
        }
        Nodo tempInicio = inicio.getSiguiente();
        if (tempInicio != null)
            tempInicio.setAnterior(null);
        if (tempInicio == null)
            fin = null;
        System.out.println("Eliminando elemento del frente: " + inicio.getDato());
        inicio = tempInicio;
        size--;
    }

    public void popRear() {
        if (fin == null) {
            System.out.println("Error - Underflow");
            return;
        }
        Nodo tempFin = inicio.getSiguiente();
        if (tempFin != null)
            tempFin.setAnterior(null);
        if (tempFin == null)
            inicio = null;
        System.out.println("Eliminando elemento al final: " + fin.getDato());
        fin = tempFin;
        size--;
    }
}
