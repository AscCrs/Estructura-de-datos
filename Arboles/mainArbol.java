package Arboles;

public class mainArbol {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // arbol.insertar(2, "u");
        // arbol.insertar(8, "p");
        // arbol.insertar(7, "s");
        // arbol.insertar(9, "q");
        // arbol.insertar(4, "x");
        // arbol.insertar(3, "w");        
        // arbol.insertar(1, "v");
        // arbol.insertar(5, "y");
        // arbol.insertar(6, "z");
        // arbol.insertar(0, "r");

        // arbol.inOrden(arbol.raiz);
        // try {
        //     Thread.sleep(1000);
        //     System.out.println("");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        
        // arbol.insertar(0, "r");
        // arbol.insertar(1, "v");
        // arbol.insertar(2, "u");
        // arbol.insertar(3, "w");
        // arbol.insertar(4, "x");
        // arbol.insertar(5, "y");
        // arbol.insertar(6, "z");
        // arbol.insertar(7, "s");
        // arbol.insertar(8, "p");
        // arbol.insertar(9, "q");
        // arbol.postOrden(arbol.raiz);

        arbol.insertar(0, "r");
        arbol.insertar(1, "v");
        arbol.insertar(2, "u");
        arbol.insertar(3, "w");
        arbol.insertar(4, "x");
        arbol.insertar(5, "y");
        arbol.insertar(6, "z");
        arbol.insertar(7, "s");
        arbol.insertar(8, "p");
        arbol.insertar(9, "q");
        arbol.inOrden(arbol.raiz);
        System.out.println("");
        arbol.preOrden(arbol.raiz);
    }
}
