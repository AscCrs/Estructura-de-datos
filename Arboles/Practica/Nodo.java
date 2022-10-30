package Arboles.Practica;
public class Nodo {
    Nodo izquierda;
    Nodo derecha;
    int dato;

    Nodo (int dato) { 
        this.dato = dato;
        derecha = null;
        izquierda = null;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public int getDato() {
        return dato;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
