package Proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vertices = 6;
        Graph grafo = new Graph(vertices);
        grafo.addEgde(0, 1, 4);
        grafo.addEgde(0, 2, 3);
        grafo.addEgde(1, 3, 2);
        grafo.addEgde(1, 2, 5);
        grafo.addEgde(2, 3, 7);
        grafo.addEgde(3, 4, 2);
        grafo.addEgde(4, 0, 4);
        grafo.addEgde(4, 1, 4);
        grafo.addEgde(4, 5, 6);
        grafo.printGraph();
    }
}
