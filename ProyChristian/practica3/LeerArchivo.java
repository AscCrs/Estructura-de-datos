import java.io.*;

public class LeerArchivo {
  String archivo;
  String cadena;
  FileReader f;

  LeerArchivo (String archivo) {
    this.archivo = archivo;  
  }

  public void mostrarContenido() throws FileNotFoundException, IOException {
        f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f); 
        while((cadena = b.readLine())!=null) { 
        	System.out.println(cadena); 
        } 
        b.close(); 
	} 
}
