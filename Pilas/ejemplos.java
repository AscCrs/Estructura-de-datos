package Pilas;
import java.util.Stack;

public class ejemplos {
    public static void main(String[] args) {
        Stack<Libro> pila = new Stack<Libro>();

        Libro l1 = new Libro("Título 1", "Autor 1");
        Libro l2 = new Libro("Título 2", "Autor 2");
        Libro l3 = new Libro("Título 3", "Autor 3");

        pila.push(l1); // adiciona un libro a la pila
        pila.push(l2);
        pila.push(l3);

        System.out.println(pila.peek().getTitulo()); // el último elemento adicionado

        while (!pila.isEmpty()) { // mostrar pila completa
            System.out.println(pila.pop().getTitulo()); // extrae un elemento de la pila
        }

    }
}