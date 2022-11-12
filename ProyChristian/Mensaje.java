package ProyChristian;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.util.Date;

import java.io.Serializable;

public class Mensaje implements Serializable{
    String fecha; 
    String texto;

    Mensaje () {}

    Mensaje (String texto, String fecha) {
        this.texto = texto;
        this.fecha = fecha;
        //setFecha();
    } 

    // public void setFecha() { //public void setFecha(Parametros)
    //     SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
    //     Calendar calendar = Calendar.getInstance();

    //     Date dateObj = calendar.getTime();
    //     fecha = dtf.format(dateObj);
    // }

    public String toString() {
        return "" + fecha + ": " + texto + "\n";
    }
}