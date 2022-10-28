package Colas;

public class CircularQueue {
    private Object circularQueue[];
    private int inicio = -1;
    private int fin = -1;
    private int size = 0;

    CircularQueue (int size) {
        this.size = size;
        circularQueue = new Object[size];
    }

    public void push(Object dato) {
        if (!((fin == size - 1 && inicio == 0) || (fin + 1 == inicio))) {
            if (fin == size - 1 && inicio != 0) fin = 0;
            else fin ++;
            circularQueue[fin] = dato;
            if (inicio == -1) inicio = 0;
        } else {
            System.out.println("Error - cola circular llena");
            return;
        }
    }

    public void pop() { 
        if (!(inicio == -1)) {
            System.out.println("Dato eliminado: " + circularQueue[inicio]);
            if (inicio == fin) {
                inicio = -1;
                fin = -1;
                return;
            }
            inicio ++;
            if (inicio == size) inicio = 0;
        } else {
            System.out.println("Error - cola circular vacia");
            return;
        }
    }

    public void show() {
        int i = 0;
        if (inicio == -1) {
            System.out.println("Cola circula vacia");
        } else {
            i = inicio;
            do {
                System.out.println("circularQueue[" + i + "] = " + circularQueue[i]);
                i ++;
                if (i == size && inicio > fin) i = 0; 
            } while (i != fin + 1);

            System.out.println("Frente de la cola: " + circularQueue[inicio]);
            System.out.println("Fin de la cola: " + circularQueue[fin]);
            System.out.println("Anchura de la cola: " + size);
        }
    }
}
 