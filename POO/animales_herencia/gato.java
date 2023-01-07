package POO.animales_herencia;

public class gato extends mascota { // heredo toda la clase con 'extends' + "NombreClase"
    
    public gato(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza; 
        this.edad = edad;
    }
    
    @Override
    public void dormir() {
        System.out.println("El gato duerme");
    }
}
