package MétodosDeOrdenamiento;

public class Bubblesort {
    public static int[] sortArray(int[] arr) {
        int[] array = arr;
        int aux;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        array = arr;
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 10, 1, 3, 6 }; // 3 5 9 1 3 6 10 - 3 5 1 3 6 9 10 - 3 1 3 5 6 9 10 - 1 3 3 5 6 9 10
        System.out.println("Arreglo desordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arregloOrdenado = sortArray(arr);
        System.out.println("\nArreglo ordenado: ");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.print(arregloOrdenado[i] + " ");
        }
    }
}
