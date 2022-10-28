package Listas;

public class mainLista {
    public static void main(String[] args) throws Exception{
        Lista lista = new Lista();

        lista.addStart(1);
        lista.addEnd(3);
        

        System.out.println(lista.isEmpty());
        System.out.println(lista.getSize());
        System.out.println(lista.getDato(1));
        System.out.println(lista.getInicio());
        lista.list();
    }
}
