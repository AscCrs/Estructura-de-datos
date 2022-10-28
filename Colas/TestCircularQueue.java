package Colas;

public class TestCircularQueue {
    int inicio;
    int fin;
    int[] cola;
    boolean extraido;
    boolean insertado;
    TestCircularQueue(int tam){
        cola=new int[tam];
        inicio=0;
        fin=inicio;
        extraido=true;
        insertado=false;
    }
    public void insertar(int x){
        if(!llena()){
            cola[fin]=x;
            if(fin==cola.length-1)
                fin=0;
            else
                fin++;
            extraido=false;
            insertado=true;
        }
        else{
            System.out.println("ERROR: COLA LLENA");
            System.out.println();
            System.out.println();
        }
 
    }
    public int extraer(){
        if(!vacia()){
            extraido=true;
            insertado=false;
            if(inicio==cola.length-1){
                inicio=0;
                return cola[cola.length-1];
            }
            else{
                inicio++;
                return cola[inicio-1];
            }
        }
        else{
            System.out.println("ERROR: COLA VACIA");
            System.out.println();
            System.out.println();
            return 0;
        }
    }
    public boolean vacia(){
        if(inicio==fin)
            if(!insertado)
                return true;
            else
                return false;
        else
            return false;
    }
    public boolean llena(){
        if(inicio==fin)
            if(!extraido)
                return true;
            else
                return false;
        else
            return false;
    }
    public void mostrar(){
        int i;
        if (inicio<fin)
            for(i=inicio;i<fin;i++)
                System.out.print(cola[i]+" ");
        if(inicio>fin || llena()){
            for(i=inicio;i<cola.length;i++)
                System.out.print(cola[i]+" ");
            for(i=0;i<fin;i++)
                System.out.print(cola[i]+" ");
        }
        if (vacia())
            System.out.println("Cola vacia");
        System.out.println();
        System.out.println();
    }
} 
