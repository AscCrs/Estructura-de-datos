package ProyectoEstructuraLineal;

import java.util.Scanner;

public class LinkedDoublyQueueMain {
    public static void main(String[] args) {
        LinkedDoublyQueue queue = new LinkedDoublyQueue();
        Scanner sc = new Scanner(System.in);
        int opc = 0, c = 0;
        boolean val = true;
        char y;

        try {
            do {
                System.out.println(
                        "Menu de opciones:\n1.Agregar elemento\n2.Agregar al frente\n3.Agregar al final\n4.Eliminar frente");
                System.out.println(
                        "5.Eliminar ultimo\n6.Mostrar Frente\n7.Mostrar final\n8.Mostrar siguiente al frente\n9.Mostrar anterior al final\n10.Salir");
                System.out.print("Ingrese su opcion: ");
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el dato: ");
                        if (c == 0) queue.pushFront(sc.next());
                        else queue.pushRear(sc.next());
                        
                        c++;
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 2:
                        System.out.print("Ingrese el dato: ");
                        queue.pushFront(sc.next());

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 3:
                        System.out.print("Ingrese el dato: ");
                        queue.pushRear(sc.next());
                        
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 4:
                        System.out.print("Desea eliminar el frente de la cola? (Y/n):");
                        y = sc.next().charAt(0);
                        if (y == 'Y' || y == 'y') queue.popFront();

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 5:
                        System.out.print("Desea eliminar el final de la cola? (Y/n):");
                        y = sc.next().charAt(0);
                        if (y == 'Y' || y == 'y') queue.popRear();
                        
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 6:
                        System.out.println("El frente de la cola es: " + queue.getInicio());

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 7:
                        System.out.println("El final de la cola es: " + queue.getFin());
                        
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 8:
                        System.out.println("El dato siguiente al frente de la cola es: " + queue.getNextFront());
                        
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 9:
                        System.out.println("El dato anterior al final de la cola es: " + queue.getLastRear());
                        
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 10:
                        val = false;
                        break;
                    default:
                        System.out.println("Error - Debe ingresar un valor valido");
                        
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
