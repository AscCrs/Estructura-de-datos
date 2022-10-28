package ProyectoEstructuraLineal;

import java.util.Scanner;

public class LinkedStackMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc = 0, size1 = 0, size2 = 0;
        boolean val = true;

        System.out.print("Ingrese el tamaño de la primera pila: ");
        size1 = sc.nextInt();
        System.out.print("Ingrese el tamaño de la segunda pila: ");
        size2 = sc.nextInt();
        LinkedStack pilaEnlazada = new LinkedStack(size1, size2);

        try {
            do {
                System.out.println("Menu de opciones:\n1. Agregar datos pila 1");
                System.out.println("2. Agregar datos pila 2\n3. Eliminar cima pila 1\n4. Eliminar cima pila 2");
                System.out.println("5. Mostrar cima 1\n6. Mostrar cima 2\n7. Salir");
                System.out.print("Ingrese su opcion: ");
                opc = sc.nextInt();
    
                switch (opc) {
                    case 1:
                        for (int i = 0; i < size1; i++) {
                            System.out.print("Ingrese el dato " + (i + 1) + " : ");
                            pilaEnlazada.pushStack1(sc.next());
                        }

                        System.out.println("Datos añadidos con exito!");
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 2:
                        for (int i = 0; i < size1; i++) {
                            System.out.print("Ingrese el dato " + (i + 1) + " : ");
                            pilaEnlazada.pushStack2(sc.next());
                        }

                        System.out.println("Datos añadidos con exito!");
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 3:
                        Thread.sleep(2000);
                        pilaEnlazada.popStack1();
                        System.out.println("Cima eliminada con exito!");
                        Thread.sleep(1000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 4:
                        Thread.sleep(2000);
                        pilaEnlazada.popStack2();
                        System.out.println("Cima eliminada con exito!");
                        Thread.sleep(1000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 5:
                        System.out.println("Cima de la pila 1: " + pilaEnlazada.getTopStack1());
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 6:
                        System.out.println("Cima de la pila 2: " + pilaEnlazada.getTopStack2());
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 7:
                        val = false;
                        break;
                    default:
                        System.out.println("Error - Ingrese una opcion valida!");

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                }
            } while (val == true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}