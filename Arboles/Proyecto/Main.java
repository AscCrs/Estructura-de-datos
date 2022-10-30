package Arboles.Proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creacion del objeto Escaner para poder leer datos por consola
        Arbol arbol = new Arbol(); // Creacion del objeto arbol para poder acceder a los metodos de la clase
        int opc = 0, cant = 0;
        boolean vVal = true, find;

        try {
            do {
                System.out.println("Menu:\n1.Ingresar datos\n2.Obtener altura");
                System.out.println("3.Buscar dato\n4.Obtener numero de padres");
                System.out.println("5.Obtener total de nodos\n8.Recorrer el arbol\n7.Salir");
                System.out.print("Ingrese su opcion: ");
                opc = sc.nextInt();
                System.out.println("");

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese la cantidad de datos que ingresara: ");
                        cant = sc.nextInt();
                        for (int i = 0; i < cant; i++) {
                            if (!(i == 0)) {
                                System.out.print(i + ". Ingrese el dato: ");
                                arbol.insertarNodo(sc.nextInt());
                            } else {
                                System.out.print("Ingrese la raiz: ");
                                arbol.insertarNodo(sc.nextInt());
                            }
                        }
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 2:
                        System.out.println("La altura del arbol es " + arbol.altura());

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 3:
                        System.out.print("Ingrese el dato que desea buscar: ");
                        find = arbol.busqueda(sc.nextInt());
                        if (!(find))
                            System.out.println("No se encontro el elemento");
                        else
                            System.out.println("El elemento existe");

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 4:
                        System.out.println("El numero de nodos padre dentro del arbol sin contar la raiz es " + arbol.contarPadres());

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 5:
                        System.out.println("El total de nodos padre dentro del arbol sin contar la raiz es " + arbol.nodosTotales());

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 6:
                        System.out.println("Recorrer:\n1.PreOrder\n2.InOrden\n3.PostOrden");
                        System.out.print("Ingrese su opcion:");
                        opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("El recorrido en PreOrden es:");
                                arbol.recorrerPreorden();
                                break;
                            case 2:
                                System.out.println("El recorrido en InOrden es:");
                                arbol.recorrerInorden();
                                break;
                            case 3:
                                System.out.println("El recorrido en PostOrden es:");
                                arbol.recorrerPostorden();
                                break;
                            default:
                                System.out.println("Error - Opcion invalida");
                                break;
                        }

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 7:
                        vVal = false;
                        break;
                    default:
                        System.out.println("Error - Ingrese una opcion valida!");

                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                }
            } while (vVal == true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        sc.close();
    }
}
