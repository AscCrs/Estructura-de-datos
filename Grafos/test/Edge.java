package test;
public class Edge {
    // Declaracion de los atributos de la clase
    int source;
    int target;
    int weight;

    /**
     * Constructor
     * 
     * @param source
     *               indica el valor de la arista
     * @param next
     *               indica la arista con la que se encontrara conectada
     * @param weight
     *               indica el peso o el coste que tendra el vertice
     */

    Edge(int source, int target, int weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }
}
