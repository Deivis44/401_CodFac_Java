package POO.animales_herencia;

public class mascota {

    public String nombre;
    public String raza;
    public int edad;
    
    public void dormir() {
        System.out.println("La mascota duerme");
    }

    public String getNombre() {
        return nombre;
    }

    public String getraza() {
        return raza;
    }

    public int getedad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
