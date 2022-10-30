public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        System.out.println("Insertando los siguientes valores: ");
        arbol.insertarNodo(8);
        arbol.insertarNodo(3);
        arbol.insertarNodo(1);
        arbol.insertarNodo(6);
        arbol.insertarNodo(4);
        arbol.insertarNodo(7);
        arbol.insertarNodo(10);
        arbol.insertarNodo(14);
        arbol.insertarNodo(13);

        arbol.recorrerInorden();
        System.out.println("");
        arbol.recorrerPostorden();
        System.out.println("");
        arbol.recorrerPreorden();
        System.out.println("");

        System.out.println(arbol.busqueda(24));

        System.out.println(arbol.altura());

        System.out.println(arbol.nodosTotales());

        System.out.println(arbol.contarPadres());
    }
}
