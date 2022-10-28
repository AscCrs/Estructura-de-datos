package Arboles;

public class Nodo {
    public Nodo padre;
    public Nodo izquierda;
    public Nodo derecha;   
    public int key;
    public Object dato;

    public Nodo(int index) {
        key = index;
        padre = null;
        izquierda = null;
        derecha = null;
        dato = null;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}