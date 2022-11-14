package MétodosDeOrdenamiento.OrdenamientoInterno;

public class Insertionsort {

    // El metodo compara el segundo elemento con el anterior para ir ordenando el arreglo
    public static void insercionDirecta(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
                                               // valor de aux sea menor que los
                A[j + 1] = A[j]; // de la izquierda, se desplaza a
                j--; // la derecha
            }
            A[j + 1] = aux; // colocamos aux en su sitio
        }
    }

    public static void main(String[] args) {
        int A[] = { 10,40, 7, 9, 15, 27 };
        insercionDirecta(A);
        for (int i = 0; i < A.length; i++) { 
            System.out.print(A[i] + " ");
        }
    }
}