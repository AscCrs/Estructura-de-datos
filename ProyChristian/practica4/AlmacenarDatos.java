import java.io.*;
import java.util.ArrayList;

public class AlmacenarDatos {
  ArrayList<Empleado> empleados;
  String archivo = "Empleados.data";
  File file = new File(archivo);
  MyObjectOutputStream output;

  AlmacenarDatos() {
    empleados = new ArrayList<Empleado>();
    
    try {
      if (!(file.exists())) { //Condicional que verifica si el archivo ya existe, si no existe lo crea
          file.createNewFile();
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

  public void GuardarEmpleado(Empleado em) {
    empleados.add(em);
  }

  public void escribirArchivo() {
    try {
      output = new MyObjectOutputStream(archivo);
      for (Empleado em: empleados) {
        output.writeObject(em);
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
