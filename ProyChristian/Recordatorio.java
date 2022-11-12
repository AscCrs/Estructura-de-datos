package ProyChristian;
import java.util.ArrayList;
import java.io.*;

public class Recordatorio implements Serializable {
    ArrayList<Mensaje> recodatorios;

    Recordatorio () {
        recodatorios = new ArrayList<Mensaje>();
    }

    public void setMensaje(String mensaje, String fecha) {
        Mensaje m = new Mensaje(mensaje, fecha);
        recodatorios.add(m);
    }

    public void crearArchivo() {
        try {
            String nombre = "Recordatorios.txt";
            File archivo = new File(nombre);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));

            for (Mensaje msj : recodatorios) {
                oos.writeObject(msj.toString());
            }

            System.out.println("Archivo generado exitosamente!");
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
