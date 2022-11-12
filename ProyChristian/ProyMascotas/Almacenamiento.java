package ProyChristian.ProyMascotas;
import java.io.*;
import java.util.ArrayList;

public class Almacenamiento {
    String nombre = "ListaMascotas.txt"; // Ruta y nombre del archivo que vamos a crear
    File archivo = new File(nombre);
    ArrayList<Mascota> temp;

    Almacenamiento() {
        temp = new ArrayList<Mascota>();
        try {
            if (!(archivo.exists())) { //Condicional que verifica si el archivo ya existe, si no existe lo crea
                archivo.createNewFile();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void guardarDatos(Mascota m) {
        temp.add(m);
    }

    public void guardarArchivo() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));

            for (Mascota mascota : temp) {
                oos.writeObject(mascota.toString());
            }

            System.out.println("Archivo escrito exitosamente!");
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
