// Implementacion del metodo de ordenamiento Radix
import java.util.*;

class Radix {

	// Metodo que devuelve el maximo valor edl arreglo
	static int getMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

  // Funcion que contara la cantidad de ordenamientos del arreglo de acuerdo 
  // al digito representado por el exponencial
	static void countSort(int arr[], int exp) {
		int output[] = new int[arr.length]; // arreglo de salida 
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Conteo de las concurrencias en el arreglo Count[]
		for (i = 0; i < arr.length; i++)
			count[(arr[i] / exp) % 10]++;

		// Cambio de count[i] para que count[] contenga la 
		// posicion actual del digito en el arreglo de salida[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Construir el arreglo de salida
		for (i = arr.length - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copia de la salida del arreglo en arr[], para que arr[] ahora
		// Copy the output array to arr[], so that arr[] now
		// contenga los numeros ordenados de acuerdo a al digito actual 
		for (i = 0; i < arr.length; i++)
			arr[i] = output[i];
	}

	// La funcion principal ordenara un arreglo arr[] de
	// ancho n usando el ordenamiento radix
	static void radixsort(int arr[]) {
		// Busca el maximo numero 
		int m = getMax(arr);

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, exp);
	}

	// Main driver method
	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

		// Function Call
		radixsort(arr);
		System.out.print(arr.toString());
	}
}

