package MétodosDeOrdenamiento.OrdenamientoInterno;

public class Shellsort {
    public static void shell(int arr[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = arr.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < arr.length; i++) // se da una pasada
                {
                    if (arr[i - salto] > arr[i]) { // y si están desordenados
                        aux = arr[i]; // se reordenan
                        arr[i] = arr[i - salto];
                        arr[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 10, 1, 3, 6 };
        System.out.println("Arreglo desordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArreglo Ordenado: ");
        shell(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
