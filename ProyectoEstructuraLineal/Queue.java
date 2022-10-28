/*
 * Programa de cola simple con arreglos
 */
package ProyectoEstructuraLineal;

public class Queue {
    private Object queue[];    
    private int cabeza = 0;
    private int fin = -1;
    private int size = 0;

    Queue(int size) {
        this.size = size;
        queue = new Object[size];
    }

    public Object getCabeza() {
        return queue[cabeza];
    }

    public Object getFin() {
        return queue[fin];
    }

    public int size() {
        return fin + 1;
    }

    public Object pop() throws Exception {
        if (!isEmpty()) {
            return queue[cabeza++];
        } else {
            throw new Exception("Error - Queue is empty");
        }
    }

    public void push(Object data) throws Exception { 
        if (!isFull()) {
            queue[++fin] = data;
        } else throw new Exception("Error - Queue is full");
    }

    public boolean isFull() {
        return (size() > size);
    }

    public boolean isEmpty() {
        return (fin < 0);
    }
}
