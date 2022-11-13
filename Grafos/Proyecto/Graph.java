package Proyecto;

import java.util.LinkedList;

public class Graph {
    int aristas;
    LinkedList<Edge>[] adjacencylist;

    // 6

    @SuppressWarnings({"unchecked"})
    Graph(int vertices) {
        this.aristas = vertices;
        adjacencylist = new LinkedList[vertices];
        // Se inicializa la lista de adyacencia para todos los vertices
        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void addEgde(int source, int target, int weight) {
        Edge edge = new Edge(source, target, weight);
        adjacencylist[source].addFirst(edge);
    }

    public void removeEdge(int source) {
        LinkedList<Edge> aux = adjacencylist[aristas];
        if (source == 0) {
            //aux = ;
        } else {

        }
    }

    public void printGraph() {
        for (int i = 0; i < aristas; i++) {
            LinkedList<Edge> lista = adjacencylist[i];
            for (int j = 0; j < lista.size(); j++) {
                System.out.println("Vertice " + i + " conectado a " +
                        lista.get(j).getTarget() + " con peso " + lista.get(j).getWeight());
            }
        }
    }
}
