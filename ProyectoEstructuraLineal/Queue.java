/*
 * Programa de cola simple con arreglos
 */
package ProyectoEstructuraLineal;

import java.util.Arrays;

public class Queue {
    private int queue[];    
    private int cabeza = 0;
    private int fin = -1;
    private int size = 0;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public int getCabeza() {
        return queue[cabeza];
    }

    public int getFin() {
        return queue[fin];
    }

    public int size() {
        return fin + 1;
    }

    public Object pop() throws Exception {
        if (!isEmpty()) {
            return queue[cabeza++];
        } else {
            throw new Exception("Error - Queue is empty");
        }
    }

    public void push(int data) throws Exception { 
        if (!isFull()) {
            queue[++fin] = data;
        } else throw new Exception("Error - Queue is full");
    }

    private boolean isFull() {
        return (size() > size);
    }

    private boolean isEmpty() {
        return (fin < 0);
    }

    public String bubbleSort() {
        int[] aux = queue;
        sortArray(aux);
        return Arrays.toString(aux);
    }

    private int[] sortArray(int[] arr) {
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

    private int particion(int arr[], int izq, int der) {
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

    public String quicksort() {
        int[] aux = queue;
        quicksort(aux, 0, aux.length - 1);
        return Arrays.toString(aux);
    }

    private void quicksort(int arr[], int izq, int der) {
        if (izq < der) {
            int indiceParticion = particion(arr, izq, der);
            quicksort(arr, izq, indiceParticion);
            quicksort(arr, indiceParticion + 1, der);
        }
    }

    public String radixSort() {
        int[] aux = queue;
        radixSort(aux);
        return Arrays.toString(aux);
    }

    private void radixSort(int[] arr) {
        int[][] bucket = new int[10][arr.length];
        int[] bucketOfElement = new int[10];
        int max = 0;
        // Encuentra el elemento más grande en la matriz
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Calcula el número de bits del elemento más grande
        int maxLength = (max + "").length();
        for (int m = 0, n = 1; m < maxLength; m++, n *= 10) {
            // Coloca los números en arr en los cubos correspondientes según sus unidades,
            // decenas, centenas, etc.
            for (int i = 0; i < arr.length; i++) {
                int digit = arr[i] / n % 10;
                // Asignar el valor de arr [i] a la matriz bidimensional en el depósito
                bucket[digit][bucketOfElement[digit]] = arr[i];
                bucketOfElement[digit]++;
            }
            int index = 0;
            // Leer los elementos en el depósito y reasignarlos a arr
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < bucketOfElement[j]; k++) {
                    arr[index] = bucket[j][k];
                    index++;
                }
                bucketOfElement[j] = 0;// Borrar el número de elementos en cada uno
            }
        }
    }

    public String shell() {
        int[] aux = queue;
        shell(aux);
        return Arrays.toString(aux);
    }

    private void shell(int arr[]) {

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
}
