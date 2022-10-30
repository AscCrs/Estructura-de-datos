package Arboles.Practica;

public class BinaryTree {
    Nodo raiz;

    BinaryTree() {
        raiz = null;
    }

    public int altura(Nodo nodo) {
        if (nodo != null) {
            return 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        }
        return 0;
    }

    public boolean busqueda(int dato) {
        return busqueda(this.raiz, dato);
    }

    public boolean busqueda(Nodo nodo, int dato) { 
        if (nodo != null) {
            if (nodo.getDato() == dato) 
                return true;
            else if (dato < nodo.getDato()) 
                return busqueda(nodo.getIzquierda(), dato);
            else 
                return busqueda(nodo.getDerecha(), dato);
        }
        return false;
    }

    public int contarPadres(Nodo nodo) {
        if (nodo != null) {
            if (nodo.getIzquierda() == null && nodo.getIzquierda() == null) {
                return 0;
            } else {
                return contarPadres(nodo.izquierda) + contarPadres(nodo.derecha) + 1;
            }
        }
        return 0;
    }

    public int nodosTotales(Nodo raiz) {
        if (raiz != null) {
            int alturaIzquierda = alturaIzquierda(raiz);
            int alturaDerecha = alturaDerecha(raiz);
            if (alturaIzquierda == alturaDerecha) {
                return (1 << alturaIzquierda) - 1;
            }
            return 1 + nodosTotales(raiz.izquierda) + nodosTotales(raiz.derecha);
        }
        return 0;
    }

    public int alturaIzquierda(Nodo nodo) {
       int altura = 0;
       while (nodo != null) {
        altura ++;
        nodo = nodo.getIzquierda();
       }
       return altura;
    }

    public int alturaDerecha(Nodo nodo) {
        int altura = 0;
        while (nodo != null) {
            altura ++;
            nodo = nodo.getDerecha();
        }

        return altura;
    }
 
    public void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            recorrerInorden(nodo.derecha);
        }
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorrerInorden(nodo.izquierda);
            recorrerInorden(nodo.derecha);
        }
    }

    public void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.izquierda);
            recorrerInorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }
}