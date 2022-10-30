public class Arbol {
    private Nodo raiz;
    
    //construir un arbol vacio
    public Arbol() {
        raiz = null;
    }

    // Obtener la altura del arbol
    public int altura() {
        return altura(raiz);
    }

    // metodo auxiliar recursivo para recorrer el arbol
    private int altura(Nodo nodo) {
        if (nodo != null) {
            return 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        }
        return 0;
    }
    
    /**
     * valor de entrada para cada nuevo nodo que sea insertado
     * @param dato
     */
    //insertar un nuevo nodo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int dato) {
        if(raiz == null)
            raiz = new Nodo(dato); //crea nodo raiz
        else
            raiz.insertar(dato); //llama al metodo insertar        
    }

    // Buscar si un elemento existe dentro del arbol
    public boolean busqueda(int dato) {
        return busqueda(this.raiz, dato);
    }

    // Metodo auxiliar para realizar la busqueda del elemento en el arbol
    private boolean busqueda(Nodo nodo, int dato) { 
        if (nodo != null) {
            if (nodo.getDatos() == dato) 
                return true;
            else if (dato < nodo.getDatos()) 
                return busqueda(nodo.getIzquierda(), dato);
            else 
                return busqueda(nodo.getDerecha(), dato);
        }
        return false;
    }

    // contar la cantidad de padres en el arbol
    public int contarPadres() {
        return contarPadres(raiz);
    }

    private int contarPadres(Nodo nodo) {
        if (nodo != null) {
            if (nodo.getIzquierda() == null && nodo.getIzquierda() == null) {
                return 0;
            } else {
                return contarPadres(nodo.getIzquierda()) + contarPadres(nodo.getDerecha()) + 1;
            }
        }
        return 0;
    }

    /**
     * @param raiz  hace referencia a la raiz del arbol creado
     * @integer altura  sera el valor devuelto por el metodo recursivo
     * los metodos auxiliares recorren la altura del arbol en la izquierda y derecha
     * @param nodo   es el valor enviado por el metodo recursivo que hace referencia a la raiz
    */

    // contar el total de nodos dentro del arbol
    public int nodosTotales() {
        return nodosTotales(raiz);
    }

    public int nodosTotales(Nodo raiz) {
        if (raiz != null) {
            int alturaIzquierda = alturaIzquierda(raiz);
            int alturaDerecha = alturaDerecha(raiz);
            if (alturaIzquierda == alturaDerecha) {
                return (1 << alturaIzquierda);
            }
            return 1 + nodosTotales(raiz.izquierda) + nodosTotales(raiz.derecha);
        }
        return 0;
    }

    // metodo auxiliar para recorrer los nodos izquierdos del arbol
    public int alturaIzquierda(Nodo nodo) {
       int altura = 0;
       while (nodo != null) {
        altura ++;
        nodo = nodo.getIzquierda();
       }
       return altura;
    }

    // metodo auxiliar para recorrer los nodos deerechos del arbol
    public int alturaDerecha(Nodo nodo) {
        int altura = 0;
        while (nodo != null) {
            altura ++;
            nodo = nodo.getDerecha();
        }

        return altura;
    }
    
    /** Metodos de recorrido del arbol
     * @param nodo  es el nodo a partir del cual se empezara a hacer el recorrido (la raiz)
     * @return cada metodo devolvera el arbol ordenado de acuerdo al recorrido efectuado (no hay ninguna salida de datos mas que una impresion por consola)
     */

    // RECOORRIDO EN PREORDEN
    public synchronized void recorrerPreorden() {
        preorden(raiz);
    }
    
    //metodo recursivo para recorrido en preorden
    private void preorden(Nodo nodo) {
        if(nodo == null)
            return;
        
        System.out.print(nodo.dato + " ");     //mostrar datos del nodo
        preorden(nodo.izquierda);   //recorre subarbol izquierdo
        preorden(nodo.derecha);     //recorre subarbol derecho
    }
    
    //EMPEZAR RECORRIDO INORDEN
    public synchronized void recorrerInorden() {
        inorden(raiz);
    }
    
    //meoto recursivo para recorrido inorden
    private void inorden(Nodo nodo) {
        if(nodo == null)
            return;
        
        inorden(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        inorden(nodo.derecha);
    }
    
    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorrerPostorden() {
        postorden(raiz);        
    }
    
    //meotod recursivo para recorrido posorden
    private void postorden(Nodo nodo) {
        if( nodo == null )
            return;
        
        postorden(nodo.izquierda);
        postorden(nodo.derecha);
        System.out.print(nodo.dato + " ");
    }
}
