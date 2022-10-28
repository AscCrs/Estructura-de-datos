package Arboles;

public class Arbol {
    Nodo raiz;
        
    Arbol() {
        raiz = null ;
    }

    public void insertar(int indice, Object dato) {
        Nodo n = new Nodo(indice);
        n.setDato(dato);

        if (raiz == null) {
            raiz = n;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                n.padre = aux;
                if (n.key >= aux.key) {
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda;
                }
            }
            if (n.key < n.padre.key) {
                n.padre.izquierda = n;
            } else {
                n.padre.derecha = n;
            }
        }
    }

    public void preOrden(Nodo n) {
        if (n != null) {
            System.out.println("Indice " + n.key + " contenido " + n.dato);
            preOrden(n.izquierda);
            preOrden(n.derecha);
        }
    }

    public void inOrden(Nodo n) { 
        if (n != null) {
            inOrden(n.izquierda);
            System.out.println("Indice " + n.key + " contenido " + n.dato);
            inOrden(n.derecha);
        }
    }

    public void postOrden(Nodo n) {
        if (n != null) {
            postOrden(n.izquierda);
            postOrden(n.derecha);
            System.out.println("Indice " + n.key + " contenido " + n.dato);
        }
    } 
    //Arbol binario y no binario con recorridos inorden, postorden y preorden
    //Ingresar y eliminar datos
    //Altura del arbol, tamaño
    //Cuantos hijos tiene, Padres y hojas
    //Buscar un elmento  
}
