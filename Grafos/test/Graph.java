package test;
/* Especificaciones del grafo:
 * Listas de aristas
 * Matriz de adyacencia
 * Lista de adyacencia
 * Operaciones basicas:
 * Insertar vertice
 * Insertar arista
 * Eliminar vertice
 * Eliminar arista
 * Camino mas corto entre dos vertices (Dijkstra)
 * */


public class Graph {
  int edges;
  LinkedList adyacencyList;

  Graph () {
    adyacencyList = new LinkedList();
  }

  public void addEdge(int source, int target, int weight) {
    Edge edge = new Edge(source, target, weight);
    if (adyacencyList.exist(source)) {
        // agrega los nodos con los que esta conectados
        //getData(source).add(edge);
    } else {
        adyacencyList.add(edge);
    }
  }
}
