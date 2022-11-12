package ProyChristian.practica2;
import java.io.*;
import java.util.ArrayList;

public class Archivo {
  ArrayList<Triangulo> areas;
  String nombre = "Areas.txt"; // Ruta y nombre del archivo que vamos a crear
  File archivo = new File(nombre);

  Archivo() {
    areas = new ArrayList<Triangulo>();

    try {
      if (!(archivo.exists())) { //Condicional que verifica si el archivo ya existe, si no existe lo crea
          archivo.createNewFile();
      }
  } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
  }
  }

  public void almacenarTriangulo(Triangulo t) {
    areas.add(t);
  }

  public void escribirArchivo() {
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
      
      for (Triangulo t : areas) {
        oos.writeObject(t.toString());        
      }

      System.out.println("Archivo escrito exitosamente");
      oos.close();
  } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
  }
  }
}
