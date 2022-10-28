package Colas;

public class QueueStack {
    private int cola[]; 
    private int cabeza = 0; 
    private int fin = -1; 
    private int t = 0; 

    QueueStack(int t) { 
        this.t = t;     
        cola = new int[t]; 
    } 

    public int getCabeza() { 
        return cola[cabeza]; 
    } 

    public int getFin() { 
        return cola[fin]; 
    } 

    public int eliminar() throws Exception { 
        if (!verificarVacia()) 
            return cola[cabeza++]; 
        else  
            throw new Exception("Error en la cola - Cola vacia"); 
    } 

    public void encolar(int dato) throws Exception { 
        if (!verificarLlena()) 
            cola[++fin] = dato; 
        else  
            throw new Exception("Error en la cola - Cola llena"); 
    }

    public boolean buscar(int dato) {
        for (int c : cola) {
            if (c == dato) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarLlena() { 
        return (anchura() > t); 
    }

    public int anchura() { 
        return fin + 1; 
    }
    
    public boolean verificarVacia() { 
        return (fin < 0); 
    }
}
