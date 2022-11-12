import java.io.*;

public class Operaciones {
    String nombre = "Distancias.txt"; // Ruta y nombre del archivo que vamos a crear
    File archivo = new File(nombre); // Creacion del objeto para hacer el archivo

    Operaciones() {
        try {
            if (!(archivo.exists())) { //Condicional que verifica si el archivo ya existe, si no existe lo crea
                archivo.createNewFile();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * @param p1 
     * @param p2
     * Objeto de tipo punto para realizar las operaciones
     */
    public void calcularDistancia(Punto p1, Punto p2) { 
        double distancia = 0;
        distancia = Math.sqrt(Math.pow((p2.getCoorx() - p1.getCoorx()), 2) + Math.pow((p2.getCoory() - p1.getCoory()), 2));

        escribirArchivo(distancia);
    }

    public void escribirArchivo(double distancia) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject("Resultado: " + distancia + "\n");

            System.out.println("Archivo escrito exitosamente");
            oos.close();
        } catch (Exception e) {
            // TO-DO: handle exception
            e.printStackTrace();
        }
    }
}
