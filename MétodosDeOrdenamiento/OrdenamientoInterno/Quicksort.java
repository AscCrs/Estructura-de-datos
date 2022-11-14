// Entrega de proyectos: 28 Metodos de ordenamiento, 12 Busquedas
package MétodosDeOrdenamiento.OrdenamientoInterno;

public class Quicksort {
    public static int particion(int arr[], int izq, int der) {
        int pivote = arr[izq];

        while (true) {
            while (arr[izq] < pivote) {
                izq ++;
            }
            while (arr[der] > pivote) {
                der --;
            }

            if (izq >= der) {
                return der;
            } 
            int aux = arr[izq];
            arr[izq] = arr[der];
            arr[der] = aux;
            izq ++;
            der --;  
        }
    }

    public static void quicksort(int arr[], int izq, int der) {
        if (izq < der) {
            int indiceParticion = particion(arr, izq, der);
            quicksort(arr, izq, indiceParticion);
            quicksort(arr, indiceParticion + 1, der);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10,40, 7, 9, 15, 27 };
        System.out.println("Arreglo desordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArreglo Ordenado: ");
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
