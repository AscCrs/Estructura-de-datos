package Pilas;

public class ArrayStack implements Pila {
    private int top = -1;
    private Object s[];
    private int power = 0;

    // Metodo constructor, Metodos lectores (getters), Metodos Modificadores (Setters)

    public ArrayStack() { this(1000); }
    
    public ArrayStack(int p) { 
        power = p;
        s = new Object[power];
    }
    public int size() { return (top + 1); }

    public boolean isEmpty() { return (top < 0); }

    public void push(Object o) { if (size() < power) s[++top] = o; }

    public Object pop() {  
        Object aux; 
        if (isEmpty()) return null;
        aux = s[top];
        s[top--] = null;
        return aux;
    }

    public Object peek() { 
        if (isEmpty()) return null;
        else return s[top];
    }
}
