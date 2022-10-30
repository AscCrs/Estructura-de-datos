/*
 * Problema: Hoy es domingo y Kevin siempre lava los domingos. Siempre que Kevin 
 * lava, distribuye su ropa en una montaña de ropa que cumple con estas caracteristicas:
 * Se encuentra distribuida de tal forma que en cada "nivel" de la montaña la cantidad de
 * ropa que hay siempre es una potencia de 2 y se llena de arriba hacia abajo, es decir, 
 * que la primera prenda se inserte en la montaña estará en la punta de la montaña. 
 * 
 * Dado un entero positivo n, un entero q y una lista de n prendas, imprime el nivel 
 * de la montaña que contenga la prenda q. Puedes asumir que los números de prenda son 
 * únicos y no se repiten.
 * 
 * Ejemplo de entrada: 
 * 5 4
 * 1 9 7 4 3
 * Ejemplo de salida:
 * 3
 */
package Arboles.Practica;
import java.util.Scanner;

public class MainBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BinaryTree arbol = new BinaryTree();
        arbol.raiz = new Nodo(2);
        arbol.raiz.izquierda = new Nodo(7);
        arbol.raiz.izquierda.izquierda = new Nodo(2);
        arbol.raiz.izquierda.derecha = new Nodo(6);
        arbol.raiz.izquierda.derecha.izquierda = new Nodo(5);
        arbol.raiz.izquierda.derecha.derecha = new Nodo(11);
        arbol.raiz.derecha = new Nodo(5);
        arbol.raiz.derecha.derecha = new Nodo(9);
        arbol.raiz.derecha.derecha.izquierda = new Nodo(4);

        System.out.println("Recorrido en inorden");
        arbol.recorrerInorden(arbol.raiz);
        System.out.println("\nRecorrido en preOrden");
        arbol.recorrerPreorden(arbol.raiz);
        System.out.println("\nRecorrido en postOrden");
        arbol.recorrerPostorden(arbol.raiz);

        System.out.println("\nLa altura del arbol es: " + arbol.altura(arbol.raiz));
        System.out.println("Hay " + arbol.contarPadres(arbol.raiz) + " numero de padres");
        System.out.println("Hay " + arbol.nodosTotales(arbol.raiz) + " numero de nodos");

        System.out.println("El valor 2 existe en el arbol: " + arbol.busqueda(2));

        sc.close();
    }
}
