package Listas;

public class Nodo {
  public Nodo siguiente; 
  public Object dato;  

  public Nodo() {
    setDato(null);
    setSiguiente(null);
  } 

  public Nodo(Object dato) {
    setDato(dato);
    setSiguiente(null);
  } 

  public Nodo getSiguiente() { return siguiente; } 

  public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; } 

  public Object getDato() { return dato; } 

  public void setDato(Object dato) { this.dato = dato; } 

}
