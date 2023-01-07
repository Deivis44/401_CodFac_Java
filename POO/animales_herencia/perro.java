package POO.animales_herencia;

public class perro extends mascota { // heredo toda la clase con 'extends' + "NombreClase"
    
    public perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza; 
        this.edad = edad;
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme");
    }
}
