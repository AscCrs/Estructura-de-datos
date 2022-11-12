package ProyChristian.ProyMascotas;

public class Mascota {
    String nombre;
    String raza;
    String edad;

    Mascota(String n, String r, String e) {
        nombre = n;
        raza = r;
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre " + nombre 
            + " \nraza: " + raza + " \nedad: "
            + edad + "\n";
    }
}