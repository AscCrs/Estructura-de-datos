/**
 * Métodos
 * void pop
 * push
 */
package Pilas;

public class ArrayStackSG {
    // Declaración de los atributos
    private int size;
    private int[] stack;
    private int cima = -1;

    public ArrayStackSG(int size) {
        this.size = size;
        stack = new int[size];
    }

    public int getSize() { return size; }

    public int getCima() { return cima = stack[cima]; }

    public void setSize(int size) { this.size = size; }

    public void push(int dato) {
        if (cima + 1 < size) stack[++cima] = dato;
        else System.out.println("No se puede ingresar datos");
    }

    public void pop() {
        if (isEmpty()) return; 
        else stack[cima--] = 0;    
    }

    public boolean isEmpty() {
        return (cima < 0);
    }
}