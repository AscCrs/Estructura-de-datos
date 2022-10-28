package Colas;

public class QueueStackmain {
    public static void main(String[] args) throws Exception {
        // QueueStack cola = new QueueStack(4);
        // cola.encolar(7);
        // cola.encolar(8);
        // cola.encolar(4);
        // cola.encolar(9);
        // System.out.println("La cabeza de la cola es: " + cola.getCabeza());
        // System.out.println("El fin de la cola es: " + cola.getFin());

        // System.out.println(cola.buscar(8));

        // QueueList cola1 = new QueueList();
        // cola1.insertar(46);
        // cola1.insertar(12);
        // cola1.insertar(87);
        // cola1.insertar(125);
        // cola1.insertar(30);
        // cola1.extraer();
        // cola1.estaVacia();
        // cola1.contar();
        // System.out.println(cola1.toString());

        TestCircularQueue queue = new TestCircularQueue(3);
        queue.insertar(1);
        queue.insertar(2);
        queue.insertar(3);
        queue.mostrar();
    }
}
